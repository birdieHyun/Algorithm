package org.example.programmers;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        int answer = 0;

        List<String> caches = new ArrayList<>();

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();

            if (caches.contains(city)) {
                caches.remove(city);
                caches.add(city);
                answer += 1;
            } else {
                if (caches.size() == cacheSize) {
                    caches.remove(0);
                }
                caches.add(city);
                answer += 5;
            }
        }

        System.out.println("answer = " + answer);
    }
}
//
//public int solution(int cacheSize, String[] cities) {
//    int answer = 0;
//    return answer;
//}
/**
 * ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"]
 */
