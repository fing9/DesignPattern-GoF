package Facade;

import java.util.HashMap;

public class DBMS {
	private HashMap<String, Row> db = new HashMap<String, Row>();

	public DBMS() {
		db.put("jane", new Row("Jane", "1990-02-14", "jane09@naver.com"));
		db.put("robert", new Row("Robert", "1979-11-05", "nice@google.com"));
		db.put("dorosh", new Row("Dorosh", "1985-08-21", "doshdo@sju.ac.kr"));
	}

	public Row query(String name) {
		// DBMS의 조회시간을 흉내내기 위해 시간을 걸리게한다.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return db.get(name.toLowerCase());
	}
	
}
