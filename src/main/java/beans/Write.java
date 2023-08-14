package beans;

import java.time.LocalDate;
import java.util.Objects;

public class Write {
	private int id;
	
	private String date;
	private String name="";

	private String butch_number;
	private String nominal_diameter;
	
	private String size_cell_1;
	private String size_cell_2;
	
	private String sediment;
	private String card_size;
	private String cross_releases;
	private String longitudinal_releases;
	private String straightforwardness;
	private String diagonal;
	private String impact;
	private int wire_idwire;
	private String note;
	
	
	
	public Write(int id, String date, String name, String butch_number, String nominal_diameter, String size_cell_1,
			String size_cell_2, String sediment, String card_size, String cross_releases, String longitudinal_releases,
			String straightforwardness, String diagonal, String impact, int wire_idwire, String note) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.butch_number = butch_number;
		this.nominal_diameter = nominal_diameter;
		this.size_cell_1 = size_cell_1;
		this.size_cell_2 = size_cell_2;
		this.sediment = sediment;
		this.card_size = card_size;
		this.cross_releases = cross_releases;
		this.longitudinal_releases = longitudinal_releases;
		this.straightforwardness = straightforwardness;
		this.diagonal = diagonal;
		this.impact = impact;
		this.wire_idwire=wire_idwire;
		this.note = note;
	}



	public Write(String date, String name, String butch_number, String nominal_diameter, String size_cell_1,
			String size_cell_2, String sediment, String card_size, String cross_releases, String longitudinal_releases,
			String straightforwardness, String diagonal, String impact, String note) {
		super();
		this.date = date;
		this.name = name;
		this.butch_number = butch_number;
		this.nominal_diameter = nominal_diameter;
		this.size_cell_1 = size_cell_1;
		this.size_cell_2 = size_cell_2;
		this.sediment = sediment;
		this.card_size = card_size;
		this.cross_releases = cross_releases;
		this.longitudinal_releases = longitudinal_releases;
		this.straightforwardness = straightforwardness;
		this.diagonal = diagonal;
		this.impact = impact;
		this.note = note;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getButch_number() {
		return butch_number;
	}



	public void setButch_number(String butch_number) {
		this.butch_number = butch_number;
	}



	public String getNominal_diameter() {
		return nominal_diameter;
	}



	public void setNominal_diameter(String nominal_diameter) {
		this.nominal_diameter = nominal_diameter;
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



	public String getSediment() {
		return sediment;
	}



	public void setSediment(String sediment) {
		this.sediment = sediment;
	}



	public String getCard_size() {
		return card_size;
	}



	public void setCard_size(String card_size) {
		this.card_size = card_size;
	}



	public String getCross_releases() {
		return cross_releases;
	}



	public void setCross_releases(String cross_releases) {
		this.cross_releases = cross_releases;
	}



	public String getLongitudinal_releases() {
		return longitudinal_releases;
	}



	public void setLongitudinal_releases(String longitudinal_releases) {
		this.longitudinal_releases = longitudinal_releases;
	}



	public String getStraightforwardness() {
		return straightforwardness;
	}



	public void setStraightforwardness(String straightforwardness) {
		straightforwardness = straightforwardness;
	}



	public String getDiagonal() {
		return diagonal;
	}



	public void setDiagonal(String diagonal) {
		this.diagonal = diagonal;
	}



	public String getImpact() {
		return impact;
	}



	public void setImpact(String impact) {
		this.impact = impact;
	}



	public int getWire_idwire() {
		return wire_idwire;
	}



	public void setWire_idwire(int wire_idwire) {
		this.wire_idwire = wire_idwire;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}



	@Override
	public int hashCode() {
		return Objects.hash(butch_number, card_size, cross_releases, date, diagonal, id, impact, longitudinal_releases,
				name, nominal_diameter, note, sediment, size_cell_1, size_cell_2, straightforwardness, wire_idwire);
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
		return Objects.equals(butch_number, other.butch_number) && Objects.equals(card_size, other.card_size)
				&& Objects.equals(cross_releases, other.cross_releases) && Objects.equals(date, other.date)
				&& Objects.equals(diagonal, other.diagonal) && id == other.id && Objects.equals(impact, other.impact)
				&& Objects.equals(longitudinal_releases, other.longitudinal_releases)
				&& Objects.equals(name, other.name) && Objects.equals(nominal_diameter, other.nominal_diameter)
				&& Objects.equals(note, other.note) && Objects.equals(sediment, other.sediment)
				&& Objects.equals(size_cell_1, other.size_cell_1) && Objects.equals(size_cell_2, other.size_cell_2)
				&& Objects.equals(straightforwardness, other.straightforwardness)
				&& Objects.equals(wire_idwire, other.wire_idwire);
	}



	@Override
	public String toString() {
		return "Write [id=" + id + ", date=" + date + ", name=" + name + ", butch_number=" + butch_number
				+ ", nominal_diameter=" + nominal_diameter + ", size_cell_1=" + size_cell_1 + ", size_cell_2="
				+ size_cell_2 + ", sediment=" + sediment + ", card_size=" + card_size + ", cross_releases="
				+ cross_releases + ", longitudinal_releases=" + longitudinal_releases + ", straightforwardness="
				+ straightforwardness + ", diagonal=" + diagonal + ", impact=" + impact + ", wire_idwire=" + wire_idwire
				+ ", note=" + note + "]";
	}







	


	
	
	
	
	
}
