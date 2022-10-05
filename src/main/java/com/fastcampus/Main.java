package com.fastcampus;

import com.fastcampus.logic.BubbleSort;
import com.fastcampus.logic.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        System.out.println("[result]" + sort.sort(Arrays.asList(args)));
    }

}