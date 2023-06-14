import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Main{
public static void main(String[]args){
    Queue<String> que=new LinkedList<>();
    que.add("Ayi Bogan Reco");
    que.add("Resul");
    que.add("Yahya");
    que.add("Reis");
    que.add("Su Aygiri");
    System.out.println(que.poll());
    System.out.println("*********");
    Iterator<String> itr=que.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
        }
}