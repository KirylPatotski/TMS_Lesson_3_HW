package com.documents;
//storage saver. This is an abstract class. 
public abstract class Document {
    public String docNumber;
    public String docDate;
    public String toString(){
        return docNumber + " " + docDate;
    }
}
