#If the bill was $150.00, split between 5 people, with 12% tip. 
#Each person should pay (150.00 / 5) * 1.12 = 33.6
#Format the result to 2 decimal places = 33.60
bill_amount = float(input("Enter the amount of total bill:\n"))
tip_amount = float(input("select tip percent (eg: 10 ):\n"))
count_person = int(input("Enter Number of person:\n"))
tip_amount = (bill_amount *(tip_amount/100))
bill_amount = bill_amount + tip_amount
pay_amount = bill_amount / count_person 
print(f"Each person has to pay : {round(pay_amount,2)}$")
