package com.mab.core.solid.dependency_inversion.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LightBulb {
    public void turnOn() {
        log.info("LightBulb: Bulb turned on...");
    }
    public void turnOff() {
        log.info("LightBulb: Bulb turned off...");
    }
}
