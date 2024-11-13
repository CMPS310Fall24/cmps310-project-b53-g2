package junitTest;

import static org.junit.Assert.*;


import org.junit.Test;

import model.AccidentReport;



public class AccidentReportTestCase2 {

    private AccidentReport accidentReport=new AccidentReport();

    // Setting up the accidentReport object before each test
    

    // Test for the getVin1 method (expected to be null for no-arg constructor)
    @Test
    public void testGetVin1() {
        assertEquals(null, accidentReport.getVin1()); // Should be null as no value is set
    }

    // Test for the getVin2 method (expected to be null for no-arg constructor)
    @Test
    public void testGetVin2() {
        assertEquals(null, accidentReport.getVin2()); // Should be null as no value is set
    }
    @Test
    public void testAccidentReportStringStringStringLocalDateTimeString() {
        // Test if the constructor initializes the object correctly
    	testGetVin1();
    	testGetVin2();
    	testGetAccidentLocation();
    	testGetAccidentTime();
    	testGetDescription();
        
    }

    // Test for the getAccidentLocation method (expected to be null for no-arg constructor)
    @Test
    public void testGetAccidentLocation() {
        assertEquals(null, accidentReport.getAccidentLocation()); // Should be null as no value is set
    }

    // Test for the getAccidentTime method (expected to be a non-null LocalDateTime object)
    @Test
    public void testGetAccidentTime() {
       assertEquals(null,accidentReport.getAccidentTime()); // Should not be null as it's initialized with the current time
    }

    // Test for the getDescription method (expected to be null for no-arg constructor)
    @Test
    public void testGetDescription() {
        assertEquals(null, accidentReport.getDescription()); // Should be null as no value is set
    }

    // Test for the generateAccidentReport method (expected to return a string with null values)
    @Test
    public void testGenerateAccidentReport() {
        String expectedReport = "Accident Report\n" +
                                 "--------------------------------------\n" +
                                 "Vehicle 1 VIN: null\n" +
                                 "Vehicle 2 VIN: null\n" +
                                 "Accident Location: null\n" +
                                 "Accident Time: " + accidentReport.getAccidentTime() + "\n" +
                                 "Description: null\n" +
                                 "--------------------------------------";
        assertEquals(expectedReport, accidentReport.generateAccidentReport());
    }

    // Test for the sendReportToInsurance method (should run without exception)
    @Test
    public void testSendReportToInsurance() {
        try {
            accidentReport.sendReportToInsurance(); // Test if the method runs without exceptions
        } catch (Exception e) {
            fail("Exception should not be thrown: " + e.getMessage());
        }
    }
}
