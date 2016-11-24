package mk.hsilomedus.kube.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlogPostsResource {
	
	BlogPosts _embedded;

	public BlogPosts get_embedded() {
		return _embedded;
	}

	public void set_embedded(BlogPosts _embedded) {
		this._embedded = _embedded;
	}
	
	public BlogPostsResource() {
		
	}

}
