package org.example;

public class Post {
    IReaction reaction;
    ReactionAdapter reactionAdapter;

    public Post(){
        this.reaction = new ReactionSymbol();
        this.reactionAdapter = new ReactionAdapter(reaction);
    }

    public void setReactionSymbol(String reactionSymbol){
        reaction.setReaction(reactionSymbol);
        reactionAdapter.setReactionSymbol();
    }

    public String getReactionSymbol(){
        return reactionAdapter.getReactionSymbol();
    }

    public int getReactionNumber(){
        return reactionAdapter.getReactionNumber();
    }
}
