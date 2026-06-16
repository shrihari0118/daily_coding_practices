def firstMissingPositive(nums):
    s = set(nums)

    smallest = 1
    while smallest in s:
        smallest += 1

    return smallest


nums = list(map(int, input().strip('[]').split(',')))
print(firstMissingPositive(nums))