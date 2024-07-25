class Node:
    
    def __init__(self, value: int, name: str) -> None:
        self.value = value
        self.name = name
        self.next: Node = None