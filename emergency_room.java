package queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class EmergencyRoomQueue {
    private PriorityQueue<Patient> queue;

    public EmergencyRoomQueue() {
        queue = new PriorityQueue<>();
    }

    public void addPatient(String name, int prio, String condition, String time) {
        Patient patient = new Patient(name, prio, condition, time);
        queue.add(patient);
    }

    public void treatNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("NO PATIENTS ARE WAITING	");
        } else {
            Patient next = queue.poll();
            System.out.println("\nTreating patient");
            System.out.println("Treated: " + next);
        }
    }

    public void displayQueue() {
        System.out.println("Patients Waiting: " + queue.size());

        List<Patient> patients = new ArrayList<>(queue);
        Collections.sort(patients);

        int index = 1;
        
        for (Patient p : patients) {
            System.out.println(index + ". " + p);
            index++;
        }
    }
}
