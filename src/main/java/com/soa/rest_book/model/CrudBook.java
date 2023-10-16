package com.soa.rest_book.model;

public class CrudBook {
    
    private String Id;
    private String titel;
    private String author;
    private String typeBook;
    
    public CrudBook(){

    }
    
    public CrudBook(String id, String titel, String author, String typeBook) {
        Id = id;
        this.titel = titel;
        this.author = author;
        this.typeBook = typeBook;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(String typeBook) {
        this.typeBook = typeBook;
    }

    

}