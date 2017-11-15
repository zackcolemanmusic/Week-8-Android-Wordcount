package com.example.user.wordcount;

import com.example.user.wordcount.models.Counter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2017.
 */

public class CountTest {

    Counter counter;

    @Test
    public void testCountWords(){
         assertEquals(5, Counter.countWords("I have how many words?"));

    }



}
