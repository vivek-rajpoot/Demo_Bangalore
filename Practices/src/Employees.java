
public class Employees {
	int id;
	String name;
	String technology;

	Employees(int id, String name, String technology) {
		this.id = id;
		this.name = name;
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", technology=" + technology + "]";
	}
}
