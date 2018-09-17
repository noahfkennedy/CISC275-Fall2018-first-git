Commands used to create four files, leaving one as untracked, one modified, one staged, one in the repo. 

git commit -m "initial project version" 

touch fileUntrack.txt
touch fileMod.txt
touch fileStaged.txt
touch fileRepo.txt


git add fileRepo.txt fileMod.txt
git commit -m " adding fileRepo.txt"
//This will add fileRepo and fileMod to the git directory

vi fileMod.txt //opens file in text editor
i //Insert command
"I am modifying the file"
(esc button)
:wq
git commit -m "adding modifications to the file: 
//This modifies fileMod and then stages it to the git directory

git add fileStaged.txt
//This stages the fileStaged.txt file

//fileUntrack.txt was not added or committed, so it is untracked. 




Username: noahfkennedy
https://github.com/noahfkennedy/CISC275-Fall2018-first-git.git

Repo cloned on local machine. 

.txt file created. Lab 3 updated so that it compiles and runs. 

Pushed commit to master branch of MY GitHub repo. 

Answer, and there is one Comparator object that accepts ty, and there is one Comparator object that accepts type "Animals"

	2. What five objects are created in the main?

		In main, there is one ArrayList that holds type Dogs, there are 3 "Dog" objects, and there is one Comparator object that accepts type "Animals"

	3. Can you spot the comparator constructor call? Where is the class definition for the comparator? 

		The comparator constructor call is within the line of code that creates the comparator object (where the single line that states ` @Override ` is). The class definition for the comparator is within the dogComparator class, which implements the Comparator Interface.  
