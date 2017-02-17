package by.htp.february15.domain;

import java.io.Serializable;

public abstract class Entity implements Serializable {
	
private static final long serialVersionUID = -583802211586528899L; // konstanta, kotoraya pokazyvaet versiu nashego klassa


@Override
public String toString() {
	return ", Entity id: " + id;
}

private int id;

public Entity(int id) {
	super();
	this.id = id;
}
public Entity() {
	
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

}
