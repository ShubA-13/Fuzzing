package org.jsoup;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

public class ParserFuzzerTest {
    public static void fuzzerTestOneInput(FuzzedDataProvider data) {
        String input = data.consumeRemainingAsString();
        Jsoup.parse(input);

    }
}