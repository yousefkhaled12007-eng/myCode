#include <iostream>
using namespace std;
double cuab(double l)
{
    double area = l * l * l;

    return area;
}


double parallel_rectangle(double l, double t, double x)
{

    double voilam = l * t * x;
    return voilam;
}

double ball(double r)
{

    double voliam = (4.0 / 3.0) * 3.14 * (r * r * r);
    return voliam;
}

double circle(double r)
{
    return 3.14 * r * r;
}

double square(double l)
{
    return l * l;
}

double rectangle(double l, double t)
{
    return l * t;
}


int main()
{
    cout << "hello in my app. what is your name?\n";
    string name;
    cin >> name;

    cout << "\nok " << name << " what do you want to measure?\n";
    cout << "2d or 3d : enter 1 for 2d or enter 2 for 3d \n ";
    int choice;
    cin >> choice;

    if (choice == 1)
    {

        int choice_shape;
        cout << "please enter the shape you want \n " << "circle = 1 , square = 2 , rectangle = 3 \n ";
        cin >> choice_shape;
        switch (choice_shape)
        {
        case 1:
        {
            cout << "please enter R:\n";
            double R;
            cin >> R;
            cout << "the area is " <<circle(R);
            break;
        }

        case 2:
        {
            cout << "please enter the length:\n";
            double L;
            cin >> L;
            cout << "the area is " <<square(L);
            break;
        }

        case 3:
        {
            cout << "please enter the length:\n";
            double L;
            cin >> L;

            cout << "please enter the width:\n";
            double W;
            cin >> W;

            cout << "the area is "<< rectangle(L, W);
            break;
        }

        default:
            cout << "wrong choice!";
        }
    }
    else if (choice == 2)
    {
        cout << "please enter the shape you want \n " << " ball = 1 , cube = 2 , parellal rectangle = 3 \n ";

        int Choice_shape;
        cin >> Choice_shape;

        switch (Choice_shape)
        {
        case 1:
            cout << "please enter R:\n";
            double R;
            cin >> R;
            cout <<"the voliam is : " <<ball(R)<<endl;
            break;

        case 2:
        {
            cout << "please enter the length:\n";
            double L;
            cin >> L;
            cout << "the voliam is : "<<cuab(L)<<endl;
            break;
        }

        case 3:
        {
            cout << "please enter the length:\n";
            double L;
            cin >> L;

            cout << "please enter the width:\n";
            double W;
            cin >> W;
            cout << "please enter height \n";
            double h;
            cin >> h;

            cout << "the voliam is : " <<parallel_rectangle(L, W, h)<<endl;
            break;
        }

        default:
            cout << "wrong choice! \n";
        }
    }
    else
    
    cout << "wrong\n";


system("pause");

}