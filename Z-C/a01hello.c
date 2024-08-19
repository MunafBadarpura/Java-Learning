#include<stdio.h>
int main(){
    
    // printf("%d\n", sizeof( int)); // 4
    // printf("%d\n", sizeof(long int)); // 4
    // printf("%d\n", sizeof(short int)); // 2
    // printf("%d\n", sizeof(long long int)); // 8
    // printf("%d\n", sizeof(long long long int)); // err
    // printf("%d\n", sizeof(short short int)); // err

    // printf("%d\n", sizeof(double)); // 8
    // printf("%d\n", sizeof(long double)); // 12
    // printf("%d\n", sizeof(short double)); // err
    // printf("%d\n", sizeof(long long double)); // err
    // printf("%d\n", sizeof(short short double)); // err
    
    // printf("%d\n", sizeof( float)); // 4
    // printf("%d\n", sizeof(long float)); // err
    // printf("%d\n", sizeof(short float)); // err

    // printf("%d\n", sizeof( char)); // 1
    // printf("%d\n", sizeof(long char)); // err
    // printf("%d\n", sizeof(short char)); // err

    // printf("%d\n", sizeof( void)); // 1

    
    float f = 20.20;
    float f2 = 20.20f;

    printf("%f\n", f);
    printf("%f\n", f2);

    printf("%d", sizeof(f2));

    return 0;
}