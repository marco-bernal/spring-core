package com.mab.core.solid.open_closed.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HealthInsuranceSurveyor {
    public boolean isValidClaim() {
        log.info("HealthInsuranceSurveyor: Validating health insurance claim...");
        /*Logic to validate health insurance claims*/
        return true;
    }
}
