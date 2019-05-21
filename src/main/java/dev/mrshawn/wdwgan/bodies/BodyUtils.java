package dev.mrshawn.wdwgan.bodies;

import net.citizensnpcs.api.npc.NPC;

import java.util.ArrayList;

public class BodyUtils {

	private static ArrayList<Body> bodies = new ArrayList<>();

	public static ArrayList<Body> getBodies() {
		return bodies;
	}

	public static Body getBodyFromNPC(NPC npc) {
		for (Body body : bodies) {
			if (body.getName().equalsIgnoreCase(npc.getName())) {
				return body;
			}
		}
		return null;
	}

	public static Body getBodyFromName(String name) {
		for (Body body : bodies) {
			if (body.getName().equalsIgnoreCase(name)) {
				return body;
			}
		}
		return null;
	}

}
