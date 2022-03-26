package com.dicoding.javafundamental.accessmodifier.package4;

import java.io.Serializable;

class Test implements Serializable {
	// vaiabel ini tidak akan dijaga nilainya
	transient int nilaiA;
	
	// variabel ini akan dijaga nilainya
	double nilaiB;
	String nilaiC;
	
	/**
	 * Synchronized modifier digunakan untuk membatasi akses ke-
	 * suatu variable/methods yang hanya boleh dilakukan oleh satu threa.
	 * 
	 * Ketika ada 2 thread yang ingin mengakses synchronized variable/methods,
	 * maka prosesnya akan dilakukan secara serial (bergantian)
	 */
	
	public synchronized void showData() {
		//contoh
	}
}
