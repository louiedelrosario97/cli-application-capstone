
// This is where we will manage all of our transactions. Reading files, entering new data, etc.

package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LedgerData
{
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public LedgerData() {
        loadTransactions();
    }

    private void loadTransactions()
    {           // Plug in file/buff reader, if statement that includes "no data" possibility
        try
        {
            FileReader fileReader = new FileReader("transaction_history.csv");
            BufferedReader br = new BufferedReader(fileReader);

            String line; // Declare variable to use in while loop
            while ((line = br.readLine()) != null)
            {
                String[] columns = line.split("\\|");
                if (columns == 5)                                     // ???
                {
                    String date = columns[0];
                    String time = columns[1];
                    String description = columns[2];
                    String vendor = columns[3];
                    double amount = Double.parseDouble(columns[4]);

                    transactions.add(new Transaction(date, time, description, vendor, amount));
                }
            }
            br.close();
        } catch (IOException e)
        {
            System.out.println("No transaction data available.");
        }
    }
}
