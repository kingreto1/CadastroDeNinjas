package dev.java10x.CadastroDeNinjas.Missions.Enum;

public enum MissionRank {
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    S("S");

    private final String rank;

    MissionRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
