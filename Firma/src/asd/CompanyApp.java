package asd;
import java.io.*;
import java.util.*;

public class CompanyApp {
	
	public static final String FILE_STORE = "Testowo.info";
	public static final int WRITE_FROM_USER = 1;
	public static final int READ_FROM_FILE = 2;

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		CompanyApp oc = new CompanyApp();
		Company company = new Company();
		
		
		
		System.out.println("Co chcesz zrobic ?");
		System.out.println("Wczytaj pracownika - " + WRITE_FROM_USER);
		System.out.println("Odczytaj zawartosc - " + READ_FROM_FILE);
		
		int option = input.nextInt();
		
		if(option == WRITE_FROM_USER)
		{
			oc.writeData(company);
			
		}
		else if (option == READ_FROM_FILE) 
		{
			oc.readData(company);
		}
		input.close();
	
		
	}
	public void writeData(Company company) {
		try (	Scanner fos = new Scanner(System.in);
				FileOutputStream fs = new FileOutputStream(FILE_STORE);
	            ObjectOutputStream oos = new ObjectOutputStream(fs); ) {
			
		
			for(int i = 0; i < Company.MAX_EMPLOYEE; i++) {
				System.out.println("Podaj imie pracownika");
				String nm = fos.nextLine();
				System.out.println("Podaj nazwisko pracownika");
				String sn = fos.nextLine();
				System.out.println("Podaj pensje pracownika");
				double salary = fos.nextDouble();
				fos.nextLine();
				
				company.add(new Employee(nm, sn, salary), i);
			}
			
			oos.writeObject(company);
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readData (Company company) {
		try (FileInputStream is = new FileInputStream(FILE_STORE);
			 ObjectInputStream ois = new ObjectInputStream(is); ) {
			
			company = (Company) ois.readObject();
			for(int i=0; i<Company.MAX_EMPLOYEE; i++) {
				System.out.println(company.getEmployees()[i]);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	