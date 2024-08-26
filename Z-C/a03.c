#include<stdio.h>
int isPrime(int num){
    for(int i=2;i<num;i++){
        if(num%i == 0){
            return 0;
        }
    }

    return 1;
}

int main(){
    int n;
    printf("Enter  N : ");
    scanf("%d", &n);
    int num = 3;
    int check = 1;

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0 || i==n-1 || j==0 || j==n-1){
                while(isPrime(num) == 0){
                    num++;
                }

                printf("%d ", num);
                num++;
            }
            else {
                printf("  ");
            }
        }
        printf("\n");
    }

    return 0;
}