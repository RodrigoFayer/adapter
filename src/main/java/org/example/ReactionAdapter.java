package org.example;

public class ReactionAdapter extends Reaction{

    private IReaction reaction;

    public ReactionAdapter(IReaction reaction){
        this.reaction = reaction;
    }

    public String getReactionSymbol(){
        int reactionNumber = this.getReactionNumber();

        if(reactionNumber == 0) {
            reaction.setReaction("👍");
        } else if(reactionNumber == 1) {
            reaction.setReaction("♥️");
        } else if(reactionNumber == 2) {
            reaction.setReaction("😂");
        }else if(reactionNumber == 3) {
            reaction.setReaction("😮");
        }else if(reactionNumber == 4) {
            reaction.setReaction("😥");
        } else if (reactionNumber == 5) {
            reaction.setReaction("😡");
        }

        return reaction.getReaction();
    }

    public void setReactionSymbol(){
        String reactionSymbol = reaction.getReaction();

        if(reactionSymbol.equals("👍")) {
            this.setReactionNumber(0);
        } else if(reactionSymbol.equals("♥️")) {
            this.setReactionNumber(1);
        } else if(reactionSymbol.equals("😂")) {
            this.setReactionNumber(2);
        } else if(reactionSymbol.equals("😮")) {
            this.setReactionNumber(3);
        } else if(reactionSymbol.equals("😥")) {
            this.setReactionNumber(4);
        } else if(reactionSymbol.equals("😡")) {
            this.setReactionNumber(5);
        }
    }
}
