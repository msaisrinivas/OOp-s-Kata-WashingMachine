package com.lynxted.sample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.lynxted.sample.Fabric.SILK;
import static com.lynxted.sample.Fabric.WOOL;

public class Main {
    public static void main(String[] args) {
        List<LaundryElement> allLaundry = new ArrayList<>();
        allLaundry.add(new LaundryElement(WOOL,"White",new BigDecimal(2.5),true));
        allLaundry.add(new LaundryElement(WOOL,"White",new BigDecimal(2.5),true));
        allLaundry.add(new LaundryElement(WOOL,"White",new BigDecimal(2.5),true));
        allLaundry.add(new LaundryElement(SILK,"Red",new BigDecimal(1),true));
        allLaundry.add(new LaundryElement(SILK,"White",new BigDecimal(0.5),true));
        allLaundry.add(new LaundryElement(SILK,"Yello",new BigDecimal(2),true));
        Basket b = new Basket(allLaundry);
        WashingController washingController = new WashingController(new WashingService());
        washingController.wash(Fabric.SILK, b);
        washingController.wash(Fabric.WOOL, b);

//        for(LaundryElement la : LaundryWeight.removeLaundry(b.OnlyWool())){
//            System.out.println(la.getWeight());
//        }

    }
}
