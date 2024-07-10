
def calculate_pay():
    fed_tax = 0.02
    state_tax = 0.03

    hourly_rate = float(input("Please input your hourly rate: "))
    hours = float(input("Please input your hours: "))
    
    gross_income = hourly_rate * hours
    state_amt = gross_income * state_tax
    fed_amt = gross_income * fed_tax
    net_income = gross_income - state_amt - fed_amt
    
    print("Your net income is: ", net_income)

    return net_income

calculate_pay()
