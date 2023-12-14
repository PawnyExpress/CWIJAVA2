public enum Grade {
    A_PLUS("A+", 12), A("A", 11), A_MINUS("A-",10), B_PLUS("B+", 9), B("B", 8), B_MINUS("B-", 7),
    C_PLUS("C+", 6), C("C", 5), C_MINUS("C-", 4), D_PLUS("D+", 3), D("D", 2), D_MINUS("D-", 1),
     F("F", 0), NOT_TAKEN("", -1);

    private String letterGrade;

    private int rank;

    private Grade(String letterGrade, int rank) {
        this.letterGrade = letterGrade;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public String toString() {
        return letterGrade;
    }
}