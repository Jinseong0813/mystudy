T = int(input())

for _ in range(T):
    stack = []
    a = input()
    is_valid = True  

    for ch in a:
        if ch == '(':
            stack.append(ch)
        elif ch == ')':
            if stack:
                stack.pop()
            else:
                is_valid = False  
                break

    if is_valid and not stack:
        print("YES")
    else:
        print("NO")