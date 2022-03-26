package com.dicoding.javafundamental.accessmodifier.package4;

// class yang dideklarasikan sebagai final tidak bisa dijadikan sbg induk kelas
final class Lingkaran {
	static final double PI = 3.141;
	
	int jari = 7;
	
	final double getLuas() {
		return PI * (jari * jari);
	}
}
