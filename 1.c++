#include <iostream>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main()
{
    cout << "enter your name " << endl;
    string name;
    cin >> name;
    cout << " hello in my app " << name;
    srand(time(0));
    int grade = 0;
    int counter =1;
    while (counter !=0)
    {

        int number1 = (rand() % 12) + 1;
        int number2 = (rand() % 12) + 1;
        
        int choise;
        cout << " what is the solutian " << endl
             << number1 << "*" << number2 << endl;
        cin >> choise;

        if (choise == number1 * number2)
        {

            grade += 10;
            cout << "very goood " << name;
        }
        else
        {
            cout << "ohh no wrong ";
            if  ( grade >= 5) 
            grade-= 5;
            else 
            grade = 0;
        }
        
        
        

        cout << "\n do uou want authar Ex ? \n . enter 0 to exit or enter any number to countanue " << endl;
        cin >> counter;
    }

    cout << "ok this is your grade now " << name << endl;
    cout << grade;

system("pause");
}