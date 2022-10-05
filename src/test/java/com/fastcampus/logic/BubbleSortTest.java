package com.fastcampus.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @DisplayName("bubble test")
    @Test
    void given_List_WhenExecuting_ThenResortList() {

        BubbleSort<Integer>  bubbleSort = new BubbleSort<>();

        List<Integer> actual = bubbleSort.sort(List.of(3,2,4,5,1));

        assertEquals(List.of(1,2,3,4,5,5),actual);

    }
}