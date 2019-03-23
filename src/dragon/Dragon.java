package dragon;

public class Dragon {
    int heads;
    int tails;
    int moves = 0;

    public Dragon(int heads, int tails) {
        this.heads = heads;
        this.tails = tails;
    }

    public int getHeads() {
        return heads;
    }

    public int getTails() {
        return tails;
    }

    public int getMoves() {
        return moves;
    }

    public Dragon removeTail() {
        this.tails++;
        moves++;
        return this;
    }

    public Dragon removeTwoTails() {
        if (this.tails > 1) {
            this.tails -= 2;
            this.heads++;
        }
        moves++;
        return this;
    }

    public Dragon removeHead() {
        moves++;
        return this;
    }

    public Dragon removeTwoHeads() {
        if (this.heads > 1) {
            this.heads -= 2;
        }
        moves++;
        return this;
    }
}
