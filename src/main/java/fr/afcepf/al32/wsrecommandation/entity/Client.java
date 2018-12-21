package fr.afcepf.al32.wsrecommandation.entity;

import javax.persistence.Embeddable;

import org.springframework.data.geo.Point;

@Embeddable
public class Client {

	private Long client_id;

	private Point location;

	public Client(Long client_id, Point location) {
		this.client_id = client_id;
		this.location = location;
	}

	public Long getClient_id() {
		return client_id;
	}

	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}
}
