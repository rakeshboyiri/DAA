class Teacher:
    def __init__(self,x):
        self.x = x

    def display(self,x):
        print(self.x)
obj = Teacher(10)
obj.display(20)
