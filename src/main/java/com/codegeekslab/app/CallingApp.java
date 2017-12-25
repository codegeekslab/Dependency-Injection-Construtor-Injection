package com.codegeekslab.app;

import com.codegeekslab.device.CellPhone;

public class CallingApp {

	private CellPhone phone;

	public CallingApp(CellPhone phone) {
		this.phone = phone;
	}

	public CellPhone getPhone() {
		return phone;
	}

	public void dialNumber(int number) {
		phone.makeCall(number);
	}

}
