package com.lynxted.sample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LaundryWeight {

    static List<LaundryElement> laundryElements = new ArrayList<>();


    static List<LaundryElement> removeLaundry(List<LaundryElement> laundry, BigDecimal maxLaundryWeight){
        float i=0;
        for(LaundryElement la : laundry){
            if(la.getWeight().floatValue()+i <= maxLaundryWeight.floatValue()){
                i = i + la.getWeight().floatValue();
                laundryElements.add(la);
            }
        }
        return laundryElements;
    }
}
