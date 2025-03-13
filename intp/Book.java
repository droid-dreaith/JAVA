import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private int yearPublished;
    Scanner sc = new Scanner(System.in);

    public Book(){
        this.title = "Unknown title";
        this.author = "Unknown author";
        this.yearPublished = 0;
    }

    public Book(String title,String author,int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;

    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);   
        }
    }
