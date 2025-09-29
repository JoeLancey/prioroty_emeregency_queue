package queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class emergency_room {
    private PriorityQueue<patients> queue;

    public emergency_room() {
        queue = new PriorityQueue<>();
    }

    public void addPatient(String name, int prio, String condition, String time) {
        patients patient = new patients(name, prio, condition, time);
        queue.add(patient);
    }

    public void treatNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("NO PATIENTS ARE WAITING");
        } else {
            patients next = queue.poll();
            System.out.println("Treated: " + next);
        }
    }

    public void displayQueue() {
        System.out.println("Patients Waiting: " + queue.size());
        
        List<patients> list = new ArrayList<>(queue);
        Collections.sort(list);

        int idx = 1;
        for (patients p : list) {
            System.out.println(idx + ". " + p);
            idx++;
        }
    }
}
