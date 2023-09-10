class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Q25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1){
            return head;
        }

        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode curr = dum, next = dum, prev = dum;
        int cnt = 0;
        while(curr.next != null){
            curr = curr.next;
            cnt++;
        }
        while(cnt >= k){
            curr = prev.next;
            next = curr.next;
            for(int i = 1 ; i < k ; i++){
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev = curr;
            cnt-=k;
        }
        return dum.next; 
    }
}
