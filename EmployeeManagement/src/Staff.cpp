#include<iostream>
#include "Staff.h"
#include<string>

Staff::Staff()
{
    cout<<"Staff object created (empty)"<< endl;
}

Staff::~Staff()
{
    cout<< "Staff object destroyed" <<endl;
}

Staff::Staff(string firstname)
{
    cout<<"staff object created (w/ firstname)"<<endl;
    this->firstname=firstname;
}

Staff::Staff(string firstname, string lastname)
{
    cout<<"staff object created (w/ firstname + lastname)"<<endl;
    this->firstname=firstname;
    this->lastname=lastname;
    cout<< "FirstName: "<<firstname<<endl<<"LastName: "<<lastname<<endl;
}

string Staff::getFullName()
{
    return this->firstname + " " + this->lastname;
}

