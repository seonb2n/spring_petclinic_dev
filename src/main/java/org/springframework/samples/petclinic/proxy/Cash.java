package org.springframework.samples.petclinic.proxy;

public class Cash implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("카드 결재 : " + amount);
	}
}
