#include <stdio.h>

void main()
{
	int a, b;
	char c;

	printf("수식을 한줄로 띄어쓰기로 입력하세요 :");
	scanf("%d %c %d", &a, &c, &b);

	switch(c) 
	{
		case '+':
			printf("%d + %d = %d입니다.\n", a, b, a + b);
			break;

		case '-':
			printf("%d - %d = %d입니다.\n", a, b, a - b);
			break;
			
		case '*':
			printf("%d * %d = %d입니다.\n", a, b, a * b);
			break;

		case '/':
			printf("%d / %d = %d입니다.\n", a, b, a / b);
			break;

		case '%':
			printf("%d % %d = %d입니다.\n", a, b, a % b);
			break;
		
		defalut :
			printf("연산자를 잘못 입력했습니다.\n");
	}

}


