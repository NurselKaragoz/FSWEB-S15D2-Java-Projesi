package com.workintech.set;

import java.util.Objects;

public class Task {
    private String project;
    private String description;
    private String assignee;
    Priority priority;
    Status status;

    public Task(String project, String description, String assignee) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description) && Objects.equals(assignee, task.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description, assignee);
    }
}
