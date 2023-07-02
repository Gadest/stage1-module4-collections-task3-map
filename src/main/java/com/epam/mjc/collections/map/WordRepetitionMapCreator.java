package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> result = new HashMap<>();
        if (!sentence.isEmpty()) {
            sentence = sentence.toLowerCase();
            sentence = sentence.replace(",", "");
            sentence = sentence.replace(".", "");
            String[] strings = sentence.split(" ");
            for (String s :
                    strings) {
                int count = 0;
                for (String t :
                        strings) {
                    if (s.equals(t)) {
                        count++;
                    }
                }
                result.put(s, count);
            }
        }
        return result;
    }
}
