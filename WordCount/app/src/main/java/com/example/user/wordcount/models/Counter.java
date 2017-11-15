package com.example.user.wordcount.models;

/**
 * Created by user on 13/11/2017.
 */

public class Counter {


    public static int countWords(String text){
        return text.split(" ").length;

    }

}
