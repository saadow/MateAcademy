package SpringIntro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import SpringIntro.AbstractAnimal;
import SpringIntro.Cat;
import SpringIntro.Dog;
import SpringIntro.Mouse;

@Configuration
//@ComponentScan("lesson19.spring.intro.entity")
public class AppConfig {

	@Bean
	public Cat returnCat() {
		return new Cat();
	}

	@Bean("dog")
	@Primary
	public Dog returnDog() {
		return new Dog();
	}

	@Bean("mouse")
	public Mouse returnMouse() {
		return new Mouse();
	}

	@Bean("pig")
	public Pig returnPig() {
		return new Pig();
	}

	//Don't write same
	class Pig extends AbstractAnimal {

		@Override
		public String getVoice() {
			return "Hru-hru";
		}

	}
}

