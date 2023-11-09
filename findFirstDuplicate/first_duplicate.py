def FirstDuplicate(arr):
  num_set = set()
  no_duplicate = -1

  for i in range(len(arr)):
    if arr[i] in num_set:
      return arr[i]
    else:
      num_set.add(arr[i])

  return no_duplicate