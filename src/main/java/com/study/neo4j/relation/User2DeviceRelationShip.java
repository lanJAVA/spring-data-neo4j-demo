package com.study.neo4j.relation;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.study.neo4j.domain.Device;
import com.study.neo4j.domain.User;
import com.study.neo4j.relationtype.RelationType;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:30 .
 */
@RelationshipEntity(type = RelationType.OWNED_DEVICE)
public class User2DeviceRelationShip {
    @GraphId
    private Long id;

    @StartNode
    private User user;
    @EndNode
    private Device device;

    public User2DeviceRelationShip(){}

    public User2DeviceRelationShip(User user, Device device){
        this.user = user;
        this.device = device;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
