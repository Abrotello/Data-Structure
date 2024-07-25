import json
from Stack import Stack


class QueueWithStacks:
    def __init__(self):
        self.firstStack = Stack()
        self.secondStack = Stack()

    def add(self, value: int, name: str) -> None:
        self.firstStack.push(value, name)
    
    def peek(self) -> str:
        self._fillSecondStack()
        return self.secondStack.peek()

    def remove(self) -> str:
        self._fillSecondStack()
        return self.secondStack.pop()

    def isEmpty(self) -> bool:
        return self.firstStack.isEmpty() and self.secondStack.isEmpty()

    def _fillSecondStack(self) -> None:
        if(self.secondStack.isEmpty()):
            while not self.firstStack.isEmpty():
                results = self.firstStack.pop()
                data = json.loads(results)
                self.secondStack.push(data['value'], data['name'])


if __name__ == '__main__':
    queue = QueueWithStacks()

    queue.add(1, 'Adrian')
    queue.add(2, 'Juan')
    queue.add(3, 'Pablo')
    queue.add(4, 'Andrea')
    queue.add(5, 'Jose')
    queue.add(6, 'Diego')

    print(queue.isEmpty())
    print(queue.peek())