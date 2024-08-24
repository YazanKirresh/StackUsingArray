class StackUsingArray {
static int size(int[] Array){

    return Array.length;
}

static int pop(int[] Array){
    if(Array.length == 0 ){
        System.out.println("OutOfBound Error!");
    }
    return Array.length -1;
}

static int push(int[] Array, int number){
    int[] newArray = [Array.length+1];

    return newArray;
}

public static void main(String[] args) throws Exception { 

}
