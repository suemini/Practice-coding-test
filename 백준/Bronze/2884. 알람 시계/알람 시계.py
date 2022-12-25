H, M = map(int, input().split())
if 0 < H <= 23 and 0 <= M < 45:
	print(H-1, M+15)
elif 0 < H <= 23 and 45 <= M <= 59:
	print(H, M-45)
elif 0 <= H and 0 <= M < 45:
	print(23, M+15)
elif 0 <= H and 45 <= M <= 59:
	print(H, M-45)
    