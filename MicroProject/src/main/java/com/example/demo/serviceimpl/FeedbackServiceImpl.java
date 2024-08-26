//package com.example.demo.serviceimpl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.model.Feedback;
//import com.example.demo.repo.FeedbackRepo;
//import com.example.demo.service.FeedbackService;
//
//@Service
//	public class FeedbackServiceImpl implements FeedbackService {
//
//	    @Autowired
//	    private FeedbackRepo feedbackRepository;
//
//	    @Override
//	    public Feedback saveFeedback(Feedback feedback) {
//	        return feedbackRepository.save(feedback);
//	    }
//
//	    @Override
//	    public List<Feedback> getAllFeedback() {
//	        return feedbackRepository.findAll();
//	    }
//
//	    @Override
//	    public Feedback getFeedbackById(Long id) {
//	        return feedbackRepository.findById(id).orElseThrow(() -> 
//	            new ResourceNotFoundException("Feedback not found with id: " + id));
//	    }
//
//	    @Override
//	    public Feedback updateFeedback(Feedback feedback, Long id) {
//	        Feedback existingFeedback = feedbackRepository.findById(id).orElseThrow(() -> 
//	            new ResourceNotFoundException("Feedback not found with id: " + id));
//
//	        existingFeedback.setName(feedback.getName());
//	        existingFeedback.setEmail(feedback.getEmail());
//	        existingFeedback.setCleanliness(feedback.getCleanliness());
//	        existingFeedback.setCleanlinessDescription(feedback.getCleanlinessDescription());
//	        existingFeedback.setService(feedback.getService());
//	        existingFeedback.setServiceDescription(feedback.getServiceDescription());
//	        existingFeedback.setAmenities(feedback.getAmenities());
//	        existingFeedback.setAmenitiesDescription(feedback.getAmenitiesDescription());
//	        existingFeedback.setValueForMoney(feedback.getValueForMoney());
//	        existingFeedback.setValueForMoneyDescription(feedback.getValueForMoneyDescription());
//	        existingFeedback.setComments(feedback.getComments());
//	        existingFeedback.setRecommend(feedback.getRecommend());
//
//	        return feedbackRepository.save(existingFeedback);
//	    }
//
//		@Override
//		public void deleteFeedback(Long id) {
//			// TODO Auto-generated method stub
//			
//		}
//
////	    @Override
////	    public void deleteFeedback(Long id) {
////	        Feedback existingFeedback = feedbackRepository.findById(id).orElseThrow(() -> 
////	            new ResourceNotFoundException("Feedback not found with id: " + id));
////	        feedbackRepository.delete(existingFeedback);
////	    }
//	}
//
