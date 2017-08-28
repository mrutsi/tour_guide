package com.example.android.map;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterViewFlipper;

public class Hotels extends AppCompatActivity
{
    CustomAdapter customerAdapter;
    int left,right;

    private AdapterViewFlipper flipp;
    int[] images ={R.drawable.the_farmyard_restuarent, R.drawable.basilsfine_dining,R.drawable.cafe_pavillion,R.drawable.ambiance,R.drawable.cappello,R.drawable.mawetse_fine_dining};

    String retuarent1 = "Enjoy the splendor of the tranquil garden, which offers the perfect backdrop for quality time with family and friends, and let kids be kids in a secure" +
            " outdoor environment. Visit the old world charm of bygone days and experience true country living hospitality from owners Paul and Angela Altenroxel. The essence" +
            " of the business is captured in the spirit of quality time with the family - it is a love for the outdoors and nature with a hint of modern comfort and healthy eating" +
            "The Farmyard proudly produces a fresh variety of home baking and Alfresco foods on the premises - from a variety of gourmet cheeses and breads to delectable pastries. The Patio " +
            "overlooking the Farmyard's beautiful garden and children's playground is ideal for leisurely breakfasts and lunches and our bakery provides fresh scones, muffins and" +
            " cakes, amongst others, everyday." +
            "The menu is contemporary with a touch of classic. Dishes like Smoked Chicken and Mango salad with a Yoghurt dressing, Gorgonzola, Tomato and Basil pesto salad, Oxtail " +
            "with butternut mash and roasted root vegetables and Kabeljou with a lemon caper sauce are available everyday.";
    String restuarent2 ="Basil’s Fine Dining Restaurant offers a sumptuous a la carte menu and is one of only two restaurants in the Limpopo Province to be awarded the world" +
            " acclaimed \"Chaine des Rotisseurs\" French award.\n" +
            "\n" +
            "The menu offers fabulously prepared dishes including the very popular steaks, lamb shanks and of course the exquisite veal. The chefs extraordinary talents " +
            "don’t end there, you can sample more of his excellence in the seafood selection, some of which include the very tender calamari, salmon prepared to your liking" +
            " and the delicious snails. There is a selection of scrumptious vegetarian options to choose from and a mouthwatering array of deserts for those with a sweet-tooth.\n" +
            "\n" +
            "Whether you are a wine connoisseur or just love a casual glass with your meal, we have a selection of wines to suit.\n" +
            "\n" +
            "Basil’s Fine Dining Restaurant is modern and sophisticated with a relaxed and welcoming feel. There are often fantastic events you can attend, such as our curry" +
            " evenings, Portuguese evenings, Italian evenings and even the mystery celebrity chef evenings. Booking is essential for any of the events and it is recommended that you also book" +
            " for any other evening to avoid disappointment. ";
    String restuarent3 = "This is a family friendly and contemporary restaurant situated in Polokwane. It overlooks the Sterkloop nursery and is a delightful place to enjoy something from our" +
            " delicious menu. Café Pavilion is famous for their bountiful buffets offering a great selection of salads, breads, soups, meats and vegetables.\n" +
            "\n" +
            "If you happen to come for the Saturday buffet you will be able to sample some of the chefs mouth watering specialties which include a very tasty rogan josh curry, passion fruit " +
            "sole and the blue cheese and fig rump. If you are not hungry enough for a buffet there is a selection of light bites to fill the gap. There are some excellent wines to choose from" +
            " that will compliment the meal of your choice. You will enjoy the warm and trendy ambiance in the dining area and kids will love the farm right next door.\n" +
            "\n";
    String restuarent4 = "Considered an excellent day time venue with seating outside in the well kept garden, Ambiance has found its popularity in its lighter meals like the quiches, filled pancakes" +
            " or wraps. Some delicious tea time treats are also available and apparently the carrot cake is a must try!\n" +
            "\n" +
            "With and elegant indoor area and some everyday favourites on their wine list this is a perfect place to sit back with some friends or family and enjoy the relaxed, private feel of this restaurant.";

    String restuarent5 = "With its 40’s and 60’s trademark feel this exciting venue boast its motto as being “Food, Passion and People”! On their menu; Capello serves a delicious array of foods such" +
            " as, fresh sushi, sea food, pasta as well as an array of continental dishes including delicious steaks and meats.\n" +
            "\n" +
            "This seems to be more of a Beer and cocktail venue but if you are a wine drinker you will be pleased to find all the usual favourites on their list. \n" +
            "Fantastic meals to cater for any palette and a fun atmosphere with great service...who wouldn’t want to experience this? So what are you waiting for...go have some fun!";
    String restuarent6 = "If you want a truly unique experience and are keen to try something different, then Mawetse is the place to visit! You can try Mopane Worms, which are so elegantly served" +
            " and so tasty that you probably wont even recognize them. There are fantastic dishes to sample, the oxtail is always made to perfection as are all the other meat dishes on offer. Here you " +
            "will find the best wine list in Polokwane with an array of boutique and estate wines in our cellar.\n" +
            "\n" +
            "This is an informal and friendly restaurant with a great atmosphere and a vibrant African feel. You can expect professional service, a sophisticated and relaxed ambiance as well as excellent food.\n" +
            "Once you have had your meal, why not linger in the cigar lounge or champagne bar and enjoy a whiskey, brandy, champagne or cognac.";

    String[] names = {retuarent1,restuarent2,restuarent3,restuarent4,restuarent5,restuarent6};
    double[] firstNumber = {-22.8785372,-25.748069,-26.548511,0,0,0};
    double[] secondNumber = {30.4468252,28.235709,31.415960,0,0,0};



    String[] titlename = {"The Farmyard Trading Post Restaurant","Basil's Fine Dining Restaurant","Café Pavilion Family Buffet and Grillhouse","Eat out at Cappello","Eat out at Ambiance in" +
            " Polokwane","Mawetse Fine Dining"};

    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

//action bar
        getSupportActionBar().setSubtitle("Restaurant");
        getSupportActionBar().setTitle("Plk Tour Guide");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        flipp =(AdapterViewFlipper)findViewById(R.id.adapterviews);

       customerAdapter = new CustomAdapter(getApplicationContext(),images,names,titlename,firstNumber,secondNumber);
       // jl[customerAdapter.getCount()] = firstNumber[customerAdapter.getCount()];
       // jr[customerAdapter.getCount()] = secondNumber[customerAdapter.getCount()];

        flipp.setAdapter(customerAdapter);
        flipp.setFlipInterval(4000);
        i++;

       /* Toast.makeText(getApplicationContext(),
        flipp.getCount(),Toast.LENGTH_LONG).show();*/

        flipp.setAutoStart(true);

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    //back button
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // int id = item.getItemId();
        if (item.getItemId() == android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


    //map link
  public void maps_(View view)

    {

        String strUri ="http://maps.google.com/maps?q=loc:" +-22.8785372+ "," +30.4468252  + " (" + "Thohoyandou" + ")" ;
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));
        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        startActivity(intent);

    }

}
