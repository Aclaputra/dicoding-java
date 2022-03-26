package com.dicoding.javafundamental.propertymethod;

public class Hewan {
	double tinggi = 30;
	double berat = 3;
	int umur;
	
	// constructor
	Hewan(int umur) {
		// this.umur is a property and umur is a parameter
		this.umur = umur;
	}
	// method void (not returning values back).
	void lari() {
		System.out.println("Berlari dengan sangat cepat..");
	}
	void jalan() {
		System.out.println("Berjalan dengan pelan..");
	}
	void makan() {
		System.out.println("Makan dengan menggunakan mulut..");
	}
	
	// method double returning double data type.
	double getBerat() {
		return berat;
	}
	double getTinggi() {
		return tinggi;
	}
	double getUmur() {
		return umur;
	}
}
