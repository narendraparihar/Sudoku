# Sudoku
### Complete implementation of sudoku game with puzzle solver and diffrent difficulty levels.
#### Userguide
    1)Run the application 
    2)click on the difficulty level 
    3)get your game ready on board
    4)if cant solve the game 
    5)enter your password and get the solution.
    6)learn from the solution and try again.
    
#### Now let's talk about code
    1)Graphical user interface is created using java swings
    2)random numbers are generated on particular box.
    3)solution generated from that random numbers.
    4)the logic of solution :
           first iterate whole row ,column and box check and try to put number from 1 to 9 in blank box
           if we get that number just fill the box with that number and move ahead.
           sometimes collison occur for last number at that time we use backtracing and remove number we had filled previously.
           and try with other possibilities this way we can generate the solution.
    5)Now at the end user submit the solution we cross check it with our solution
    6)if it matched user wins the game 
    7)otherwise user loose the game.
           
  
#### Screenshot
![](https://i.ibb.co/yScc9rm/Sudoku.png)

<!-- <a href="https://imgbb.com/"><img src="" alt="2021-04-29-18-23-Office-Lens-7-auto-x2-1" border="0"></a> -->
<!--<a href="https://ibb.co/q533SvL"><img src="https://i.ibb.co/yScc9rm/Sudoku.png" alt="Sudoku" border="0"></a> -->
