package com.lynxted.sample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.lynxted.sample.Fabric.COTTON;
import static com.lynxted.sample.Fabric.SILK;
import static com.lynxted.sample.Fabric.WOOL;

class WashingService {

    Collection<LaundryElement> washWool(WashingMachine washingMachine, Basket basket, Integer spinSpeed, Integer temperature) {
        List<LaundryElement> laundryToBeDone = basket.OnlyWool();
        washingMachine.setLaundry(laundryToBeDone);
//        if (spinSpeed >= 0 && spinSpeed <= 400) {
//            washingMachine.setSpinSpeed(spinSpeed);
//        } else {
//            washingMachine.setSpinSpeed(400);
//        }
//        if (temperature >= 0 && temperature <= 40) {
//            washingMachine.setTemperature(temperature);
//        } else {
//            washingMachine.setTemperature(40);
//        }
        washingMachine.setProgramme(Programme.forWool(temperature,spinSpeed));
        System.out.println("======================>>>>>");
        for(LaundryElement la :laundryToBeDone){
            System.out.println(la.getType()+" "+la.getDirty()+" "+la.getWeight());
        }
        System.out.println("======================>>>>>");
        washingMachine.wash();
        for(LaundryElement la :laundryToBeDone){
            System.out.println(la.getType()+" "+la.getDirty()+" "+la.getWeight());
        }
        System.out.println("======================>>>>>");
        return washingMachine.getLaundry();
    }

    Collection<LaundryElement> washCotton(WashingMachine washingMachine, Basket basket, Integer spinSpeed, Integer temperature) {
        List<LaundryElement> laundryToBeDone = basket.OnlyCotton();
        washingMachine.setLaundry(laundryToBeDone);
//        if (spinSpeed >= 0 && spinSpeed <= 1200) {
//            washingMachine.setSpinSpeed(spinSpeed);
//        } else {
//            washingMachine.setSpinSpeed(1200);
//        }
//        if (temperature >= 0 && temperature <= 95) {
//            washingMachine.setTemperature(temperature);
//        } else {
//            washingMachine.setTemperature(95);
//        }
        washingMachine.setProgramme(Programme.forCotton(temperature,spinSpeed));
        System.out.println("======================>>>>>");
        for(LaundryElement la :laundryToBeDone){
            System.out.println(la.getType()+" "+la.getDirty()+" "+la.getWeight());
        }
        System.out.println("======================>>>>>");
        washingMachine.wash();
        for(LaundryElement la :laundryToBeDone){
            System.out.println(la.getType()+" "+la.getDirty()+" "+la.getWeight());
        }
        System.out.println("======================>>>>>");
        return washingMachine.getLaundry();
    }

    Collection<LaundryElement> washSilk(WashingMachine washingMachine, Basket basket, Integer spinSpeed, Integer temperature) {
        List<LaundryElement> laundryToBeDone = basket.OnlySilk();
        washingMachine.setLaundry(laundryToBeDone);
//        if (spinSpeed >= 0 && spinSpeed <= 300) {
//            washingMachine.setSpinSpeed(spinSpeed);
//        } else {
//            washingMachine.setSpinSpeed(300);
//        }
//        if (temperature >= 0 && temperature <= 30) {
//            washingMachine.setTemperature(temperature);
//        } else {
//            washingMachine.setTemperature(30);
//        }
        washingMachine.setProgramme(Programme.forSilk(temperature,spinSpeed));
        System.out.println("======================>>>>>");
        for(LaundryElement la :laundryToBeDone){
            System.out.println(la.getType()+" "+la.getDirty()+" "+la.getWeight());
        }
        System.out.println("======================>>>>>");
        washingMachine.wash();
        for(LaundryElement la :laundryToBeDone){
            System.out.println(la.getType()+" "+la.getDirty()+" "+la.getWeight());
        }
        System.out.println("======================>>>>>");
        return washingMachine.getLaundry();
    }


}
