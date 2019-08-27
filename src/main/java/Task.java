public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description){
        this.description = description;
        this.isDone = false;
    }

    public Task(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718");
    }

    public void mardAsDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return this.description;
    }

    public String toSave() {
        return this.description + this.isDone;
    }
}
