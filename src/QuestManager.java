import java.util.List;

public class QuestManager {
    
    List<Quest> quests = null;

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
            System.out.println(quest.getName());
        }
    }
}