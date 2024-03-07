import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {

    private ArrayList<User> users;

    private ArrayList<Appointment> appointments;

    private static AppointmentManager appointmentManager;

    // Private constructor to prevent instantiation from outside
    private AppointmentManager() {
        users = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public boolean registerUser(User user) {
        users.add(user);
        // return if this was successful
    }
    
    // Method to get the single instance of AppointmentManager
    // This also ensures only one instance of AppointmentManager can exist at a time
    public static AppointmentManager getInstance() {
        if (appointmentManager == null) {
            appointmentManager = new AppointmentManager();
        }
        return appointmentManager;
    }

    // Method to schedule an appointment
    public void scheduleAppointment(User user, Map<Doctor, Float> recommendedDoctors) {
        Appointment potentialAppointment = *GET APPOINTMENT*; // prompt user to select date/time
        Doctor chosenDoctor = *CHOOSE DOCTOR*; // prompt user to select doctor from list
        if (potentialAppointent.getTime() is available for chosenDoctor) {
            // 1. Add appointment to both schedules
            // 2. Send appointment confirmation to doctor and user
        } else {
            // alternativeCase
            handleMatchingFailure(user, recommendedDoctors, chosenDoctor, "Selected appointment time does not work!");
        }
    }
    
    // Method to recommend doctors based on user symptoms, discomfort level, and insurance coverage
    public void recommendDoctors(User user, String symptoms, int discomfortLevel, String healthInsurance) {
        // Logic to recommend doctors based on user's symptoms, discomfort level, and insurance coverage
        // Returns a list of recommended doctors
        Map<Doctor, Float> recommendedDoctors = new HashMap<>();
        for (Doctor d : allDoctors) {
            // Evaluate compatability and update recommended doctors map if compatibility > 0
            // Compatibility is negative if the match doesn't work
            // If it's positive, higher number represents a better match
        }
        if (reccomendedDoctors.size() == 0) {
            handleMatchingFailure(User, recommendedDoctors, null, "No matching doctors found!");
        }
        scheduleAppointment(user, recommendedDoctors);
    }


    // Alternative scenario when preferred doctor is unavailable or no matches found
    public void handleMatchingFailure(User user, HashMap<Doctor, Float> recommendedDoctors, Doctor doctor, String explanation) {
        // Step 1: inform user doctor was unavailable using provided explanation
        switch (prompt user for choice to proceed)
            case otherDoctor:
                // Recall scheduleAppointment (unavailable doctor removed from hasmap)
            case adjustCriteria:
                // Call recommend doctors with updated criteria
            case reschedule:
                // Recall scheduleAppointment (user can choose better time)
    }

}
