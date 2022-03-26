package com.dicoding.javafundamental.obyek;

public class Hewan {
	String nama;
	int berat;
	int jumlahKaki;
	
	// constructor
	public Hewan(String namaHewan) {
		nama = namaHewan;
	}
	
	// method ambil data ke local
	public void beratHewan(int beratHewan) {
		berat = beratHewan;
	}
	public void jumlahKakiHewan(int jumlahKakiHewan) {
		jumlahKaki = jumlahKakiHewan;
	}
	
	// method cetak
	public void cetakHewan() {
		System.out.println("Nama hewan : " + nama);
		System.out.println("Berat hewan : " + berat + " kg");
		System.out.println("Jumlah kaki : " + jumlahKaki);
	}
}
