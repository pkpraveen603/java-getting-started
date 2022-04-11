import java.util.ArrayList;

public class segregator {
    public static void segregate(ArrayList<Integer> l){
        int n = l.size();
        int j = 0;
        for(int i=0;i<n;i++){
            if (l.get(i)==0){
                l.set(j,0);
                j++;
            }
            else{
                l.add(l.get(i));
            }
        }
        for(int i=j;i<n;i++){
            l.remove(j);
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(67);
        l.add(0);
        l.add(-2);
        l.add(0);
        segregate(l);
        for(Integer i:l){
            System.out.println(i);
        }
        System.out.println("Size: "+l.size());
    }
}
