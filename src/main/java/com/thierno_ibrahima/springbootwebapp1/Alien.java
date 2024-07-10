package com.thierno_ibrahima.springbootwebapp1;

public class Alien {
  private int alienId;
  private String alienName;

    public Alien(int alienId, String alienName) {
        this.alienId = alienId;
        this.alienName = alienName;
    }

    public int getAlienId() {
        return alienId;
    }

    public void setAlienId(int alienId) {
        this.alienId = alienId;
    }

    public String getAlienName() {
        return alienName;
    }

    public void setAlienName(String alienName) {
        this.alienName = alienName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alien{");
        sb.append("alienId=").append(alienId);
        sb.append(", alienName=").append(alienName);
        sb.append('}');
        return sb.toString();
    }
  
}
