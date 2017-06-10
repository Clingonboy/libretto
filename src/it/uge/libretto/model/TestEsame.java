package it.uge.libretto.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {
		Esame tdp = new Esame("03FYZ", "Tecniche", "Mario");
		System.out.println(tdp);
		Esame ami = new Esame("03ZZZ", "Tricche", "Luigi");
		System.out.println(ami);
		System.out.println(ami.equals(tdp));
		
		tdp.supera(30, LocalDate.now());
		System.out.println(tdp);
		
		
	}

}
