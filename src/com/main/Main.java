package com.main;
// This class simulates the behavior of this program.
import com.register.Register;
import com.documents.ContractForSupply;
import com.documents.FinancialInvoice;
import com.documents.ContractWithEmployee;
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        ContractForSupply doc1 = new ContractForSupply("3014159265", "22/08/2021", "Paper", 1000);
        ContractWithEmployee doc2 = new ContractWithEmployee("462100979", "22/08/2021", "Andrew", "1/09/2021");
        FinancialInvoice doc3 = new FinancialInvoice("359356679", "22/08/2021", "0001", 10999);
        ContractForSupply doc4 = new ContractForSupply("589822663", "22/08/2021", "Pen", 100);
        ContractWithEmployee doc5 = new ContractWithEmployee("189656656", "22/08/2021", "Vladimir", "1/09/2021");
        ContractForSupply doc6 = new ContractForSupply("738655225", "22/08/2021", "Chair", 5);
        ContractForSupply doc7 = new ContractForSupply("64531587","23/08/2021","Notebooks",10);
        Register register = new Register();
        register.registerNewDocument(doc1.docNumber,doc1.docDate);
        register.registerNewDocument(doc2.docNumber,doc2.docDate);
        register.registerNewDocument(doc3.docNumber,doc3.docDate);
        register.registerNewDocument(doc4.docNumber,doc1.docDate);
        register.registerNewDocument(doc5.docNumber,doc5.docDate);
        register.registerNewDocument(doc6.docNumber,doc6.docDate);
        register.registerNewDocument(doc7.docNumber,doc7.docDate);


        System.out.println("End");
    }
}
