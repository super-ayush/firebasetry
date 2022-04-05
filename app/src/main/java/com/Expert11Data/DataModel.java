package com.Expert11Data;

public class DataModel {

    int expert_pic;
    String expert_name;
    int expert_team;

    public DataModel(int expert_pic, String expert_name, int expert_team) {
        this.expert_pic = expert_pic;
        this.expert_name = expert_name;
        this.expert_team = expert_team;
    }

    public int getExpert_pic() {
        return expert_pic;
    }

    public void setExpert_pic(int expert_pic) {
        this.expert_pic = expert_pic;
    }

    public String getExpert_name() {
        return expert_name;
    }

    public void setExpert_name(String expert_name) {
        this.expert_name = expert_name;
    }

    public int getExpert_team() {
        return expert_team;
    }

    public void setExpert_team(int expert_team) {
        this.expert_team = expert_team;
    }
}
