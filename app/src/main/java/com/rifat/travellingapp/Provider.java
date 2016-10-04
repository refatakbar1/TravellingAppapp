package com.rifat.travellingapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by refat on 10/4/2016.
 */
public class Provider {
    static List<Language> languageList= new ArrayList<>();
    public static List<Language>getData(){return  languageList;}

    static {
        for (int i=0;i<1;i++) {
            languageList.add(new Language("fort", "Lalbag Fort"," Lalbagh Fort situated in Dhaka."+
                    "For long the fort was considered to be a combination of"+
                    " three buildings (the mosque,the tomb of Bibi Pari and the Diwan-i-Aam)," +
                    " with two gateways and a portion of the partly damaged fortification wall." +
                    "   Recent excavations carried out by the Department of Archaeology     " +
                    "of Bangladesh have revealed the existence of other structures.  " +
                    "The southern fortification wall has a huge bastion       "+
                    " in the southwestern corner. " +
                    "On the north of the south fortification wall were the utility buildings,"+
                    "stable, administration block, and its western part accommodated a beautiful " +
                    "  roof-garden with arrangements for fountains and a water reservoir. The"+
                    "residential part was located on the east of the west fortification wall, mainly"+
                    "to the southwest of the mosque."+
                    " The fortification wall on the south had five bastions at regular " +
                    " intervals two stories in height, and the western wall had" +
                    "       two bastions; the biggest one is near the main southern gate."+
                    " The bastions had an underground tunnel.The central area of" +
                    "       the fort is occupied by three buildings - the Diwan-i-Aam and the hammam on its east, the Mosque on the west and the Tomb" +
                    "       of Pari Bibi in between the two - in one line, but not at an equal distance."+"A water channel with fountains at regular" +
                    "       intervals connects the three buildings from east to west and north to south."));
            languageList.add(new Language("sundor", "Sundorbon","Sundorbon is famous and longest mangrove forest in the world."+
                    "The forest stretchers over Bangladesh and India." +
                    "  Bangladesh is famous for its two gifts of nature. sundorbon is one of this two."+
                    "The area of sundorbon in Bangladesh" +
                    "      is 6017sq km of which 4143 square km are landless and remaning 1874 square km are under water bodies. "+
                    "It is situtate in" +
                    "      the district of greater khulna of Bangladesh. sundorbon is famous for its beauty. " +
                    "Its biodiversity is very strong. It is a" +
                    "      popular tourist spot. It is also famous for photografy." +
                    " Millions of south western region people depends on sundorbon."+"It helps to save tho whole country " +
                    "from various natural calamities like sidr, aila etc." +
                    "     various tress, birds, animals, snakes, rivers etc are the main attraction of the forest. sundor, garan, gaya, goalpata," +
                    "      babla, raj koroy  trees are available here. It makes the forest green.It creat great attraction. "+
                    " spotted deers are another attraction of the forest. according to UNESCO more than 30,000 spotted deers are" +
                    "      available in sundorbon." +
                    "       sundorbon is very attractive and interesting place for tourist. It also plentyful for a number of unoccupied time" +
                    "      for reaserch and travel activities.It is a suitable place for photography. The main attractives of Sunderban are Hiroin point," +
                    "      Kotka, Dublar char, Tinkona islands."

            ));
            languageList.add(new Language("cox", "Cox Bazar","Cox Bazar sea beach is the longest sea beach in the world 120 km long," +
                    "      having no 2nd instance.The wavy water of Bay of Bengal touches the beach throughout this 120 km." +

                    "For Bangladeshis it doesnot get much better than Coxs Bazar, the countrys most popular beach town than the other one" +
                    "      Kuakata beach town.Its sort of a Cancun of the east. Its choc-a-bloc with massive well-architectured concrete structures," +
                    "      affluent 5 and 3 star hotels, catering largely to the countrys elite and overseas tourists. The beach is only a bit" +
                    "      crowded in tourist season, October to March, especially near the hotel-motel zone, but remains virgin during the rest of the" +
                    "      year, April to September, when its better to take a trip there." +

                    "The part of the 120 km beach is named differently having diversified flora and fauna. It starts with Laboni Beach, Sughandha Beach" +
                    "      within the Coxs Bazar region and 10 km south is known as Himchari Beach,30 km fur known as Inani Beach and more 70 km" +
                    "      is the Teknaf Beach. Things should be quieter here, but still expect to draw great attention. The entire 120 km beach" +
                    "      can be traveled in one go by motorbike. The more one gets into the south, the more the ocean water becomes blue."));
            languageList.add(new Language("bandarban", "Bandorban ","   Bandarban, a 4,479 km wide area with a population of 292,900 (2003 est.)" +
                    "        inside Bangladesh is bordered by Coxs Bazaar, Chittagong, Rangamati and Khagrachari." +
                    "        On the other side of the 129 kilometre international border lies Myanmar provinces of Chin and Arakan." +
                    "        Bandarban has only one town that approaches anything near a city - the Bandarban town. The rest of the area is" +
                    "        divided into 7 upazilas, which are in turn divided into varying numbers of unions. Each union is a cluster of paras" +
                    "        and villages." +
                    "        The three highest peak of Bangladesh - Tahjindong (1280 meters, also known as bijoy)," +
                    "        Mowdok Mual (1052 meters), and Keokradong (883 metres) - are located in Bandarban district, as well as Raikhiang Lake," +
                    "        the highest lake in Bangladesh. Chimbuk peak and Boga Lake are two more highly noted features of the district. Though most" +
                    "        Bangladesh sources cite Keokradong as the highest peak in the country, but Tazing Dong (sometimes spelled as Tahjingdong," +
                    "        and also known as Bijoy) lying further east is recognized both by government and expert sources as a taller peak." +
                    "        Measurements taken by English adventurer Ginge Fullen shows that an officially unnamed peak near the Myanmar border" +
                    "        (locally known as Mowdok Mual) is the highest point in Bangladesh.Recently a team from Nature Adventure Club took part" +
                    "        in an expedition in the mowdok range and agreed with the ginge fullens statement. They got the hight of" +
                    "        this peak as 3488 feet with gps accuracy of 3 meter. The unnamed summit is known as Saka Haphong to the local Tripura tribes."));
        }
    }
}
