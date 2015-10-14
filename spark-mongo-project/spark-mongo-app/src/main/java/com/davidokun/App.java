package com.davidokun;


import static spark.Spark.get;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        get("/hello", (req, res) -> "Hello World Spark and Mongo");

    }
}
