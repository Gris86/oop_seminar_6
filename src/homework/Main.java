package homework;

public class Main{
    public static void main(String[] args){
        SaveableUser user = new SaveableUser("Bob");
        user.report();
        user.save();
    }
}