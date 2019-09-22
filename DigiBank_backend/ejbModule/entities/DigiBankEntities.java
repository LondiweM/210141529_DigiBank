package entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity(name="digibank_table")
public class DigiBankEntities {
	
	@TableGenerator(
			  name = "yourTableGenerator",
			  initialValue = 0014)
			@Id 
			@GeneratedValue(
			  strategy=GenerationType.TABLE, 
			  generator="yourTableGenerator")

	
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)*/
	
	private long id;
	
	private int TransactionCode;
	private String Name;
	private  String SourcePassport;
	private String DestinationPassport;
	private String DestinationBank;
	private String DestationCountry;
	private int AccountNumber;
	private double Amount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(int transactionCode) {
		TransactionCode = transactionCode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSourcePassport() {
		return SourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		SourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return DestinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		DestinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return DestinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		DestinationBank = destinationBank;
	}
	public String getDestationCountry() {
		return DestationCountry;
	}
	public void setDestationCountry(String destationCountry) {
		DestationCountry = destationCountry;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
	
	
}
