package com.codegyani.course;
/* Copyright (c) 2019 
 * Company: MyToshika
 * project Name: Code Gyani
 * Module:Course
 * version: 1.0
 * Date: 15/12/2019
 * author: ALI SNSA
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        System.out.println("\n \n \n Application Started at port no 8080. you may proceed\n");
    }
}
