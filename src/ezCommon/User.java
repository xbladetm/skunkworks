/*
 * User almacena toda la informacion referente a un usuario y los metodos para
 * modificar dicha información.
 */
package ezCommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Andrei
 * @author Andrés
 */
public class User implements IData, Serializable {

    private int userId;
    private String name;
    private String surname;
    private Rank rank;
    private Team team;
    private int scrumUnits;
    private String username;
    private String password;

    public User() {
    }

    public User(int uid, String n, String s, Rank r, Team t, int scu, String usr, String pwd) {
        userId = uid;
        name = n;
        surname = s;
        rank = r;
        team = t;
        scrumUnits = scu;
        username = usr;
        password = pwd;
    }

    @Override
    public String getString() {
        String s = new String();
        s += ("" + userId);
        s += ("| " + name);
        s += ("| " + surname);
        s += ("| " + rank);
        s += ("| " + team);
        s += ("| " + scrumUnits);
        s += ("| " + username);

        return s;

    }

    @Override
    public void create(String s) {
        StringTokenizer tokens = new StringTokenizer(s, "|");
        userId = Integer.parseInt(tokens.nextToken());
        name = tokens.nextToken();
        surname = tokens.nextToken();
        rank = Rank.valueOf(tokens.nextToken());
        team = Team.valueOf(tokens.nextToken());
        scrumUnits = Integer.parseInt(tokens.nextToken());
        username = tokens.nextToken();
        password = tokens.nextToken();
    }

    public boolean checkPass(String pass) {
        return password.equals(pass);
    }

    // ---------- ---------- Getters ---------- ----------
    public String getName() {
        return "" + name;
    }

    public String getSurname() {
        return "" + surname;
    }

    public String getRank() {
        return "" + rank;
    }

    public String getTeam() {
        return "" + team;
    }

    public String getScrumUnits() {
        return "" + scrumUnits;
    }

    public String getUsername() {
        return "" + username;
    }

    public String getPassword() {
        return "" + password;
    }

    public String getUserID() {
        return "" + userId;
    }

    // ---------- ---------- Setters ---------- ----------
    public void setName(String n) {
        this.name = n;
    }

    public void setSurname(String sn) {
        this.surname = sn;
    }

    public void setRank(String r) {
        this.rank = Rank.valueOf(r);
    }

    public void setTeam(String t) {
        this.team = Team.valueOf(t);
    }

    public void setScrumUnits(String su) {
        this.scrumUnits = Integer.parseInt(su);
    }

    public void setUsername(String n) {
        this.username = n;
    }

    public void setPassword(String psswd) {
        this.password = psswd;
    }

    public void setUserID(String uid) {

        this.userId = Integer.parseInt(uid);
    }
}
