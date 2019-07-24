package def;

import java.util.Vector;

public class Worker {
	private String _name;
	private String _Id;
	private int[] _d2p ;
	private Farmer _farmer;
	private static  String _lastId;
	
	
	
	@SuppressWarnings("deprecation")
	public Worker(String name, String id, int[] d2p/*, Farmer farmer*/) {
		_name = name;
		_Id = id;
		_d2p = d2p;
		//_farmer = farmer;
		_lastId = id;
	}
	
	
	
	public static String get_lastId() {
		
		
		return _lastId;
	}
	public String get_Id() {
		return _Id;
	}
	
}
