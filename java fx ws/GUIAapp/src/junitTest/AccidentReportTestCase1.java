package junitTest;

import static org.junit.Assert.*;




import org.junit.Test;

import model.AccidentReport;

public class AccidentReportTestCase1 {

    private AccidentReport accidentReport=new AccidentReport("VIN12345", "VIN67890", "Downtown Street", "11/2/2024", "Minor fender bender");;

    

    @Test
    public void testAccidentReportStringStringStringLocalDateTimeString() {
        // Test if the constructor initializes the object correctly
    	testGetVin1();
    	testGetVin2();
    	testGetAccidentLocation();
    	testGetAccidentTime();
    	testGetDescription();
        
    }

    @Test
    public void testGetVin1() {
        // Test the getter for vin1
        assertEquals("VIN12345", accidentReport.getVin1());
    }

    @Test
    public void testGetVin2() {
        // Test the getter for vin2
        assertEquals("VIN67890", accidentReport.getVin2());
    }

    @Test
    public void testGetAccidentLocation() {
        // Test the getter for accident location
        assertEquals("Downtown Street", accidentReport.getAccidentLocation());
    }

    @Test
    public void testGetAccidentTime() {
        // Test the getter for accident time
       assertEquals("11/2/2024",accidentReport.getAccidentTime());
    }

    @Test
    public void testGetDescription() {
        // Test the getter for description
        assertEquals("Minor fender bender", accidentReport.getDescription());
    }

    @Test
    public void testGenerateAccidentReport() {
        // Test the generateAccidentReport method
        String expectedReport = "Accident Report\n" +
                                 "--------------------------------------\n" +
                                 "Vehicle 1 VIN: VIN12345\n" +
                                 "Vehicle 2 VIN: VIN67890\n" +
                                 "Accident Location: Downtown Street\n" +
                                 "Accident Time: " + accidentReport.getAccidentTime() + "\n" +
                                 "Description: Minor fender bender\n" +
                                 "--------------------------------------";
        assertEquals(expectedReport, accidentReport.generateAccidentReport());
    }

    @Test
    public void testSendReportToInsurance() {
        // Test the sendReportToInsurance method
        try {
            accidentReport.sendReportToInsurance();
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }
}
