class Task {
    public String id;
    public String description;
    public String status;
    public String createdAt;
    public String updatedAt;

    public Task(String id, String description, String status, String createdAt, String updatedAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}