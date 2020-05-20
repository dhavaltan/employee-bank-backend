package com.cognizant.employeebank.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.employeebank.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {

	@Transactional
	@Modifying
	@Query(value="INSERT INTO notification (text,notification_date) VALUES(?,curDate())", nativeQuery = true)
	void saveNotification(String text);
	
	@Query(value="SELECT notification_id,text,notification_date FROM notification order by notification_id desc limit 3", nativeQuery = true)
	List<Notification> findRecentNotification();

}
