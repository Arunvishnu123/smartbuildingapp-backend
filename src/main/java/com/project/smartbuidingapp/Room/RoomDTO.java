package com.project.smartbuidingapp.Room;

import com.project.smartbuidingapp.Heater.HeaterEntity;
import com.project.smartbuidingapp.Window.WindowEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;


public class RoomDTO {
    private Long ID;
    private String roomName;
    private Long roomID;
    private float roomTemperature;
    private Long buildingID;
    /*
    @ManyToMany
    private Collection<WindowEntity> windows = new ArrayList<>();
    @ManyToMany
    private Collection<HeaterEntity> heaters = new ArrayList<>();
*/

    public RoomDTO(RoomEntity roomEntity) {
        this.ID = roomEntity.getID();
        this.roomName = roomEntity.getRoomName();
        this.roomID = roomEntity.getRoomID();
        this.roomTemperature = roomEntity.getRoomTemperature();
        this.buildingID = roomEntity.getBuildingID();
    }

    public RoomDTO() {
    }

    public RoomDTO(Long ID, String roomName, Long roomID, float roomTemperature, Long buildingID) {
        this.ID = ID;
        this.roomName = roomName;
        this.roomID = roomID;
        this.roomTemperature = roomTemperature;
        this.buildingID = buildingID;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Long getRoomID() {
        return roomID;
    }

    public void setRoomID(Long roomID) {
        this.roomID = roomID;
    }

    public float getRoomTemperature() {
        return roomTemperature;
    }

    public void setRoomTemperature(float roomTemperature) {
        this.roomTemperature = roomTemperature;
    }

    public Long getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(Long buildingID) {
        this.buildingID = buildingID;
    }
}
