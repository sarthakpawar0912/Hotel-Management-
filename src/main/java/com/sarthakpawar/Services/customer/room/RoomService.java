package com.sarthakpawar.Services.customer.room;

import com.sarthakpawar.DTO.RoomsResponseDto;

public interface RoomService {

    RoomsResponseDto getAvailableRooms(int pageNumber);
}
