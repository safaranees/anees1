import re 

test_string = input()
res = len(re.findall(r'\w+', test_string))
print (str(res))
