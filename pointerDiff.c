#include <stdio.h>

int main(){
    int arr[5]= {10, 20, 30, 40, 50};
    int *ptr1= &arr[0];
    int *ptr2= &arr[3];
    int diff= ptr2-ptr1;
    printf("%d\n",diff);
    return 0;
}
