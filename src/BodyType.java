public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COMPARTMENT("Купе"),
    STATION_WAGON("Универсал"),
    OFF_ROAD_VEHICLE("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP_TRUCK("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String assignmentBodyType;

    BodyType(String assignmentBodyType) {
        this.assignmentBodyType = assignmentBodyType;
    }

    @Override
    public String toString() {
        return "Тип кузова " +  assignmentBodyType;
    }
}
