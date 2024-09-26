#include <stdio.h>
#include <stdlib.h>
struct node
{
    int key, height;
    struct node *left,*right;
    
};
int getHeight(struct node *n){
    if(n==NULL)
    return 0;
    return n->height;
}
struct node *createNode(int key)
{
    struct node *node=(struct node*)malloc(sizeof(struct node));
    node->key=key;
    node->left=NULL;
    node->right=NULL;
    node->height=1;
    return node;
}
int max(int a,int b){
	return (a>b)?a:b;
}
int getBalanceFactor(struct node*n){
	if(n==NULL){
		return 0;
	}
	return (getHeight(n->left)-getHeight(n->right));
}
struct node *RightRotate(struct node *y){
	struct node *x=y->right;
	struct node *t2=x->right;
	x->right=y;
	y->left=t2;
	x->height=max(getHeight(x->right),getHeight(x->left)+1);
	y->height=max(getHeight(y->right),getHeight(y->left)+1);
	return x;
}
struct node *leftRotate(struct node *x){
	struct node *y=x->right;
	struct node *t2=y->right;
	y->left=x;
	x->right=t2;
	x->height=max(getHeight(x->right),getHeight(x->left)+1);
	y->height=max(getHeight(y->right),getHeight(y->left)+1);
	return y;
	
}
struct node *insert(struct node *n,int key){
	if(n==NULL){
		return createNode(key);
		
	}
	if(key<n->key)
		n->left=insert(n->right,key);
	else if(key>n->key)
		n->right=insert(n->right,key);
		
	n->height=1+max(getHeight(n->left),getHeight(n->right));
	int bf =getBalanceFactor(n);
	if(bf>1 && key<n->key)
		return RightRotate(n);
	if(bf<-1 &&key>n->right->key)
		return leftRotate(n);
	if(bf>1 && key>n->left->key)
		{
			n->left=leftRotate(n->left);
			return RightRotate(n);
		}
	if(bf<-1 && key<n->right->key){
			n->right=RightRotate(n->right);
			return leftRotate(n);
	}
	return n;
	
	
	
}
void preOrder(struct node *root){
	if(root!=NULL){
		printf("%d",root->key);
		preOrder(root->left);
		preOrder(root->right);
	}
}
int main(){
	struct node *root=NULL;
	root =insert(root,1);
	root=insert(root,2);
	root=insert(root,3);
	root=insert(root,8);
	root=insert(root,5);
	root=insert(root,7);
	root=insert(root,3);
	preOrder(root);
	return 0;
}
