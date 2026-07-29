/* InsuranceFactoryTest.java
   Insurance Factory Test class
   Author: Thandeka Chantal Malande (222857005)
   Date: 26 June 2026 */

package za.ac.cput.carrental.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.carrental.domain.Insurance;

import static org.junit.jupiter.api.Assertions.*;

public class InsuranceFactoryTest {

    @Test
    void createInsurance_validData_success() {
        Insurance insurance = InsuranceFactory.createInsurance(
                "INS001", "BOOK001", "Comprehensive", 150.00);

        assertNotNull(insurance);
        assertEquals("INS001", insurance.getInsuranceId());
        assertEquals("BOOK001", insurance.getBookingId());
        assertEquals("Comprehensive", insurance.getType());
        assertEquals(150.00, insurance.getDailyPremium());
    }

    @Test
    void createInsurance_nullInsuranceId_returnsNull() {
        Insurance insurance = InsuranceFactory.createInsurance(
                null, "BOOK001", "Comprehensive", 150.00);
        assertNull(insurance);
    }

    @Test
    void createInsurance_emptyBookingId_returnsNull() {
        Insurance insurance = InsuranceFactory.createInsurance(
                "INS001", "", "Comprehensive", 150.00);
        assertNull(insurance);
    }

    @Test
    void createInsurance_emptyType_returnsNull() {
        Insurance insurance = InsuranceFactory.createInsurance(
                "INS001", "BOOK001", "", 150.00);
        assertNull(insurance);
    }

    @Test
    void createInsurance_negativeDailyPremium_returnsNull() {
        Insurance insurance = InsuranceFactory.createInsurance(
                "INS001", "BOOK001", "Comprehensive", -50.00);
        assertNull(insurance);
    }

    @Test
    void createInsurance_zeroDailyPremium_returnsNull() {
        Insurance insurance = InsuranceFactory.createInsurance(
                "INS001", "BOOK001", "Comprehensive", 0.00);
        assertNull(insurance);
    }

    @Test
    void createInsurance_nullType_returnsNull() {
        Insurance insurance = InsuranceFactory.createInsurance(
                "INS001", "BOOK001", null, 150.00);
        assertNull(insurance);

    }
}