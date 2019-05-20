package com.young.flightcheckin.integration;

import com.young.flightcheckin.integration.dto.Reservation;
import com.young.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);

}
