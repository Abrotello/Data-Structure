def isMultipleof3( number: int ) -> bool:
    return number % 3 == 0

def isMultipleof5( number: int ) -> bool:
    return number % 5 == 0

if __name__ == "__main__":
    for i in range(1, 101):
        if isMultipleof3(i) and isMultipleof5(i):
            print(f'{i} FizzBuzz')
        else:
            if isMultipleof3(i):
                print(f'{i} Fizz')
            elif isMultipleof5(i):
                print(f'{i} Buzz')
            else:
                print(i)
        
        