import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JsonFileCreator {

     public static String convertToJson(Map<String, Task> tasks) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n    \"GetTaskData\": {\n");

        int count = 0;
        for (Map.Entry<String, Task> entry : tasks.entrySet()) {
            Task task = entry.getValue();
            jsonBuilder.append("        \"").append(entry.getKey()).append("\": {\n");
            jsonBuilder.append("            \"id\": \"").append(task.id).append("\",\n");
            jsonBuilder.append("            \"description\": \"").append(task.description).append("\",\n");
            jsonBuilder.append("            \"status\": \"").append(task.status).append("\",\n");
            jsonBuilder.append("            \"createdAt\": \"").append(task.createdAt).append("\",\n");
            jsonBuilder.append("            \"updatedAt\": \"").append(task.updatedAt).append("\"\n");
            jsonBuilder.append("        }");

            count++;
            if (count < tasks.size()) {
                jsonBuilder.append(",");
            }
            jsonBuilder.append("\n");
        }

        jsonBuilder.append("    }\n}");
        return jsonBuilder.toString();
    }

    public static void writeToFile(String jsonString, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(jsonString);
            System.out.println("JSON file created successfully: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

}
