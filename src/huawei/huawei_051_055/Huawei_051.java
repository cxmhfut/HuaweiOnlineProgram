package huawei.huawei_051_055;

import java.util.Scanner;

/**
 * 输出单向链表中倒数第K个节点
 */
public class Huawei_051 {

    public static class Node{
        int key;
        Node next;
        Node(){
            key = 0;
        }
        Node(int key){
            this.key = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            Node head = new Node();
            for(int i=0;i<n;i++){
                int key = sc.nextInt();
                Node node = new Node(key);
                node.next = head.next;
                head.next = node;
            }
            int k = sc.nextInt();
            Node kNode = getKthNode(head,k);
            if(kNode!=null) System.out.println(kNode.key);
        }

        sc.close();
    }

    public static Node getKthNode(Node head,int k){
        int x = 0;
        Node cur = head;
        while (cur!=null){
            if(x==k){
                return cur;
            }
            x++;
            cur = cur.next;
        }
        return null;
    }
}
