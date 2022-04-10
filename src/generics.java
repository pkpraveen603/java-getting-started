public class generics {
    public static <T extends Comparable<T>> T find_max(T[] data, int n){
        T ans = data[0];
        for(int i=0; i<n; i++){
           if(data[i].compareTo(ans)>0){
               ans = data[i];
           }
        }
        return ans;
    }

    public static void main(String[] args){

        Integer[] int_arr  = {2,3,4,5,7,-1};
        Integer ans_int = find_max(int_arr,6);
        Float[] float_arr = {1.1f,2.2f,99.2321f,-37.32f};
        Float float_ans = find_max(float_arr,4);
        String[] string_arr = {"alpha","gamma","zeta","beta","delta"};
        String str_ans = find_max(string_arr,5);

        System.out.println("Int: "+ans_int+"\nFloat: "+float_ans+"\nString: "+str_ans);
    }
}
