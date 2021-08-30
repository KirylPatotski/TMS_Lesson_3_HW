package com.documents;
//This class organises the financial reports of each month
public class FinancialInvoice extends Document{
    double totalAmount;
    String departmentCode;
    public FinancialInvoice(String a, String b, String c, int d){
        this.docNumber= a;
        this.docDate=b;
        this.departmentCode=c;
        this.totalAmount=d;
    }
}
