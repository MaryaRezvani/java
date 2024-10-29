
public interface Engine {
  public void start();
  public void stop();
  public void printEngineDetails(); // Method to print engine details
}

public interface Vehicle {
  public void accelerate();
  public void brake();
  public void printVehicleDetails(); // Method to print generic vehicle details
}

public class Car implements Engine,Vehicle {

  @Override
  public void start() {
    System.out.println("Engine: Starting...");
  }

  @Override
  public void stop() {
    System.out.println("Engine: Stopping...");
  }
  @Override
  public void accelerate() {
    System.out.println("Car: Accelerating...");
  }

  @Override
  public void brake() {
    System.out.println("Car: Braking...");
  }

  @Override
  public void printVehicleDetails() {
    System.out.println("Car Details (Model, number of wheels etc.)");
  }

  @Override
  public void printEngineDetails() {
    System.out.println("Engine Details (Horsepower, type etc.)");
  }
}
