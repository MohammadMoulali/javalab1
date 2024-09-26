#include<stdio.h>
#include<stdlib.h>
#define MAX 100
int adj[MAX][MAX];
int visited[MAX];
int queue[MAX];
int front=-1,rear=-1;
int n;
void addEdge(int start,int end)
{
	adj[start][end]=1;
	adj[end][start]=1;
	printf("Edge added between vertex%d and vertex%d\n",start,end);

}
void displayAdjmatrix()
{
	int i,j;
	printf("Adjacency matrix\n");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("%d",adj[i][j]);
		}
		printf("\n");
	}
}
void bfs(int start)
{
	int i,v;
	front=0;
	rear=0;
	queue[rear]=start;
	visited[start]=1;
	printf("BFS traversal:");
	while(front<=rear)
	{
		v=queue[front++];
		printf("%d",v);
		for(i=0;i<n;i++)
		{
			if(adj[v][i]==1&&visited[i]==0)
			{
				queue[++rear]=i;
				visited[i]=1;
			
			}
		}
	}
	printf("/n");
}
void dfs(int v)
{
	int i,j;
	printf("%d",v);
	visited[v]=1;
	for(i=0;i<n;i++)
	{
		if(adj[v][j]==1&&visited[i]==0)
		{
			dfs(i);
		}
	}
}
void resetVisited()
{
	int i;
	for( i=0;i<n;i++){
		visited[i]=0;
	}
}
int main()
{
	int choice,start,end,startvertex,i,j;
	printf("Enter the number of vertices");
	scanf("%d",&n);
	for( i=0;i<n;i++)
	{
		for( j=0;j<n;j++)
		{
			adj[i][j]=0;
			
		}
		visited[i]=0;
	
	}

while(1)
{
	printf("/n Menu:/n");
	printf("1.AddEdge\n");
	printf("2.Display Adjacency Matrix\n");
	printf("3.BFS Traversal\n");
	printf("4.DFS Traversal\n");
	printf("5.exit\n");
	printf("Enter your choice:");
	scanf("%d",&choice);
	switch(choice)
	{
		case 1:
			printf("Enter start and end vertices of the edge");
			scanf("%d%d",&start,&end);
			if(start>=n||start<0||end<0)
			{
				printf("Invalid vertices!please enter vertices between 0 and %d/n",n-1);
			}
			else
			{
				addEdge(start,end);
		    }
		    break;
	
	 case 2:
	 	     displayAdjmatrix();
	 	     break;
	case 3:
		  printf("Enter the starting vertex for BFS");
		scanf("%d",&startvertex);
		if(startvertex>=n||startvertex<0)
		printf("Invalid starting vertex!please enter vertex %d",n-1);
		else
		{
			resetVisited();
		    bfs(startvertex);
		}
		break;
	case 4:  printf("Enter the starting vertex for DFS");
		scanf("%d",&startvertex);
		if(startvertex>=n||startvertex<0)
		printf("Invalid starting vertex!please enter vertex %d",n-1);
		else
		{
			resetVisited();
		    dfs(startvertex);
		    
		}
		   break;
	case 5: exit(0);
	default:
		    printf("invalid choice!please try again/n");
		    
   }
 }
}

