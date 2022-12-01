package com.laliento.interview.espa2.collections.queue.priority;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityWithObject {

	public static void main(String[] args) {
		Queue<EmergencyClient> clients = new PriorityQueue<>(Comparator.reverseOrder());
		clients.offer(new EmergencyClient("lalo_min", Priority.MINOR));
		clients.offer(new EmergencyClient("lalo_hs", Priority.HIGH_SEVERE));
		clients.offer(new EmergencyClient("lalo_hs", Priority.HIGH_SEVERE));
		clients.offer(new EmergencyClient("lalo_hs", Priority.HIGH_SEVERE));
		clients.offer(new EmergencyClient("lalo_med", Priority.MEDIUM));
		clients.offer(new EmergencyClient("lalo_sev", Priority.SEVERE));
		clients.offer(new EmergencyClient("lalo_sev", Priority.SEVERE));
		clients.offer(new EmergencyClient("lalo_sev", Priority.SEVERE));
		System.out.println(clients);
//		int clientsNum = clients.size();
//		for (int i = 0; i < clientsNum; i++) {
//			EmergencyClient current = clients.poll();
//			System.out.println("Atendiendo a: " + current);
//		}
//		 Iterator<EmergencyClient> itClients = clients.iterator();
//		 while (itClients.hasNext()) {
//			 EmergencyClient current = clients.poll();
//				System.out.println("Atendiendo a: " + current);
//		 }
		while (!clients.isEmpty()) {
			EmergencyClient current = clients.poll();
			System.out.println("Atendiendo a: " + current);
		}
	}
}

class EmergencyClient implements Comparable<EmergencyClient>{
	private String name;
	private Priority priority;
	public EmergencyClient(String name, Priority priority) {
		this.name = name;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "EmergencyClient [name=" + name + ", priority=" + priority + "]";
	}
	@Override
	public int compareTo(EmergencyClient toCompare) {
		// x < 0 --> éste objeto es de menor prioridad que el que llega
		// x = 0 --> éste objeto es de igual prioridad que el que llega
		// x > 0 --> éste objeto es de mayor prioridad que el que llega
		return this.priority.getSeverity().compareTo(toCompare.priority.getSeverity());	
	}
}

enum Priority {
	MINOR("Minor", 1), MEDIUM("Medium", 2), SEVERE("Severe", 3), HIGH_SEVERE("High severe", 4);
	
	private Priority(String description, Integer severity) {
		this.description = description;
		this.severity = severity;
	}
	private String description;
	private Integer severity;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getSeverity() {
		return severity;
	}
	public void setSeverity(Integer severity) {
		this.severity = severity;
	}
}