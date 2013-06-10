package de.hsbremen.powerwall.kinect.events;

import javax.vecmath.Vector3f;

public class FingerBaseEvent {
	private Vector3f position;
	
	public FingerBaseEvent(Vector3f position) {
		this.position = position;
	}
	
	public Vector3f getPosition() {
		return position;
	}
}
