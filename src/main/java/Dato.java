
public class Dato {
	
	private int id;
	private String date;
	private String countryCode;
	private String confirmed;
	private String suspected;
	private String cured;
	private String dead;
	
	
	public Dato(String date, String countryCode, String confirmed, String suspected, String cured, String dead) {
		super();
		this.date = date;
		this.countryCode = countryCode;
		this.confirmed = confirmed;
		this.suspected = suspected;
		this.cured = cured;
		this.dead = dead;
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


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public String getConfirmed() {
		return confirmed;
	}


	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}


	public String getSuspected() {
		return suspected;
	}


	public void setSuspected(String suspected) {
		this.suspected = suspected;
	}


	public String getCured() {
		return cured;
	}


	public void setCured(String cured) {
		this.cured = cured;
	}


	public String getDead() {
		return dead;
	}


	public void setDead(String dead) {
		this.dead = dead;
	}


	@Override
	public String toString() {
		return "Dato [id=" + id + ", date=" + date + ", countryCode=" + countryCode + ", confirmed=" + confirmed
				+ ", suspected=" + suspected + ", cured=" + cured + ", dead=" + dead + "]";
	}
	
	

}
