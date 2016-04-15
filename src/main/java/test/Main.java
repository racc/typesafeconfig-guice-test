package test;

import com.github.racc.tscg.TypesafeConfigModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Main {

	public static void main(String[] args) {
		Config config = ConfigFactory.load();
		System.out.println(config.getString("test.prop"));
		System.out.println(config.getString("test.prop2"));
		
		Injector injector = Guice.createInjector(TypesafeConfigModule.fromConfigWithPackage(config, "test"));
		System.out.println(injector.getInstance(Injectable.class));
	}
}
