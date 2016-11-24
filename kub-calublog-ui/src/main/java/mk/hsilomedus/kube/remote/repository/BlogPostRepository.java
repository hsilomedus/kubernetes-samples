package mk.hsilomedus.kube.remote.repository;

import java.util.List;

import mk.hsilomedus.kube.model.BlogPost;
import mk.hsilomedus.kube.model.BlogPostsResource;

import org.springframework.hateoas.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class BlogPostRepository {
	
	public List<BlogPost> findAll() {
		RestTemplate restTemplate = new RestTemplate();
		
		BlogPostsResource posts = 
				restTemplate.getForObject("http://calublogsvc:8081/blogposts", BlogPostsResource.class);
//		return posts.getContent().get(0).getBlogPosts();
		return posts.get_embedded().getBlogPosts();
	}
	
	public BlogPost findOne(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Resource<BlogPost> posts = restTemplate.getForObject("http://calublogsvc:8081/blogposts/"+id, Resource.class);
		return posts.getContent();
	}
	
	public BlogPost save(BlogPost post) {
		RestTemplate restTemplate = new RestTemplate();
		Resource<BlogPost> created = restTemplate.postForEntity("http://calublogsvc:8081/blogposts", post, Resource.class).getBody();
		return created.getContent();
	}

}
