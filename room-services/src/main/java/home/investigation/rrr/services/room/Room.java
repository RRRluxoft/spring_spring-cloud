package home.investigation.rrr.services.room;

import org.springframework.data.annotation.AccessType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@AccessType(AccessType.Type.FIELD)
//@data
@lombok.Data
public class Room {

    @Id
    @Column(name = "ROOM_ID")
    /**
     *     @SequenceGenerator(name = "ROOM_ID_GENERATOR", sequenceName = "ROOM_SEQ", allocationSize = 1)
     *     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ROOM_ID_GENERATOR")
     */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String roomNumber;
    private String bedInfo;

//    public long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getRoomNumber() {
//        return roomNumber;
//    }
//
//    public String getBedInfo() {
//        return bedInfo;
//    }
}
