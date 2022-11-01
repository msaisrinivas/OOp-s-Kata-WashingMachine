package com.lynxted.sample;

abstract class Programme {
    private final int temperature;
    private final int spinSpeed;

    Programme(int temperature, int spinSpeed) {
        this.temperature = temperature>0 && temperature<=maximumTemperature() ? temperature : maximumTemperature() ;
        this.spinSpeed = spinSpeed<=maximumSpinSpeed() ? spinSpeed : maximumSpinSpeed() ;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    protected abstract int maximumTemperature();
    protected abstract int maximumSpinSpeed();

    protected abstract Programme programmeFor(int temperature, int spinSpeed);

    static Programme forWool(int temperature, int spinSpeed) {
        return new WoolProgramme(temperature,spinSpeed);
    }

    static Programme forCotton(int temperature, int spinSpeed) {
        return new CottonProgramme(temperature,spinSpeed);
    }

    static Programme forSilk(int temperature, int spinSpeed) {
        return new SilkProgramme(temperature,spinSpeed);
    }
    //Code for Abstract Programme Class Ends here

    // WoolProgramme stats from here
    private static class WoolProgramme extends Programme {

        private static final int MAX_TEMERATURE = 90;
        public static final int MAX_SPIN_SPEED = 1200;
        private WoolProgramme() {
            this(MAX_TEMERATURE, MAX_SPIN_SPEED);
        }
        WoolProgramme(int temperature, int spinSpeed) {
            super(temperature, spinSpeed);
        }

        @Override
        protected int maximumTemperature() {
            return MAX_TEMERATURE;
        }

        @Override
        protected int maximumSpinSpeed() {
            return MAX_SPIN_SPEED;
        }

        @Override
        protected Programme programmeFor(int temperature, int spinSpeed) {
            return new WoolProgramme(temperature,spinSpeed);
        }
    }

    // CottonProgramme stats from here
    private static class CottonProgramme extends Programme {

        private static final int MAX_TEMERATURE = 40;
        public static final int MAX_SPIN_SPEED = 400;

        private CottonProgramme() {
            this(MAX_TEMERATURE, MAX_SPIN_SPEED);
        }
        CottonProgramme(int temperature, int spinSpeed) {
            super(temperature, spinSpeed);
        }

        @Override
        protected int maximumTemperature() {
            return MAX_TEMERATURE;
        }

        @Override
        protected int maximumSpinSpeed() {
            return MAX_SPIN_SPEED;
        }

        @Override
        protected Programme programmeFor(int temperature, int spinSpeed) {
            return new CottonProgramme(temperature,spinSpeed);
        }
    }

    // SilkProgrammme stats from here
    private static class SilkProgramme extends Programme {

        private static final int MAX_TEMERATURE = 30;
        public static final int MAX_SPIN_SPEED = 300;

        private SilkProgramme() {
            this(MAX_TEMERATURE, MAX_SPIN_SPEED);
        }
        SilkProgramme(int temperature, int spinSpeed) {
            super(temperature, spinSpeed);
        }

        @Override
        protected int maximumTemperature() {
            return MAX_TEMERATURE;
        }

        @Override
        protected int maximumSpinSpeed() {
            return MAX_SPIN_SPEED;
        }

        @Override
        protected Programme programmeFor(int temperature, int spinSpeed) {
            return new SilkProgramme(temperature,spinSpeed);
        }
    }
}
