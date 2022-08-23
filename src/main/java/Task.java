public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void markAsDone(){
        isDone = true;
        if (description.contains("[ ] ")){
            description = "[ X ] " +description.substring(description.indexOf("[ ] ")+ 4);
        }

    }

    public void markAsUndone(){
        isDone = false;
        if (description.contains("[ X ] ")){
            description = "[ ] " +description.substring(description.indexOf("[ X ] ")+ 6);
        }

    }
}
