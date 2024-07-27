class Node:
    def __init__(self, value) -> None:
        self.value: int = value
        self.left: 'Node' = None
        self.right: 'Node' = None