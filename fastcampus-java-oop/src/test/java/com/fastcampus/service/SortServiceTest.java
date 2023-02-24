package com.fastcampus.service;

import com.fastcampus.logic.BubbleSort;
import com.fastcampus.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private  SortService sut = new SortService(new BubbleSort<>());

    @Test
    void test(){
        //GIven

        //when
        List<String> actual = sut.doSort(List.of("3","2","1"));
        //then
        assertEquals(List.of("1","2","3"), actual);
    }

}