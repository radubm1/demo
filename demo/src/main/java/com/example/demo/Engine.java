package com.example.demo;

public class Engine {
private String version;
private int cilinders;
public Engine(String version, int cilinders) {
	this.version = version;
	this.cilinders = cilinders;
}
public String getVersion() {
	return version;
}
public int getCilinders() {
	return cilinders;
}
}
