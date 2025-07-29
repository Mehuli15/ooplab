//WAP to insert an element to an array
//Mehuli Sarkar CSE-B AV.SC.U4CSE24150

#include <stdio.h>
void main(){
    int arr[10], size, position, value;

    printf("Enter the size of the array : ");
    scanf("%d",& size);
    printf("Enter the element of the array : ");
    for (int i=0; i<size; i++){
        scanf("%d",& arr[i]);
    }
    printf("Enter the position you want to insert the new element : ");
    scanf("%d",& position);
    printf("Type the value you want to insert : ");
    scanf("%d",& value);
    for (int i=size-1; i>=position; i--){
        arr[i+1]=arr[i];
    }
    arr[position]=value;
    size =size+1;
    for( int j=0; j<size; j++){
        printf("%d\n",j, arr[j]);
    }

}
