

public class Bus extends Transport {


    private CapacityType capacity;

    private final CapacityType[] typeOfCapacity = new CapacityType[CapacityType.values().length];
    private double bodyLength;
    private double bodyWidth;
    private int powerReserve;
    private int weight;

    public Bus(String stamp, String model, double engineCapacity, double bodyLength, double bodyWidth,
                     int powerReserve, int weight) {
        super(stamp, model, engineCapacity);
        this.bodyLength = bodyLength;
        this.bodyWidth = bodyWidth;
        this.powerReserve = powerReserve;
        this.weight = weight;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public double getBodyWidth() {
        return bodyWidth;
    }

    public int getPowerReserve() {
        return powerReserve;
    }
    public int getWeight() {
        return weight;
    }
    @Override
    public void start() {
        System.out.println("Автобус " + getStamp() + getModel() + " начал движение.");
    }
    @Override
    public void stop() {
        System.out.println("Автобус " + getStamp() + getModel() + " закончил движение.");
    }



    @Override
    public String toString() {
        return "Марка " + getStamp() + "; " + "Модель " + getModel() + "; " + "Объём двигателя " + getEngineCapacity() +
                "; " + "Длина кузова " + bodyLength + " м" +  "; " + "Ширина кузова " + bodyWidth + " м" + "; " +
                "Запас хода " + powerReserve + " км" +  "; " + "Общий вес " + weight + "тонн";
    }

    @Override
    public void getPitStop() {
        System.out.println("У ввтобуса пит-стоп");
    }

    @Override
    public void getBestLapTime() {
        int minTime = 18;
        int maxTime = 21;
        int theBestTime = (int) (minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время прохождения круга " + theBestTime + " мин");
    }

    @Override
    public int getMaximumSpeed() {
        int minSpeed = 80;
        int maxSpeed = 180;
        int theBestSpeed = (int) (minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость " + theBestSpeed + " км/час");
        return minSpeed;
    }

    @Override
    public void printType() {
        if (capacity != null){
            System.out.println(capacity);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }



    public void setCapacity(CapacityType capacity) {
        this.capacity = capacity;
    }
}

