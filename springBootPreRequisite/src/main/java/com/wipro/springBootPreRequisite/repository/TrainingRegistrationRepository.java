package com.wipro.springBootPreRequisite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springBootPreRequisite.entity.TrainingDetails;
import com.wipro.springBootPreRequisite.entity.TrainingRegistration;

@Repository
public interface TrainingRegistrationRepository extends JpaRepository<TrainingRegistration, Long> {

	List<TrainingRegistration> findByUserId(long userId);

}
