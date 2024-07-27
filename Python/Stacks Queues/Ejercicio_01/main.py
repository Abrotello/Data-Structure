from QueueWithStacks import QueueWithStacks

if  __name__ == '__main__':
     queue = QueueWithStacks()

     queue.add(1, 'Adrian')
     queue.add(2, 'Juan')
     queue.add(3, 'Pablo')
     queue.add(4, 'Andrea')
     queue.add(5, 'Jose')
     queue.add(6, 'Diego')

     print(queue.isEmpty())
     print(queue.peek())