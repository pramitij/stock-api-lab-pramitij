[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=9815679&assignment_repo_type=AssignmentRepo)
# Welcome to the course CSYE6200 - Object Oriented Design
> Northeastern University, College of Engineering


## Professor: Daniel Peters

### Requirements
1. Eclipse or VS Code or IntelliJ.

Note: If you are using Eclipse, please have git CLI installed on your system or GitHub Desktop to commit the code in this repository

### SetUp Instructions
1. Please clone the repository on your local system
2. For Eclipse Import the project as Existing Maven Project, For IntelliJ you can directlty open it using 'Get from VCS'.
4. All code should be pushed to the main branch
3. Ensure the GitHub actions are successful post push

Submissions will have deadlines, failed GitHub Actions would result in point deductions.

### References
1. Cloning a Repository: <https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository>
2. Any GitHub Setup: Please refer to the Git & GitHub Fundamentals Repository shared to you by your respective TA and refer the README.md section


### Specifications of Assignment
LAB: Stock API:

NOTE: collaborative TEAM work AND INDIVIDUAL work in following description. ALL WORK TO BE PRESENTED IN CLASS AND SUBMITTED TO CANVAS AS ASSIGNMENT.

TEAM EXERCISE: 

Implement a StockMarket class as a lazy Singleton. It must:

A. Add Stock objects;

B. Trade Stock objects (calculate new Stock price based on current price, bid and metric);

C. Remove Stock objects;

D. Show all stocks traded on this market (e.g., Stock state like price, metric, etc.)

Implement your Stock super class with a meaningful toString() and AT LEAST the following attributes:

String name, e.g. IBM

double price, e.g. 131.15

String description, e.g. "IBM Common Stock"

You may include other attributes.

Your Stock class must implement the following Tradable interface and EACH STUDENT INDIVIDUALLY must derive TWO UNIQUE stock subclasses, each with it's own algorithm for calculating the performance metric (getMetric() implementation). provide 6 bids (setBid(double bid)) for each stock subclass and show it's price changing and it's metric changing based on the 6 bids.

public interface Tradable {
    /**
     * place a bid to buy a stock
     * 
     * @param bid
     */
    void setBid(double bid);
    /**
     * return a metric indicating measure of positive performance of this stock
     * where a large positive index means consider buying this well performing stock.
     * and where a large negative index means consider selling this poorly performing stock.
     * @return
     */
    int getMetric();

}

Please reach out to your respective TA if you need any help in regards with submission/ GitHub

Author:
- Aditya Mulik (mulik.a@northeastern.edu)
- Sai Akhil Vemula (vemula.v@northeastern.edu)
