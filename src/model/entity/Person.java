package model.entity;

import java.io.Serializable;

public class Person  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String name;
	private String emial;
	
	public Person() {}

	public Person(Integer id, String name, String emial) {
		super();
		this.id = id;
		this.name = name;
		this.emial = emial;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", emial=" + emial + "]";
	}
	
	
	
	

}
