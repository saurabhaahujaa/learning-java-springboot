package training.oracle.ratingdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.oracle.ratingdataservice.models.Rating;

@RestController
@RequestMapping("/v1/ratingdata")
public class RatingResource {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId,5);
	}
	
	@RequestMapping("users/{userId}")
	public List<Rating> getUserRating(@PathVariable("userId") String userId){
		List<Rating> ratings=Arrays.asList(
				new Rating("1",5),
				new Rating("2",4)
				);
		return ratings;
		
	}
}
