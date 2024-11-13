package junitTest;

import static org.junit.Assert.*;


import org.junit.Test;

import model.Transfer;

public class TransferTestCase2 {

    private Transfer transfer=new Transfer();

    
    
    // Test for the Transfer constructor
    @Test
    public void testTransferStringStringStringStringBoolean() {
    	testGetVin();
    	testGetCurrentOwnerName();
    	testGetNewOwnerName();
    	testGetQidNewOwner();
    	testHasUnpaidBills();
    	
    }

    // Test for the getVin method
    @Test
    public void testGetVin() {
        assertEquals(null, transfer.getVin());
    }

    // Test for the getCurrentOwnerName method
    @Test
    public void testGetCurrentOwnerName() {
        assertEquals(null, transfer.getCurrentOwnerName());
    }

    // Test for the getNewOwnerName method
    @Test
    public void testGetNewOwnerName() {
        assertEquals(null, transfer.getNewOwnerName());
    }

    // Test for the getQidNewOwner method
    @Test
    public void testGetQidNewOwner() {
        assertEquals(null, transfer.getQidNewOwner());
    }

    // Test for the hasUnpaidBills method (expected to return false for this test case)
    @Test
    public void testHasUnpaidBills() {
    	assertEquals(false, transfer.hasUnpaidBills());
        //assertFalse(transfer.hasUnpaidBills()); // As per the test setup, this should return false
    }
}
