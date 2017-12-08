
package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@Autowired
	private Environment environment;



	@Value("${sampleProject}")
	private String sampleProject;

	@RequestMapping("/")
	public String query(@RequestParam("q") String q) {
		System.out.println(environment.toString());
		System.out.println("sampleProject=>>>>" + environment.getProperty("sampleProject"));
		return environment.getProperty(q);
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}


