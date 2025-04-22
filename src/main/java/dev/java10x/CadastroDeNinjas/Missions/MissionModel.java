package dev.java10x.CadastroDeNinjas.Missions;

import dev.java10x.CadastroDeNinjas.Missions.Enum.MissionRank;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_mission")
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String description;

    private MissionRank rank;

    // Uma missão pode ser executada por vários ninjas;
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissionModel() {
    }

    public MissionModel(String name, String description, MissionRank rank) {
        this.name = name;
        this.description = description;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MissionRank getRank() {
        return rank;
    }

    public void setRank(MissionRank rank) {
        this.rank = rank;
    }

}
