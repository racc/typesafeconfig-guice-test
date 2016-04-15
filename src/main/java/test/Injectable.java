package test;

import com.github.racc.tscg.TypesafeConfig;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class Injectable {

	private final String a;
	private final String b;

	@Inject
	public Injectable(
		@TypesafeConfig("test.prop") String a, 
		@TypesafeConfig("test.prop2") String b
	) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return a + " " + b;
	}
}
