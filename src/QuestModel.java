class QuestModel {
    Quest[] quest = {
            new Quest(
                    0,
                    "The beginning of a quest",
                    "You must obtain a sword for the hooded man",
                    5),
            new Quest(
                    1, 
                    "WHAAA", 
                    "asdasd", 
                    5)
    };

    Quest searchQuest(int id){
        //Sorts the list of quests by id
        for(Quest q : quest){
            if(q.getId() == id){
                return q;
            }
        }
        return null;
    }
}