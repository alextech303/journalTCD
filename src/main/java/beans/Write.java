package beans;

import java.time.LocalDate;
import java.util.Objects;

public class Write {
	private int id;
	private String name="";
	private String size_cell_1;
	private String size_cell_2;
	private String diameter;
	private String date;
	
	public Write(int id, String name, String size_cell_1, String size_cell_2, String diameter, String date) {
		super();
		this.id = id;
		this.name = name;
		this.size_cell_1 = size_cell_1;
		this.size_cell_2 = size_cell_2;
		this.diameter = diameter;
		this.date = date;
	}

	
	public Write(String name, String size_cell_1, String size_cell_2, String diameter, String date) {
		super();
		this.name = name;
		this.size_cell_1 = size_cell_1;
		this.size_cell_2 = size_cell_2;
		this.diameter = diameter;
		this.date = date;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize_cell_1() {
		return size_cell_1;
	}

	public void setSize_cell_1(String size_cell_1) {
		this.size_cell_1 = size_cell_1;
	}

	public String getSize_cell_2() {
		return size_cell_2;
	}

	public void setSize_cell_2(String size_cell_2) {
		this.size_cell_2 = size_cell_2;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, diameter, id, name, size_cell_1, size_cell_2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Write other = (Write) obj;
		return Objects.equals(date, other.date) && Objects.equals(diameter, other.diameter) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(size_cell_1, other.size_cell_1)
				&& Objects.equals(size_cell_2, other.size_cell_2);
	}

	@Override
	public String toString() {
		return "Write [id=" + id + ", name=" + name + ", size_cell_1=" + size_cell_1 + ", size_cell_2=" + size_cell_2
				+ ", diameter=" + diameter + ", date=" + date + "]";
	}
	
	
	
	
}
