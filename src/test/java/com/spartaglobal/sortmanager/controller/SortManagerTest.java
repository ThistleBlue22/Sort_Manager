package com.spartaglobal.sortmanager.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

class SortManagerTest {

    SortManager sm;
    Random r;

    @BeforeEach
    public void setUp(){
        sm = new SortManager();
        r = new Random();
    }

    @Test
    @DisplayName("Given a small number generate an array with that many digits populated")
    public void givenASmallNumberGenerateAnArrayWithThatManyDigitsPopulated(){
        int expected = 10;
        int[] sizeArray = new int[expected];
        sm.randomNumber(sizeArray);

        int actual = sizeArray.length;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given a random number generate an array with that many digits populated")
    public void givenARandomNumberGenerateAnArrayWithThatManyDigitsPopulated(){
        int expected = r.nextInt(100)+1;
        int[] sizeArray = new int[expected];
        sm.randomNumber(sizeArray);

        int actual = sizeArray.length;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given a big number generate an array with that many digits populated")
    public void givenABigNumberGenerateAnArrayWithThatManyDigitsPopulated(){
        int expected = 10000;
        int[] sizeArray = new int[expected];
        sm.randomNumber(sizeArray);

        int actual = sizeArray.length;

        Assertions.assertEquals(expected, actual);
    }

}