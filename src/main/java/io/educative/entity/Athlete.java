package io.educative.entity;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Athlete {
	private String firstName;
	
	@NotNull(message = "This is a required field .")
	@Size(min = 1, message = "This is a required field .")
	private String lastName;
	private String country;
	private String handedness;
	private String[] titles;
	
	@NotNull(message = "This is a required field")
	@Min(value = 1, message = "Value must be greater or equal to 1")
	@Max(value = 100, message = "Value must be less than or equal to 100")
	private Integer rank;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Past(message = "Date must be in past .")
	private Date lastWon;
	
	@Pattern(regexp = "^\\$([0-9]{1,3},([0-9]{3},)*[0-9]{3})$", message = "incorrect format")
	private String prizeMoney;
	
	public Athlete() {
		
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHandedness() {
		return handedness;
	}

	public void setHandedness(String handedness) {
		this.handedness = handedness;
	}

	public String[] getTitles() {
		return titles;
	}

	public void setTitles(String[] titles) {
		this.titles = titles;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Date getLastWon() {
		return lastWon;
	}

	public void setLastWon(Date lastWon) {
		this.lastWon = lastWon;
	}

	public String getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(String prizeMoney) {
		this.prizeMoney = prizeMoney;
	}
	
	
}