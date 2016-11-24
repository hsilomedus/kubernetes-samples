package mk.hsilomedus.kube.remote.repository;

import mk.hsilomedus.kube.model.User;

import org.springframework.hateoas.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserRepository {
	
	public User getOne(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Resource<User> posts = restTemplate.getForObject("http://calublogsvc:8081/users/"+id, Resource.class);
		return posts.getContent();
	}
	
	public User findByName(String name) {
		RestTemplate restTemplate = new RestTemplate();
		User posts = restTemplate.getForObject("http://calublogsvc:8081/users/search/findByName?name="+name, User.class);
		return posts;
	}

}
