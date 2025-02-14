package com.sarthakpawar.Controller.Customer;

import com.sarthakpawar.Services.customer.room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/customer")
public class CustomerRoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/rooms/{pageNumber}")
    public ResponseEntity<?> getAvailableRooms(@PathVariable int pageNumber){
        return ResponseEntity.ok(roomService.getAvailableRooms(pageNumber));
    }


}
