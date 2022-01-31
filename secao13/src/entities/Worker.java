package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private List<HourContract> contracts;
	
	public Worker(String name, WorkerLevel level, Double baseSalary) {
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

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
	}

	public void addContracts(HourContract contract) {
		if(contracts==null) {
			contracts = new ArrayList<HourContract>();
		}
		contracts.add(contract);
	}
	
	public void removeContracts(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(Integer year, Integer month) {
		double totalIncome = 0;
		for (int i = 0; i < this.contracts.size() ; i++) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(this.contracts.get(i).getDate());
			Integer contractMonth = cal.get(Calendar.MONTH);
			Integer contractYear = cal.get(Calendar.YEAR);
			if(contractMonth == month && contractYear == year) {
				totalIncome += this.contracts.get(i).totalValue();
			}
		}
		return totalIncome + baseSalary;
	}
}
