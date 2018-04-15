package home.investigation.rrr.business.reservation.domain;

@lombok.Getter
@lombok.Setter
public class Guest {
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;

}
