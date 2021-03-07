package project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Genres")
public class Genres {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "horror")
	private String horror;

	@Column(name= "comedy")
	private String comedy;

	public Integer getId() {
		return id;		
	}
	public String Horror() {
		return horror;
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
	public String getHorror1() {
		return horror;
	}

	public void setHorror(String horror) {
		this.horror = horror;
		
	}

	public Object getHorror() {
		return null;
	}
	public String getComedy() {
		return comedy;
	}

	public void setComedy(String comedy) {
		this.comedy = comedy;
		
	}

	public Object getComedy1() {
		return null;
	}

	public void setHorror(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setComedy(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setName(int i) {
		// TODO Auto-generated method stub
		
	}
}
