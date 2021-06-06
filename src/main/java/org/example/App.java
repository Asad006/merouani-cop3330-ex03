package org.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


public class App 
{
    public static void main( String[] args )
    {
        App app = new App();

        app.outputDisplay();
    }

    private void outputDisplay() {
        System.out.println( "What is the quote? "+"These aren't the droids you're looking for.\n"  +
                "Who said it? "+ "Obi-Wan Kenobi\n" +
                "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"" );
    }
}
