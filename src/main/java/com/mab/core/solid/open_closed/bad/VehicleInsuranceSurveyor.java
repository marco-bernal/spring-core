package com.mab.core.solid.open_closed.bad;

import lombok.extern.slf4j.Slf4j;

//New class for adding support to vehicle claims
@Slf4j
public class VehicleInsuranceSurveyor {
    public boolean isValidClaim() {
        log.info("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        /*Logic to validate health insurance claims*/
        return true;
    }
}
