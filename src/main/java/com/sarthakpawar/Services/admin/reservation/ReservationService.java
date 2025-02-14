package com.sarthakpawar.Services.admin.reservation;

import com.sarthakpawar.DTO.ReservationResponseDto;

public interface ReservationService {
    ReservationResponseDto getAllReservations(int pageNumber);
    boolean changeReservationStatus(Long id, String status);
}
