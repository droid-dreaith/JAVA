package Mid_DataStructureActs;

public class TrainCar {
    int carNumber;
    String cargo;
    TrainCar nextCar;

    public TrainCar(int carNumber, String cargo) {
        this.carNumber = carNumber;
        this.cargo = cargo;
        this.nextCar = null;
    }

public class Train {
    private TrainCar head;  // Engine is car 0

    public Train() {
        this.head = null;
    }

    public void addCar(int carNumber, String cargo) {
        TrainCar newCar = new TrainCar(carNumber, cargo);
        if (head == null) {
            head = newCar;
            return;
        }
        TrainCar current = head;
        while (current.nextCar != null) {
            current = current.nextCar;
        }
        current.nextCar = newCar;
    }

    public void removeCar(int carNumber) {
        if (head == null) {
            System.out.println("Train is empty!");
            return;
        }
        if (head.carNumber == carNumber) {
            head = head.nextCar;
            return;
        }
        TrainCar current = head;
        while (current.nextCar != null && current.nextCar.carNumber != carNumber) {
            current = current.nextCar;
        }
        if (current.nextCar != null) {
            current.nextCar = current.nextCar.nextCar;
        } else {
            System.out.println("Car " + carNumber + " not found!");
        }
    }

    public void switchCars(int car1Number, int car2Number) {
        if (car1Number == car2Number) {
            System.out.println("Cannot switch the same cars.");
            return;
        }

        TrainCar car1Prev = null, car1 = head;
        while (car1 != null && car1.carNumber != car1Number) {
            car1Prev = car1;
            car1 = car1.nextCar;
        }

        TrainCar car2Prev = null, car2 = head;
        while (car2 != null && car2.carNumber != car2Number) {
            car2Prev = car2;
            car2 = car2.nextCar;
        }

        if (car1 == null || car2 == null) {
            System.out.println("One or both cars not found!");
            return;
        }

        if (car1Prev != null) {
            car1Prev.nextCar = car2;
        } else {
            head = car2;
        }

        if (car2Prev != null) {
            car2Prev.nextCar = car1;
        } else {
            head = car1;
        }

        TrainCar temp = car1.nextCar;
        car1.nextCar = car2.nextCar;
        car2.nextCar = temp;
    }

    public void loadCargo(int carNumber, String cargo) {
        TrainCar car = findCar(carNumber);
        if (car != null) {
            car.cargo = cargo;
        } else {
            System.out.println("Car " + carNumber + " not found!");
        }
    }

    public void unloadCargo(int carNumber) {
        TrainCar car = findCar(carNumber);
        if (car != null) {
            car.cargo = null;
        } else {
            System.out.println("Car " + carNumber + " not found!");
        }
    }

    public void displayTrain() {
        if (head == null) {
            System.out.println("Train is empty!");
            return;
        }
        TrainCar current = head;
        while (current != null) {
            System.out.println("Car " + current.carNumber + ", Cargo: " + (current.cargo != null ? current.cargo : "None"));
            current = current.nextCar;
        }
    }

    private TrainCar findCar(int carNumber) {
        TrainCar current = head;
        while (current != null) {
            if (current.carNumber == carNumber) {
                return current;
            }
            current = current.nextCar;
        }
        return null;
    }

    public void run() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Switch Cars");
            System.out.println("4. Load Cargo");
            System.out.println("5. Unload Cargo");
            System.out.println("6. Display Train");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter car number: ");
                    int carNumber1 = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter cargo (optional): ");
                    String cargo1 = scanner.nextLine();
                    addCar(carNumber1, cargo1.isEmpty() ? null : cargo1);
                    break;
                case 2:
                    System.out.print("Enter car number to remove: ");
                    int carNumber2 = scanner.nextInt();
                    removeCar(carNumber2);
                    break;
                case 3:
                    System.out.print("Enter first car number: ");
                    int car1 = scanner.nextInt();
                    System.out.print("Enter second car number: ");
                    int car2 = scanner.nextInt();
                    switchCars(car1, car2);
                    break;
                case 4:
                    System.out.print("Enter car number: ");
                    int carNumber4 = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter cargo: ");
                    String cargo4 = scanner.nextLine();
                    loadCargo(carNumber4, cargo4);
                    break;
                case 5:
                    System.out.print("Enter car number: ");
                    int carNumber5 = scanner.nextInt();
                    unloadCargo(carNumber5);
                    break;
                case 6:
                    displayTrain();
                    break;
                case 7:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {
        Train train = new Train();
        train.run();
    }
}
