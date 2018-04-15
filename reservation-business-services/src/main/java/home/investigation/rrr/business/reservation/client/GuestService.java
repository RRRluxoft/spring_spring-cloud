package home.investigation.rrr.business.reservation.client;

import home.investigation.rrr.business.reservation.domain.Guest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("GUESTSERVICES")
public interface GuestService {

    @GetMapping(value="/guests")
    List<Guest> findAll(@RequestParam(name="emailAddress", required = false)String emailAddress);

    @GetMapping(value = "/guests/{id}")
    Guest findOne(@PathVariable(name="id")long id);
}

