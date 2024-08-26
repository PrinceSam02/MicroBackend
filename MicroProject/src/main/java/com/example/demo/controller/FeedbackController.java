//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.model.Feedback;
//import com.example.demo.service.FeedbackService;
//
//@RestController
//@RequestMapping("/api/feedbacks")
//public class FeedbackController {
//
//    @Autowired
//    private FeedbackService feedbackService;
//
//    @PostMapping
//    public Feedback createFeedback(@RequestBody Feedback feedback) {
//        return feedbackService.saveFeedback(feedback);
//    }
//
//    @GetMapping
//    public List<Feedback> getAllFeedback() {
//        return feedbackService.getAllFeedback();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Feedback> getFeedbackById(@PathVariable("id") Long id) {
//        Feedback feedback = feedbackService.getFeedbackById(id);
//        return ResponseEntity.ok(feedback);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Feedback> updateFeedback(@RequestBody Feedback feedback, @PathVariable("id") Long id) {
//        Feedback updatedFeedback = feedbackService.updateFeedback(feedback, id);
//        return ResponseEntity.ok(updatedFeedback);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteFeedback(@PathVariable("id") Long id) {
//        feedbackService.deleteFeedback(id);
//        return ResponseEntity.noContent().build();
//    }
//}