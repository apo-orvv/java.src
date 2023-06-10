class anyType<T>{
    T a;
    public anyType(T p){
        a=p;
    }
    public T retType(){
        System.out.println("Value is: "+a);
        return a;
    }
    public void showType(){
        System.out.println("Type of T is: "+a.getClass().getName());
    }
}
public class anyTypeMain {
    public static void main(String args[]){
        anyType<Integer> it1=new anyType<Integer>(88);
        int c1=it1.retType();
        it1.showType();
        anyType<Float> it2=new anyType<Float>(88.88888f);
        float c2=it2.retType();
        it2.showType();
        anyType<Double> it3=new anyType<Double>(88.888888);
        double c3=it3.retType();
        it3.showType();
        anyType<String> it4=new anyType<String>("AD");
        String c4=it4.retType();
        it4.showType();
    }
}