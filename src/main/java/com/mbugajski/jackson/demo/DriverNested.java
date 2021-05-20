package com.mbugajski.jackson.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mbugajski.jackson.demo.entity.Address;
import com.mbugajski.jackson.demo.entity.Student;

public class DriverNested {
	public static void main(String[] args) {

		try {

			ObjectMapper mapper = new ObjectMapper();

			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

			System.out.println("First name: " + theStudent.getFirstName());
			System.out.println("Last name: " + theStudent.getLastName());

			Address tempAddress = theStudent.getAddress();

			System.out.println("Street = " + tempAddress.getStreet());
			System.out.println("City = " + tempAddress.getCity());
			System.out.println("State = " + tempAddress.getState());
			System.out.println("Country = " + tempAddress.getCountry());
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}