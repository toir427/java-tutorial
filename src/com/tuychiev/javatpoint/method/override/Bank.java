package com.tuychiev.javatpoint.method.override;

class CentralBank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends CentralBank {
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

class ICI extends CentralBank {
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends CentralBank {
    int getRateOfInterest() {
        return 9;
    }
}

public class Bank {
    /*
     * Can we override static method?
     * No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.
     * Why can we not override static method?
     * It is because the static method is bound with class whereas instance method is bound with an object.
     * Static belongs to the class area, and an instance belongs to the heap area.
     * */

    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICI ici = new ICI();
        AXIS axis = new AXIS();

        System.out.println("SBI Rate if interest: " + sbi.getRateOfInterest());
        System.out.println("ICI Rate if interest: " + ici.getRateOfInterest());
        System.out.println("AXIS Rate if interest: " + axis.getRateOfInterest());
    }
}
