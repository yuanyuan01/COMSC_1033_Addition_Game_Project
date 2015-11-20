# COMSC_1033_Addition_Game_Project 
```
Homework_-10_AdditionGame

We are going to do the addition game using for loops, custom method calls, and an array.

```
## Introduction
```
In this project, i have use three custom method calls 
and create arrays of each variable to be value.
and using for loops and another useful statement to write code.

```
## Project outline
```
* Main Method:
public class COMSC_1033_Addition_Game_Class {
	public static void main(String[] args) {
	}
	
}
* AdditonGameMethod
public static void AdditonGameMethod() {
	Define four array of gameVariables
	using for loops and  if statement or if - else statement
	print the result
	
}
	
*bealoop method
public static int[] getAndCheckStudentAnswer(int[] gameVariables) {
	
	Define two munbers of int type
	also use math to Calculate two numbers addtion.
	input the answer and check the corrct answer.
	print the result

	
}

```
## References & Literature
```
    liang,Y. Daniel. *Introduction to JAVA Programming: Comprehensive Version. 
    * 10th ed. n.p : Pearson, 201.print.
```

import java.util.Scanner;
public class COMSC_1033_Addition_Game_Class {
	public static void main(String[] args) {

        //Call the addition game method.
        AdditonGameMethod();
    }
    public static void AdditonGameMethod() {
        

        int[] gameVariables = new int[4];
        gameVariables[0] = 10; //hardness;
        gameVariables[1] = 2; //hardnessStep;
        gameVariables[2] = 0; //score;
        gameVariables[3] = 0; // 1 for true, 0 for false
        
        int numberOfRounds = 4;
        for(int roundNumber = 1; 
        roundNumber <= numberOfRounds;  
        roundNumber = roundNumber + 1){
            
            System.out.print("Round " + roundNumber + " of " + numberOfRounds + ". ");
            gameVariables = getAndCheckStudentAnswer(gameVariables);
            if(gameVariables[3] == 1){
                System.out.print("Your score was " + gameVariables[2] + " and is now ");
                gameVariables[2] = gameVariables[2] + gameVariables[0];
                System.out.print(gameVariables[2] + ". ");

                if(roundNumber<numberOfRounds){
                    System.out.print("Your hardness was " + gameVariables[0] + " and is now ");
                    gameVariables[0] = gameVariables[0] * gameVariables[1];
                    System.out.println(gameVariables[0] + ".");
                }
            }else{
                System.out.print("Your score is " + gameVariables[2] + ". ");
                if(roundNumber<numberOfRounds){
                    System.out.print("Your hardness was " + gameVariables[0] + " and is now ");
                    if(gameVariables[0]>5){
                        gameVariables[0] = gameVariables[0] / gameVariables[1];
                    }
                    System.out.println(gameVariables[0] + ".");

                }

            }
        }
        System.out.print("\nThe game is complete. ");
        System.out.println("Your final score was " + gameVariables[2] );
    }

    public static int[] getAndCheckStudentAnswer(int[] gameVariables) {
        int number1 = (int)(Math.random()*gameVariables[0]);
        int number2 = (int)(Math.random()*gameVariables[0]);
        System.out.print("Add " + number1 + " and " + number2 +": ");
       
        Scanner get = new Scanner(System.in);
        int studentAnswer = get.nextInt();
        if(studentAnswer == (number1 + number2)){
            System.out.print("Correct. ");
            gameVariables[3] = 1;

        }else{
            System.out.println("Nice try, but the correct answer was " 
                    + (number1 + number2) + ".");
            gameVariables[3] = 0;
        }
        return gameVariables;	

	}
}

   ## Console output
   ```
Round 1 of 4. Add 0 and 6: 6
Correct. Your score was 0 and is now 10. Your hardness was 10 and is now 20.
Round 2 of 4. Add 3 and 9: 12
Correct. Your score was 10 and is now 30. Your hardness was 20 and is now 40.
Round 3 of 4. Add 8 and 2: 10
Correct. Your score was 30 and is now 70. Your hardness was 40 and is now 80.
Round 4 of 4. Add 56 and 54: 110
Correct. Your score was 70 and is now 150. 
The game is complete. Your final score was 150

   ```
## Command Prompt
```
* Starting a project in eclipse
* Start a local repository 
Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\LAB>E:

E:\>dir
 Volume in drive E is YUANYUAN
 Volume Serial Number is 8A4A-E951

 Directory of E:\

04/23/2015  08:51 PM    <DIR>          ???
04/23/2015  08:52 PM    <DIR>          ??????
11/04/2015  11:34 AM            92,218 unforgetabble expeience.docx
11/10/2015  06:54 PM            18,944 You Zeng Field Experience Packet.doc
05/18/2015  09:30 AM    <DIR>          ?????
05/18/2015  09:32 AM    <DIR>          ??????
05/18/2015  09:33 AM    <DIR>          ? ? ?
05/20/2015  10:10 AM    <DIR>          English
05/27/2015  03:55 PM    <DIR>          Skypee
07/21/2015  07:30 PM    <DIR>          ????
08/30/2015  06:11 PM    <DIR>          ????
08/30/2015  06:12 PM    <DIR>          SWOSU
10/02/2015  10:17 AM    <DIR>          Camon Workspace
10/08/2015  03:03 PM    <DIR>          Users
11/01/2015  05:47 PM    <DIR>          New folder
               2 File(s)        111,162 bytes
              13 Dir(s)   9,509,847,040 bytes free

E:\>cd SWOSU

E:\SWOSU>dir
 Volume in drive E is YUANYUAN
 Volume Serial Number is 8A4A-E951

 Directory of E:\SWOSU

08/30/2015  06:12 PM    <DIR>          .
08/30/2015  06:12 PM    <DIR>          ..
10/12/2015  08:30 AM           417,625 English????--??????_????.htm
08/31/2015  08:13 AM    <DIR>          CS1_Workspace
09/01/2015  09:58 AM    <DIR>          eclipse-java-mars-R-win32
09/18/2015  09:42 AM    <DIR>          Operating Systems Class
09/21/2015  05:28 PM    <DIR>          Computer Science I
09/08/2015  03:33 PM    <DIR>          Fund of English
10/12/2015  08:30 AM    <DIR>          English????--??????_????_files
               1 File(s)        417,625 bytes
               8 Dir(s)   9,509,847,040 bytes free

E:\SWOSU>cd Computer Science I

E:\SWOSU\Computer Science I>dir
 Volume in drive E is YUANYUAN
 Volume Serial Number is 8A4A-E951

 Directory of E:\SWOSU\Computer Science I

09/21/2015  05:28 PM    <DIR>          .
09/21/2015  05:28 PM    <DIR>          ..
10/19/2015  10:18 AM    <DIR>          .metadata
11/09/2015  07:05 PM    <DIR>          Listing 4.16
11/09/2015  07:05 PM    <DIR>          rhftghn
09/14/2015  05:02 PM            18,846 HW _ 2.docx
09/15/2015  12:04 PM            45,568 HW _3.doc
09/14/2015  05:44 PM            11,776 HW3.doc
08/31/2015  08:26 AM       189,603,416 jdk-8u60-windows-i586.exe
08/31/2015  08:27 AM       171,043,550 eclipse-java-mars-R-win32.zip
10/19/2015  10:10 PM            56,320 Pre_Exam.HW _ 7.doc
10/26/2015  10:51 AM            19,840 1412_Fun_With_Functions_Project.docx
11/02/2015  03:04 PM    <DIR>          .recommenders
11/09/2015  06:21 PM    <DIR>          HomeWork _9
11/09/2015  07:05 PM    <DIR>          Listing_4_16 project
11/09/2015  07:13 PM    <DIR>          GitHub_files
11/09/2015  07:13 PM            38,802 GitHub.htm
11/10/2015  10:29 AM    <DIR>          Test
09/22/2015  01:08 PM            18,613 HW_4.1.docx
11/16/2015  02:23 PM    <DIR>          HomeWoerk_ 10
11/11/2015  04:24 PM         3,661,528 HW _ 9 Adittion game.md
11/11/2015  04:19 PM    <DIR>          HW _ 9 Adittion game_files
09/22/2015  01:11 PM            21,498 HW_4.2.docx
09/19/2015  11:53 AM         2,331,164 This work is licensed under the Creative
Commons A.doc
11/16/2015  04:09 PM    <DIR>          AnalyzeNumbers
11/09/2015  10:52 AM            12,651 public class strings111232435465.docx
11/18/2015  10:50 AM            15,965 import java.docx
11/20/2015  12:38 PM    <DIR>          Git
11/20/2015  12:51 PM    <DIR>          AdditionGameForHomework_ 10
09/30/2015  03:43 PM            18,517 HW_5.docx
10/08/2015  02:52 PM    <DIR>          eclipse-java-mars-R-win32
10/09/2015  02:07 PM    <DIR>          AdditionGame1214_Project
10/13/2015  11:14 AM            12,706 GIT.docx
10/13/2015  03:18 PM            56,832 AdditionGameHW_6.doc
              17 File(s)    366,987,592 bytes
              17 Dir(s)   9,509,847,040 bytes free

E:\SWOSU\Computer Science I>cd "AdditionGameForHomework_ 10"

E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10>dir
 Volume in drive E is YUANYUAN
 Volume Serial Number is 8A4A-E951

 Directory of E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10

11/20/2015  12:51 PM    <DIR>          .
11/20/2015  12:51 PM    <DIR>          ..
11/20/2015  12:51 PM               403 .project
11/20/2015  12:51 PM    <DIR>          src
11/20/2015  12:51 PM    <DIR>          bin
11/20/2015  12:51 PM               232 .classpath
11/20/2015  12:51 PM                 6 .gitignore
11/20/2015  01:00 PM    <DIR>          AdditionGameForHomework_-10
11/20/2015  01:07 PM    <DIR>          COMSC_1033_Addition_Game_Project
11/20/2015  01:12 PM    <DIR>          .metadata
11/20/2015  01:28 PM    <DIR>          .recommenders
               3 File(s)            641 bytes
               8 Dir(s)   9,509,847,040 bytes free

E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10>cd COMSC_1033_Addition_G
ame_Project

E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10\COMSC_1033_Addition_Game
_Project>git init
Reinitialized existing Git repository in E:/SWOSU/Computer Science I/AdditionGam
eForHomework_ 10/COMSC_1033_Addition_Game_Project/.git/

* Connect our local repository to our global repository.
E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10\COMSC_1033_Addition_Game
_Project>git add .

E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10\COMSC_1033_Addition_Game
_Project>git config user.name
Yuanyuan Yang

E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10\COMSC_1033_Addition_Game
_Project>git config user.name
Yuanyuan Yang

E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10\COMSC_1033_Addition_Game
_Project>git config user.name"yuanyuan01"

E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10\COMSC_1033_Addition_Game
_Project>git config user.email "yangy2@student.swosu.edu"

## Summary
```
In fact, the method is no easy to analysis its function in the code,
and if you creating arrays should be carful to make sure evry variable no such mistakes.
for loop is the most inportant statement to learn, using for loop can make you program to be easily and clearly.

```

E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10\COMSC_1033_Addition_Game
_Project>git commit -m"First commit"
[devYuanyuan 4bd2c29] First commit
 2 files changed, 2 insertions(+), 4 deletions(-)

E:\SWOSU\Computer Science I\AdditionGameForHomework_ 10\COMSC_1033_Addition_Game
_Project>
```
