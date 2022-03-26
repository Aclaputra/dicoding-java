package com.dicoding.javafundamental.accessmodifier;

public class KelasA {
	// private tidak bisa dipanggil langsung diluar kelas ini seperti konsep Abstraction
	private int memberA = 5;
	
	private int functionA() {
		return memberA;
	}
	
	int functionB() {
		// Pemanggilan private member dan private function
		int hasil = functionA() + memberA;
		return hasil;
	}
}
