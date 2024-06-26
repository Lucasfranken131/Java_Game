package Enemies;

public class Goblin extends Enemy {

    static int id = 2;
    static String name = "Goblin";
    static int HP = 20;
    static int attack = 7;
    static int defense = 7;
    static int speed = 4;
    static String image = 
                "                        **/                                 \r\n" + //
                "                    ,  *//                                  \r\n" + //
                "                   /  **//                                  \r\n" + //
                "                  /  ///(                                   \r\n" + //
                "                 *..(//*                                    \r\n" + //
                "                ,,.(/*/                                     \r\n" + //
                "               ...(///                                      \r\n" + //
                "             ....(((/                                       \r\n" + //
                "             ,**####                                        \r\n" + //
                "           ///*%###                                         \r\n" + //
                "          (((*%%##                                          \r\n" + //
                "         *%#&#(/#,   %,                                     \r\n" + //
                "       #%#%%/#%./(##%(*%%%%%%%%%%%%%%*%(//                  \r\n" + //
                "      %%##(&&##  .%##(((/(##############%&                  \r\n" + //
                "    #((%#(&&#%* %%%(%,&./(/#(/#*/#/*(%(%#(#%           ,*   \r\n" + //
                "    /%##((((/(#((&*##&%&(****%##***/&,,,&#((#%%#((((#((*/   \r\n" + //
                "     *((%//**(%/(@@&@#(/((((((((/*,*/*/*/&@(/%(/*//*#       \r\n" + //
                "          *(///(%(&&&&(&@&%%&@@@@@@@@.&&&&/(&((***(         \r\n" + //
                "               #(&(&&&%#%%%%&(((((((&%&&&/,,/(*.            \r\n" + //
                "                 #(&/&.%###%%%%&#(((@%@/*                   \r\n" + //
                "                  #((&&#(#(/*,**/(%(#.                      \r\n" + //
                "                  /@&((#(&&###%&#*./      ##@@@@&((         \r\n" + //
                "                    #&&#(**//**(#/#/#   (&@@@@&&&&&%*       \r\n" + //
                "                      /%#(((((((#&(/%  *&@&&&(&%(((&&,      \r\n" + //
                "     (/&#*%*%(      ,%%#(//////(#% .#/(%@@#&&/@%///#&#*     \r\n" + //
                "  ##%%/*(&(/#%  %@@@&&&&&&&&&%&&&&&,  ((#@#%%#&#(/(&%%*     \r\n" + //
                "   #*/&%(/***/#%(/(%@#(/*,...,*(%#@#&. .%@&%%%%%%%%%%(*     \r\n" + //
                "     %/,,,,,,/(&##%#%%(/*,,,,*/###%&#**.,&&%&(%%####%/      \r\n" + //
                "      #///(/((((&&%#%%((/****/((#((/#%#(# #%%#####%/*       \r\n" + //
                "        #/////**/(%(%/##(////((#%(/((&(//%.  ./(/           \r\n" + //
                "          ((****/#    (,%#(((%*(,. %(%                      \r\n" + //
                "                          ..  ,/* (/(/                      \r\n" + //
                "                            .%##(/(#                        \r\n" + //
                "                             (#///((#                       \r\n" + //
                "                              .(/***/#                      \r\n" + //
                "                               (((###&%%((                  \r\n" + //
                "                               /#/*(((*#(,*                 \r\n" + //
                "                                 #######       ";

    public Goblin() {
        super(id, name, HP, attack, defense, speed, image);
    }
}
