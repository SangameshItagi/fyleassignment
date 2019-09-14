#!/bin/sh

echo "\n\nLogging in : \n"
JWTToken=$(curl -H 'Accept: application/json' -X POST 'https://fyleassignment1.herokuapp.com/login?emailId=abc@gmail.com&password=pass1234')
echo "JWT TOKEN : \n"
echo "$JWTToken"


echo "\n\n\n\nGetting Bank Detail by IFSC CODE : \n"
curl -H 'Accept: application/json' -H "Authorization: Bearer ${JWTToken}" -X GET 'https://fyleassignment1.herokuapp.com/bankDetails/ICIC0000001' | json_pp


echo "\n\n\n\n\nGetting Bank Details by giving Bank Name and City : \n"
echo " Page : 1\n limit : 10 \n offset : 0\n"
curl -H 'Accept: application/json' -H "Authorization: Bearer ${JWTToken}" -X GET 'https://fyleassignment1.herokuapp.com/bankDetails/getBankDetailsFromCity/ICICI%20BANK%20LIMITED?city=BANGALORE&limit=10&offset=0' | json_pp

echo "\n\n\n\n\nGetting Bank Details by giving Bank Name and City : \n"
echo " Page : 2\n limit : 10 \n offset : 10\n"
curl -H 'Accept: application/json' -H "Authorization: Bearer ${JWTToken}" -X GET 'https://fyleassignment1.herokuapp.com/bankDetails/getBankDetailsFromCity/ICICI%20BANK%20LIMITED?city=BANGALORE&limit=10&offset=10' | json_pp

echo "\n\n\n\n\nGetting Bank Details by giving Bank Name and City : \n"
echo " Page : 3\n limit : 10 \n offset : 20\n"
curl -H 'Accept: application/json' -H "Authorization: Bearer ${JWTToken}" -X GET 'https://fyleassignment1.herokuapp.com/bankDetails/getBankDetailsFromCity/ICICI%20BANK%20LIMITED?city=BANGALORE&limit=10&offset=20' | json_pp

echo "\n"
