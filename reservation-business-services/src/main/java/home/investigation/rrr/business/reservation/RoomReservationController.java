package home.investigation.rrr.business.reservation;

import home.investigation.rrr.business.reservation.client.RoomService;
import home.investigation.rrr.business.reservation.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
//            }
//        );
//        return roomsResponse.getBody();
        /*
        cause we're use @see @EnableFeignClients and spring-cloud-starter-feign
         */
        return this.roomService.findAll(null);
    }
}
