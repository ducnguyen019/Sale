package com.vti.lesson11;

public class Cpu {
	private float price;
	private Processor processor;
	private Ram ram;

	public Cpu(float price) {
		this.price = price;
	}

	public class Processor {
		private int coreAmount;
		private String manufacture;

		public Processor(int coreAmount, String manufacture) {
			this.coreAmount = coreAmount;
			this.manufacture = manufacture;
		}

		public float getCache() {
			return 4.3f;
		}
	}

	public class Ram {
		private String memory;
		private String manufacture;

		public Ram(String memory, String manufacture) {
			this.memory = memory;
			this.manufacture = manufacture;
		}

		public float getClockSpeed() {
			return 5.5f;
		}

	}

}
