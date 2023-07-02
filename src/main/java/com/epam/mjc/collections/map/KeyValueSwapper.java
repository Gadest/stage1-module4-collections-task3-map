package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> result = new HashMap<>();
        Set<Integer> keys = sourceMap.keySet();
        for (Integer i:
                keys) {
            if (result.get(sourceMap.get(i))==i){
            }
            else result.put(sourceMap.get(i),i);
        }
        return result;
    }
}
