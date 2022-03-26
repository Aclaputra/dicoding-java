package com.dicoding.javafundamental.accessmodifier.package3;

public class Perhitungan {
	// public static digunakan agar dapat diakses dimanapun
	public static int nilai = 0;
	
	protected static int getNilai() {
		return nilai;
	}
	// constructor setiap dipanggil variable nilai terjadi increment
	Perhitungan() {
		nilai++;
	}
}
