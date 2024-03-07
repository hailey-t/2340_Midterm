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
    public boolean scheduleAppointment(User user, Map<Doctor, Float> recommendedDoctors) {
        Appointment potentialAppointment = *GET APPOINTMENT*; // prompt user to select date/time
        Doctor chosenDoctor = *CHOOSE DOCTOR*; // prompt user to select doctor from list
        if (potentialAppointent.getTime() is available for chosenDoctor) {
            // 1. Add appointment to both schedules
            // 2. Send appointment confirmation to doctor and user
            // 3. Return true
        } else {
            // alternativeCase
            handleMatchingFailure(user, recommendedDoctors, chosenDoctor);
        }
    }
    
    // Method to recommend doctors based on user symptoms, discomfort level, and insurance coverage
    public List<Doctor> recommendDoctors(String symptoms, int discomfortLevel, String healthInsurance) {
        // Logic to recommend doctors based on user's symptoms, discomfort level, and insurance coverage
        // Returns a list of recommended doctors
        Map<Doctor, Float> recommendedDoctors = new HashMap<>();
        for (Doctor d : allDoctors) {
            // Evaluate compatability and update recommended doctors map if compatibility > 0
            // Compatibility is negative if the match doesn't work
            // If it's positive, higher number represents a better match
        }
        if (reccomendedDoctors.size() == 0) {
            noMatchesFound();
        }
        Doctor bestMatch = highest compatibility doctor from hash map;
        attemptCreateAppointment(user, bestMatch);
    }


    // Alternative scenario when preferred doctor is unavailable or no matches found
    public void handleMatchingFailure(User user, HashMap<Doctor, Float> recommendedDoctors, Doctor bestDoctor) {
        // Step 1: inform user doctor was unavailable
        switch (prompt user for choice to proceed)
            case otherDoctor:
                // attemptCreateAppointment with second best fit doctor in HashMap besides bestDoctor (second best fit)
            case adjustCriteria:
                // Call recommend doctor with updated criteria
            case reschedule:
                // Recall attemptCreateAppointment so user can select a different date/time
    }

}
