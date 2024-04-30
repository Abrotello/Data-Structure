#include <iostream>
#include <stdlib.h>

using namespace std;

struct Node {
    int value;
    Node *left;
    Node *right;
    
    Node(int value_) : value(value_), left(nullptr), right(nullptr) {}
};

// Functions
void inOrderTraversal(Node *node);
void preOrderTraversal(Node *node);
void postOrderTraversal(Node *node);

int main(int argc, const char * argv[]) {
    
    Node *root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->left = new Node(6);
    root->right->right = new Node(7);
    root->left->right->left = new Node(8);
    root->right->right->left = new Node(9);
    root->right->right->right = new Node(10);
    
    cout << "inOrder: "; inOrderTraversal(root); cout << endl;
    cout << "preOrder: "; preOrderTraversal(root); cout << endl;
    cout << "postOrder: "; postOrderTraversal(root); cout << endl;
    
    // Free memory
    delete root->right->right->right;
    delete root->right->right->left;
    delete root->right->right;
    delete root->right->left;
    delete root->right;
    delete root->left->right->left;
    delete root->left->right;
    delete root->left->left;
    delete root->left;
    delete root;

    return 0;
}

void inOrderTraversal(Node *node) {
    if(node != nullptr) {
        inOrderTraversal(node->left);
        cout << node->value << " ";
        inOrderTraversal(node->right);
    }
}

void preOrderTraversal(Node *node) {
    if(node != nullptr) {
        cout << node->value << " ";
        preOrderTraversal(node->left);
        preOrderTraversal(node->right);
    }
}

void postOrderTraversal(Node *node) {
    if(node != nullptr) {
        postOrderTraversal(node->left);
        postOrderTraversal(node->right);
        cout << node->value << " ";
    }
}
