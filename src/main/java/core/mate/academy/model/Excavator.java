package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketDiggingForce;
    private String engineType;

    public Excavator() {
    }

    public Excavator(String engineType, double bucketDiggingForce) {
        this.engineType = engineType;
        this.bucketDiggingForce = bucketDiggingForce;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
