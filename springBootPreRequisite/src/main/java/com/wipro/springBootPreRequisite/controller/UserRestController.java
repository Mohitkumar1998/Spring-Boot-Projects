package com.wipro.springBootPreRequisite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springBootPreRequisite.entity.TrainingDetails;
import com.wipro.springBootPreRequisite.entity.TrainingRegistration;
import com.wipro.springBootPreRequisite.repository.TrainingDetailsRepository;
import com.wipro.springBootPreRequisite.repository.TrainingRegistrationRepository;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	private TrainingRegistrationRepository trRepo;
	
//	initially no registrations are present in db, to view first create registration using add function by post method
	
	@GetMapping("/viewAllTrainingRegistrations/{userId}")
	private List<TrainingRegistration> viewAllTrainingRegistrations(@PathVariable("userId") long userId) {
		return trRepo.findByUserId(userId);
	}
	
//	Demo Json for creating an entry in db is:
//	{
//		  "id": 1,
//	  	  "userId": 1,
//	  	  "trainingId": 1,
//		  "trainingName": "SpringBoot",
//		  "location": "online",
//	  	  "userName": "Mohit",
//	      "userEmail": "a@abc.def",
//	  	  "dateOfRegistration": "2020-12-31"
//		}	
	
	@PostMapping("/addTrainingRegistration")
	private void addTrainingRegistration(@RequestBody TrainingRegistration thisTrainingRegistration) {
		trRepo.save(thisTrainingRegistration);
	}
	
//	Demo Json for creating an entry in db is:
//	{
//		  "id": 1,
//	  	  "userId": 1,
//	  	  "trainingId": 1,
//		  "trainingName": "SpringBoot",
//		  "location": "online",
//	  	  "userName": "Mohit Kumar",
//	      "userEmail": "c@abc.def",
//	  	  "dateOfRegistration": "2020-12-31"
//		}
	
	@PutMapping("/updateTrainingRegistration/{id}")
	private void updateTrainingRegistration(@RequestBody TrainingRegistration thisTrainingRegistration, @PathVariable("id") long id) {
		trRepo.save(thisTrainingRegistration);
	}
	
	@DeleteMapping("/deleteTrainigRegistration/{id}")
	private void deleteTrainingRegistration(@PathVariable("id") long id) {
		trRepo.deleteById(id);
	}
}
