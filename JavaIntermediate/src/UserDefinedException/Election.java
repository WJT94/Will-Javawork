package UserDefinedException;

public class Election {
    public void checkEligibility(int age) throws InvalidAgeException {
        throw new InvalidAgeException("Oof");
    }
}
