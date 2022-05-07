import os
project = os.environ['project']
print('Hello World!!! to ', project)

print("DO I have your approval to proceed")

while os.environ['approval'] != None:
  if os.environ['approval'] == "yes":
    print("Changes were applied!!!!!!!")
  else:
    print("Exit from code!!!!!!!!!!")  
