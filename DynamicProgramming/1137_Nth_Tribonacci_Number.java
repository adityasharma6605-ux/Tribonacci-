class Solution {
    public int tribonacci(int n) {
        Map<Integer,Integer>map=new HashMap<>();
        return fibo(n,map);
    }
    public int fibo(int n,Map<Integer,Integer>map){
        if(n==0){
            return 0;

        }
        if(n==1 || n==2){
            return 1;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int a=fibo(n-1,map);
        int b= fibo(n-2,map);
        int c=fibo(n-3,map);

        int sum=a+b+c;
        map.put(n,sum);
        return sum;
    }
}
