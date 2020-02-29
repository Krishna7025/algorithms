package dev.ananda.oopatterns.creational.prototype.sample1;

public class Manager extends Employee {
	public Manager() {
		position = "Intern";
	}

	@Override
	void work() {
		System.out.println("Writing a schedule for the project!");
	}

}
