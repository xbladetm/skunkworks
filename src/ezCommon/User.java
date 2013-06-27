/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ezCommon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Andrei
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

    public String getRank() {
        return "" + rank;
    }
}
