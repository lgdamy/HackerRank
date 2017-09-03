class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
       HashMap<String,Integer> agenda = new HashMap();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         agenda.put(name,phone);         
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
          if(agenda.containsKey(s)) {
              System.out.println(s + "=" + agenda.get(s));
          } else {
              System.out.println("Not found");
          }
      }
   }
}