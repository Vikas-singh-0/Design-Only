package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node list1 = new Node(2,new Node(13,new Node(56,new Node(4,new Node(12,new Node(55))))));
        // Node list2 = new Node(4,new Node(12,new Node(55,new Node(99))));
        // while (list1!=null) {
        // System.out.println(list1.val + " " + list2.val);
        // list1=list1.next;
        // list2=list2.next;
        // }
        // Node head = mergerLists(list1, list2);
        // while(head!=null){
        //     System.out.println(head.val);
        //     head=head.next;
        // }
        System.out.println(midNode(list1).val);
    }
    public static Node midNode(Node head){
        int count = 0;
        Node temp= head;
        // System.out.println(temp+" "+head);
        while(temp!=null){
            temp = temp.next;
            count++;
            // System.out.println(temp+" "+head);
        }
        int mid = (count/2)+1;
        // System.out.println("size "+count+" "+mid);
        count=0;
        while(count<mid-1){
            head=head.next;
            count++;
        }
        return head;
    }
    public static Node mergerLists(Node list1, Node list2) {
        Node curr = new Node();
        Node temp = curr;
        while (list1 != null || list2 != null) {
            if(list1==null){
                curr.next = list2;
                break; 
            }else if(list2==null){
                curr.next = list1;
                break;
            }
            Node newNode = list1.val < list2.val?new Node(list1.val):new Node(list2.val);
            curr.next = newNode;
            curr = curr.next;
            // list1.val < list2.val?{list1=list1.next}:{list2=list.next};
            if (list1.val < list2.val) {
                list1 = list1.next;
            } else {
                list2 = list2.next;
            }
            // System.out.println(curr.val);
        }

        return temp.next;
    }
}
