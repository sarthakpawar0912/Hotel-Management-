package com.sarthakpawar.Repository;

import com.sarthakpawar.Entity.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
    Page<Room>findByAvailable(boolean available, Pageable pageable);
}
