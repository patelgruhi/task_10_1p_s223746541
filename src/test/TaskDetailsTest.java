package test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import task_10P.Ontrack;

public class TaskDetailsTest {

    @Test
    public void testViewTaskDetails() {
       
        Map<String, Object> expectedOutput = new HashMap<>();
        expectedOutput.put("tid", 1);
        expectedOutput.put("descrip", "707 task");
        expectedOutput.put("submission", "2024-05-20");
        expectedOutput.put("feedback", "Good work, needs more detail in question 3.");
        List<Map<String, String>> chatHistory = Arrays.asList(
            new HashMap<String, String>() {{ put("sender", "student"); put("message", "i am having a problem"); }},
            new HashMap<String, String>() {{ put("sender", "tutor"); put("message", "Sure, what do you need help with?"); }}
        );
        expectedOutput.put("chat_history", chatHistory);

        // Call the function with a sample input
        Ontrack onTrack = new Ontrack();
        Map<String, Object> result = onTrack.viewTaskDetails(1, 123);

        // Assert that the result matches the expected output
        assertEquals(expectedOutput, result);
    }

	
	
}
