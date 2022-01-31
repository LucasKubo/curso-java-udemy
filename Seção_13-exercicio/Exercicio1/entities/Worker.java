package entities;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	public Worker(String name, WorkerLevel level, Double baseSalary) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void addContract(HourContract contract) {

	}

	public void removeContract(HourContract contract) {

	}
	
	public Double income(Integer year, Integer month) {
		return 0.0;	
	}
}
