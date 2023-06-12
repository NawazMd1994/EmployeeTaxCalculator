# employeeTaxCal
# 1. API endpoint to store employee details(Validate the data and throw the errors on invalid data)

 

# Fields(All fields are mandatory):

Employee ID

FirstName

LastName

Email

PhoneNumber(May have multiple phone numbers)

DOJ

Salary(per month)

 

# 2. API endpoint to return employees' tax deduction for the current financial year(April to March). API should return employee code, first name, last name, yearly salary, tax amount, cess amount.

 

## Tax slabs on yearly salary:

No Tax for <=250000

5% Tax for >250000 and <=500000

10% Tax for >500000 and <=1000000

20% Tax for >1000000

  (Ex: if salary is 750000, for first 250000 no tax, for 250001 to 500000 tax is 12500, for 500001 to 750000 tax is 25000 and total tax is 37500)

 

 

# Rules:

Consider the DOJ while calculating total salary(If the employee joined on May 16th, we should not include April month salary and May month's 15 days salary in total salary)

Collect additional 2% cess for the amount more than 2500000 (ex: yearly salary is 2800000 then collect 2% cess for 300000)

  

# Others:

Total Salary: Salary * Number of months

Loss of pay per day: Salary / 30

