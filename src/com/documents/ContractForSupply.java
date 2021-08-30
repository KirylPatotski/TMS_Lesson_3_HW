package com.documents;
//This class organises the contracts for supplies.
public class ContractForSupply extends Document{
    String typeOfGoods;
    int amountOfGoods;
    public ContractForSupply(String a, String b, String c, int d){
        this.docNumber=a;
        this.docDate=b;
        this.typeOfGoods=c;
        this.amountOfGoods=d;
    }
}
