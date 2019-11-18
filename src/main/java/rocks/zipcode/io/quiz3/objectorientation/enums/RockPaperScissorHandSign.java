package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        switch (this) {
            case SCISSOR:
                return ROCK;
            case ROCK:
                return PAPER;
            case PAPER:
                return SCISSOR;
            default:
                return null;
        }
    }

    public RockPaperScissorHandSign getLoser() {
        switch (this) {
            case SCISSOR:
                return PAPER;
            case ROCK:
                return SCISSOR;
            case PAPER:
                return ROCK;
            default:
                return null;
        }
    }
}
