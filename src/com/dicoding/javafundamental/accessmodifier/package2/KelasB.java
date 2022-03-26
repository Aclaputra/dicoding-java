package com.dicoding.javafundamental.accessmodifier.package2;

import com.dicoding.javafundamental.accessmodifier.package1.KelasA;

// lakukan inheritance dari KelasA
public class KelasB extends KelasA{
	// lakukan polymorphism dengan cara Override method pada KelasA di pacakge1
	@Override
	protected void methodC() {
		super.methodC();
		
		System.out.println("Contoh pemanggilan protected dari package luar");
	}
}
