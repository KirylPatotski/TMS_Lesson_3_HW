package com.documents;
//This class organises the contracts with employees .
public class ContractWithEmployee extends Document{
    String employerName;
    String contractExpirationDate;
    public ContractWithEmployee(String a, String b, String c, String d){
        this.docNumber=a;
        this.docDate=b;
        this.employerName=c;
        this.contractExpirationDate=d;
    }
}
