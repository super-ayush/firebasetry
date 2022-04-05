package com.ExpertRanks;

public class DataModel {


    String expertTeam_rank;
    int expert_pic;
    String expert_name;
    String expertTeam_points;
    int expert_team;


    public DataModel(String expertTeam_rank, int expert_pic, String expert_name, String expertTeam_points, int expert_team) {
        this.expertTeam_rank = expertTeam_rank;
        this.expert_pic = expert_pic;
        this.expert_name = expert_name;
        this.expertTeam_points = expertTeam_points;
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

    public String getExpertTeam_rank() {
        return expertTeam_rank;
    }

    public void setExpertTeam_rank(String expertTeam_rank) {
        this.expertTeam_rank = expertTeam_rank;
    }

    public String getExpertTeam_points() {
        return expertTeam_points;
    }

    public void setExpertTeam_points(String expertTeam_points) {
        this.expertTeam_points = expertTeam_points;
    }
}
