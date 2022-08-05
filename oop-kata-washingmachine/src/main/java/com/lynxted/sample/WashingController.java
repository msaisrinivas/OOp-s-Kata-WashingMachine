package com.lynxted.sample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import static com.lynxted.sample.Fabric.*;

class WashingController {

    private final WashingService washingService;

    WashingController(WashingService washingService) {
        this.washingService = washingService;
    }

    void wash(Fabric fabricType, Basket basket) {
        Collection<LaundryElement> laundry = getAllLaundry();
        WashingMachine washingMachine = new WashingMachine();
        Integer spinSpeed = getRequestedSpinSpeed();
        Integer temperature = getRequestedTemperature();
        if (fabricType == Fabric.WOOL) {
            washingService.washWool(washingMachine, basket, spinSpeed, temperature);
        }
        else if (fabricType == COTTON) {
            washingService.washCotton(washingMachine, basket, spinSpeed, temperature);
        } else if (fabricType == SILK) {
            washingService.washSilk(washingMachine, basket, spinSpeed, temperature);
        }
    }

    private Collection<LaundryElement> getAllLaundry() {
        Collection<LaundryElement> allLaundry = new ArrayList<>();
        allLaundry.add(new LaundryElement(WOOL,"White",new BigDecimal(2.5),true));
        allLaundry.add(new LaundryElement(WOOL,"White",new BigDecimal(2.5),true));
        allLaundry.add(new LaundryElement(WOOL,"White",new BigDecimal(2),true));
        allLaundry.add(new LaundryElement(SILK,"Red",new BigDecimal(1),true));
        allLaundry.add(new LaundryElement(SILK,"White",new BigDecimal(0.5),true));
        allLaundry.add(new LaundryElement(SILK,"Yello",new BigDecimal(2),true));
        // fill the allLaundry collection with available laundry by any way, e.g. obtaining it from repositories, providers, services
        return allLaundry;
    }

    private Integer getRequestedSpinSpeed() {
        return new Random().nextInt(1200);
    }

    private Integer getRequestedTemperature() {
        return new Random().nextInt(95);
    }

}
