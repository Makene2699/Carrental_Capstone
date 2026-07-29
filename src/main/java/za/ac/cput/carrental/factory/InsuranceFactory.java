/* InsuranceFactory.java
   TDD Test class for InsuranceFactory
   Author: Thandeka Chantal Malande - 222857005
   Date: 28 June 2026 */

package za.ac.cput.carrental.factory;

import za.ac.cput.carrental.domain.Insurance;
import za.ac.cput.carrental.util.Helper;


public class InsuranceFactory {

public static Insurance createInsurance(String insuranceId, String bookingId,
                                            String type, double dailyPremium) {
        if (Helper.isNullOrEmpty(insuranceId) || Helper.isNullOrEmpty(bookingId)
                || Helper.isNullOrEmpty(type)
                || !Helper.isPositiveDouble(dailyPremium)) {
            return null;
        }
        return new Insurance.Builder()
                .setInsuranceId(insuranceId)
                .setBookingId(bookingId)
                .setType(type)
                .setDailyPremium(dailyPremium)
                .build();
    }
}



