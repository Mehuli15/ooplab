#AV.SC.U4CSE24150
#include <stdio.h>
void main(){
    int a[10],position,i,n,value;
    printf("Enter the size of the array : ");
    scanf("%d",& n);
    printf("Enter the array elements :\n ");

    for (i=0; i<n; i++){
        scanf("%d",& a[i]);
    }
    printf("Enter the position : ");
    scanf("%d",& position);
    printf("Enter the value : ");
    scanf("%d",& value);

    for (i=n-1; i>=position; i--){
        a[i+1]=a[i];
    }
    a[position]=value;
    n=n+1;
    printf("Resultant array is : \n");

    for (i=0; i<n; i++){
        printf("a[%d]=%d\n",i,a[i]);
    }
    printf("av.sc.u4cse24150");
}
