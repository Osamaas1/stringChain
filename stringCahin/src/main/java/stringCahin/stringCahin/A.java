package stringCahin.stringCahin;

//׳�׳—׳�׳§׳” A
public class A {
 private B next;

 public A(B next) {
     this.next = next;
 }

 public String process(String prefix) {
	String updated = prefix + "H";
		    
	 return next.process(updated);
		     
		 }
}




//׳�׳—׳�׳§׳” C



