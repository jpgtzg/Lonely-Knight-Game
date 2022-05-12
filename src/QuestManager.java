import java.util.ArrayList;

public class QuestManager {
    
    ArrayList<Quest> quests = new ArrayList<Quest>();

    public void addQuest(Quest quest) {
        quests.add(quest);
    }

    public void removeQuest(Quest quest) {
        quests.remove(quest);
    }

    public void completeQuest(Quest quest) {
        quest.setCompleted(true);
        //TODO give player the reward
    }

    public void showQuests(){
        for (Quest quest : quests) {
            System.out.println(quest.getName()
            + "\n" + quest.getDescription()
            + "\nReward: " + quest.getReward());
        }
    }
}
