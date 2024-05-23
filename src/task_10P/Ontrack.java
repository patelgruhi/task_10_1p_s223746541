package task_10P;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ontrack {

    public Map<String, Object> viewTaskDetails(int taskId, int studentId) {
        // Simulated data for the purpose of the test
        Map<String, Object> taskDetails = new HashMap<>();
        taskDetails.put("task_id", 1);
        taskDetails.put("description", "Math homework");
        taskDetails.put("submission_date", "2024-05-20");
        taskDetails.put("status", "In Review");
        taskDetails.put("feedback", "Good work, needs more detail in question 3.");
        List<Map<String, String>> chatHistory = Arrays.asList(
            new HashMap<String, String>() {{ put("sender", "student"); put("message", "I have a question about question 3."); }},
            new HashMap<String, String>() {{ put("sender", "tutor"); put("message", "Sure, what do you need help with?"); }}
        );
        taskDetails.put("chat_history", chatHistory);
        return taskDetails;
    }
}
