public enum TypeOfCapacity {
    N1("с полной массой до 3,5 тонн"),
    N2("с полной массой свыше 3,5 тонн до 12 тонн"),
    N3("с полной массой свыше 12 тонн");


    private final String assignmentLoadCapacity;

    TypeOfCapacity(String assignmentLoadCapacity) {
        this.assignmentLoadCapacity = assignmentLoadCapacity;
    }
    @Override
    public String toString() {
        return "Масса гружоного грузовика " + assignmentLoadCapacity;
    }
}
