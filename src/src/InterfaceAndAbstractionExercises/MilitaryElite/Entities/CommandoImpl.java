package src.InterfaceAndAbstractionExercises.MilitaryElite.Entities;

import src.InterfaceAndAbstractionExercises.MilitaryElite.Enums.Corps;
import src.InterfaceAndAbstractionExercises.MilitaryElite.Interfaces.Commando;
import src.InterfaceAndAbstractionExercises.MilitaryElite.Interfaces.Mission;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldiersImpl implements Commando {

    private List<Mission>missions;
    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions=new ArrayList<>();
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return Collections.unmodifiableList(this.missions);
    }
}
