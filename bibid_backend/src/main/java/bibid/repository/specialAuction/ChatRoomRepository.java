package bibid.repository.specialAuction;

import bibid.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
    Optional<ChatRoom> findByAuction_AuctionIndex(Long auctionIndex);
}