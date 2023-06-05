package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int x : sourceList) {
            hashSet.add(x);

            if (x % 2 == 0) {
                int temp = x / 2;
                while (temp % 2 == 0) {
                    hashSet.add(temp);
                    temp = temp / 2;
                }
                hashSet.add(temp);
            } else {
                hashSet.add(2 * x);
            }
        }

        return hashSet;
    }
}
