package com.example.demo;

public class Car {
	 
    public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	private Engine engine;
	private Transmission transmission;

	public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }
}
