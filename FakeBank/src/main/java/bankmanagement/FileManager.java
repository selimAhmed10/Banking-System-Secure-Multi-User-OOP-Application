package bankmanagement;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    public static void writeProfilesToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("profiles.txt"))) {
            for (Profile profile : Profile.Profiles) {
                if (profile instanceof Client) {
                    Client client = (Client) profile;
                    writer.write("Client\n");
                    writer.write(client.getUsername() + "," + client.getEmail() + "," + client.getPassword() + "," +
                            client.getGender() + "," + client.getBalance() + "," + client.getLoan() + "," +
                            client.getRequestedLoan() + "\n");
                    
                    // Write concatenated transactions for each client
                    StringBuilder transactions = new StringBuilder();
                    for (Transaction transaction : client.getTransactions()) {
                        transactions.append(transaction.getAmount()).append("-").append(transaction.getType()).append(",");
                    }
                    writer.write(transactions.toString() + "\n");
                } else if (profile instanceof Admin) {
                    Admin admin = (Admin) profile;
                    writer.write("Admin\n");
                    writer.write(admin.getUsername() + "," + admin.getEmail() + "," + admin.getPassword() + "," +
                            admin.getGender() + "\n");
                }
            }
            writer.close();
            System.out.println("Profiles data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void readProfilesFromFile() {
        ArrayList<Profile> profiles = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("profiles.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals("Client")) {
                    String[] data = reader.readLine().split(",");
                    String username = data[0];
                    String email = data[1];
                    String password = data[2];
                    String gender = data[3];
                    int balance = Integer.parseInt(data[4]);
                    int loan = Integer.parseInt(data[5]);
                    int requestedLoan = Integer.parseInt(data[6]);
                    Client newClient = new Client(username, email, password, gender, balance, loan, requestedLoan);

                    // Read concatenated transactions for the client
                    String Transactionsline = reader.readLine();
                    if(!Transactionsline.equals("")){
                        String[] transactionsData = Transactionsline.split(",");
                        for (String transactionData : transactionsData) {
                            String[] transactionParts = transactionData.split("-");
                            int amount = Integer.parseInt(transactionParts[0]);
                            String type = transactionParts[1];
                            newClient.addTransaction(new Transaction(amount, type));
                        }
                    }
                    
                    profiles.add(newClient);
                    if (requestedLoan > 0) {
                        Admin.LoanRequests.add(newClient);
                    }
                } else if (line.equals("Admin")) {
                    String[] data = reader.readLine().split(",");
                    String username = data[0];
                    String email = data[1];
                    String password = data[2];
                    String gender = data[3];
                    profiles.add(new Admin(username, email, password, gender));
                }
            }

            reader.close();
            Profile.Profiles = profiles;
            System.out.println("Profiles data read from file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
