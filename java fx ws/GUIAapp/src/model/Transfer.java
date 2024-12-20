package model;

public class Transfer {
	
	// Attributes
    private String vin;
    private String currentOwnerName;
    private String newOwnerName;
    private String qidNewOwner;
    private boolean hasUnpaidBills; // New attribute to check unpaid bills

    // Constructor to initialize the ownership transfer object
    public Transfer(String vin, String currentOwnerName, String newOwnerName, String qidNewOwner, boolean hasUnpaidBills) {
        this.vin = vin;
        this.currentOwnerName = currentOwnerName;
        this.newOwnerName = newOwnerName;
        this.qidNewOwner = qidNewOwner;
        this.hasUnpaidBills = hasUnpaidBills; // Initialize the unpaid bills status
    }

    // Default constructor
    public Transfer() {
    }

    // Getter and Setter methods
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCurrentOwnerName() {
        return currentOwnerName;
    }

    public void setCurrentOwnerName(String currentOwnerName) {
        this.currentOwnerName = currentOwnerName;
    }

    public String getNewOwnerName() {
        return newOwnerName;
    }

    public void setNewOwnerName(String newOwnerName) {
        this.newOwnerName = newOwnerName;
    }

    public String getQidNewOwner() {
        return qidNewOwner;
    }

    public void setQidNewOwner(String qidNewOwner) {
        this.qidNewOwner = qidNewOwner;
    }

    public boolean hasUnpaidBills() {
        return hasUnpaidBills;
    }

    public void setHasUnpaidBills(boolean hasUnpaidBills) {
        this.hasUnpaidBills = hasUnpaidBills;
    }

    // Method to transfer ownership
    public boolean transferOwnership() {
        // Validate VIN and QIDs
        if (vin == null || vin.isEmpty() || currentOwnerName == null || currentOwnerName.isEmpty()
                || newOwnerName == null || newOwnerName.isEmpty() || qidNewOwner == null || qidNewOwner.isEmpty()) {
            System.out.println("Error: VIN or Owner details cannot be empty.");
            return false;
        }

        // Check if there are any unpaid bills
        if (hasUnpaidBills) {
            System.out.println("Error: Unpaid bills prevent ownership transfer.");
            return false;
        }

        // Simulate ownership transfer
        System.out.println("Successfully transferred ownership of vehicle with VIN " + vin + " from "
                + currentOwnerName + " to " + newOwnerName + " (QID: " + qidNewOwner + ").");
        return true;
    }

    // Main method for simple testing
    public static void main(String[] args) {
        // Sample transfer without unpaid bills
        Transfer transfer = new Transfer("VIN12345", "Haneen", "Nahda", "QID12345", false);
        boolean success = transfer.transferOwnership();
        if (success) {
            System.out.println("Transfer Completed Successfully.");
        } else {
            System.out.println("Transfer Failed.");
        }

        // Sample transfer with unpaid bills
        Transfer transferWithBills = new Transfer("VIN12345", "Haneen", "Nahda", "QID12345", true);
        success = transferWithBills.transferOwnership();
        if (success) {
            System.out.println("Transfer Completed Successfully.");
        } else {
            System.out.println("Transfer Failed due to unpaid bills.");
        }
    }

}
