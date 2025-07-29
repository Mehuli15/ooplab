//WAP to take 5 ages and print the ages of the array
//Mehuli Sarkar CSE-B AV.SC.U4CSE24150

#include <stdio.h>
void main(){
    int age[5];
    printf("Enter 5 ages : ");
    for( int i=0; i<5; i++){
        scanf("%d",& age[i]);
    }
    for( int i=0; i<5; i++){
        printf("%d", age[i]);
    }

}
