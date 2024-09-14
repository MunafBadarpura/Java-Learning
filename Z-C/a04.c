// 1. size is extra when initilize with "";
// 2. scanf work without &
// 3. inout with gets and puts
// 4. scanf("%[^\n]s", str);
// 5. directly initilize karo tab size not neccesary otherwise neccesary


#include<stdio.h>
int main(){
    // char str[6] = "fsdfs";

    // printf("%c\n", 2[str]);

    // puts(str);


    char str[10];
    puts("Enter String : ");
    scanf("%s", &str);
    //scanf("%[^\n]s", str);
    //gets(str);

    printf("%s", str);



    return 0;
}