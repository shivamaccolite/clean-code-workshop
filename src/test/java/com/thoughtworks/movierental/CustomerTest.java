package com.thoughtworks.movierental;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    Customer myCustomer = new Customer("myCustomer");
    @Test
    public void test(){
        String movieTitle="Yaadein";
        int priceCode = 0;
        int daysRented = 3;
        Movie movie =new Movie(movieTitle, priceCode);
        Rental rental = new Rental(movie, daysRented);
        myCustomer.addRental(rental);
        String result = "Rental Record for myCustomer\n\tYaadein\t3.5\nAmount owed is 3.5\nYou earned 1 frequent renter points";
        System.out.println(result);
        assertEquals(result, myCustomer.statement());
    }
    @Test
    public void test1(){
        String movieTitle="Yaadein";
        int priceCode = 1;
        int daysRented = 2;
        Movie movie =new Movie(movieTitle, priceCode);
        Rental rental = new Rental(movie, daysRented);
        myCustomer.addRental(rental);
        String result = "Rental Record for myCustomer\n\tYaadein\t6.0\nAmount owed is 6.0\nYou earned 2 frequent renter points";
        System.out.println(result);
        assertEquals(result, myCustomer.statement());
    }
    @Test
    public void test2(){
        String movieTitle="Yaadein";
        int priceCode = 0;
        int daysRented = 2;
        Movie movie =new Movie(movieTitle, priceCode);
        Rental rental = new Rental(movie, daysRented);
        myCustomer.addRental(rental);
        String result = "Rental Record for myCustomer\n\tYaadein\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points";
        System.out.println(result);
        assertEquals(result, myCustomer.statement());
    }
    @Test
    public void test3(){
        String movieTitle="Yaadein";
        int priceCode = 1;
        int daysRented = 1;
        Movie movie =new Movie(movieTitle, priceCode);
        Rental rental = new Rental(movie, daysRented);
        myCustomer.addRental(rental);
        String result = "Rental Record for myCustomer\n\tYaadein\t3.0\nAmount owed is 3.0\nYou earned 1 frequent renter points";
        System.out.println(result);
        assertEquals(result, myCustomer.statement());
    }
    @Test
    public void test4(){
        String movieTitle="Yaadein";
        int priceCode = 2;
        int daysRented = 2;
        Movie movie =new Movie(movieTitle, priceCode);
        Rental rental = new Rental(movie, daysRented);
        myCustomer.addRental(rental);
        String result = "Rental Record for myCustomer\n\tYaadein\t1.5\nAmount owed is 1.5\nYou earned 1 frequent renter points";
        System.out.println(result);
        assertEquals(result, myCustomer.statement());
    }
    @Test
    public void test5(){
        String movieTitle="Yaadein";
        int priceCode = 2;
        int daysRented = 4;
        Movie movie =new Movie(movieTitle, priceCode);
        Rental rental = new Rental(movie, daysRented);
        myCustomer.addRental(rental);
        String result = "Rental Record for myCustomer\n\tYaadein\t3.0\nAmount owed is 3.0\nYou earned 1 frequent renter points";
        System.out.println(result);
        assertEquals(result, myCustomer.statement());
    }
    @Test
    public void test6(){
        String movieTitle="Yaadein";
        int priceCode = 0;
        int daysRented = 3;
        String movieTitle1="Yaadein1";
        int priceCode1 = 1;
        int daysRented1 = 2;
        String movieTitle2="Yaadein2";
        int priceCode2 = 2;
        int daysRented2 = 4;
        Movie movie =new Movie(movieTitle, priceCode);
        Movie movie1 =new Movie(movieTitle1, priceCode1);
        Movie movie2 =new Movie(movieTitle2, priceCode2);
        Rental rental = new Rental(movie, daysRented);
        Rental rental1 = new Rental(movie1, daysRented1);
        Rental rental2 = new Rental(movie2, daysRented2);
        myCustomer.addRental(rental);
        myCustomer.addRental(rental1);
        myCustomer.addRental(rental2);
        String result = "Rental Record for myCustomer\n\tYaadein\t3.5\n\tYaadein1\t6.0\n\tYaadein2\t3.0\nAmount owed is 12.5\nYou earned 4 frequent renter points";
        System.out.println(result);
        assertEquals(result, myCustomer.statement());
    }
    @Test
    public void test7(){
        String movieTitle="Yaadein";
        int priceCode = 0;
        int daysRented = 3;
        String movieTitle1="Yaadein1";
        int priceCode1 = 1;
        int daysRented1 = 2;
        String movieTitle2="Yaadein2";
        int priceCode2 = 2;
        int daysRented2 = 4;
        Movie movie =new Movie(movieTitle, priceCode);
        Movie movie1 =new Movie(movieTitle1, priceCode1);
        Movie movie2 =new Movie(movieTitle2, priceCode2);
        Rental rental = new Rental(movie, daysRented);
        Rental rental1 = new Rental(movie1, daysRented1);
        Rental rental2 = new Rental(movie2, daysRented2);
        myCustomer.addRental(rental);
        myCustomer.addRental(rental1);
        myCustomer.addRental(rental2);
        String result = "<h1>Rental Record for <b>myCustomer</b></h1><br/>" +
                " Yaadein 3.5<br/>" +
                " Yaadein1 6.0<br/>" +
                " Yaadein2 3.0<br/>" +
                "Amount owed is <b>12.5</b><br/>" +
                "You earned <b>4</b> frequent renter points";
        System.out.println(result);
        assertEquals(result, myCustomer.htmlstatement());
    }
}