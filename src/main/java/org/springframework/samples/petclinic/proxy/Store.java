package org.springframework.samples.petclinic.proxy;

public class Store {

	Payment payment;

	public void doPay(int amount) {
		payment.pay(amount);
	}

}
