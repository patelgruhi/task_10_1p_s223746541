package task_10P;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnTrack {

    public Map<String, Object> viewTaskDetails(int taskId, int studentId) {
      
        Map<String, Object> taskDetails = new HashMap<>();
        taskDetails.put("tid", 1);
        taskDetails.put("descrip", "707 task");
        taskDetails.put("submission", "2024-05-20");
        taskDetails.put("feedback", "nice work.");
        List<Map<String, String>> chatHistory = Arrays.asList(
            new HashMap<String, String>() {{ put("sender", "student"); put("message", "i am having a problem"); }},
            new HashMap<String, String>() {{ put("sender", "tutor"); put("message", "Sure, what do you need help with?"); }}
        );
        taskDetails.put("chat_history", chatHistory);
        return taskDetails;
    }
}
