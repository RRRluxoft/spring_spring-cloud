package home.investigation.rrr.business.reservation.domain;

import lombok.Setter;

@lombok.Getter
@Setter
public class Reservation {
    private long id;
    private long roomId;
    private long guestId;
    private String reservationDate;

}
