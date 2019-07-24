package def;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, String> hash = new HashMap<>();
		hash.put("a", "alef");
		
		
		int i;
		int k;
		hash.put("b", "bet");
		System.out.println(hash.get("A".toLowerCase()));
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0 ; i < 100; i++){
					System.out.println("i=" + i);
				}
				
				
			}
		});
		t.start();
		for (int j = 0 ; j < 100; j++){
			System.out.println("j=" + j);
		}
		
	}
	
	
	
		
		
	}


