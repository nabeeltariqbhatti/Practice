package com.company.threads.oncurrentc;

import java.util.NavigableSet;
import java.util.concurrent.*;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/24/2022
 * @Time at 1:20 PM
 */
public class ConMap {

    public static void main(String[] args) {
        ConcurrentMap<Integer, String> cMap = new ConcurrentHashMap<>();//hashMap / not sorted
        ConcurrentSkipListMap<Object, Object> concurrentSkipListMap = new ConcurrentSkipListMap<>();//eq with TreeMap / sorted
        ConcurrentNavigableMap<String,String> concurrentNavigableMap = new ConcurrentSkipListMap<>();//eq with TreeMap
        NavigableSet<Integer> integerConcurrentSkipListSet = new ConcurrentSkipListSet<>();//TreeSet / sorted


    }
}
