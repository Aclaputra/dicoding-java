package com.dicoding.javafundamental.kelas;

public class KucingAnggora {
	String namaKucing;
	int beratBadan;
	
	public KucingAnggora(String name, int berat) {
		namaKucing = name;
		beratBadan = berat;
		
	}
	
	public void printAku() {
		System.out.println("namaku: " + namaKucing + ", beratku: " + beratBadan);
	}


}
