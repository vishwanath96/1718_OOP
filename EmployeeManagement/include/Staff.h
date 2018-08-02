#ifndef STAFF_H
#define STAFF_H
#include<string>
using namespace std;
class Staff
{
    protected:
        string firstname;
        string lastname;

    public:
        Staff();
        ~Staff();
        Staff(string firstname);
        Staff(string firstname, string lastname);
        string getFirstName() {return this->firstname;}
        string getLastName() {return this->lastname;}
        string getFullName();

    private:
};

#endif // STAFF_H
