package model;



public class AccidentReport {

    // Attributes
    private String vin1;  // VIN of the first vehicle involved
    private String vin2;  // VIN of the second vehicle involved
    private String accidentLocation;
    private String accidentTime;
    private String description;

    // Constructor
    public AccidentReport(String vin1, String vin2, String accidentLocation, String accidentTime, String description) {
        this.vin1 = vin1;
        this.vin2 = vin2;
        this.accidentLocation = accidentLocation;
        this.accidentTime = accidentTime;
        this.description = description;
    }

    // Default constructor
    public AccidentReport() {
    }

    // Getter and Setter methods
    public String getVin1() {
        return vin1;
    }

    public void setVin1(String vin1) {
        this.vin1 = vin1;
    }

    public String getVin2() {
        return vin2;
    }

    public void setVin2(String vin2) {
        this.vin2 = vin2;
    }

    public String getAccidentLocation() {
        return accidentLocation;
    }

    public void setAccidentLocation(String accidentLocation) {
        this.accidentLocation = accidentLocation;
    }

    public String getAccidentTime() {
        return accidentTime;
    }

    public void setAccidentTime(String accidentTime) {
        this.accidentTime = accidentTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method to generate accident report
    public String generateAccidentReport() {
        return "Accident Report\n" +
               "--------------------------------------\n" +
               "Vehicle 1 VIN: " + vin1 + "\n" +
               "Vehicle 2 VIN: " + vin2 + "\n" +
               "Accident Location: " + accidentLocation + "\n" +
               "Accident Time: " + accidentTime + "\n" +
               "Description: " + description + "\n" +
               "--------------------------------------";
    }

    // Method to send the accident report to the insurance company
    public void sendReportToInsurance() {
        System.out.println("Sending the accident report to the insurance company...");
        // Simulate sending the report
        System.out.println("Accident Report Sent!");
    }

    // Main method for simple testing
    public static void main(String[] args) {
        // Create an example accident report
        AccidentReport report = new AccidentReport("VIN12345", "VIN67890", "Downtown Street", "11/12/2024", "Minor fender bender");

        // Generate the report
        System.out.println(report.generateAccidentReport());

        // Send the report to the insurance company
        report.sendReportToInsurance();
    }
}
