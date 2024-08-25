class allblock5 {
allblock5() {
System.out.println("---default constactor---");
}
public void m1(){
System.out.println("--method calling--");

}




public static void main(String[] args){
System.out.println("---main method---");
allblock5 xyz = new allblock5();
xyz.m1();
}
}