package beans;

import java.time.LocalDate;
import java.util.Objects;

public class Write {
	
	private String name;
	private double size_cell_1;
	private double size_cell_2;
	private double diameter;
	private LocalDate date;
	
	
	
	public Write() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSize_cell_1() {
		return size_cell_1;
	}
	public void setSize_cell_1(double size_cell_1) {
		this.size_cell_1 = size_cell_1;
	}
	public double getSize_cell_2() {
		return size_cell_2;
	}
	public void setSize_cell_2(double size_cell_2) {
		this.size_cell_2 = size_cell_2;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, diameter, name, size_cell_1, size_cell_2);
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
		return Objects.equals(date, other.date)
				&& Double.doubleToLongBits(diameter) == Double.doubleToLongBits(other.diameter)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(size_cell_1) == Double.doubleToLongBits(other.size_cell_1)
				&& Double.doubleToLongBits(size_cell_2) == Double.doubleToLongBits(other.size_cell_2);
	}

	@Override
	public String toString() {
		return "Write [name=" + name + ", size_cell_1=" + size_cell_1 + ", size_cell_2=" + size_cell_2 + ", diameter="
				+ diameter + ", date=" + date + "]";
	}
	
	
	
}
