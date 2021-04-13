package com.wipro.springBootPreRequisite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springBootPreRequisite.entity.TrainingDetails;

@Repository
public interface TrainingDetailsRepository extends JpaRepository<TrainingDetails, Long> {

	List<TrainingDetails> findByTrainingStat(String trainingStat);

}
