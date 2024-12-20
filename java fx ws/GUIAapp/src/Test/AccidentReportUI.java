package Test;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccidentReportUI extends JFrame {

    private JPanel contentPane;
    private JTextField vinCurrentField, vinNewField, timeField, locationField;
    private JLabel statusLabel;
    private JButton submitButton; // Declare submitButton here

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                AccidentReportUI frame = new AccidentReportUI();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public AccidentReportUI() {
        setTitle("Accident Report");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Current VIN input
        JLabel vinCurrentLabel = new JLabel("Current Owner VIN:");
        vinCurrentLabel.setBounds(30, 30, 200, 25);
        contentPane.add(vinCurrentLabel);

        vinCurrentField = new JTextField();
        vinCurrentField.setBounds(250, 30, 200, 25);
        contentPane.add(vinCurrentField);
        vinCurrentField.setColumns(10);

        // New VIN input
        JLabel vinNewLabel = new JLabel("New Owner VIN:");
        vinNewLabel.setBounds(30, 70, 200, 25);
        contentPane.add(vinNewLabel);

        vinNewField = new JTextField();
        vinNewField.setBounds(250, 70, 200, 25);
        contentPane.add(vinNewField);
        vinNewField.setColumns(10);

        // Time input
        JLabel timeLabel = new JLabel("Accident Time:");
        timeLabel.setBounds(30, 110, 200, 25);
        contentPane.add(timeLabel);

        timeField = new JTextField();
        timeField.setBounds(250, 110, 200, 25);
        contentPane.add(timeField);
        timeField.setColumns(10);

        // Location input
        JLabel locationLabel = new JLabel("Accident Location:");
        locationLabel.setBounds(30, 150, 200, 25);
        contentPane.add(locationLabel);

        locationField = new JTextField();
        locationField.setBounds(250, 150, 200, 25);
        contentPane.add(locationField);
        locationField.setColumns(10);

        // Status Label
        statusLabel = new JLabel("");
        statusLabel.setBounds(30, 200, 400, 25);
        contentPane.add(statusLabel);

        // Confirm button
        JButton confirmButton = new JButton("Confirm");
        confirmButton.setBounds(150, 250, 200, 30);
        contentPane.add(confirmButton);

        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call confirmation method to validate inputs
                confirmAccidentReport();
            }
        });

        // Submit button (now declared as a class variable)
        submitButton = new JButton("Submit Accident Report");
        submitButton.setBounds(150, 290, 200, 30);
        submitButton.setEnabled(false); // Initially disabled
        contentPane.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                submitAccidentReport();
            }
        });
    }

    // Method to simulate the accident reporting process
    private void confirmAccidentReport() {
        String vinCurrent = vinCurrentField.getText();
        String vinNew = vinNewField.getText();
        String time = timeField.getText();
        String location = locationField.getText();

        if (vinCurrent.isEmpty() || vinNew.isEmpty() || time.isEmpty() || location.isEmpty()) {
            statusLabel.setText("Please fill in all the fields.");
        } else {
            // Simulate accident reporting flow
            boolean isVinCurrentValid = verifyVIN(vinCurrent);
            boolean isVinNewValid = verifyVIN(vinNew);

            if (!isVinCurrentValid || !isVinNewValid) {
                statusLabel.setText("Error: Invalid VIN.");
            } else {
                statusLabel.setText("Confirmation successful. You can now submit the report.");
                // Enable the submit button after confirmation
                submitButton.setEnabled(true); // No need for getComponent() here
            }
        }
    }

    // Method to submit the accident report
    private void submitAccidentReport() {
        String vinCurrent = vinCurrentField.getText();
        String vinNew = vinNewField.getText();
        String time = timeField.getText();
        String location = locationField.getText();

        sendReportToInsurance(vinCurrent, vinNew, time, location);
        statusLabel.setText("Accident report submitted successfully!");
    }

    // Simulated method to verify the VIN
    private boolean verifyVIN(String vin) {
        // In a real system, you'd query a database or external service to verify VIN
        return !vin.equals("000000"); // Invalid VIN for testing
    }

    // Simulated method to send report to insurance
    private void sendReportToInsurance(String vinCurrent, String vinNew, String time, String location) {
        // Simulate sending the accident report to the insurance company
        System.out.println("Accident report sent to insurance company.");
        System.out.println("Current Owner VIN: " + vinCurrent);
        System.out.println("New Owner VIN: " + vinNew);
        System.out.println("Time: " + time);
        System.out.println("Location: " + location);
    }
}
