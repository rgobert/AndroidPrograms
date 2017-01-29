package com.example;

/**
 * Created by Beeztofly on 09/08/2016.
 */
public class player {

    private int live;
    private int lvl;
    private String name;

    public void player(){

    }

    public void player(String nameTmp){
        name = nameTmp;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


