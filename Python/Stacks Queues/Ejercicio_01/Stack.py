import json
from Node import Node

class Stack:
    def __init__(self) -> None:
        self.top: Node = None

    def push(self, value: int, name: str) -> None:
        newTop = Node(value, name)
        newTop.next = self.top
        self.top = newTop

    def peek(self) -> str:
        if self.top is None: return json.dumps(None)
        result = {
            'value': self.top.value,
            'name': self.top.name,
        }
        return json.dumps(result)

    def pop(self) -> str:
        if self.top is None: return json.dumps(None)
        topValue: int = self.top.value
        topName: str = self.top.name
        self.top = self.top.next
        result = {
            'value': topValue,
            'name': topName,
        }
        return json.dumps(result)

    def isEmpty(self) -> bool:
        return self.top == None 