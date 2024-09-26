#include<stdio.h>
#include<stdlib.h>
#define MAX_VERTICES 100
int i,j;
void initailizeMatrix(int matrix[MAX_VERTICES][MAX_VERTICES],int vertices)
{
	for(i=0;i<vertices;i++)
	{
		for( j=0;j<vertices;j++)
		{
			matrix[i][j]=0;
			
		}
	}
}

void addEdge(int matrix[MAX_VERTICES][MAX_VERTICES],int start,int end)
{
	matrix[start][end]=1;
	matrix[end][start]=1;
	
}  
void printMatrix(int matrix[MAX_VERTICES][MAX_VERTICES],int vertices)
{
	printf("adjacency matrix :\n");
	for( i=0;i<vertices;i++)
	{
		for(j=0;j<vertices;j++)
		{ 
			printf("%d ",matrix[i][j]);
			
		}
		printf("\n");
	}
}
int main()
{
	int vertices,edges;
	int matrix[MAX_VERTICES][MAX_VERTICES];
	printf("enter the no of vertices :");
	scanf("%d",&vertices);
	if(vertices>MAX_VERTICES)
	{
		printf("the number of vertices exceeds the maximum limit \n");
		return 1;
	}
	initailizeMatrix(matrix,vertices);
	printf("enter the no of edges:");
	scanf("%d",&edges);
	for ( i=0;i<edges;i++)
	{
		int start,end;
		printf("enter edge %d (start,end): ",i+1);
		scanf("%d %d",&start,&end);
		if(start>=vertices || end>=vertices || start<0 || end<0)
		{
			printf("INVALID EDGE\n");
			i--;
			continue;
		}
		addEdge(matrix,start,end);
	}
	printMatrix(matrix,vertices);
}
