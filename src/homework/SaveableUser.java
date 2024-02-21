package homework;

public class SaveableUser extends User {
    public SaveableUser(String name) {
        super(name);
    }

    public final void save() {
        Persister persister = new Persister(this);
        persister.save();
    }
}
