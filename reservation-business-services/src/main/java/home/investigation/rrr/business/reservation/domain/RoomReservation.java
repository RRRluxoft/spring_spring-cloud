package home.investigation.rrr.business.reservation.domain;

@lombok.Getter
@lombok.Setter
public class RoomReservation {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private String date;

}
