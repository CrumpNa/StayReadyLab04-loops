package com.codedifferently.stayready.lab04;


import org.junit.Assert;
import org.junit.Test;


public class CarRideTest {

    @Test
    public void areWeThereYetTestYes(){
        //Given
        CarRide carRide= new CarRide();
        String expected="Good";

        //When
        String actual=carRide.areWeThereYet("Yes");

        //then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void areWeThereYetTestNo(){
        //Given
        CarRide carRide= new CarRide();
        String expected="Are we there yet?";

        //When
        String actual=carRide.areWeThereYet("No");

        //then
        Assert.assertEquals(expected,actual);

    }

}
