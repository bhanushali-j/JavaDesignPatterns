package creational;

import java.util.Calendar;

//When you want to allow only one object instantiation per JVM for a class
public class SingletonPattern{
	
	
	//Problem with below singleton code is object is created even before it is required.
	public static class EagerSingleton{
		private static EagerSingleton instance=new EagerSingleton();
		
		private EagerSingleton() {};
		
		public static EagerSingleton getInstance() {
			return instance;
		}
	}
	
	/*
	 * Using this we resolved the above issue however in lazySingleton issue arises
	 * in case two threads t1 and t2 reach into getInstance() method at the null
	 * check and both will create seperate instances so in total we will have two
	 * instances.
	 */
	public static class LazySingleton{
		private static LazySingleton instance=null;
		
		private LazySingleton() {};
		
		public static LazySingleton getInstance() {
			if(instance==null){
				instance=new LazySingleton();
			}
			return instance;
		}
	}
	
	/*
	 * We can use enum as it is thread safe and guarantees one instance only. Enum
	 * implicitly creates a private constructor and static method getInstance().
	 */
	public enum MySingleton {
		  INSTANCE;   
	}

	
	/*
	 * Calendar class is example of singleton as we cannot instantiate it as seen
	 * below, we can get the instance by calling getInstance method of Calendar
	 * class.
	 */
//	Calendar c=new Calendar();
}
