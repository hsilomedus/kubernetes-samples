package mk.hsilomedus.kube.repository;

import mk.hsilomedus.kube.model.BlogPost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="blogposts")
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

}
