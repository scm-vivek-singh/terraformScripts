import os
project = os.environ['project']
print('Hello World!!! to ', project)

print("Would you like to proceed with changes.")
response = input("select yes/no to proceed or discard respectively: ")
if response == "yes":
  print("Changes were applied!!!!!!!")
else:
  print("Exit from code!!!!!!!!!!")  
