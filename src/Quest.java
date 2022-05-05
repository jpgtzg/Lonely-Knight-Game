

public class Quest {

    private int id;
    private boolean completed;
    
    private String name;
    private String description;
    private int reward;

    public Quest(int id, String name, String description, int reward) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.reward = reward;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getReward()
    {
        return reward;
    }

    public boolean isCompleted()
    {
        return completed;
    }

    public boolean setCompleted(boolean state)
    {
        this.completed = state;
        return completed;
    }
}
