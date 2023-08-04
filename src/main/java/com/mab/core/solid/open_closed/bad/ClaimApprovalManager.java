package com.mab.core.solid.open_closed.bad;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClaimApprovalManager {
    public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            log.info("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }

    //Updated method for adding support to vehicle claims
    public void processVehicleClaim(VehicleInsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            log.info("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
