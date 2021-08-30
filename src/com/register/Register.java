package com.register;
//Methods and other things to organise the contracts and other documents.
public class Register implements IRegister  {
    String[] Doc = new String[10];
    int i = 0;

    @Override
    public void registerNewDocument(String docNumber, String docDate) {
        Doc[i] = docNumber + " " + docDate;
        System.out.print(Doc[i]);
        System.out.println("");
        i++;
    }
}

