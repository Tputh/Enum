public enum CapacityType {
    ESPECIALLY_SMALL("до 10 мест"), SMALL("до 25 мест"),
    AVERAGE("до 40–50 мест"), BIG("до 60–80 мест"),
    ESPECIALLY_BIG("до 100–120 мест");




    private String assignmentCapacity;



    @Override
    public String toString() {
        return   "Вместимость салона " + assignmentCapacity;
    }

    CapacityType(String assignmentCapacity) {
        this.assignmentCapacity = assignmentCapacity;


    }

}
