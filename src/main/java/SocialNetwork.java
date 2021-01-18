public class SocialNetwork {
    private static int count = 0;
    private String name;
    private int users;
    private double rating;

    public SocialNetwork(){
        this.count++;
        this.name = "Facebook";
        this.users = 50;
        this.rating = 2.5;
    }
    public SocialNetwork(String name, int users, double rating){
        this.count++;
        this.name = name;
        this.users = users;
        this.rating = rating;
    }

    public double getRating(){
        return this.rating;
    }

    public int getUsers(){
        return this.users;
    }

    public void addUser(){
        this.users++;
    }
    public void goodReview(){
        this.rating = Math.min(this.rating + 0.5, 5.0);
    }
    public void badReview(){
        this.rating = Math.max(this.rating - 0.5, 0.0);
    }
    public String toString(){
        return this.name + " has " + this.users + " users, and a rating of " + this.rating;
    }
    public static void printCount(){
        System.out.println("There are " + count + " social networks.");
    }
    public boolean isBetterThan(SocialNetwork sn) {
        return this.rating > sn.getRating();
    }
}
