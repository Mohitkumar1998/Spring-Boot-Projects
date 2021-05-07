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
import com.wipro.springBootPreRequisite.repository.TrainingDetailsRepository;

// some changes made here to see where changes are made

@RestController
@RequestMapping("/admin")
public class AdminRestController {
	
	@Autowired
	private TrainingDetailsRepository tdRepo;
	
//	initially both tables are empty so to check first an entry has to be created usinfg add function by post method
	
	@GetMapping("/viewAllTrainingDetails")
	private List<TrainingDetails> viewAllTrainingDetails() {
		return tdRepo.findAll();
	}

//	trainingStat values are either upcoming or ongoing any of these values can be passed and results can be checked
	
	@GetMapping("/viewTrainingDetailsByTrainingStat/{trainingStat}")
	private List<TrainingDetails> viewTrainingDetailsByTrainingMode(@PathVariable("trainingStat") String trainingStat) {
		return tdRepo.findByTrainingStat(trainingStat);
	}
	
//	Demo Json for creating an entry in db is:
//	{
//		  "trainingId": 1,
//		  "trainingName": "SpringBoot",
//		  "startDate": "2021-01-01",
//		  "endDate": "2021-01-20",
//		  "trainingStat": "upcoming",
//		  "location": "online",
//		  "businessUnit": "I&ES",
//		  "contactPersonId": "a@abc.def"
//		}
	
	@PostMapping("/addTrainingDetails")
	private void addTrainingDetails(@RequestBody TrainingDetails thisTrainingDetails) {
		tdRepo.save(thisTrainingDetails);
	}
	
//	Demo Json for updating an entry in db is:
//	{
//		  "trainingId": 1,
//		  "trainingName": "SpringBoot",
//		  "startDate": "2021-01-01",
//		  "endDate": "2021-01-15",
//		  "trainingStat": "upcoming",
//		  "location": "online",
//		  "businessUnit": "Digital",
//		  "contactPersonId": "b@abc.def"
//		}
	
	@PutMapping("/updateTrainingDetails/{trainingId}")
	private void updateTrainingDetails(@RequestBody TrainingDetails thisTrainingDetails, @PathVariable("trainingId") long trainingId) {
		tdRepo.save(thisTrainingDetails);
	}
	
	@DeleteMapping("/deleteTrainingDetails/{trainingId}")
	private void deleteTrainingDetails(@PathVariable("trainingId") long trainingId) {
		tdRepo.deleteById(trainingId);
	}
}
