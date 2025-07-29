#include <stdio.h>

void main(){

    int a[10],del,i,n;

    printf("Enter the size of the array : ");
    scanf("%d",& n);

    printf("Enter the array elements :\n ");
    for (i=0; i<n; i++){
        scanf("%d",& a[i]);
    }

    printf("Enter the index of the number to be deleted : ");
    scanf("%d",&del);

    if (del>n){
    printf("Deletion not possible.");
    }else{
        for (i=0; i<n; i++){
            a[i]=a[i+1];
        }
        printf("new array is : \n");

        for (i=0; i<n-1; i++){
            printf("%d",a[i]);
            printf(" ");
        }
    }
    printf("av.sc.u4cse24150");
}
