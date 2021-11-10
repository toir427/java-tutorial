package com.tuychiev.example.method.override;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}
