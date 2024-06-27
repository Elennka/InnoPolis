package Homework7;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Objects;

@XmlRootElement()
public class Player {


    @JsonProperty("id")
    private int id;
    @JsonProperty("nick")
    private String nick;
    @JsonProperty("points")
    private int points;
    @JsonProperty("isOnline")
    private boolean isOnline;

    public Player() {
    }

    public Player(int id, String nick, int points, boolean isOnline) {
        this.id = id;
        this.nick = nick;
        this.points = points;
        this.isOnline = isOnline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
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
        if (!(o instanceof Player player)) return false;
        return getId() == player.getId() && getPoints() == player.getPoints() && isOnline() == player.isOnline() && Objects.equals(getNick(), player.getNick());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNick(), getPoints(), isOnline());
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", points=" + points +
                ", isOnline=" + isOnline +
                '}';
    }
}