#include <stdio.h>
#include <stdlib.h>

int Breakfast()
{
    char BreakfastItems[51];

    printf("\n1)Idly-----Rs.20\n2)Dosa-----Rs.40\n3)Vada-----Rs.25\n--->Click on '=' to check out our LUNCH MENU or to EXIT\n");
    char I;
    int i;
    int done=0,item;

    while (!done)
        {
            scanf("%c", &I);
            switch(I)
                {
                    case 'I':
                    case 'i':
                    printf("\nYou have selected IDLY.\n");

                    break;

                    case 'D':
                    case 'd':
                    printf("\nYou have selected DOSA.\n");
                    break;

                    case 'V':
                    case 'v':
                    printf("\nYou have selected VADA.\n");
                    break;

                    case '=':
                    return(0);

                    case '\n':
                    break;




                    default:
                    printf("You have not selected any item from our breakfast menu.");
                }

        }

}
int Lunch()
{
    printf("\n4)Chicken Biryani-----Rs.850\n5)Veg Pulao-----------Rs.600\n6)Curd Rice-----------Rs.100\n--->Click on '=' to check out our SNACKS MENU or to EXIT\n");

    char I;
    int done=0;
    scanf("%d", &I);

    while (!done)
        {
            I=getchar();
            switch(I)
                {
                    case 'B':
                    case 'b':
                    printf("\nYou have selected CHICKEN BIRYANI.\n");
                    break;

                    case 'V':
                    case 'v':
                    printf("\nYou have selected VEG PULAO.\n");
                    break;

                    case 'C':
                    case 'c':
                    printf("\nYou have selected CURD RICE.\n");
                    break;

                    case '=':
                    return(0);

                    case '\n':
                    break;

                    default:
                    printf("You have not selected any item from our lunch menu.");
                }
        }

}
int Snacks()
{
    printf("\n7)Burger---------------Rs.50\n8)Fish Fry and Chips---Rs.80\n9)Pizza---------------Rs.150\n10)Soft Drinks---------Rs.50\n--->Click on '=' to check out our DINNER MENU or to EXIT\n");

    char I;
    int done=0;
    scanf("%d", &I);

    while (!done)
        {
            I=getchar();
            switch(I)
                {
                    case 'B':
                    case 'b':
                    printf("\nYou have selected BURGER.\n");
                    break;

                    case 'F':
                    case 'f':
                    printf("\nYou have selected FISH FRY AND CHIPS.\n");
                    break;

                    case 'P':
                    case 'p':
                    printf("\nYou have selected PIZZA.\n");
                    break;

                    case 'S':
                    case 's':
                    printf("\nYou have selected SOFT DRINKS.\n");
                    break;

                    case '=':
                    return(0);

                    case '\n':
                    break;

                    default:
                    printf("You have not selected any item from our snacks menu.");
                }
        }

}
int Dinner()
{
    printf("\n11)Butter Naan---------Rs.20\n12)Fish Curry---------Rs.400\n13)Butter Chicken-----Rs.300\n14)Veg Kofta----------Rs.250\n15)Panner Butter Masala-Rs.350\n16)Chicken Biryani----Rs.850\n17)Veg Pulao----------Rs.600\n--->Click on '=' to check out our DRINKS MENU or to EXIT\n");

    char I;
    int done=0;
    scanf("%d", &I);

    while (!done)
        {
            I=getchar();
            switch(I)
                {
                    case 'N':
                    case 'n':
                    printf("\nYou have selected BUTTER NAAN.\n");
                    break;

                    case 'F':
                    case 'f':
                    printf("\nYou have selected FISH CURRY.\n");
                    break;

                    case 'B':
                    case 'b':
                    printf("\nYou have selected BUTTER CHICKEN.\n");
                    break;

                    case 'K':
                    case 'k':
                    printf("\nYou have selected VEG KOFTA curry.\n");
                    break;

                    case 'P':
                    case 'p':
                    printf("\nYou have selected PANNER BUTTER MASALA.\n");
                    break;

                    case 'C':
                    case 'c':
                    printf("\nYou have selected CHICKEN BIRIYANI.\n");
                    break;

                    case 'V':
                    case 'v':
                    printf("\nYou have selected VEG PULAO.\n");
                    break;

                    case '=':
                    return(0);

                    case '\n':
                    break;

                    default:
                    printf("You have not selected any item from our dinner menu.");
                }
        }

}
int Drinks()
{
    printf("\n18)Tea-----------------Rs.20\n19)Coffee--------------Rs.20\n20)Soda(Salt or Sweet)-Rs.30\n21)Ice cream-----------Rs.50\n--->Click on '=' to EXIT\n");

    char I;
    int done=0;
    scanf("%d", &I);

    while (!done)
        {
            I=getchar();
            switch(I)
                {
                    case 'T':
                    case 't':
                    printf("\nYou have selected TEA.\n");
                    break;

                    case 'C':
                    case 'c':
                    printf("\nYou have selected COFFEE.\n");
                    break;

                    case 'S':
                    case 's':
                    printf("\nYou have selected SODA.\n");
                    break;

                    case 'I':
                    case 'i':
                    printf("\nYou have selected ICE CREAM.\n");
                    break;

                    case 'P':
                    case 'p':
                    printf("\nYou have selected PANNER BUTTER MASALA.\n");
                    break;

                    case '=':
                    printf("\n*****************************************************\n");
                    printf("\n**********Thank You for placing your order.**********\n");
                    printf("\n*****************************************************\n");
                    return(0);

                    case '\n':
                    break;

                    default:
                    printf("You have not selected any item from our drinks menu.");
                }
        }

}



int main()

{
    /*int I;*/
    printf("*************************************************************************************************\n");
    printf("***************************---->    WELCOME TO OUR RESTAURANT.    <----**************************\n");
    printf("*************************************************************************************************\n");
    Breakfast();
    Lunch ();
    Snacks();
    Dinner();
    Drinks();

    return 0 ;
}
