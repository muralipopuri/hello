package com.hello;

import java.util.Date;

/**
 * sample
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello Welcome back! now new code added -" + new Date());

		String dbUrl = System.getenv("DB_URL");
		System.out.println("dbUrl: " + dbUrl);
		String dbUser = System.getenv("DB_USER");
		System.out.println("dbUser: " + dbUser);
		String dbPass = System.getenv("DB_PASS");
		System.out.println("dbPass: " + dbPass);
		System.out.println(">>>>>>"+System.getenv("hhjhh"));
		System.out.println(">>>>>>"+System.getenv("dbpas"));
		
	}
}