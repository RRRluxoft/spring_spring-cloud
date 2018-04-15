package home.investigation.rrr.business.reservation;

import home.investigation.rrr.business.reservation.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Date: 09.04.2018
 */
@RestController
public class RoomReservationController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/rooms")
    public List<Room> getAllRooms() {
        ResponseEntity<List<Room>> roomsResponse = this.restTemplate.exchange(
            "http://ROOMSERVICES/rooms", HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
                @Override
                public Type getType() {
                    return super.getType();
                }
            }
        );
        return roomsResponse.getBody();
    }
}
