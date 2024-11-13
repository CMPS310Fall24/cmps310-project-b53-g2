package Test;

import javax.swing.*;
import javax.swing.border.EmptyBorder;  // Add this import statement
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OwnershipTransferUI extends JFrame {

    private JPanel contentPane;
    private JTextField vinField, currentOwnerField, newOwnerField, qidField;
    private JLabel statusLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                OwnershipTransferUI frame = new OwnershipTransferUI();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public OwnershipTransferUI() {
        setTitle("Transfer Registered Vehicle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));  // Ensure EmptyBorder is imported
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // VIN input
        JLabel vinLabel = new JLabel("Vehicle Identification Number (VIN):");
        vinLabel.setBounds(30, 30, 200, 25);
        contentPane.add(vinLabel);

        vinField = new JTextField();
        vinField.setBounds(250, 30, 200, 25);
        contentPane.add(vinField);
        vinField.setColumns(10);

        // Current Owner input
        JLabel currentOwnerLabel = new JLabel("Current Owner Name:");
        currentOwnerLabel.setBounds(30, 70, 200, 25);
        contentPane.add(currentOwnerLabel);

        currentOwnerField = new JTextField();
        currentOwnerField.setBounds(250, 70, 200, 25);
        contentPane.add(currentOwnerField);
        currentOwnerField.setColumns(10);

        // New Owner input
        JLabel newOwnerLabel = new JLabel("New Owner Name:");
        newOwnerLabel.setBounds(30, 110, 200, 25);
        contentPane.add(newOwnerLabel);

        newOwnerField = new JTextField();
        newOwnerField.setBounds(250, 110, 200, 25);
        contentPane.add(newOwnerField);
        newOwnerField.setColumns(10);

        // QID input
        JLabel qidLabel = new JLabel("New Owner QID:");
        qidLabel.setBounds(30, 150, 200, 25);
        contentPane.add(qidLabel);

        qidField = new JTextField();
        qidField.setBounds(250, 150, 200, 25);
        contentPane.add(qidField);
        qidField.setColumns(10);

        // Status Label
        statusLabel = new JLabel("");
        statusLabel.setBounds(30, 250, 400, 25);
        contentPane.add(statusLabel);

        // Submit button
        JButton submitButton = new JButton("Submit Transfer");
        submitButton.setBounds(150, 200, 150, 30);
        contentPane.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                transferOwnership();
            }
        });
    }

    // Method to simulate the transfer of ownership
    private void transferOwnership() {
        String vin = vinField.getText();
        String currentOwner = currentOwnerField.getText();
        String newOwner = newOwnerField.getText();
        String qid = qidField.getText();

        if (vin.isEmpty() || currentOwner.isEmpty() || newOwner.isEmpty() || qid.isEmpty()) {
            statusLabel.setText("Please fill in all the fields.");
        } else {
            // Simulate registration verification, bill check, and invoice generation
            boolean isRegistered = verifyRegistration(vin);
            boolean hasUnpaidBills = checkForUnpaidBills(vin);

            if (!isRegistered) {
                statusLabel.setText("Error: VIN not registered.");
            } else if (hasUnpaidBills) {
                statusLabel.setText("Error: Unpaid bills. Cannot transfer ownership.");
            } else {
                generateInvoice();
                statusLabel.setText("Ownership transfer successful!");
            }
        }
    }

    // Simulated method to verify registration
    private boolean verifyRegistration(String vin) {
        // In a real system, you would query a database or external service
        return !vin.equals("000000");
    }

    // Simulated method to check for unpaid bills
    private boolean checkForUnpaidBills(String vin) {
        // In a real system, you would check a database for unpaid bills
        return false;
    }

    // Simulated method to generate an invoice
    private void generateInvoice() {
        // This would normally generate an invoice and possibly update the database
        System.out.println("Invoice generated.");
    }
}
