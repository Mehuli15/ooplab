#include <stdio.h>
void main(){
    int a[10],s,i,n;
    printf("Enter the size of the array : ");
    scanf("%d",& n);

    printf("Enter the array elements :\n ");
    for (i=0; i<n; i++){
        scanf("%d",& a[i]);
    }

    printf("Enter the number to be searched : ");
    scanf("%d", &s);

    for (i=0; i<n; i++){
        if(a[i]==s){
            printf("The number is present in the array");
            break;
        }
    }
    if(i==n){
        printf("The number is not present in the array");
    }
    printf("av.sc.u4cse24150");
}
