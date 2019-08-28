package vivek;

public class Employees {
	
	 int id;
	 String name;
	 String tech;
	public Employees(int id, String name, String tech) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	} 

}
