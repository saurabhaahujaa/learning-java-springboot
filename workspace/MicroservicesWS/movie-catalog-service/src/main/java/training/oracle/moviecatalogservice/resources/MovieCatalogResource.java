package training.oracle.moviecatalogservice.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import training.oracle.moviecatalogservice.models.CatalogItem;
import training.oracle.moviecatalogservice.models.Movie;
import training.oracle.moviecatalogservice.models.Rating;

@EnableDiscoveryClient
@RestController
@RequestMapping("/v1/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		
//		RestTemplate restTemplate= new RestTemplate();
		

		List<Rating> ratings = null;
		try {
			ratings = Arrays.asList(
					new Rating("1",restTemplate.getForObject(new URI("http://movie-rating-service/v1/ratingdata/1"), Rating.class).getRating()),
					new Rating("2",restTemplate.getForObject(new URI("http://movie-rating-service/v1/ratingdata/2"), Rating.class).getRating())
					);
		} catch (RestClientException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return ratings.stream().map(rating->{
			Movie movie=null;
			try {
//				movie=restTemplate.getForObject(new URI("http://localhost:8081/v1/movies/"+rating.getMovieId()),Movie.class);
				movie=restTemplate.getForObject(new URI("http://movie-info-service/v1/movies/"+rating.getMovieId()),Movie.class);
			}catch(URISyntaxException|RestClientException e) {
				e.printStackTrace();
				
			}
			return new CatalogItem(movie.getName(),"Fantubulous",rating.getRating());
		})
		.collect(Collectors.toList());
	}
}
