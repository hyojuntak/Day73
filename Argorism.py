def numnum():
    S = input()
    result = 1
    for i in range(len(S)):
        if S[i]=='0':
            if i==0: pass
            if i>0: result += int(S[i])
        elif S[i]=='1':
            if i==0: pass
            if i>0: result +=int(S[i])
       
        else: result *= int(S[i])  
        
   
 
    print(result)
    
for i in range(2):
    numnum()
