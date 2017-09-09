import static java.lang.System.*;
class Prime {
    public void checkPrime(int... input){
        int output[]=new int[input.length];
        int outpos = 0;
        for (int i=0;i<input.length; i++){
            if (isPrime(input[i])){
                output[outpos] = input[i];
                outpos++;
            }
        }
            for(int i=0; i<outpos;i++){
                out.print(output[i]+" ");
            }
        out.println();
    }
    private boolean isPrime(int in){
        if(in ==1){
            return false;
        }
        for (int i=2;i<in; i++){
            if(in%i==0){
                return false;
            }
        }
        return true;
    }
}

public class Solution {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}