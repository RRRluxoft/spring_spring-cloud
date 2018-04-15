package home.investigation.rrr.business.reservation.client;

import home.investigation.rrr.business.reservation.domain.Room;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("ROOMSERVICES")
public interface RoomService {

    @GetMapping("/rooms")
    List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber);

}
