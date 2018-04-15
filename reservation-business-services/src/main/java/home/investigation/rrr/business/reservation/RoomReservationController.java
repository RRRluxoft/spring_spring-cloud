package home.investigation.rrr.business.reservation;

import home.investigation.rrr.business.reservation.client.RoomService;
import home.investigation.rrr.business.reservation.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Date: 09.04.2018
 */
@RestController
public class RoomReservationController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private RoomService roomService;

    @GetMapping(value = "/rooms")
    public List<Room> getAllRooms() {
//        ResponseEntity<List<Room>> roomsResponse = this.restTemplate.exchange(
//            "http://ROOMSERVICES/rooms", HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
//                @Override
//                public Type getType() {
//                    return super.getType();
//                }
//            }
//        );
//        return roomsResponse.getBody();
        return this.roomService.findAll(null);
    }
}
