static boolean isArmstrong(int n){
    int count = 0;
    int original = n;
    while(n>0){
        count ++;
        n = n/10;
    }
    n = original;

     int sum = 0;
     while(n>0){
    sum = sum + (int) Math.pow(n % 10, count);
    n = n/10;
     }

     if(sum==original){
    return true;
    }else{
        return false;
    }

}

