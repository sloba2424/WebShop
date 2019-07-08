package model;

import java.util.EventObject;

public class UpdateEvent extends EventObject{
	private Stanje stanje;

	public UpdateEvent(Object source, Stanje _stanje) {
		super(source);
		stanje = _stanje;
	}

}