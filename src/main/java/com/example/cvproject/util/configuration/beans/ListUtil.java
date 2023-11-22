package com.example.cvproject.util.configuration.beans;

import java.util.List;

public class ListUtil {
    public int sumElements(final List<Integer> ints){
        return ints.stream().reduce(0,Integer::sum);
    }
}
