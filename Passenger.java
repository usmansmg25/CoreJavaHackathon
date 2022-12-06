package train_ticket_hackathon;

public class Passenger {
	
	
	private String passengerName;
	private Integer passengerAge;
	private char gender;
	
	
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Integer getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Passenger(String passengerName, Integer passengerAge, char gender) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Passenger [passengerName=" + passengerName + ", passengerAge=" + passengerAge + ", gender=" + gender
				+ "]";
	}
	
	

}

