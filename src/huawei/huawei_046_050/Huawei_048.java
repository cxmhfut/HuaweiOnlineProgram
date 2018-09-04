package huawei.huawei_046_050;

import java.util.Scanner;

/**
 * 从单向链表中删除指定值的节点
 */
public class Huawei_048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int head = sc.nextInt();
            Node first = listInit(head);
            for (int i = 1; i < n; i++) {
                int key = sc.nextInt();
                int preKey = sc.nextInt();
                insert(first, key, preKey);
            }
            printList(first);
            int delKey = sc.nextInt();
            delete(first,delKey);
            printList(first);
        }

        sc.close();
    }

    static class Node {
        int key;
        Node next;

        Node() {
        }

        Node(int key) {
            this.key = key;
        }
    }

    /**
     * 初始化链表
     */
    public static Node listInit(int headKey) {
        Node first = new Node();
        first.next = new Node(headKey);
        return first;
    }

    /**
     * 查找节点值为key的节点
     *
     * @param first
     * @param key
     * @return 存在返回该节点，否则返回空
     */
    public static Node search(Node first, int key) {
        Node cur = first.next;
        while (cur != null) {
            if (cur.key == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    /**
     * 在以first为头节点的表中 在值为preKey节点后插入新的节点
     *
     * @param first
     * @param key
     * @param preKey
     */
    public static void insert(Node first, int key, int preKey) {
        Node pre = search(first, preKey);
        if (pre != null) {
            Node node = new Node(key);
            node.next = pre.next;
            pre.next = node;
        }
    }

    public static void delete(Node first, int delKey) {
        Node pre = first;
        Node cur = first.next;
        while (cur != null) {
            if (cur.key == delKey) {
                pre.next = cur.next;
            }
            pre = cur;
            cur = cur.next;
        }
    }

    public static void printList(Node first) {
        Node cur = first.next;

        while (cur != null) {
            System.out.print(cur.key + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
