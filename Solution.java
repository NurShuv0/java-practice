class Drive51 {
    private double totalCapacity;
    private double usedSpace;
    private double freeSpace;
    public Drive51() {
        this.totalCapacity = 10.0;
        this.usedSpace = 0.0;
        this.freeSpace = 10.0;
    }
    public void uploadFile(double fileSize) {
        if (freeSpace >= fileSize) {
            usedSpace += fileSize;
            freeSpace -= fileSize;
            System.out.println("File uploaded successfully.");
        } else {
            System.out.println("Insufficient free space.Try again");
        }
    }
    public void upgrade(double additionalCapacity) {
        totalCapacity += additionalCapacity;
        freeSpace += additionalCapacity;
        System.out.println("Storage upgraded successfully.");
    }
    public void viewStatus() {
        System.out.println("Total Capacity: " + totalCapacity + " GB");
        System.out.println("Used Space: " + usedSpace + " GB");
        System.out.println("Free Space: " + freeSpace + " GB");
    }
}
class User {
    private String username;
    private Drive51 storage;
    public User(String username) {
        this.username = username;
        this.storage = new Drive51();
        System.out.println("User '" + username + "' created with Drive51 storage.");
    }
    public Drive51 getStorage() {
        return storage;
    }
    public String getUsername() {
        return username;
    }
}
class Solution {
    public static void main(String[] args) {
        User user1 = new User("NUR");
        user1.getStorage().uploadFile(2.5);
        System.out.println("User '" + user1.getUsername() + "' storage status:");
        user1.getStorage().viewStatus();
        user1.getStorage().upgrade(5.0);
        user1.getStorage().uploadFile(6.0);
        System.out.println("User '" + user1.getUsername() + "' updated storage status:");
        user1.getStorage().viewStatus();
        User user2 = new User("Rahat");
        user2.getStorage().uploadFile(11.0);
        user2.getStorage().viewStatus();
    }
}