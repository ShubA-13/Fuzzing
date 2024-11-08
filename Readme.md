### Установка необходимых компонент

Устанавливаем Jazzer - https://github.com/mojohaus/jaxb2-maven-plugin/releases?page=1

Устанавливаем Jacoco - https://www.eclemma.org/jacoco/

Скачиваем библиотеку Jsoup - https://github.com/jhy/jsoup

### Хэш-сумма репозитория
```agsl
find ./Fuzzing -type f -exec shasum -a 256 {} \; | shasum -a 256

8ca8916a37d4b34ee1e58575e4019aec22ffba921af1e3661a9e9a51d9d08ba3
```

### Запуск фаззинг-тестиования
Библиотека Jsoup в java предназначена для работы с HTML, из нее берем директорию **src**, в нее добавляем обертку для фаззинга ParserFuzzerTest.java,
 и **pom.xml**, в него добаявляме зависимость com.code-intelligence для jazzer

Скачиваем необходимые зависисмости из **pom.xml** и собираем проект

```
mvn clean package
```

После сборки проекта получили директорию **target**, и запускаем фаззер
```agsl
timeout 3600s ./jazzer --cp=target/classes --target_class=org.jsoup.ParserFuzzerTest --coverage_dump=/Users/yura/workspace/Fuzz/jacoco.exec > ./fuzzing.log 2>&1
```

``timeout 3600s`` - отвечает за то, что тестирование продлиться час

``./jazzer`` - запускает фаззер Jazzer

``--cp=...`` - указывает классы

``--target_class=...`` - указывает, какой класс будет фаззиться

``--coverage_dump=...`` - указывает файл, в которм будет информация о покрытии в формате .exec, приемлимом для Jacoco

``> ./fuzzing.log 2>&1`` - переводит вывод из консоли в файл fuzzing.log

Логи фаззинг-тестирования представлены в файле fuzzing.log

### Сбор покрытия фаззинг-тестирования

Из полученного файла **jacoco.exec** при фаззинг-тестирования сделаем отчет о покрытии с попощью Jacoco в формате .html,
для этого вопосльзуемся jacococli.jar
```
java -jar /Users/yura/workspace/Fuzz/jacoco-0.8.12/lib/jacococli.jar report jacoco.exec \
     --classfiles /Users/yura/workspace/Fuzz/target/classes/org/jsoup/ \
     --sourcefiles /Users/yura/workspace/Fuzz/src/main/java/org/jsoup/ \
     --html ./
```

Из получнного **index.html** определяем покрытие
<img width="1509" alt="Снимок экрана 2024-11-08 в 17 12 06" src="https://github.com/user-attachments/assets/305ff8f9-7891-418b-a109-be4c27513c67">


