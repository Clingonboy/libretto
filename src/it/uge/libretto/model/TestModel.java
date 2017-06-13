package it.uge.libretto.model;

public class TestModel {

	public static void main(String[] args) {
		Model m = new Model();
		
		System.out.println(m.addEsame(new Esame("03FYZ", "Tecniche", "Mario")));
		System.out.println(m.addEsame(new Esame("03ZZZ", "Tricche", "Luigi")));
		System.out.println(m.addEsame(new Esame("03ZZZ", "Tricche", "Luigi")));
		
		System.out.println(m.trovaEsame("03FYZ"));
		System.out.println(m.trovaEsame("03ZZZ"));
		System.out.println(m.trovaEsame("03ZZ"));
	}

}
