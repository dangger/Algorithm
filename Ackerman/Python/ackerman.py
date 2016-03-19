def ackerman(n, m) :
    if (m == 0 and n == 1) :
        return 2
    elif (m >= 0 and n == 0) :
        return 1
    elif (m == 0 and n >= 2) :
        return n + 2
    elif (m >= 1 and n >= 1) :
        return ackerman(ackerman(n - 1, m), m - 1)

print "This is a Ackerman function."
print "Please enter n and m:"
n = input("n = ")
m = input("m = ")
print "Ackerman(%d,%d) = %d" % (n, m, ackerman(n, m))
