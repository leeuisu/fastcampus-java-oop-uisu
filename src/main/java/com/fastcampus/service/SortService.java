package com.fastcampus.service;

import java.util.List;
import com.fastcampus.logic.*;

public class SortService {

    private final Sort<String> sort;
    public SortService(Sort<String> sort){
        this.sort=sort;
    }
    public List<String> doSort(List<String> list){
        return sort.sort(list);

    }
}
