package com.mab.core.solid.dependency_inversion.good;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        log.info("Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        log.info("Fan: Fan turned off...");
    }
}
