package dev.java10x.CadastroDeNinjas.Missions;

import dev.java10x.CadastroDeNinjas.Missions.Enum.MissionRank;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tb_mission")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
