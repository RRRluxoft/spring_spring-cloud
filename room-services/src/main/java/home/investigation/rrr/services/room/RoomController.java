package home.investigation.rrr.services.room;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/rooms")
@Api(value = "rooms", description = "Data service ", tags = "rooms")
public class RoomController {

    @Autowired
    private RoomRepository<Room, Long> roomRepository;

    @GetMapping
//    @RequestMapping(value = "/search")
    @ApiOperation(value = "Get All Rooms", notes = "Get all rooms in the system", nickname = "getRooms")
    public List<Room> findAll(@RequestParam(name = "roomNumber", required = false)String roomNumber) {
        if (StringUtils.isNotEmpty(roomNumber)) {
            return Collections.singletonList(this.roomRepository.findByRoomNumber(roomNumber));
        }
        return this.roomRepository.findAll();
    }
}
