package HomeWork;

public enum Size {
    HIGH(4),
    MEDIUMHIGHT(3),
    MEDIUM(2),
    LOW(1);

    private int size;

    Size(int i) {
        this.size = i;
    }

    public int getSize() {
        return this.size;
    }
}
