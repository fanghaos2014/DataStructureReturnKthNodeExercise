package returnKthtoLast;

// O(n) for time complexity
// O(1) for space complexity
public class KthetotheLast2 {
	
	public static LinkedListNode rethrnKth(LinkedListNode head, int k){
		LinkedListNode p1 = head;
		LinkedListNode p2 = head; 
		
		for(int i = 0 ; i < k; i++){
			if ( p1 != null){
				p1 = p1.next;
			}
		}
		
		while (p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2; 
	}
}
