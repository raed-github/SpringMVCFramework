package com.rsaad.helper;

import com.rsaad.generator.FileGenerator;

public class CsvHelper implements Helper {

	private FileGenerator fileGenerator;
	
	public FileGenerator getFileGenerator() {
		return fileGenerator;
	}

	public void setFileGenerator(FileGenerator fileGenerator) {
		this.fileGenerator = fileGenerator;
	}

	public void generateOutput() {
		fileGenerator.generateOutput();
	}

}
