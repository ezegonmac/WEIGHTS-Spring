package es.ezegonmac.HibernateConnection;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Weights")
public class Weights {
	
	@Id
	@Column(name="Id")
	private int Id;
	
	@Column(name="Weight")
	private double Weight;
	
	@Column(name="Date", unique=true)
	private Date Date;
	
	@Column(name="Hour", nullable=true)
	private Time Hour;
	
	
	// CONSTRUCTORS
	public Weights() {
	}
	
	public Weights(double weight, Date date) {
		super();
		Weight = weight;
		Date = date;
	}

	public Weights(int id, double weight, Date date, Time hour) {
		super();
		Id = id;
		Weight = weight;
		Date = date;
		Hour = hour;
	}
	
	
	// GETTERS AND SETTERS
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Time getHour() {
		return Hour;
	}

	public void setHour(Time hour) {
		Hour = hour;
	}
	
	// TO STRING
	
	@Override
	public String toString() {
		return "Weights [Id=" + Id + ", Weight=" + Weight + ", Date=" + Date + ", Hour=" + Hour + "]";
	}	
	

}
