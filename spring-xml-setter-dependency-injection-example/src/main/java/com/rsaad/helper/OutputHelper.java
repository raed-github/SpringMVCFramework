package com.rsaad.helper;

import com.rsaad.generator.InOutGenerator;

public class OutputHelper {

	private InOutGenerator inOutGenerator;

	public void generateOutput() {
		inOutGenerator.generateOutput();
	}
	
	public InOutGenerator getInOutGenerator() {
		return inOutGenerator;
	}

	public void setInOutGenerator(InOutGenerator inOutGenerator) {
		this.inOutGenerator = inOutGenerator;
	}
	
}
