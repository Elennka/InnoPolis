package Homework5;

import java.util.Objects;

public class Players {
    private int id;
    private String nickname;
    private boolean isOnline;

    public Players(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return id == players.id && isOnline == players.isOnline && Objects.equals(nickname, players.nickname);
    }

    @Override
    public String toString() {
        return "Players{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, isOnline);


    }
}
