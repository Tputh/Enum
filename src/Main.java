public class Main {
    public static void main(String[] args) {
        System.out.println("Enum");





            Car cars = new Car("Tayota", " Mark II", 2.5, 300,
                    280, " Механика ");
            cars.setBodyType(BodyType.SEDAN);
            cars.printType();
            System.out.println(cars);
            cars.start();
            cars.getPitStop();
            cars.stop();
            cars.getBestLapTime();
            cars.getMaximumSpeed();
            System.out.println();




            Bus bus = new Bus("Mercedes-Benz", "Travego M OM 457 LA", 8.0,
                    12.82, 3.7, 1000, 12);

            bus.setCapacity(CapacityType.BIG);
            bus.printType();
            System.out.println(bus);
            bus.start();
            bus.getPitStop();
            bus.stop();
            bus.getBestLapTime();
            bus.getMaximumSpeed();
            System.out.println();



            Trucks trucks = new Trucks("Volvo", "Wild Viking", 12.6, 158,
                    "1600-силовой турбодизель", "Дикий викинг", "Двух местный");
            trucks.setTypeOfCapacity(TypeOfCapacity.N3);
            trucks.printType();
            System.out.println(trucks);
            trucks.start();
            trucks.getPitStop();
            trucks.stop();
            trucks.getBestLapTime();
            trucks.getMaximumSpeed();

        }


    }
