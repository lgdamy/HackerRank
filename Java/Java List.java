public class Solution {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam = sc.nextInt();
        List<Integer> lista = new ArrayList<>();
        for (int i=0;i<tam;i++){
            lista.add(sc.nextInt());
        }
        int numOp = sc.nextInt();
        String oper;
        int x,y;
        for (int i = 0; i<numOp; i++){
            oper = sc.next();
            x = sc.nextInt();
            if ("Insert".equals(oper)){
                y = sc.nextInt();
                lista.add(x, y);
            } else if ("Delete".equals(oper)){
                lista.remove(x);
            }
        }
        String list = lista.toString();
        list = list.substring(1, list.length()-1).replace(",","");
        System.out.println(list);
    }
}