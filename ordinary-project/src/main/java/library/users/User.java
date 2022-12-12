package library.users;

import java.util.UUID;

public class User {
    private static final int MAX_NUMBER_OF_LATE_RETURNS = 3;
    private String name;
    private UUID id;
    private UserType userType;
    private int numberOfLateReturns;

    public User(String name, UserType userType) {
        this.name = name;
        this.userType = userType;
        id = UUID.randomUUID();
        numberOfLateReturns = 0;
    }

    public boolean isAllowedToBorrow() {
        return numberOfLateReturns < MAX_NUMBER_OF_LATE_RETURNS;
    }

    public int daysToReturn() {
        return userType.getDuration();
    }
}
