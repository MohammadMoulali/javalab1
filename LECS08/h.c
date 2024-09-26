#include <stdio.h>
#include <stdlib.h>

#define MAX 100

int adj[MAX][MAX];    // Adjacency matrix
int visited[MAX];      // Visited array
int queue[MAX];        // Queue for BFS
int front = -1, rear = -1;
int n;                 // Number of vertices

// Function to add an edge
void addEdge(int start, int end) {
    adj[start][end] = 1;
    adj[end][start] = 1; // For undirected graph
    printf("Edge added between vertex %d and vertex %d.\n", start, end); // Confirmation message
}

// Function to display the adjacency matrix
void displayAdjMatrix() {
    int i, j;
    printf("Adjacency Matrix:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            printf("%d ", adj[i][j]);
        }
        printf("\n");
    }
}

// BFS function
void bfs(int start) {
    int i, v;
    front = 0;
    rear = 0;
    queue[rear] = start;
    visited[start] = 1;

    printf("BFS Traversal: ");

    while (front <= rear) {
        v = queue[front++];
        printf("%d ", v);

        for (i = 0; i < n; i++) {
            if (adj[v][i] == 1 && visited[i] == 0) {
                queue[++rear] = i;
                visited[i] = 1;
            }
        }
    }
    printf("\n");
}

// DFS function
void dfs(int v) {
    int i;
    printf("%d ", v);
    visited[v] = 1;

    for (i = 0; i < n; i++) {
        if (adj[v][i] == 1 && visited[i] == 0) {
            dfs(i);
        }
    }
}

// Function to reset visited array
void resetVisited() {
	int i;
    for ( i = 0; i < n; i++) {
        visited[i] = 0;
    }
}

// Main function
int main() {
    int i,j, choice, start, end, startVertex;

    printf("Enter the number of vertices: ");
    scanf("%d", &n);

    // Initialize adjacency matrix and visited array
    for ( i = 0; i < n; i++) {
        for ( j = 0; j < n; j++) {
            adj[i][j] = 0;
        }
        visited[i] = 0;
    }

    // Menu-driven program
    while (1) {
        printf("\nMenu:\n");
        printf("1. Add Edge\n");
        printf("2. Display Adjacency Matrix\n");
        printf("3. BFS Traversal\n");
        printf("4. DFS Traversal\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter start and end vertices of the edge: ");
                scanf("%d %d", &start, &end);
                if (start >= n || end >= n || start < 0 || end < 0) {
                    printf("Invalid vertices! Please enter vertices between 0 and %d.\n", n - 1);
                } else {
                    addEdge(start, end);
                }
                break;
            case 2:
                displayAdjMatrix();
                break;
            case 3:
                printf("Enter the starting vertex for BFS: ");
                scanf("%d", &startVertex);
                if (startVertex >= n || startVertex < 0) {
                    printf("Invalid starting vertex! Please enter a vertex between 0 and %d.\n", n - 1);
                } else {
                    resetVisited();
                    bfs(startVertex);
                }
                break;
            case 4:
                printf("Enter the starting vertex for DFS: ");
                scanf("%d", &startVertex);
                if (startVertex >= n || startVertex < 0) {
                    printf("Invalid starting vertex! Please enter a vertex between 0 and %d.\n", n - 1);
                } else {
                    resetVisited();
                    printf("DFS Traversal: ");
                    dfs(startVertex);
                    printf("\n");
                }
                break;
            case 5:
                exit(0);
            default:
                printf("Invalid choice! Please try again.\n");
        }
    }

    return 0;
}


