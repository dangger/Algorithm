def perms(elements) :
    if len(elements) <= 1 :
        yield elements
    else :
        for perm in perms(elements[1:]) :
            for i in range(len(elements)) :
                yield perm[:i] + elements[0:1] + perm[i:]

for item in list(perms([1, 2, 3])) :
    print item
