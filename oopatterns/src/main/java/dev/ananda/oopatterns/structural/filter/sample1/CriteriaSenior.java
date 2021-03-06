package dev.ananda.oopatterns.structural.filter.sample1;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaSenior implements Criteria {

	@Override
	public List<Employee> filter(List<Employee> employees) {
		return employees.stream().filter(e -> e.getPosition().equals("Senior"))
				.collect(Collectors.toList());
	}

}
