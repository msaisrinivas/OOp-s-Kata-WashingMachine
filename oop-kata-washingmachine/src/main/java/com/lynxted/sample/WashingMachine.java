package com.lynxted.sample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

class WashingMachine {
    private static final BigDecimal MAX_LAUNDRY_WEIGHT = BigDecimal.valueOf(7);
    private Collection<LaundryElement> laundry;

    private Programme programme;

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    Collection<LaundryElement> getLaundry() {
        return laundry;
    }

    void setLaundry(Collection<LaundryElement> laundry) {
        this.laundry = laundry;
    }

    void wash() {
        System.out.println("Washing with \"Spin Speed : "+ programme.getSpinSpeed()+", Temperatre : "+programme.getTemperature()+"\"");
        laundry = LaundryWeight.removeLaundry(new ArrayList<>(laundry), MAX_LAUNDRY_WEIGHT);
        laundry.forEach(laundryElement -> laundryElement.setDirty(false));
    }
}
