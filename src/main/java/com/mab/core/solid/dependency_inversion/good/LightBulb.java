package com.mab.core.solid.dependency_inversion.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        log.info("LightBulb: Bulb turned on...");
    }

    @Override
    public void turnOff() {
        log.info("LightBulb: Bulb turned off...");
    }
}
