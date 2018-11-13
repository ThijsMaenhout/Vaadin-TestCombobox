package be.one.test.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import be.one.test.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
