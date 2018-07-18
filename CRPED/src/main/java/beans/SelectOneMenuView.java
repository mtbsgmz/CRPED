package beans;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class SelectOneMenuView {

	private String city;
	private Map<String, String> cities = new HashMap<String, String>();

	@PostConstruct
	public void init() {

		cities = new HashMap<String, String>();
		cities.put("New York", "New York");
		cities.put("London", "London");
		cities.put("Paris", "Paris");
		cities.put("Barcelona", "Barcelona");
		cities.put("Istanbul", "Istanbul");
		cities.put("Berlin", "Berlin");

	}
}