// 1. size is extra when initilize with "";
// 2. scanf work without &
// 3. inout with gets and puts
// 4. scanf("%[^\n]s", str);
// 5. directly initilize karo tab size not neccesary otherwise neccesary


#include<stdio.h>
int main(){

    char str[10];
    puts("Enter String : ");
    scanf("%s", &str);

    int num1 = 0;
    int num2 = 0;
    int check = 0;
    char opr = '0';

    int i = 0;
    while(str[i] != '\n'){
        if(str[i] >= '0' && str[i] <= '9'){
            int val = str[i] - 48;
            if(check == 0){
                num1 =  num1 *10 + val;
            }
            if(check == 1){
                printf("%d\n", val);
                num2 =  num2 *10 + val;
            }
        }

        else if(str[i] == '+' || str[i] == '-'){
            check = 1;
            opr = str[i];
        }

        i++;
    }


    printf("%d", num1);
    printf(" %d", num2);
    printf(" %c", opr);



    return 0;
}