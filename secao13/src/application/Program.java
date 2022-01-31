package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = sdf.parse("20/12/2021");
		System.out.println(sdf.format(data));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name:");
		String depName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name:");
		String workerName = sc.nextLine();
		System.out.print("Level:");
		String workerLevelString = sc.nextLine();
		WorkerLevel workerLevel = WorkerLevel.valueOf(workerLevelString);
		System.out.print("Base salary:");
		double workerSalary = sc.nextDouble();
		System.out.print("How many contracts to this worker? ");
		int contractsCounter = sc.nextInt();
		
		Worker worker = new Worker(workerName, workerLevel, workerSalary);
		
		for (int i = 1; i <= contractsCounter; i++) {
			System.out.println("Enter contract #"+ i + "data:");
			System.out.print("Date (DD/MM/YYYY):");
			String contractDate = sc.nextLine();
			System.out.print("Value per hour:");
			double contractValueHour = sc.nextDouble();
			System.out.print("Duration (hours):");
			int contractHours = sc.nextInt();
			
			HourContract hourContract = new HourContract(contractDate, contractValueHour, contractHours);
			worker.addContracts(hourContract);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String incomeDate = sc.nextLine();
		String [] incomeDateSplit = incomeDate.split("/");
		worker.income((Integer)incomeDateSplit[0], null);
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+ depName);
		System.out.println("Income for ");
		sc.close();
	}

}
