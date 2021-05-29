import re
def historyDocuments(input1):











    uDates=set()
    x=input1.replace(".","-")
    arr = x.split("-")
    for n in arr:
        if(len(n)==4):
            uDates.add(n)
    return len(uDates)















str = "UN was established on 24-10-1945.\
        India got freedom on 15-08-1947."

print(historyDocuments(str))