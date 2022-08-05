package com.lynxted.sample;

import java.util.List;
import java.util.stream.Collectors;

public class Basket {
    static List<LaundryElement> laundry;

    public Basket(List<LaundryElement> laundry) {
        this.laundry = laundry;
    }

    static List<LaundryElement> OnlyWool(){
        return laundry.stream().filter(laundryElement -> laundryElement.getType().equals(Fabric.WOOL)).collect(Collectors.toList());
    }

    static List<LaundryElement> OnlySilk(){
        return laundry.stream().filter(laundryElement -> laundryElement.getType().equals(Fabric.SILK)).collect(Collectors.toList());
    }

    static List<LaundryElement> OnlyCotton(){
        return laundry.stream().filter(laundryElement -> laundryElement.getType().equals(Fabric.COTTON)).collect(Collectors.toList());
    }
}
