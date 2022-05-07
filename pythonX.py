import os, time
project = os.environ['project']
print('Hello World!!! to ', project)

print("DO I have your approval to proceed?")
time.sleep(60)
approval = input("enter yes/no")
if approval == "yes":
  print("Changes were applied!!!!!!!")
else:
  print("Exit from code!!!!!!!!!!")  
