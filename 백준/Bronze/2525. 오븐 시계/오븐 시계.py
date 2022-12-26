H, M = map(int, input().split())
bns = int(input())
M = M + bns
while M >= 60:
	H = H + 1
	M = M - 60

if H >= 24:
	H = H-24

print(H, M)
