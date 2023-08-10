package beans;

import java.util.Objects;

public class WriteS500 {
	
	private int id;
	private String date;
	private String name="";
	private String butch_number;
	private String nominal_diameter;
	private String nominal_square;
	private String linear_mass;
	private String ovality;
	private String carbon_equivalent;
	private String ultimate_strength; //предел прочности, временное сопративление
	private String yield_strength; //предел текучести
	private String relation_of_ultStr_to_yieldStr;// отношение временного сопративления к физическому пределу текучести
	private String relative_elongation; // относительное удлинение
	private String height_of_transverse_ribs; //высота поперечных ребер
	private String rib_thickness;//толщина ребра
	private String edge_pitch; // шаг ребер
	private String note;
	
	public WriteS500(int id, String date, String name, String butch_number, String nominal_diameter,
			String nominal_square, String linear_mass, String ovality, String carbon_equivalent,
			String ultimate_strength, String yield_strength, String relation_of_ultStr_to_yieldStr,
			String relative_elongation, String height_of_transverse_ribs, String rib_thickness, String edge_pitch,
			String note) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.butch_number = butch_number;
		this.nominal_diameter = nominal_diameter;
		this.nominal_square = nominal_square;
		this.linear_mass = linear_mass;
		this.ovality = ovality;
		this.carbon_equivalent = carbon_equivalent;
		this.ultimate_strength = ultimate_strength;
		this.yield_strength = yield_strength;
		this.relation_of_ultStr_to_yieldStr = relation_of_ultStr_to_yieldStr;
		this.relative_elongation = relative_elongation;
		this.height_of_transverse_ribs = height_of_transverse_ribs;
		this.rib_thickness = rib_thickness;
		this.edge_pitch = edge_pitch;
		this.note = note;
	}
	public WriteS500(String date, String name, String butch_number, String nominal_diameter, String nominal_square,
			String linear_mass, String ovality, String carbon_equivalent, String ultimate_strength,
			String yield_strength, String relation_of_ultStr_to_yieldStr, String relative_elongation,
			String height_of_transverse_ribs, String rib_thickness, String edge_pitch, String note) {
		super();
		this.date = date;
		this.name = name;
		this.butch_number = butch_number;
		this.nominal_diameter = nominal_diameter;
		this.nominal_square = nominal_square;
		this.linear_mass = linear_mass;
		this.ovality = ovality;
		this.carbon_equivalent = carbon_equivalent;
		this.ultimate_strength = ultimate_strength;
		this.yield_strength = yield_strength;
		this.relation_of_ultStr_to_yieldStr = relation_of_ultStr_to_yieldStr;
		this.relative_elongation = relative_elongation;
		this.height_of_transverse_ribs = height_of_transverse_ribs;
		this.rib_thickness = rib_thickness;
		this.edge_pitch = edge_pitch;
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
	public String getNominal_square() {
		return nominal_square;
	}
	public void setNominal_square(String nominal_square) {
		this.nominal_square = nominal_square;
	}
	public String getLinear_mass() {
		return linear_mass;
	}
	public void setLinear_mass(String linear_mass) {
		this.linear_mass = linear_mass;
	}
	public String getOvality() {
		return ovality;
	}
	public void setOvality(String ovality) {
		this.ovality = ovality;
	}
	public String getCarbon_equivalent() {
		return carbon_equivalent;
	}
	public void setCarbon_equivalent(String carbon_equivalent) {
		this.carbon_equivalent = carbon_equivalent;
	}
	public String getUltimate_strength() {
		return ultimate_strength;
	}
	public void setUltimate_strength(String ultimate_strength) {
		this.ultimate_strength = ultimate_strength;
	}
	public String getYield_strength() {
		return yield_strength;
	}
	public void setYield_strength(String yield_strength) {
		this.yield_strength = yield_strength;
	}
	public String getRelation_of_ultStr_to_yieldStr() {
		return relation_of_ultStr_to_yieldStr;
	}
	public void setRelation_of_ultStr_to_yieldStr(String relation_of_ultStr_to_yieldStr) {
		this.relation_of_ultStr_to_yieldStr = relation_of_ultStr_to_yieldStr;
	}
	public String getRelative_elongation() {
		return relative_elongation;
	}
	public void setRelative_elongation(String relative_elongation) {
		this.relative_elongation = relative_elongation;
	}
	public String getHeight_of_transverse_ribs() {
		return height_of_transverse_ribs;
	}
	public void setHeight_of_transverse_ribs(String height_of_transverse_ribs) {
		this.height_of_transverse_ribs = height_of_transverse_ribs;
	}
	public String getRib_thickness() {
		return rib_thickness;
	}
	public void setRib_thickness(String rib_thickness) {
		this.rib_thickness = rib_thickness;
	}
	public String getEdge_pitch() {
		return edge_pitch;
	}
	public void setEdge_pitch(String edge_pitch) {
		this.edge_pitch = edge_pitch;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public int hashCode() {
		return Objects.hash(butch_number, carbon_equivalent, date, edge_pitch, height_of_transverse_ribs, id,
				linear_mass, name, nominal_diameter, nominal_square, note, ovality, relation_of_ultStr_to_yieldStr,
				relative_elongation, rib_thickness, ultimate_strength, yield_strength);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WriteS500 other = (WriteS500) obj;
		return Objects.equals(butch_number, other.butch_number)
				&& Objects.equals(carbon_equivalent, other.carbon_equivalent) && Objects.equals(date, other.date)
				&& Objects.equals(edge_pitch, other.edge_pitch)
				&& Objects.equals(height_of_transverse_ribs, other.height_of_transverse_ribs) && id == other.id
				&& Objects.equals(linear_mass, other.linear_mass) && Objects.equals(name, other.name)
				&& Objects.equals(nominal_diameter, other.nominal_diameter)
				&& Objects.equals(nominal_square, other.nominal_square) && Objects.equals(note, other.note)
				&& Objects.equals(ovality, other.ovality)
				&& Objects.equals(relation_of_ultStr_to_yieldStr, other.relation_of_ultStr_to_yieldStr)
				&& Objects.equals(relative_elongation, other.relative_elongation)
				&& Objects.equals(rib_thickness, other.rib_thickness)
				&& Objects.equals(ultimate_strength, other.ultimate_strength)
				&& Objects.equals(yield_strength, other.yield_strength);
	}
	@Override
	public String toString() {
		return "WriteS500 [id=" + id + ", date=" + date + ", name=" + name + ", butch_number=" + butch_number
				+ ", nominal_diameter=" + nominal_diameter + ", nominal_square=" + nominal_square + ", linear_mass="
				+ linear_mass + ", ovality=" + ovality + ", carbon_equivalent=" + carbon_equivalent
				+ ", ultimate_strength=" + ultimate_strength + ", yield_strength=" + yield_strength
				+ ", relation_of_ultStr_to_yieldStr=" + relation_of_ultStr_to_yieldStr + ", relative_elongation="
				+ relative_elongation + ", height_of_transverse_ribs=" + height_of_transverse_ribs + ", rib_thickness="
				+ rib_thickness + ", edge_pitch=" + edge_pitch + ", note=" + note + "]";
	}
	
	
	
	
	
	
}

