package behavior.Chain_of_Responsibility;

public enum Note {
    R100(100),
    R50(50),
    R20(20),
    R5(5);

    private int num;

    Note(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int sum(Note... money) {
        int result = 0;

        for (Note i : money) {
            result = result + i.getNum();
        }
        return result;
    }
}
