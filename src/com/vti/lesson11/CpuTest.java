package com.vti.lesson11;

public class CpuTest {
	public static void main(String[] args) {
		Cpu cpu = new Cpu(100.f);
		Cpu.Processor pr1 = cpu.new Processor(99, "Intel");
		System.out.println(pr1.getCache());
		Cpu.Ram r1 = cpu.new Ram("512Gb", "Kingstom");
		System.out.println(r1.getClockSpeed());

	}

}
