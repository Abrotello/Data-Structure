#   Input:
#                   4
#           2               7
#       1       3       6      9  
#   
# 
#   Output:
#                   4
#           7               2
#       9       6       3       1
# 
from Node import Node

def invertTree(root: Node) -> Node:
    if root is None: 
        return None

    tmp: Node = root.left
    root.left = invertTree(root.right)
    root.right = invertTree(tmp)

    return root

if __name__ == "__main__":
    root = Node(4)
    root.left = Node(2)
    root.right = Node(7)
    root.left.left = Node(1)
    root.left.right = Node(3)
    root.right.left = Node(6)
    root.right.right = Node(9)