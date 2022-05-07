import os
project = os.environ['project']
print('Hello World!!! to ', project)

print("Would you like to proceed with changes.")
response = os.environ['approval']
if response == "yes":
  print("Changes were applied!!!!!!!")
else:
  print("Exit from code!!!!!!!!!!")  
