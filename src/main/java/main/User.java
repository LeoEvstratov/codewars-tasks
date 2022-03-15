package main;

public class User {
    public int rank;
    public int progress;

    public void incProgress(int rank) {
        if (rank > 8 || rank < -8 || rank == 0) throw new IllegalArgumentException();

        int rankDifference = countRanksDifference(rank);

        incrementProgress(rankDifference);

        if (progress >= 100) updateUsersRankAndProgress();

        checkProgressAndRankOutOfBound();
    }

    private void checkProgressAndRankOutOfBound() {
        if (this.rank >= 8) {
            this.rank = 8;
            this.progress = 0;
        }
    }

    private void updateUsersRankAndProgress() {
        this.rank += this.progress / 100;
        this.progress = this.progress % 100;

        if (this.rank == 0) this.rank++;
    }

    private int countRanksDifference(int rank) {
        int rankDifference = rank - this.rank;
        if (this.rank < 0 && this.rank + rankDifference > 0) rankDifference -= 1;
        if (this.rank > 0 && this.rank + rankDifference < 0) rankDifference += 1;

        return rankDifference;
    }

    private void incrementProgress(int rankDifference) {
        if (rankDifference == 0) this.progress += 3;
        if (rankDifference == -1) this.progress += 1;
        if (rankDifference > 0) this.progress += rankDifference * rankDifference * 10;
    }

    public User() {
        this.rank = -8;
        this.progress = 0;
    }
}
