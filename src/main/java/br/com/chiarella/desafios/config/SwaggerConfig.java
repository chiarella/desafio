package br.com.chiarella.desafios.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig extends WebMvcConfigurationSupport {

	@Bean
	public Docket detalheApi() {
 
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
 
		docket
		.select()
		.apis(RequestHandlerSelectors.basePackage("br.com.ciceroednilson"))
		.paths(PathSelectors.any())
		.build()
		.apiInfo(this.informacoesApi().build());
 
		return docket;
	}
 
	private ApiInfoBuilder informacoesApi() {
 
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
 
		apiInfoBuilder.title("Api-Desafio");
		apiInfoBuilder.description("Api para realização de um CRUD.");
		apiInfoBuilder.version("1.0");
		apiInfoBuilder.termsOfServiceUrl("Termo de uso: TESTE.");
		apiInfoBuilder.license("Licença - Open Source");
		apiInfoBuilder.licenseUrl("https://github.com/chiarella");
		apiInfoBuilder.contact(this.contato());
 
		return apiInfoBuilder;
 
	}
	private Contact contato() {
 
		return new Contact(
				"Anderson Chiarella",
				"chiarellabsi@gmail.com",
				"www.linkedin.com/in/anderson-chiarella");
	}
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("swagger-ui.html")
	.addResourceLocations("classpath:/META-INF/resources/");

	registry.addResourceHandler("/webjars/**")
	.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}