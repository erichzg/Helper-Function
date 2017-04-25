# Helper Function
Eric Zhang, Fabiha Ahmed, David Frid

# Design
Ticket:<br>
  Instance variables for ID, priority, problem, name, and if it is solved.
  <br>
  Comparable based on priority
  
HelpDesk:<br>
<ul>
  <li> addTicket() uses user input. The user is prompted for their name, vp level, and issue.  All of this is used to add a new Ticket to the Ticket queue in HelpDesk. The id of each added Ticket is one more than the previous. </li>
  <li> deQueue() is used for an unsolved problem. </li>
  <li> deQueue(String solutionDesc) is used for a solved problem, it prints out the solution. </li>
</ul>
  <br>
  Instance variable: ArrayPriorityQueue for tickets and maximum id
  <br>

