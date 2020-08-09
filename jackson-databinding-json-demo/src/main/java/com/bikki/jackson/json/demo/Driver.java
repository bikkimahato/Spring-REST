package com.bikki.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {

			ObjectMapper mapper = new ObjectMapper();

//			Student myStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			Student myStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

			System.out.println("First Name : " + myStudent.getFirstName());
			System.out.println("Last Name : " + myStudent.getLastName());

			Address tempAddress = myStudent.getAddress();
			System.out.println("Street : " + tempAddress.getStreet());
			System.out.println("City : " + tempAddress.getCity());

			for (String tempLang : myStudent.getLanguages()) {
				System.out.println(tempLang);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
