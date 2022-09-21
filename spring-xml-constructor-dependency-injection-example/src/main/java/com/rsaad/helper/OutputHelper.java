package com.rsaad.helper;

import com.rsaad.generator.InOutGenerator;

public class OutputHelper {

	private InOutGenerator inOutGenerator;
	
	public OutputHelper(InOutGenerator inOutGenerator) {
		this.inOutGenerator = inOutGenerator;
	}

	public void generateOutput() {
		inOutGenerator.generateOutput();
	}

}
