package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        Movies1 movies1 = new Movies1();
        movies1.initMovieSeats();
        movies1.getSeats(7);
        movies1.getSeats(3);
        movies1.getSeats(4);
        movies1.getSeats(1);
        movies1.getSeats(8);
        movies1.getSeats(20);
        movies1.getSeats(15);
        movies1.getSeats(20);
        movies1.getSeats(15);
        movies1.getSeats(5);


        for (int i = 0; i < movies1.text.length; i++) {
            System.out.println( Arrays.toString(movies1.text[i]));
        }

    }


}
