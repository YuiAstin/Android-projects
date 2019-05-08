package com.example.foodrecipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CookingDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking_detail);
        Bundle extra=getIntent().getExtras();
        int pos = extra.getInt("position");
        display(pos);
    }
    public void display(int pos)
    {
        TextView a = findViewById(R.id.tax);

        if(pos==0)
        {
            a.setText("Ingredients\n" +
                    "Software:\n" +
                    "One 1 1/2-inch ribeye steak, about 14 ounces\n" +
                    "2 teaspoons kosher salt\n" +
                    "Peanut oil\n" +
                    "Special hardware:\n" +
                    "Quarter sheet pan or other shallow pan\n" +
                    "Cooling rack that fits inside the pan\n" +
                    "Remote style probe thermometer (see note)\n" +
                    "Infrared thermometer (optional)" + "Directions\n" +
                    "Season steak on both sides with the salt and place on a rack set inside a sheet pan.\n" +
                    "\n" +
                    "Refrigerate for a minimum of 6 hours and as many as 24.\n" +
                    "\n" +
                    "Preheat oven to 200 degrees F. Insert a remote style probe thermometer horizontally through the side of the steak and roast until it reaches an internal temperature of 120 degrees F, about an hour. Remove steak from oven and rest, uncovered, 10 minutes.\n" +
                    "\n" +
                    "Meanwhile, place a 12-inch cast iron pan over high heat at least 10 minutes or until it reaches 600 degrees F. (If you don't have an infrared thermometer you'll know you're close when a half teaspoon water dropped into the middle of the pan is completely evaporated in 5 seconds.)\n" +
                    "\n" +
                    "Brush a very light coat of peanut oil onto both sides of the steak.\n" +
                    "\n" +
                    "Sear steak on each side for 45 seconds. Use a stopwatch!\n" +
                    "\n" +
                    "Rest steak on a rack for 5 minutes and then slice diagonally against the grain to serve.\n" +
                    "\n" +
                    "Sauce? You don't need no stinkin' sauce but if you happen to have some of my compound herb butter that wouldn't be bad (https://www.foodnetwork.com/recipes/alton-brown/compound-butter-recipe-2013062).");
        }
        if(pos==1)
        {
            a.setText("Ingredients\n" +
                    "6 1/3 cups /1.5 liters 75-percent volume alcohol (recommended: 2 bottles Everclear Grain Alcohol)\n" +
                    "14 lemons\n" +
                    "6 1/3 cups /1.5 liters water\n" +
                    "2 1/3 pounds/1050 grams sugar\n"+"Directions\n" +
                    "Watch how to make this recipe.\n" +
                    "\n" +
                    "After a few weeks of brewing, sitting in plain view on my library, the long awaited Limoncello is finally ready!\n" +
                    "\n" +
                    "So many of you have been asking about my family recipe for this delicious liquor, well, now you have it: this episode in fact features a recipe from my family's vault, straight out of Aunt Laura's handwritten kitchen book, this Limoncello will enter your home and never leave. Get ready, your friends will ask for it, your family will drink it every time they come over, and in summer it will literally fly out of the freezer. \n" +
                    "\n" +
                    "The history of Limoncello is kind of confused, as there are indications of a liquor brewed using lemons throughout the center of Italy for many centuries... however, it was only in 1988 that an official trademark was deposited by the Canale family in Capri. Besides their business operation though, some Italians believe that Limoncello dates as back as the beginning of the cultivation of lemons in central and southern Italy, especially when referred to the oval lemon of Sorrento, which traditionally is the best kind of citrus you can use to make it.... and obviously, as often happens when talking alcohol, priests are held accountable by many, for inventing this incredible \"Liquid Gold\"! \n" +
                    "\n" +
                    "Debi and I love to drink a shot of Limoncello during hot summer nights, after dinner... It has a special freshness and a great liquor punch that combined together really make this drink a must for anybody's freezer. \n" +
                    "\n" +
                    "Summer is already over, you got now a few months for practicing and researching your own flavor and balance of ingredients. \n" +
                    "\n" +
                    "In fact, even if this recipe is extremely simple, the sweetness of the drink can be adjusted to your likings; after tasting your first batch of Limoncello (in about a month and a half from now) you will be able to assess if you would like it to be more or less sugary. We personally like our drinks to be more on the dry side, and the proportion of ingredients we are giving you reflects that. \n" +
                    "\n" +
                    "Grazie Zia Laura, for opening your secret kitchen book for us... we might think of starting designing a label for it now and put it in our market! \n" +
                    "\n" +
                    "Enjoy and brew responsibly!\n" +
                    "\n" +
                    "To make the Limoncello: \n" +
                    "\n" +
                    "This recipe occurs in 2 different stages: first the macerating of the lemon peels in alcohol, and then the actual brewing with the rest of the ingredients.\n" +
                    "\n" +
                    "First stage:\n" +
                    "\n" +
                    "Peel the lemons, making sure to only separate the yellow part of the peel from the fruit, and not go too deep.\n" +
                    "\n" +
                    "A potato peeler does the trick, even if it behaves sketchy in the hand (lemons are much rougher than potatoes) still, you can try with a small blade, like a paring knife, but you will probably end up cutting too deep. \n" +
                    "\n" +
                    "Place the peels in glass jars, possibly big enough to accommodate all the ingredients in the recipe, seal tight and let rest for two weeks. Find a dark corner in your house, even a basement or a cellar where to let your Limoncello rest, absolutely do not leave it exposed to sunlight... also, try to resist the temptation of opening your jars and sniffing it. It is called \"resting\" for a reason, be respectful, you will be rewarded later! We actually keep our jars on a library, to decorate our dining room... \n" +
                    "\n" +
                    "Second stage:\n" +
                    "\n" +
                    "After macerating for two weeks, the alcohol is now ready to be drained and mixed with the water and sugar.\n" +
                    "\n" +
                    "Heat the water in the pan and mix the sugar, then let cool off for about 1 hour, stirring every now and then to make sure that the sugar collected on the bottom of the pan \"stays in the game\". \n" +
                    "\n" +
                    "Drain the lemon peels from the jars and mix in the sugar water. Be careful, this is a moment you have to keep an eye on your volumes: figure out how many jars you are working with and maintain the proportion of ingredients! To simplify your life you, can brew everything in a big enough pot to accommodate all ingredients and then bottle it back into the jars. \n" +
                    "\n" +
                    "And again, for the second time, you have to exercise control and patience. Sniff all you want, than close your jars tight and let rest for a whole month. You can shake the liquid gently when you start noticing some sugar deposited on the bottom of the jars. Where did you decide to let your Limoncello rest, in the basement on a kitchen shelf? Remember, no sunlight! \n" +
                    "\n" +
                    "After a month, it is time to bottle, and it is totally up to you, just make sure you can fit your bottles in the freezer. \n" +
                    "\n" +
                    "Our first batch will be ready this coming weekend and we decided to keep only one bottle for us, most of the Limoncello will be small bottled and given to friends... Our recipe will evolve, and in a few days we will have already an excuse to start brewing more. \n" +
                    "\n" +
                    "This recipe is fun and simple, good to drink and good to watch while in the making; we have been so proud of ourselves this past summer, looking at our liquid gold decorating our house. Now we also have figure out a great, well thought out, made with love, and on a seriously controlled budget, Christmas present. ");

        }
        if(pos==2)
        {
            a.setText("Ingredients\n" +
                    "1 stick (4 ounces) unsalted butter\n" +
                    "4 ounces good-quality unsweetened chocolate, coarsely chopped\n" +
                    "1 cup packed light brown sugar\n" +
                    "1/2 cup granulated sugar\n" +
                    "2 teaspoons pure vanilla extract\n" +
                    "2 large eggs\n" +
                    "1 cup all-purpose flour\n" +
                    "1/2 cup unsweetened cocoa powder\n" +
                    "1 tablespoon ground cinnamon\n" +
                    "1 teaspoon chili powder\n" +
                    "1/2 teaspoon baking soda\n" +
                    "1/2 teaspoon kosher salt\n" +
                    "1/4 teaspoon cayenne pepper\n" +
                    "1 cup semisweet chocolate chips\n"+"Directions\n" +
                    "Preheat the oven to 325 degrees F. \n" +
                    "\n" +
                    "In a heatproof bowl set over simmering water, melt the butter and chocolate together, whisking until glossy and smooth. Alternately, the butter and chocolate can be melted in the microwave (in a microwave-safe bowl) in 25-second increments, whisking between each interval. Cool the chocolate mixture to room temperature. \n" +
                    "\n" +
                    "In the bowl of a stand mixer fitted with the paddle attachment (or a hand-held mixer), beat the brown sugar, granulated sugar, vanilla extract and eggs on low speed until well combined. Pour in the cooled chocolate and continue to mix until the ingredients are evenly distributed. \n" +
                    "\n" +
                    "In a medium bowl sift together the flour, cocoa powder, cinnamon, chili powder, baking soda, salt and cayenne pepper. Add the dry ingredients to the chocolate batter and mix on low speed until just combined and no visible flour remains. Fold in the chocolate chips with a rubber spatula or wooden spoon. ");
        }
        if(pos==3)
        {
            a.setText("Ingredients\n" +
                    "3 cups/375 g all-purpose flour, plus more as needed\n" +
                    "1 1/4 teaspoons salt\n" +
                    "1/4 teaspoon instant yeast\n" +
                    "Cornmeal, wheat bran or extra flour, as needed\n"+"Directions\n" +
                    "Watch how to make this recipe.\n" +
                    "\n" +
                    "Mix the flour, salt and yeast in a bowl. Stir in 1 1/2 cups/375 ml water to blend. What you'll have is a wet, shaggy, sticky dough, but not so wet as to be batter. Cover the bowl with a tea towel and let it rest in a warm place for at least 12 hours, and up to 24 hours. It's ready for the next step when the surface is dotted with bubbles.\n" +
                    "\n" +
                    "Flour a work surface and dump the dough out onto it. Sprinkle over a little more flour and fold it once or twice. Cover with the tea towel and let rest 15 minutes.\n" +
                    "\n" +
                    "Using only enough flour to keep the dough from sticking to your fingers, shape the dough into a ball. Coat a cotton towel with cornmeal, wheat bran or flour and lay the dough on it, seam-side down. Dust with more cornmeal, wheat bran or flour. (You need quite a lot because you want to be sure the dough doesn't stick to the towel). Cover and let rise for about 2 hours. When ready, the dough will be more than double in size.\n" +
                    "\n" +
                    "Half an hour before the dough is ready, preheat the oven to 450 degrees F/230 degrees C. Put a 2-liter cast-iron pot or Dutch oven (cocotte) inside to heat.");
        }
        if(pos==4)
        {
            a.setText("Ingredients\n" +
                    "Software:\n" +
                    "One 1 1/2-inch ribeye steak, about 14 ounces\n" +
                    "2 teaspoons kosher salt\n" +
                    "Peanut oil\n" +
                    "Special hardware:\n" +
                    "Quarter sheet pan or other shallow pan\n" +
                    "Cooling rack that fits inside the pan\n" +
                    "Remote style probe thermometer (see note)\n" +
                    "Infrared thermometer (optional)" + "Directions\n" +
                    "Season steak on both sides with the salt and place on a rack set inside a sheet pan.\n" +
                    "\n" +
                    "Refrigerate for a minimum of 6 hours and as many as 24.\n" +
                    "\n" +
                    "Preheat oven to 200 degrees F. Insert a remote style probe thermometer horizontally through the side of the steak and roast until it reaches an internal temperature of 120 degrees F, about an hour. Remove steak from oven and rest, uncovered, 10 minutes.\n" +
                    "\n" +
                    "Meanwhile, place a 12-inch cast iron pan over high heat at least 10 minutes or until it reaches 600 degrees F. (If you don't have an infrared thermometer you'll know you're close when a half teaspoon water dropped into the middle of the pan is completely evaporated in 5 seconds.)\n" +
                    "\n" +
                    "Brush a very light coat of peanut oil onto both sides of the steak.\n" +
                    "\n" +
                    "Sear steak on each side for 45 seconds. Use a stopwatch!\n" +
                    "\n" +
                    "Rest steak on a rack for 5 minutes and then slice diagonally against the grain to serve.\n" +
                    "\n" +
                    "Sauce? You don't need no stinkin' sauce but if you happen to have some of my compound herb butter that wouldn't be bad (https://www.foodnetwork.com/recipes/alton-brown/compound-butter-recipe-2013062).");
        }
        if(pos==5)
        {
            a.setText("Ingredients\n" +
                    "6 1/3 cups /1.5 liters 75-percent volume alcohol (recommended: 2 bottles Everclear Grain Alcohol)\n" +
                    "14 lemons\n" +
                    "6 1/3 cups /1.5 liters water\n" +
                    "2 1/3 pounds/1050 grams sugar\n"+"Directions\n" +
                    "Watch how to make this recipe.\n" +
                    "\n" +
                    "After a few weeks of brewing, sitting in plain view on my library, the long awaited Limoncello is finally ready!\n" +
                    "\n" +
                    "So many of you have been asking about my family recipe for this delicious liquor, well, now you have it: this episode in fact features a recipe from my family's vault, straight out of Aunt Laura's handwritten kitchen book, this Limoncello will enter your home and never leave. Get ready, your friends will ask for it, your family will drink it every time they come over, and in summer it will literally fly out of the freezer. \n" +
                    "\n" +
                    "The history of Limoncello is kind of confused, as there are indications of a liquor brewed using lemons throughout the center of Italy for many centuries... however, it was only in 1988 that an official trademark was deposited by the Canale family in Capri. Besides their business operation though, some Italians believe that Limoncello dates as back as the beginning of the cultivation of lemons in central and southern Italy, especially when referred to the oval lemon of Sorrento, which traditionally is the best kind of citrus you can use to make it.... and obviously, as often happens when talking alcohol, priests are held accountable by many, for inventing this incredible \"Liquid Gold\"! \n" +
                    "\n" +
                    "Debi and I love to drink a shot of Limoncello during hot summer nights, after dinner... It has a special freshness and a great liquor punch that combined together really make this drink a must for anybody's freezer. \n" +
                    "\n" +
                    "Summer is already over, you got now a few months for practicing and researching your own flavor and balance of ingredients. \n" +
                    "\n" +
                    "In fact, even if this recipe is extremely simple, the sweetness of the drink can be adjusted to your likings; after tasting your first batch of Limoncello (in about a month and a half from now) you will be able to assess if you would like it to be more or less sugary. We personally like our drinks to be more on the dry side, and the proportion of ingredients we are giving you reflects that. \n" +
                    "\n" +
                    "Grazie Zia Laura, for opening your secret kitchen book for us... we might think of starting designing a label for it now and put it in our market! \n" +
                    "\n" +
                    "Enjoy and brew responsibly!\n" +
                    "\n" +
                    "To make the Limoncello: \n" +
                    "\n" +
                    "This recipe occurs in 2 different stages: first the macerating of the lemon peels in alcohol, and then the actual brewing with the rest of the ingredients.\n" +
                    "\n" +
                    "First stage:\n" +
                    "\n" +
                    "Peel the lemons, making sure to only separate the yellow part of the peel from the fruit, and not go too deep.\n" +
                    "\n" +
                    "A potato peeler does the trick, even if it behaves sketchy in the hand (lemons are much rougher than potatoes) still, you can try with a small blade, like a paring knife, but you will probably end up cutting too deep. \n" +
                    "\n" +
                    "Place the peels in glass jars, possibly big enough to accommodate all the ingredients in the recipe, seal tight and let rest for two weeks. Find a dark corner in your house, even a basement or a cellar where to let your Limoncello rest, absolutely do not leave it exposed to sunlight... also, try to resist the temptation of opening your jars and sniffing it. It is called \"resting\" for a reason, be respectful, you will be rewarded later! We actually keep our jars on a library, to decorate our dining room... \n" +
                    "\n" +
                    "Second stage:\n" +
                    "\n" +
                    "After macerating for two weeks, the alcohol is now ready to be drained and mixed with the water and sugar.\n" +
                    "\n" +
                    "Heat the water in the pan and mix the sugar, then let cool off for about 1 hour, stirring every now and then to make sure that the sugar collected on the bottom of the pan \"stays in the game\". \n" +
                    "\n" +
                    "Drain the lemon peels from the jars and mix in the sugar water. Be careful, this is a moment you have to keep an eye on your volumes: figure out how many jars you are working with and maintain the proportion of ingredients! To simplify your life you, can brew everything in a big enough pot to accommodate all ingredients and then bottle it back into the jars. \n" +
                    "\n" +
                    "And again, for the second time, you have to exercise control and patience. Sniff all you want, than close your jars tight and let rest for a whole month. You can shake the liquid gently when you start noticing some sugar deposited on the bottom of the jars. Where did you decide to let your Limoncello rest, in the basement on a kitchen shelf? Remember, no sunlight! \n" +
                    "\n" +
                    "After a month, it is time to bottle, and it is totally up to you, just make sure you can fit your bottles in the freezer. \n" +
                    "\n" +
                    "Our first batch will be ready this coming weekend and we decided to keep only one bottle for us, most of the Limoncello will be small bottled and given to friends... Our recipe will evolve, and in a few days we will have already an excuse to start brewing more. \n" +
                    "\n" +
                    "This recipe is fun and simple, good to drink and good to watch while in the making; we have been so proud of ourselves this past summer, looking at our liquid gold decorating our house. Now we also have figure out a great, well thought out, made with love, and on a seriously controlled budget, Christmas present. ");

        }
        if(pos==6)
        {
            a.setText("Ingredients\n" +
                    "1 stick (4 ounces) unsalted butter\n" +
                    "4 ounces good-quality unsweetened chocolate, coarsely chopped\n" +
                    "1 cup packed light brown sugar\n" +
                    "1/2 cup granulated sugar\n" +
                    "2 teaspoons pure vanilla extract\n" +
                    "2 large eggs\n" +
                    "1 cup all-purpose flour\n" +
                    "1/2 cup unsweetened cocoa powder\n" +
                    "1 tablespoon ground cinnamon\n" +
                    "1 teaspoon chili powder\n" +
                    "1/2 teaspoon baking soda\n" +
                    "1/2 teaspoon kosher salt\n" +
                    "1/4 teaspoon cayenne pepper\n" +
                    "1 cup semisweet chocolate chips\n"+"Directions\n" +
                    "Preheat the oven to 325 degrees F. \n" +
                    "\n" +
                    "In a heatproof bowl set over simmering water, melt the butter and chocolate together, whisking until glossy and smooth. Alternately, the butter and chocolate can be melted in the microwave (in a microwave-safe bowl) in 25-second increments, whisking between each interval. Cool the chocolate mixture to room temperature. \n" +
                    "\n" +
                    "In the bowl of a stand mixer fitted with the paddle attachment (or a hand-held mixer), beat the brown sugar, granulated sugar, vanilla extract and eggs on low speed until well combined. Pour in the cooled chocolate and continue to mix until the ingredients are evenly distributed. \n" +
                    "\n" +
                    "In a medium bowl sift together the flour, cocoa powder, cinnamon, chili powder, baking soda, salt and cayenne pepper. Add the dry ingredients to the chocolate batter and mix on low speed until just combined and no visible flour remains. Fold in the chocolate chips with a rubber spatula or wooden spoon. ");
        }
        if(pos==7)
        {
            a.setText("Ingredients\n" +
                    "3 cups/375 g all-purpose flour, plus more as needed\n" +
                    "1 1/4 teaspoons salt\n" +
                    "1/4 teaspoon instant yeast\n" +
                    "Cornmeal, wheat bran or extra flour, as needed\n"+"Directions\n" +
                    "Watch how to make this recipe.\n" +
                    "\n" +
                    "Mix the flour, salt and yeast in a bowl. Stir in 1 1/2 cups/375 ml water to blend. What you'll have is a wet, shaggy, sticky dough, but not so wet as to be batter. Cover the bowl with a tea towel and let it rest in a warm place for at least 12 hours, and up to 24 hours. It's ready for the next step when the surface is dotted with bubbles.\n" +
                    "\n" +
                    "Flour a work surface and dump the dough out onto it. Sprinkle over a little more flour and fold it once or twice. Cover with the tea towel and let rest 15 minutes.\n" +
                    "\n" +
                    "Using only enough flour to keep the dough from sticking to your fingers, shape the dough into a ball. Coat a cotton towel with cornmeal, wheat bran or flour and lay the dough on it, seam-side down. Dust with more cornmeal, wheat bran or flour. (You need quite a lot because you want to be sure the dough doesn't stick to the towel). Cover and let rise for about 2 hours. When ready, the dough will be more than double in size.\n" +
                    "\n" +
                    "Half an hour before the dough is ready, preheat the oven to 450 degrees F/230 degrees C. Put a 2-liter cast-iron pot or Dutch oven (cocotte) inside to heat.");
        }
        if(pos==8)
        {
            a.setText("Ingredients\n" +
                    "1 stick (4 ounces) unsalted butter\n" +
                    "4 ounces good-quality unsweetened chocolate, coarsely chopped\n" +
                    "1 cup packed light brown sugar\n" +
                    "1/2 cup granulated sugar\n" +
                    "2 teaspoons pure vanilla extract\n" +
                    "2 large eggs\n" +
                    "1 cup all-purpose flour\n" +
                    "1/2 cup unsweetened cocoa powder\n" +
                    "1 tablespoon ground cinnamon\n" +
                    "1 teaspoon chili powder\n" +
                    "1/2 teaspoon baking soda\n" +
                    "1/2 teaspoon kosher salt\n" +
                    "1/4 teaspoon cayenne pepper\n" +
                    "1 cup semisweet chocolate chips\n"+"Directions\n" +
                    "Preheat the oven to 325 degrees F. \n" +
                    "\n" +
                    "In a heatproof bowl set over simmering water, melt the butter and chocolate together, whisking until glossy and smooth. Alternately, the butter and chocolate can be melted in the microwave (in a microwave-safe bowl) in 25-second increments, whisking between each interval. Cool the chocolate mixture to room temperature. \n" +
                    "\n" +
                    "In the bowl of a stand mixer fitted with the paddle attachment (or a hand-held mixer), beat the brown sugar, granulated sugar, vanilla extract and eggs on low speed until well combined. Pour in the cooled chocolate and continue to mix until the ingredients are evenly distributed. \n" +
                    "\n" +
                    "In a medium bowl sift together the flour, cocoa powder, cinnamon, chili powder, baking soda, salt and cayenne pepper. Add the dry ingredients to the chocolate batter and mix on low speed until just combined and no visible flour remains. Fold in the chocolate chips with a rubber spatula or wooden spoon. ");
        }
        if(pos==9)
        {
            a.setText("Ingredients\n" +
                    "3 cups/375 g all-purpose flour, plus more as needed\n" +
                    "1 1/4 teaspoons salt\n" +
                    "1/4 teaspoon instant yeast\n" +
                    "Cornmeal, wheat bran or extra flour, as needed\n"+"Directions\n" +
                    "Watch how to make this recipe.\n" +
                    "\n" +
                    "Mix the flour, salt and yeast in a bowl. Stir in 1 1/2 cups/375 ml water to blend. What you'll have is a wet, shaggy, sticky dough, but not so wet as to be batter. Cover the bowl with a tea towel and let it rest in a warm place for at least 12 hours, and up to 24 hours. It's ready for the next step when the surface is dotted with bubbles.\n" +
                    "\n" +
                    "Flour a work surface and dump the dough out onto it. Sprinkle over a little more flour and fold it once or twice. Cover with the tea towel and let rest 15 minutes.\n" +
                    "\n" +
                    "Using only enough flour to keep the dough from sticking to your fingers, shape the dough into a ball. Coat a cotton towel with cornmeal, wheat bran or flour and lay the dough on it, seam-side down. Dust with more cornmeal, wheat bran or flour. (You need quite a lot because you want to be sure the dough doesn't stick to the towel). Cover and let rise for about 2 hours. When ready, the dough will be more than double in size.\n" +
                    "\n" +
                    "Half an hour before the dough is ready, preheat the oven to 450 degrees F/230 degrees C. Put a 2-liter cast-iron pot or Dutch oven (cocotte) inside to heat.");
        }
    }
}
