package Model;

import java.util.ArrayList;

/**
 * Created by Silver on 12/3/2016.
 */
public class User {
    private String username;
    private long userId;
    private ArrayList<Record> gameRecords;

    public User(String username, long userId) {
        this.username = username;
        this.userId = userId;
        gameRecords = new ArrayList<Record>();
    }

    public void addRecord(Record record){
        gameRecords.add(record);
    }

    public String getUsername() {
        return username;
    }

    public long getUserId() {
        return userId;
    }

    public ArrayList<Record> getGameRecords() {
        return gameRecords;
    }
}
