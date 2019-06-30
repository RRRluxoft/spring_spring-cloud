package home.investigation.rrr.services.room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository<T extends Room, ID extends Long> extends CrudRepository<T, ID>{
             T findByRoomNumber(String roomNumber);
             List<T> findAll();
}
