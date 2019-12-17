#include <stdio.h>
// I apologize I know i did really bad on this lab it just  broke and I couldt work on it any more.
int main(void) {

	char p,q,r ;
	int i = 0;int j = 0;int k = 0;
	int input = 0;
	printf( "truth table\n" );
	printf( "P \t Q \t R \t | f (p,q,r)\n" );
	printf( "--------------------------\n");
		for (i = 0; i <= 1 ; i++) {
			for (j = 0; j <= 1 ; j++) {
				for ( k=  0; k <= 1 ; k++) {
					
					if ( i == 0) {
						p = '1';
					}
					else {
						p = '0'; 
					}
					if (j == 0) {
						 q = '1';
					} 
					else { 
						q = '0';
					}
					if (k == 0) {
						r = '1';
					} 
					else {
						r = '0';
					}
					printf("%d\t%d\t%d\n", p,q,r); 
				}	
  		}
		}

		int Array[8];
	for(int a = 0; a < 8; a++){
		printf(" Enter 0 or 1 : \n");
		scanf("%d",&input);
		if (input == 0 || input == 1){
					Array[a] = input;
		}else if(input > 1){
			printf("Invalid input\n");
			break;
		}else if(input < 0){
			printf("Invalid input\n");
			break;
		}
	}

    return 0;
	}