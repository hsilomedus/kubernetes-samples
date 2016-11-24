package mk.hsilomedus.kube;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

//@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {
	
//	private final String REDIS_ENDPOINT = "http://redis:6379/";
//	
//	@Bean
//	public JedisConnectionFactory connectionFactory() {
//		URI uri = null;
//		try {
//			uri = new URI(REDIS_ENDPOINT);
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return new JedisConnectionFactory(new JedisShardInfo(uri.getHost(), uri.getPort()));
//	}
//	
//	@Bean
//	@Order(value=0)
//	public FilterRegistrationBean sessionRepositoryFilterRegistration(SessionRepositoryFilter filter) {
//		return new FilterRegistrationBean(
//	}
	

}
