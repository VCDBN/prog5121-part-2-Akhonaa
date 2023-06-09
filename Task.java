/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package St10083153_Register;

public class Task {
    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;

    // Constructor
    public Task(String taskName, String taskDescription, String developerDetails, int taskDuration) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
    }

    // Method to check if task description is within 50 characters
    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    // Method to create and return the task ID
    public String createTaskID() {
        String taskID = taskName.substring(0, 2).toUpperCase() + ":" + developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return taskID;
    }

    // Method to return the full task details
    public String printTaskDetails() {
        String taskDetails = "Task Name: " + taskName + "\n" +
                             "Task Description: " + taskDescription + "\n" +
                             "Developer Details: " + developerDetails + "\n" +
                             "Task Duration: " + taskDuration + " hours" + "\n" +
                             "Task ID: " + createTaskID();
        return taskDetails;
    }

    // Getter method for task duration
    public int getTaskDuration() {
        return taskDuration;
    }
}

