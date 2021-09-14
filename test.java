package TEC3GROUP3;
import java.util.Scanner;

/**
 *
 * TEC3
 */
public class test {
    
    public static void main(String[] args) {
        // Aldrin Merrell Buenaventura - 19002178000
        //ICT-TEC 3
        //PROG 3111 Programming Java NCIII Part 1
       
        Scanner xp=new Scanner (System.in);
        
        String loop;//loop
           
        int choice;//choices
        
        int PROG,ANI,VIS,MATH,ENG,PEDH;//program1
        double GWA  ;//program1
        double x;//program1
        double roundoff;//program1
        String mploop1;
                
       
        int sales1;//program2
        int commissionedvalue;//program2
        int commision=10;//program2
        int salesinput;//program2
        int sumsales,differencesales,productsales,quotientsales;//program2
        int ovrsum,ovrdiff,ovrprod,ovrquo;//program2
        int commsum,commdiff,commprod,commquo;//program2
        String mploop2;
        
       
        char item1,item2,item3;//program3
        int  price1=0,price2=0,price3=0;//program3
        int totalprog3;//program3;
        String mploop3;
        
       
        char lunch;//program4
        String mploop4;
       
        int age;//program5
        String mploop5;
       
        int input1,input2,operator;//program6
        String mploop6;
       
        int day;//program7
        String mploop7;
       
        int value1,value2,value3,value4,sum,product,difference,quotient;//program8
        String mploop8;
       
        int interger;//program9
        String mploop9;
       
        char ques1,ques2,ques3,ques4,ques5,ques6,ques7,ques8;//program10
        char ques9,ques10,ques11,ques12;//program10
        int score1=0,score2=0,score3=0,score4=0,score5=0,score6=0,score7=0,score8=0,score9=0;//program10
        int score10=0,score11=0,score12=0;//program10
        int WAscore1=0,WAscore2=0,WAscore3=0,WAscore4=0,WAscore5=0,WAscore6=0,WAscore7=0,WAscore8=0,WAscore9=0;//program10
        int WAscore10=0,WAscore11=0,WAscore12=0;//program10
        int totalscore;//program10
        String mploop10;
       
        
        do
        {
            System.out.println("=====PROJECT IN PROGRAMMING=====");
            System.out.println("");
            System.out.println("-------CHOOSE PROGRAM-------");
            System.out.println("1. GWA");
            System.out.println("2. Values Of Sales");
            System.out.println("3. Total price of 3 Items");
            System.out.println("4. Yes Or No");
            System.out.println("5. Age Group");
            System.out.println("6. Math Operators");
            System.out.println("7. Day");
            System.out.println("8. Highest & Lowest Value");
            System.out.println("9. Integer");
            System.out.println("10. Reading Comprehension");
            System.out.print("Input Choice:");
            choice=xp.nextInt();
       
                switch (choice)
                {
                    case 1:
                        //FINISHED
                        //GWA
                        do 
                        {
                            System.out.println("");
                            System.out.println("Machine Problem 1");
                            System.out.println("");
                            System.out.println("Program will compute your GWA");
                            System.out.println("");
                            System.out.println("PROG = 3 UNITS");
                            System.out.println("ANI = 3 UNITS");
                            System.out.println("VIS = 3 UNITS");
                            System.out.println("MATH = 3 UNITS");
                            System.out.println("ENG = 3 UNITS");
                            System.out.println("PEDH = 2 UNITS");
                            System.out.println("");

                            System.out.println("INPUT GRADES:");

                            System.out.print("PROG =");
                            PROG=xp.nextInt();
                            System.out.print("ANI =");
                            ANI=xp.nextInt();
                            System.out.print("VIS =");
                            VIS=xp.nextInt();
                            System.out.print("MATH =");
                            MATH=xp.nextInt();
                            System.out.print("ENG =");
                            ENG=xp.nextInt();
                            System.out.print("PHED =");
                            PEDH=xp.nextInt();

                            System.out.println("Generated Points:"+(GWA=(PROG*3)+(ANI*3)+(VIS*3)+(MATH*3)+(ENG*3)+(PEDH*2)));
                            System.out.println("GWA is:"+(x=(GWA/17)));
                            roundoff=Math.round(x);


                            if (x<=74)
                            {
                                System.out.println("Below Average:"+(int)roundoff);
                            }
                            else if (x>=101)
                            {
                                System.out.println("Above Average:"+(int)roundoff);
                            }
                            else
                            {
                                System.out.println("Correctly Computed GWA");
                            }
                                System.out.println("");
                                System.out.println("Restart Program?");
                                System.out.println("Type Yes or No");
                                System.out.print("Answer:");
                                mploop1=xp.next();
                        }
                         while (mploop1.equalsIgnoreCase("Yes"));
                        
                            break;
                             
                    case 2:
                        //Finished
                        //sales
                        do 
                        {
                            System.out.println("");
                            System.out.println("Machine Problem 2");
                            System.out.println("");
                            System.out.println("    Program will accept value of sales ");
                            System.out.println("If the Value of sales is greater than 50,000");
                            System.out.println("    Agent will get 10% as Commision");
                            System.out.println("");
                            System.out.print("Enter Value Of Sales:");
                            sales1=xp.nextInt();

                            commissionedvalue = (sales1*10)/100;

                            if (sales1>50000)
                            {
                                    System.out.println("");
                                    System.out.println("Value of Sales:"+sales1);
                                    System.out.println("Commissioned Value:"+(double)commissionedvalue);
                                    System.out.println("Commission:"+commision);         
                            }
                            else 
                            {
                               System.out.println("Value of Sales:"+sales1);
                               System.out.println("No Commision");
                            }
                            System.out.println("");
                            System.out.println("Additional:");
                            System.out.println("1. If you want to add more sales ");
                            System.out.println("2. If you want to subtract your sales");
                            System.out.println("3. If you want to multiply your sales");
                            System.out.println("4. If you want to divide your sales");
                            System.out.print("Input:");
                            salesinput=xp.nextInt();

                            switch (salesinput)
                            {
                                case 1:
                                    System.out.println("");
                                    System.out.println("Sales:"+sales1);
                                    System.out.print("Addition to your sales:");
                                    sumsales=xp.nextInt();

                                    ovrsum=(sales1+sumsales);
                                    commsum = (ovrsum*10)/100;
                                    
                                    if (ovrsum>50000)
                                    {
                                        System.out.println("Overall Total:"+ovrsum);
                                        System.out.println("Commissioned Value:"+(double)commsum);
                                    }
                                    else 
                                    {
                                        System.out.println("Overall Total:"+ovrsum);
                                    }
                                    break;
                                case 2:
                                    System.out.println("");
                                    System.out.println("Sales:"+sales1);
                                    System.out.print("Subtact to your sales:");
                                    differencesales=xp.nextInt();
                                    
                                    ovrdiff=(sales1-differencesales);
                                    commdiff = (ovrdiff*10)/100;
                                    
                                    if (ovrdiff>50000)
                                    {
                                    System.out.println("Overall Total:"+ovrdiff);
                                    System.out.println("Commissioned Value:"+(double)commdiff);
                                    }
                                    else 
                                    {
                                        System.out.println("Overall Total:"+ovrdiff);
                                        System.out.println("No Commission");
                                    }
                                    break;
                                case 3:
                                    System.out.println("");
                                    System.out.println("Sales:"+sales1);
                                    System.out.print("Multiply to your sales:");
                                    productsales=xp.nextInt();                    
                                    
                                    ovrprod=(sales1*productsales);
                                    commprod = (ovrprod*productsales)/100;
                                    if (ovrprod>50000)
                                    {
                                        System.out.println("Overall Total:"+ovrprod);
                                        System.out.println("Commissioned Value:"+(double)commprod);
                                    }
                                    else
                                    {
                                        System.out.println("Overall Total:"+ovrprod);
                                        System.out.println("No Commission");
                                    }
                                    break;
                                case 4:
                                    System.out.println("");
                                    System.out.println("Sales:"+sales1);
                                    System.out.print("Divide to your sales:");
                                    quotientsales=xp.nextInt();
                                   
                                    ovrquo=(sales1/quotientsales);
                                    commquo = (ovrquo*10)/100;
                                    if (ovrquo>50000)
                                    {
                                        System.out.println("Overall Total:"+ovrquo);
                                        System.out.println("Commissioned Value:"+(double)commquo);
                                    }
                                    else 
                                    {
                                        System.out.println("Overall Total:"+ovrquo);
                                        System.out.println("No Commission");
                                    }
                                    break;
                                default:
                                    System.out.println("");
                                    System.out.println("Invalid Input");
                                    break;
                            }
                                System.out.println("");
                                System.out.println("Restart Program?");
                                System.out.println("Type Yes or No");
                                System.out.print("Answer:");
                                mploop2=xp.next();
                        }
                         while (mploop2.equalsIgnoreCase("Yes"));

                            break;
                        
                    case 3:
                        //FINISHED
                        //Total price of 3 items
                        do 
                        {
                            System.out.println("");
                            System.out.println("Machine Problem 3");
                            System.out.println("");
                            System.out.println(" Program will compute 3 items");
                            System.out.println("If Total is Greater than 5,000");
                            System.out.println(" Customer Gets A 14% Discount");
                            System.out.println("");
                            System.out.println("What do you want to buy?:");
                            System.out.println("Choose One:");
                            System.out.println("A. Table       2,500php");
                            System.out.println("B. Chair       1,500php");
                            System.out.println("C. Toy Car     1,000php");
                            System.out.print("Input Choice:");
                            item1=xp.next().charAt(0);

                            switch (item1)
                            {
                                case 'A':
                                case 'a':
                                    System.out.println("Purchased Table 2,500");
                                    price1=2500;
                                    break;
                                case 'B':
                                case 'b':
                                    System.out.println("Purchased Chair 1,500");
                                    price1=1500;
                                    break;
                                case 'C':
                                case 'c':
                                    System.out.println("Purchased Toy Car 1000php");
                                    price1=1000;
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                             }

                            System.out.println("");
                            System.out.println("Selection #2");
                            System.out.println("Choose One:");
                            System.out.println("A. Keyboard  2,000");
                            System.out.println("B. Monitor   3,000");
                            System.out.println("C. Mouse     1,500");
                            System.out.print("Input Choice:");
                            item2=xp.next().charAt(0);

                            switch (item2)
                            {
                                case 'A':
                                case 'a':
                                    System.out.println("Purchased Keyboard 2,000php");
                                    price2=2000;
                                    break;
                                case 'B':
                                case 'b':
                                    System.out.println("Purchased Monitor 3,000");
                                    price2=3000;
                                    break;
                                case 'C':
                                case 'c':
                                    System.out.println("Purchased Mouse 1,500php");
                                    price2=1500;
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                                    break;
                            }

                            System.out.println("");
                            System.out.println("Selection #3");
                            System.out.println("Choose One:");
                            System.out.println("A. Lamp      500php");
                            System.out.println("B. Bed       1,000php");
                            System.out.println("C. Curtains  500php");
                            System.out.print("Input Choice:");
                            item3=xp.next().charAt(0);

                            switch (item3) 
                            {
                              case 'A':
                              case 'a':
                                System.out.println("Purchased Lamp  500php");
                                price3=500;
                                break;
                              case 'B':
                              case 'b':
                                System.out.println("Purchased Bed 1,000");
                                price3=1000;
                                break;
                              case 'C':
                              case 'c':
                                System.out.println("Purchased Curtains 500php");
                                price3=500;
                                break;
                              default:
                                System.out.println("Invalid Choice:");
                                break;
                            }

                            totalprog3=(price1+price2+price3);

                            if (totalprog3>=5000)
                            {
                                System.out.println("");
                                System.out.println("Total Price:"+totalprog3);
                                System.out.println("Discounted:"+(totalprog3*14)/100);
                                System.out.println("Total Discounted Price:"+(totalprog3-(totalprog3*14)/100));
                            }
                            else if (totalprog3<=5000)
                            {
                                System.out.println("");
                                System.out.println("No Discount");
                                System.out.println("Total Price:"+totalprog3);
                            }
                                System.out.println("");
                                System.out.println("Restart Program?");
                                System.out.println("Type Yes or No");
                                System.out.print("Answer:");
                                mploop3=xp.next();
                        }
                        while (mploop3.equalsIgnoreCase("Yes"));
                          break;

                    case 4:
                        //done
                        //Yes or No
                        do 
                        {
                            System.out.println("");
                            System.out.println("Machine Problem 4");
                            System.out.println("");
                            System.out.println("Program will ask if User");
                            System.out.println("has Eaten his/her Lunch");
                            System.out.println("");
                            System.out.println("Did You Eat Lunch?");
                            System.out.println("Type Y For Yes");
                            System.out.println("Type N For No");
                            System.out.print("Input:");
                            lunch=xp.next().charAt(0);

                            if (lunch=='Y'||lunch=='y')
                            {
                                System.out.println("Have A Nice Day");
                            }
                            else
                            {
                                System.out.println("Go and Eat your Lunch");
                            }
                                System.out.println("");
                                System.out.println("Restart Program?");
                                System.out.println("Type Yes or No");
                                System.out.print("Answer:");
                                mploop4=xp.next();
                        }
                         while (mploop4.equalsIgnoreCase("Yes"));
                        
                            break;
               
                    case 5:
                        //age group
                        //done
                        do 
                        {
                            System.out.println("");
                            System.out.println("Machine Problem 5");
                            System.out.println("");
                            System.out.println("Program will Identify Which Age Group");
                            System.out.println("       Is the Inputed Age");
                            System.out.println("");
                            System.out.println("0-3 Infant");
                            System.out.println("4-5 Toddler");
                            System.out.println("6-12 Gradeschool");
                            System.out.println("13-16 Highschool");
                            System.out.println("17-59 Adult");
                            System.out.println("60 and Above Senior Citizen");
                            System.out.println("");
                            System.out.print("Input Age:");
                            age=xp.nextInt();

                            if (age<=0||age<=3)
                            {
                                System.out.println("Infant");
                            }
                            else if (age==4||age==5)
                            {
                                System.out.println("Toddler");
                            }
                            else if (age<=6||age<=12)
                            {
                                System.out.println("Gradeschool");
                            }
                            else if (age<=13||age<=16)
                            {
                                System.out.println("Highschool");
                            }
                            else if (age<=17||age<=59)
                            {
                                System.out.println("Adult");
                            }
                            else
                            {
                                System.out.println("Senior Citizen");
                            }
                            System.out.println("");
                                System.out.println("Restart Program?");
                                System.out.println("Type Yes or No");
                                System.out.print("Answer:");
                                mploop5=xp.next();
                        }
                         while (mploop5.equalsIgnoreCase("Yes"));
                        
                          break;
                 
                    case 6:
                        //math operator
                        //done
                        do 
                        {
                            System.out.println("");
                            System.out.println("Machine Problem 6");
                            System.out.println("");
                            System.out.println("   Program will let you input two values");
                            System.out.println("Then you may select which Operator you want");
                            System.out.println("");
                            System.out.print("First Input:");
                            input1=xp.nextInt();
                            System.out.print("Second Input:");
                            input2=xp.nextInt();
                            System.out.println("");
                            System.out.println("Choose Operator:");
                            System.out.println("1- Addition");
                            System.out.println("2- Subtraction");
                            System.out.println("3- Multiplication");
                            System.out.println("4- Division");
                            System.out.print("Choice:");
                            operator=xp.nextInt();

                            switch (operator)
                            {
                                case 1:
                                    System.out.println("");
                                    System.out.println(input1+"+"+input2);
                                    System.out.println("The sum is:"+(input1+input2));
                                    break;
                                case 2:
                                    System.out.println("");
                                    System.out.println(input1+"-"+input2);
                                    System.out.println("The Difference is:"+(input1-input2));
                                    break;
                                case 3:
                                    System.out.println("");
                                    System.out.println(input1+"*"+input2);
                                    System.out.println("The Product is:"+(input1*input2));
                                    break;
                                case 4:
                                    System.out.println("");
                                    System.out.println(input1+"/"+input2);
                                    System.out.println("The Quotient is:"+(double)(input1/input2));
                                    break;
                                default:
                                    System.out.println("");
                                    System.out.println("Logical Error");
                                    break;
                            }
                                System.out.println("");
                                System.out.println("Restart Program?");
                                System.out.println("Type Yes or No");
                                System.out.print("Answer:");
                                mploop6=xp.next();
                        }
                         while (mploop6.equalsIgnoreCase("Yes"));
                        break;
               
                    case 7:
                        //day
                        //done
                       do 
                       {
                            System.out.println("");
                            System.out.println("Machine Problem 7");
                            System.out.println("");
                            System.out.println("Program Will Identify the Day with the Number Inputed");
                            System.out.println("");
                            System.out.println("1- Monday");
                            System.out.println("2- Tuesday");
                            System.out.println("3- Wednesday");
                            System.out.println("4- Thursday");
                            System.out.println("5- Friday");
                            System.out.println("6- Saturday");
                            System.out.println("7- Sunday");
                            System.out.print("Input Number:");
                            day=xp.nextInt();

                            switch (day)
                            {
                                case 1:
                                    System.out.println("Monday");
                                    break;
                                case 2:
                                    System.out.println("Tuesday");
                                    break;
                                case 3:
                                    System.out.println("Wednesday");
                                    break;
                                case 4:
                                    System.out.println("Thursday");
                                    break;
                                case 5:
                                    System.out.println("Friday");
                                    break;
                                case 6:
                                    System.out.println("Saturday");
                                    break;
                                case 7:
                                    System.out.println("Sunday");
                                    break;  
                                default:
                                    System.out.println("Invalid Input");
                                    break;
                            }
                                System.out.println("");
                                System.out.println("Restart Program?");
                                System.out.println("Type Yes or No");
                                System.out.print("Answer:");
                                mploop7=xp.next();
                       }
                        while (mploop7.equalsIgnoreCase("Yes"));
                            
                        break;
               
                    case 8:
                        //done
                        //highest and lowest value
                        do 
                        {
                            System.out.println("");
                            System.out.println("Machine Problem 8");
                            System.out.println("");
                            System.out.println("Program will determine the highest and lowest value");
                            System.out.println("");
                            System.out.println("Multiplication");
                            System.out.print("Enter First Value:");
                            value1=xp.nextInt();
                            System.out.print("Enter Second Value:");
                            value2=xp.nextInt();
                            System.out.println("Product Is:"+value1+"*"+value2+"="+(product=value1*value2));
                            System.out.println("");
                            System.out.println("Subdivision");
                            System.out.print("Enter Third Value:");
                            value3=xp.nextInt();
                            System.out.print("Entere Fourth Value:");
                            value4=xp.nextInt();
                            System.out.println("Difference is:"+value3+"-"+value4+"="+(difference=value3-value4));
                            System.out.println("");
                            System.out.println("Sum Of Product & Difference is:"+product+"+"+difference+"="+(sum=product+difference));
                            System.out.println("");
                            System.out.println("Half Of The Sum is:"+sum+"/"+"2"+"="+(quotient=sum/2));
                            System.out.println("");
                            
                            System.out.print("This is the Highest Value:");
                            
                            if (sum>difference||sum>product||sum>quotient)
                            {
                                System.out.println(sum);
                            }
                            else if (difference>sum||difference>product||difference>quotient)
                            {
                                System.out.println(difference);
                            }
                            else if (product>sum||product>difference||product>quotient)
                            {
                                System.out.println(product);
                            }
                            else if (product>quotient||product>difference||product>sum)
                            {
                                System.out.println(quotient);
                            }
                            System.out.print("This is the Lowest Value:");
                            
                            if (sum<difference||sum<product||sum<quotient)
                            {
                                System.out.println(sum);
                            }
                            else if (difference<sum||difference<product||difference<quotient)
                            {
                                System.out.println(difference);
                            }
                            else if (product<sum||product<difference||product<quotient)
                            {
                                System.out.println(product);
                            }
                            else if (quotient<sum||quotient<difference||quotient<product)
                            {
                                System.out.println(quotient);
                            }
                            
                                System.out.println("");
                                System.out.println("Restart Program?");
                                System.out.println("Type Yes or No");
                                System.out.print("Answer:");
                                mploop8=xp.next();
                        }
                         while (mploop8.equalsIgnoreCase("Yes"));
                        
                        break;

                    case 9:
                        //integers
                        //done
                        do 
                        {
                            System.out.println("");
                            System.out.println("Machine Problem 9");
                            System.out.println("");
                            System.out.println("Program will determine if the Inputed Number is: ");
                            System.out.println("Positive, Negative, Or Zero");
                            System.out.println("");
                            System.out.print("Input Number:");
                            interger=xp.nextInt();

                            if (interger==0)
                            {
                                System.out.println("Inputed Number is Zero");
                            }
                            else if (interger>0)
                            {
                                System.out.println("Inputed Number is Positive");
                            }
                            else if (interger<0)
                            {
                                System.out.println("Inputed Number is Negative");
                            }
                            else
                            {
                                System.out.println("Error");
                            }
                                System.out.println("");
                                System.out.println("Restart Program?");
                                System.out.println("Type Yes or No");
                                System.out.print("Answer:");
                                mploop9=xp.next();
                        }
                         while (mploop9.equalsIgnoreCase("Yes"));
                        
                        break;


                    case 10:
                        //program10
                        //Finished                     
                        do 
                        {
                            System.out.println("");
                            System.out.println("Machine Problem 10");
                            System.out.println("");
                            System.out.println("Read and Answer the Story Below");
                            System.out.println("");
                            System.out.println("Story: MY FRIEND PETER:\n"
                                        + "My friend's name is Peter.\nPeter is from " +
                            "Amsterdam, in Holland.\nHe is Dutch. He is married and " +
                            "has two children.\nHis wife, Jane, is American.\nShe is "+
                            "from Boston, in the United States.\nHer family is still in " +
                            "Boston, but she now works and lives with Peter in Milan.\n" +
                            "They speak English, Dutch, German, and Italian!\n" +
                                        "Their children are pupils at a local primary " +
                            "school.\nThe children go to school with other children " +
                            "from all over the world.\nFlora, their daughter, has friends " +
                            "from France, Switzerland, Austria, and Sweden.\nHans, " +
                            "their son, goes to school with students from South Africa,\n" +
                            "Portugal, Spain, and Canada.\nOf course, there are many " +
                            "children from Italy.\nImagine, French, Swiss, Austrian, " +
                            "Swedish, South African, American, Italian, Portuguese,\n" +
                            "Spanish, and Canadian children all learning together in " +
                            "Italy");
                            System.out.println("");

                            System.out.println("Multiple-Choice Comprehension Questions");
                            System.out.println("");
                            System.out.println("1. Where is Peter From?");
                            System.out.println("A.  Germany");
                            System.out.println("B.  Holland");
                            System.out.println("C.  Spain");
                            System.out.println("D.  Canada");
                            System.out.print("Answer:");
                            ques1=xp.next().charAt(0);
                            switch (ques1)
                            {
                                case'B': case'b':
                                score1=1;
                                System.out.println("Correct");
                                break;
                                case'A': case'a':
                                WAscore1-=1;
                                System.out.println("Wrong");
                                break;
                                case 'C': case'c':
                                WAscore1-=1;
                                System.out.println("Wrong");
                                break;
                                case 'D': case 'd':
                                WAscore1-=1;
                                System.out.println("Wrong");
                                break;
                                default:
                                WAscore1-=1;
                                System.out.println("Wrong");
                                break;
                            }
                            
                            System.out.println("");
                            System.out.println("2. Where is his wife from?");
                            System.out.println("A.  New York");
                            System.out.println("B.  Switzerland");
                            System.out.println("C.  Boston");
                            System.out.println("D.  Italy");
                            System.out.print("Answer:");
                            ques2=xp.next().charAt(0);
                            switch (ques2)
                            {
                                case 'C': case 'c':
                                    score2=1;
                                    System.out.println("Correct");
                                    break;
                                case 'D': case 'd':
                                    WAscore2-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'A': case 'a':
                                    WAscore2-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'B': case'b':
                                    WAscore2-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore2-=1;
                                    System.out.println("Wrong");
                                    break;
                            }
                            
                            System.out.println("");
                            System.out.println("3. Where are they now?");
                            System.out.println("A.  Madrid");
                            System.out.println("B.  Boston");
                            System.out.println("C.  Milan");
                            System.out.println("D.  Sweden");
                            System.out.print("Answer:");
                            ques3=xp.next().charAt(0);
                            switch (ques3)
                            {
                                case 'c': case 'C':
                                    score3=1;
                                    System.out.println("Correct");
                                    break;
                                case 'A': case 'a':
                                    WAscore3-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'B': case 'b':
                                    WAscore3-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'D': case 'd':
                                    WAscore3-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore3-=1;
                                    System.out.println("Wrong");
                                    break;
                            }
                            
                            System.out.println("");
                            System.out.println("4. Where is her family?");
                            System.out.println("A.  United States");
                            System.out.println("B.  England");
                            System.out.println("C.  Holland ");
                            System.out.println("D.  Italy");
                            System.out.print("Answer:");
                            ques4=xp.next().charAt(0);
                            switch (ques4)
                            {
                                case 'A': case 'a':
                                    score4=1;
                                    System.out.println("Correct");
                                    break;
                                case 'B': case 'b':
                                    WAscore4-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'C': case 'c':
                                    WAscore4-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'D': case 'd':
                                    WAscore4-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore4-=1;
                                    System.out.println("Wrong");
                                    break;
                            }
                            
                            System.out.println("");
                            System.out.println("5. How many languages does the family speak?");
                            System.out.println("A.  3");
                            System.out.println("B.  4");
                            System.out.println("C.  5");
                            System.out.println("D.  6");
                            System.out.print("Answer:");
                            ques5=xp.next().charAt(0);
                            switch (ques5)
                            {
                                case 'B': case 'b':
                                    score5=1;
                                    System.out.println("Correct");
                                    break;
                                case 'A': case 'a':
                                    WAscore5-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'C': case 'c':
                                    WAscore5-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'D': case 'd':
                                    WAscore5-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore5-=1;
                                    System.out.println("Wrong");
                                    break;
                            }
                            
                            System.out.println("");
                            System.out.println("6. What are the children's names?");
                            System.out.println("A.  Greta and Peter");
                            System.out.println("B.  Anna  and Frank");
                            System.out.println("C.  Susan and John");
                            System.out.println("D.  Flora and Hans");
                            System.out.print("Answer:");
                            ques6=xp.next().charAt(0);
                            switch (ques6)
                            {
                                case 'D': case 'd':
                                    score6=1;
                                    System.out.println("Correct");
                                    break;
                                case 'A': case 'a':
                                    WAscore6-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'B': case 'b':
                                    WAscore6-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'C': case 'c':
                                    WAscore6-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore6-=1;
                                    System.out.println("Wrong");
                                    break;
                            }
                            
                            System.out.println("");
                            System.out.println("7. The school is:");
                            System.out.println("A.  International");
                            System.out.println("B.  Big");
                            System.out.println("C.  Small");
                            System.out.println("D.  Difficult");
                            System.out.print("Answer:");
                            ques7=xp.next().charAt(0);
                            switch (ques7)
                            {
                                case 'A': case 'a':
                                    score7=1;
                                    System.out.println("Correct");
                                    break;
                                case 'B': case 'b':
                                    WAscore7-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'C': case 'c':
                                    WAscore7-=1;
                                    System.out.println("Wrong");
                                    break;
                                case 'D': case 'd':
                                    WAscore7-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore7-=1;
                                    System.out.println("Wrong");
                                    break;
                            }
                            
                            System.out.println("");
                            System.out.println("True or False Questions");
                            System.out.println("Type T if True");
                            System.out.println("Type F if False");
                            System.out.println("");
                            System.out.println("1. Jane is Canadian");
                            System.out.print("Answer:");
                            ques8=xp.next().charAt(0);
                            switch (ques8)
                            {
                                case 'F': case 'f':
                                    score8=1;
                                    System.out.println("Correct");
                                    break;
                                case 'T': case 't':
                                    WAscore8-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore8-=1;
                                    System.out.println("Wrong");
                                    break;
                            }
                            
                            System.out.println("2. Peter is Dutch");
                            System.out.print("Answer:");
                            ques9=xp.next().charAt(0);
                            switch (ques9)
                            {
                                case 'T': case 't':
                                    score9=1;
                                    System.out.println("Correct");
                                    break;
                                case 'F': case 'f':
                                    WAscore9-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore9-=1;
                                    System.out.println("Wrong");
                                    break;
                            }                           

                            System.out.println("3. There are many children from diffrent countries at the school.");
                            System.out.print("Answer:");
                            ques10=xp.next().charAt(0);
                            switch (ques10)
                            {
                                case 'T': case 't':
                                    score10=1;
                                    System.out.println("Correct");
                                    break;
                                case 'F': case 'f':
                                    WAscore10-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore10-=1;
                                    System.out.println("Wrong");
                                    break;
                                    
                            }

                            System.out.println("4. There are children from Australia at the school.");
                            System.out.print("Answer:");
                            ques11=xp.next().charAt(0);
                           switch (ques11)
                            {
                                case 'F': case 'f':
                                    score11=1;
                                    System.out.println("Correct");
                                    break;
                                case 'T': case 't':
                                    WAscore11-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore11-=1;
                                    System.out.println("Wrong");
                                    break;
                            }
                           
                            System.out.println("5. There daughter has friends from Portugal");
                            System.out.print("Answer:");
                            ques12=xp.next().charAt(0);
                            switch (ques12)
                            {
                                case 'F': case 'f':
                                    score12=1;
                                    System.out.println("Correct");
                                    break;
                                case 'T': case 't':
                                    WAscore12-=1;
                                    System.out.println("Wrong");
                                    break;
                                default:
                                    WAscore12-=1;
                                    System.out.println("Wrong");
                                    break;
                            }
                            totalscore=(score1+score2+score3+score4+score5+score6+score7+score8+score9+score10+score11+score12);
                            System.out.println("");
                            System.out.println("Total Question = 12");

                            if (totalscore>=8)
                            {
                                System.out.println("Total Correct Answers:"+totalscore);
                                System.out.println("Passed!");
                            }
                            else if (totalscore<=7)
                            {
                                System.out.println("Total Correct Answers:"+totalscore);
                                System.out.println("Failed!");
                            }
                            
                                System.out.println("");
                                System.out.println("Restart Program?");
                                System.out.println("Type Yes or No");
                                System.out.print("Answer:");
                                mploop10=xp.next();
                        }
                         while (mploop10.equalsIgnoreCase("Yes"));
                        
                        break;      
                }
                     System.out.println("");
                     System.out.println("");
                     System.out.println("Do you wish to select another Program?");
                     System.out.println("Type Yes or No");
                     System.out.print("Input:");
                     loop=xp.next();
             
        }
        while (loop.equalsIgnoreCase("Yes"));
        System.out.println("Program Finished");
        System.out.println("");
}
}
