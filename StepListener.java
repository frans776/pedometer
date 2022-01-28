package com.example.pedometer;


// Will listen to step alerts
public interface StepListener {

    public void step(long timeNs);

}
