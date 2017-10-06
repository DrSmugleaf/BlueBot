package com.github.drsmugbrain.pokemon;

import com.github.drsmugbrain.util.Bot;
import javafx.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.util.*;

/**
 * Created by DrSmugleaf on 11/08/2017.
 */
public enum Species {

    ABRA("Abra"),
    ALAKAZAM("Alakazam"),
    KADABRA("Kadabra"),
    ABSOL("Absol"),
    AERODACTYL("Aerodactyl"),
    AIPOM("Aipom"),
    AMBIPOM("Ambipom"),
    ALOMOMOLA("Alomomola"),
    AMAURA("Amaura"),
    AURORUS("Aurorus"),
    ANORITH("Anorith"),
    ARMALDO("Armaldo"),
    ARCEUS("Arceus"),
    ARCEUS_FIRE("Arceus-Fire"),
    ARCEUS_WATER("Arceus-Water"),
    ARCEUS_ICE("Arceus-Ice"),
    ARCEUS_FAIRY("Arceus-Fairy"),
    ARCEUS_GRASS("Arceus-Grass"),
    ARCEUS_GROUND("Arceus-Ground"),
    ARCEUS_FIGHTING("Arceus-Fighting"),
    ARCEUS_DARK("Arceus-Dark"),
    ARCEUS_BUG("Arceus-Bug"),
    ARCEUS_STEEL("Arceus-Steel"),
    ARCEUS_ELECTRIC("Arceus-Electric"),
    ARCEUS_PSYCHIC("Arceus-Psychic"),
    ARCEUS_GHOST("Arceus-Ghost"),
    ARCEUS_FLYING("Arceus-Flying"),
    ARCEUS_POISON("Arceus-Poison"),
    ARCEUS_ROCK("Arceus-Rock"),
    ARCEUS_DRAGON("Arceus-Dragon"),
    ARCHEN("Archen"),
    ARCHEOPS("Archeops"),
    AGGRON("Aggron"),
    ARON("Aron"),
    LAIRON("Lairon"),
    ARTICUNO("Articuno"),
    AUDINO("Audino"),
    AXEW("Axew"),
    FRAXURE("Fraxure"),
    HAXORUS("Haxorus"),
    AZELF("Azelf"),
    BAGON("Bagon"),
    SALAMENCE("Salamence"),
    SHELGON("Shelgon"),
    BALTOY("Baltoy"),
    CLAYDOL("Claydol"),
    BARBOACH("Barboach"),
    WHISCASH("Whiscash"),
    BASCULIN("Basculin"),
    BELDUM("Beldum"),
    METAGROSS("Metagross"),
    METANG("Metang"),
    BELLSPROUT("Bellsprout"),
    VICTREEBEL("Victreebel"),
    WEEPINBELL("Weepinbell"),
    AVALUGG("Avalugg"),
    BERGMITE("Bergmite"),
    BIBAREL("Bibarel"),
    BIDOOF("Bidoof"),
    BARBARACLE("Barbaracle"),
    BINACLE("Binacle"),
    BLITZLE("Blitzle"),
    ZEBSTRIKA("Zebstrika"),
    BOUFFALANT("Bouffalant"),
    BRONZONG("Bronzong"),
    BRONZOR("Bronzor"),
    BUIZEL("Buizel"),
    FLOATZEL("Floatzel"),
    BULBASAUR("Bulbasaur"),
    IVYSAUR("Ivysaur"),
    VENUSAUR("Venusaur"),
    BUNEARY("Buneary"),
    LOPUNNY("Lopunny"),
    BUNNELBY("Bunnelby"),
    DIGGERSBY("Diggersby"),
    BURMY("Burmy"),
    MOTHIM("Mothim"),
    WORMADAM("Wormadam"),
    WORMADAM_SANDY("Wormadam-Sandy"),
    WORMADAM_TRASH("Wormadam-Trash"),
    CACNEA("Cacnea"),
    CACTURNE("Cacturne"),
    CARBINK("Carbink"),
    CARNIVINE("Carnivine"),
    CARVANHA("Carvanha"),
    SHARPEDO("Sharpedo"),
    CASTFORM("Castform"),
    BUTTERFREE("Butterfree"),
    CATERPIE("Caterpie"),
    METAPOD("Metapod"),
    CELEBI("Celebi"),
    BLISSEY("Blissey"),
    CHANSEY("Chansey"),
    HAPPINY("Happiny"),
    CHARIZARD("Charizard"),
    CHARMANDER("Charmander"),
    CHARMELEON("Charmeleon"),
    CHATOT("Chatot"),
    CHERRIM("Cherrim"),
    CHERUBI("Cherubi"),
    CHESNAUGHT("Chesnaught"),
    CHESPIN("Chespin"),
    QUILLADIN("Quilladin"),
    BAYLEEF("Bayleef"),
    CHIKORITA("Chikorita"),
    MEGANIUM("Meganium"),
    CHIMCHAR("Chimchar"),
    INFERNAPE("Infernape"),
    MONFERNO("Monferno"),
    CHIMECHO("Chimecho"),
    CHINGLING("Chingling"),
    CHINCHOU("Chinchou"),
    LANTURN("Lanturn"),
    CLAMPERL("Clamperl"),
    GOREBYSS("Gorebyss"),
    HUNTAIL("Huntail"),
    CLAUNCHER("Clauncher"),
    CLAWITZER("Clawitzer"),
    CLEFABLE("Clefable"),
    CLEFAIRY("Clefairy"),
    CLEFFA("Cleffa"),
    COBALION("Cobalion"),
    COMBEE("Combee"),
    VESPIQUEN("Vespiquen"),
    CORPHISH("Corphish"),
    CRAWDAUNT("Crawdaunt"),
    CORSOLA("Corsola"),
    COTTONEE("Cottonee"),
    WHIMSICOTT("Whimsicott"),
    CRANIDOS("Cranidos"),
    RAMPARDOS("Rampardos"),
    CRESSELIA("Cresselia"),
    CROAGUNK("Croagunk"),
    TOXICROAK("Toxicroak"),
    CRYOGONAL("Cryogonal"),
    BEARTIC("Beartic"),
    CUBCHOO("Cubchoo"),
    CUBONE("Cubone"),
    MAROWAK("Marowak"),
    CYNDAQUIL("Cyndaquil"),
    QUILAVA("Quilava"),
    TYPHLOSION("Typhlosion"),
    DARKRAI("Darkrai"),
    DARMANITAN("Darmanitan"),
    DARUMAKA("Darumaka"),
    DEDENNE("Dedenne"),
    DEERLING("Deerling"),
    SAWSBUCK("Sawsbuck"),
    DEINO("Deino"),
    HYDREIGON("Hydreigon"),
    ZWEILOUS("Zweilous"),
    DELIBIRD("Delibird"),
    DEOXYS("Deoxys"),
    DEOXYS_ATTACK("Deoxys-Attack"),
    DEOXYS_DEFENSE("Deoxys-Defense"),
    DEOXYS_SPEED("Deoxys-Speed"),
    DIALGA("Dialga"),
    DIANCIE("Diancie"),
    DIGLETT("Diglett"),
    DUGTRIO("Dugtrio"),
    DITTO("Ditto"),
    DODRIO("Dodrio"),
    DODUO("Doduo"),
    DRAGONAIR("Dragonair"),
    DRAGONITE("Dragonite"),
    DRATINI("Dratini"),
    DRIFBLIM("Drifblim"),
    DRIFLOON("Drifloon"),
    DRILBUR("Drilbur"),
    EXCADRILL("Excadrill"),
    DROWZEE("Drowzee"),
    HYPNO("Hypno"),
    DRUDDIGON("Druddigon"),
    DUCKLETT("Ducklett"),
    SWANNA("Swanna"),
    DUNSPARCE("Dunsparce"),
    DURANT("Durant"),
    DUSCLOPS("Dusclops"),
    DUSKNOIR("Dusknoir"),
    DUSKULL("Duskull"),
    CRUSTLE("Crustle"),
    DWEBBLE("Dwebble"),
    EEVEE("Eevee"),
    ESPEON("Espeon"),
    FLAREON("Flareon"),
    GLACEON("Glaceon"),
    JOLTEON("Jolteon"),
    LEAFEON("Leafeon"),
    SYLVEON("Sylveon"),
    UMBREON("Umbreon"),
    VAPOREON("Vaporeon"),
    ARBOK("Arbok"),
    EKANS("Ekans"),
    ELECTABUZZ("Electabuzz"),
    ELECTIVIRE("Electivire"),
    ELEKID("Elekid"),
    ELECTRIKE("Electrike"),
    MANECTRIC("Manectric"),
    BEHEEYEM("Beheeyem"),
    ELGYEM("Elgyem"),
    EMOLGA("Emolga"),
    ENTEI("Entei"),
    ESPURR("Espurr"),
    MEOWSTIC_F("Meowstic-F"),
    MEOWSTIC_M("Meowstic-M"),
    EXEGGCUTE("Exeggcute"),
    EXEGGUTOR("Exeggutor"),
    FARFETCHD("Farfetch'd"),
    FEEBAS("Feebas"),
    MILOTIC("Milotic"),
    BRAIXEN("Braixen"),
    DELPHOX("Delphox"),
    FENNEKIN("Fennekin"),
    FERROSEED("Ferroseed"),
    FERROTHORN("Ferrothorn"),
    FINNEON("Finneon"),
    LUMINEON("Lumineon"),
    FLABEBE("Flabebe"),
    FLOETTE("Floette"),
    FLORGES("Florges"),
    FLOETTE_ETERNAL("Floette-Eternal"),
    FLETCHINDER("Fletchinder"),
    FLETCHLING("Fletchling"),
    TALONFLAME("Talonflame"),
    AMOONGUSS("Amoonguss"),
    FOONGUS("Foongus"),
    FRILLISH("Frillish"),
    JELLICENT("Jellicent"),
    FROAKIE("Froakie"),
    FROGADIER("Frogadier"),
    GRENINJA("Greninja"),
    GRENINJA_ASH("Greninja-Ash"),
    FURFROU("Furfrou"),
    GASTLY("Gastly"),
    GENGAR("Gengar"),
    HAUNTER("Haunter"),
    GENESECT("Genesect"),
    GEODUDE("Geodude"),
    GOLEM("Golem"),
    GRAVELER("Graveler"),
    GABITE("Gabite"),
    GARCHOMP("Garchomp"),
    GIBLE("Gible"),
    GIRAFARIG("Girafarig"),
    GIRATINA("Giratina"),
    GIRATINA_ORIGIN("Giratina-Origin"),
    GLAMEOW("Glameow"),
    PURUGLY("Purugly"),
    GLIGAR("Gligar"),
    GLISCOR("Gliscor"),
    GOLDEEN("Goldeen"),
    SEAKING("Seaking"),
    GOLETT("Golett"),
    GOLURK("Golurk"),
    GOODRA("Goodra"),
    GOOMY("Goomy"),
    SLIGGOO("Sliggoo"),
    GOTHITA("Gothita"),
    GOTHITELLE("Gothitelle"),
    GOTHORITA("Gothorita"),
    GRIMER("Grimer"),
    MUK("Muk"),
    GROUDON("Groudon"),
    ARCANINE("Arcanine"),
    GROWLITHE("Growlithe"),
    GULPIN("Gulpin"),
    SWALOT("Swalot"),
    HAWLUCHA("Hawlucha"),
    HEATMOR("Heatmor"),
    HEATRAN("Heatran"),
    HELIOLISK("Heliolisk"),
    HELIOPTILE("Helioptile"),
    HERACROSS("Heracross"),
    HIPPOPOTAS("Hippopotas"),
    HIPPOWDON("Hippowdon"),
    HITMONCHAN("Hitmonchan"),
    HITMONLEE("Hitmonlee"),
    HITMONTOP("Hitmontop"),
    TYROGUE("Tyrogue"),
    AEGISLASH("Aegislash"),
    DOUBLADE("Doublade"),
    HONEDGE("Honedge"),
    HO_OH("Ho-Oh"),
    HOOPA("Hoopa"),
    HOOPA_UNBOUND("Hoopa-Unbound"),
    HOOTHOOT("Hoothoot"),
    NOCTOWL("Noctowl"),
    HOPPIP("Hoppip"),
    JUMPLUFF("Jumpluff"),
    SKIPLOOM("Skiploom"),
    HORSEA("Horsea"),
    KINGDRA("Kingdra"),
    SEADRA("Seadra"),
    HOUNDOOM("Houndoom"),
    HOUNDOUR("Houndour"),
    ILLUMISE("Illumise"),
    INKAY("Inkay"),
    MALAMAR("Malamar"),
    IGGLYBUFF("Igglybuff"),
    JIGGLYPUFF("Jigglypuff"),
    WIGGLYTUFF("Wigglytuff"),
    JIRACHI("Jirachi"),
    GALVANTULA("Galvantula"),
    JOLTIK("Joltik"),
    JYNX("Jynx"),
    SMOOCHUM("Smoochum"),
    KABUTO("Kabuto"),
    KABUTOPS("Kabutops"),
    KANGASKHAN("Kangaskhan"),
    ESCAVALIER("Escavalier"),
    KARRABLAST("Karrablast"),
    KECLEON("Kecleon"),
    KELDEO("Keldeo"),
    KLEFKI("Klefki"),
    KLANG("Klang"),
    KLINK("Klink"),
    KLINKLANG("Klinklang"),
    KOFFING("Koffing"),
    WEEZING("Weezing"),
    KINGLER("Kingler"),
    KRABBY("Krabby"),
    KRICKETOT("Kricketot"),
    KRICKETUNE("Kricketune"),
    KYOGRE("Kyogre"),
    KYUREM("Kyurem"),
    KYUREM_BLACK("Kyurem-Black"),
    KYUREM_WHITE("Kyurem-White"),
    LANDORUS("Landorus"),
    LANDORUS_THERIAN("Landorus-Therian"),
    LAPRAS("Lapras"),
    LARVESTA("Larvesta"),
    VOLCARONA("Volcarona"),
    LARVITAR("Larvitar"),
    PUPITAR("Pupitar"),
    TYRANITAR("Tyranitar"),
    LATIAS("Latias"),
    LATIOS("Latios"),
    LEDIAN("Ledian"),
    LEDYBA("Ledyba"),
    LICKILICKY("Lickilicky"),
    LICKITUNG("Lickitung"),
    CRADILY("Cradily"),
    LILEEP("Lileep"),
    HERDIER("Herdier"),
    LILLIPUP("Lillipup"),
    STOUTLAND("Stoutland"),
    LITLEO("Litleo"),
    PYROAR("Pyroar"),
    CHANDELURE("Chandelure"),
    LAMPENT("Lampent"),
    LITWICK("Litwick"),
    LOMBRE("Lombre"),
    LOTAD("Lotad"),
    LUDICOLO("Ludicolo"),
    LUGIA("Lugia"),
    LUNATONE("Lunatone"),
    LUVDISC("Luvdisc"),
    MACHAMP("Machamp"),
    MACHOKE("Machoke"),
    MACHOP("Machop"),
    GYARADOS("Gyarados"),
    MAGIKARP("Magikarp"),
    MAGBY("Magby"),
    MAGMAR("Magmar"),
    MAGMORTAR("Magmortar"),
    MAGNEMITE("Magnemite"),
    MAGNETON("Magneton"),
    MAGNEZONE("Magnezone"),
    HARIYAMA("Hariyama"),
    MAKUHITA("Makuhita"),
    MANAPHY("Manaphy"),
    MANKEY("Mankey"),
    PRIMEAPE("Primeape"),
    MANTINE("Mantine"),
    MANTYKE("Mantyke"),
    MARACTUS("Maractus"),
    AMPHAROS("Ampharos"),
    FLAAFFY("Flaaffy"),
    MAREEP("Mareep"),
    AZUMARILL("Azumarill"),
    AZURILL("Azurill"),
    MARILL("Marill"),
    MAWILE("Mawile"),
    MEDICHAM("Medicham"),
    MEDITITE("Meditite"),
    MELOETTA("Meloetta"),
    MEOWTH("Meowth"),
    PERSIAN("Persian"),
    MESPRIT("Mesprit"),
    MEWTWO("Mewtwo"),
    MEW("Mew"),
    MIENFOO("Mienfoo"),
    MIENSHAO("Mienshao"),
    MILTANK("Miltank"),
    MIME_JR("Mime Jr."),
    MR_MIME("Mr. Mime"),
    CINCCINO("Cinccino"),
    MINCCINO("Minccino"),
    MINUN("Minun"),
    MISDREAVUS("Misdreavus"),
    MISMAGIUS("Mismagius"),
    MOLTRES("Moltres"),
    MARSHTOMP("Marshtomp"),
    MUDKIP("Mudkip"),
    SWAMPERT("Swampert"),
    MUNNA("Munna"),
    MUSHARNA("Musharna"),
    HONCHKROW("Honchkrow"),
    MURKROW("Murkrow"),
    NATU("Natu"),
    XATU("Xatu"),
    NIDOQUEEN("Nidoqueen"),
    NIDORAN_F("Nidoran-F"),
    NIDORINA("Nidorina"),
    NIDOKING("Nidoking"),
    NIDORAN_M("Nidoran-M"),
    NIDORINO("Nidorino"),
    NINCADA("Nincada"),
    NINJASK("Ninjask"),
    SHEDINJA("Shedinja"),
    NOIBAT("Noibat"),
    NOIVERN("Noivern"),
    NOSEPASS("Nosepass"),
    PROBOPASS("Probopass"),
    CAMERUPT("Camerupt"),
    NUMEL("Numel"),
    BELLOSSOM("Bellossom"),
    GLOOM("Gloom"),
    ODDISH("Oddish"),
    VILEPLUME("Vileplume"),
    OMANYTE("Omanyte"),
    OMASTAR("Omastar"),
    ONIX("Onix"),
    STEELIX("Steelix"),
    DEWOTT("Dewott"),
    OSHAWOTT("Oshawott"),
    SAMUROTT("Samurott"),
    PACHIRISU("Pachirisu"),
    PALKIA("Palkia"),
    PANCHAM("Pancham"),
    PANGORO("Pangoro"),
    PANPOUR("Panpour"),
    SIMIPOUR("Simipour"),
    PANSAGE("Pansage"),
    SIMISAGE("Simisage"),
    PANSEAR("Pansear"),
    SIMISEAR("Simisear"),
    PARAS("Paras"),
    PARASECT("Parasect"),
    PATRAT("Patrat"),
    WATCHOG("Watchog"),
    BISHARP("Bisharp"),
    PAWNIARD("Pawniard"),
    LILLIGANT("Lilligant"),
    PETILIL("Petilil"),
    DONPHAN("Donphan"),
    PHANPY("Phanpy"),
    PHANTUMP("Phantump"),
    TREVENANT("Trevenant"),
    PHIONE("Phione"),
    PIDGEOT("Pidgeot"),
    PIDGEOTTO("Pidgeotto"),
    PIDGEY("Pidgey"),
    PIDOVE("Pidove"),
    TRANQUILL("Tranquill"),
    UNFEZANT("Unfezant"),
    PICHU("Pichu"),
    PIKACHU("Pikachu"),
    RAICHU("Raichu"),
    FORRETRESS("Forretress"),
    PINECO("Pineco"),
    PINSIR("Pinsir"),
    EMPOLEON("Empoleon"),
    PIPLUP("Piplup"),
    PRINPLUP("Prinplup"),
    PLUSLE("Plusle"),
    POLITOED("Politoed"),
    POLIWAG("Poliwag"),
    POLIWHIRL("Poliwhirl"),
    POLIWRATH("Poliwrath"),
    PONYTA("Ponyta"),
    RAPIDASH("Rapidash"),
    MIGHTYENA("Mightyena"),
    POOCHYENA("Poochyena"),
    PORYGON("Porygon"),
    PORYGON_Z("Porygon-Z"),
    PORYGON2("Porygon2"),
    GOLDUCK("Golduck"),
    PSYDUCK("Psyduck"),
    GOURGEIST("Gourgeist"),
    GOURGEIST_LARGE("Gourgeist-Large"),
    GOURGEIST_SMALL("Gourgeist-Small"),
    GOURGEIST_SUPER("Gourgeist-Super"),
    PUMPKABOO("Pumpkaboo"),
    PUMPKABOO_LARGE("Pumpkaboo-Large"),
    PUMPKABOO_SMALL("Pumpkaboo-Small"),
    PUMPKABOO_SUPER("Pumpkaboo-Super"),
    LIEPARD("Liepard"),
    PURRLOIN("Purrloin"),
    QWILFISH("Qwilfish"),
    RAIKOU("Raikou"),
    GALLADE("Gallade"),
    GARDEVOIR("Gardevoir"),
    KIRLIA("Kirlia"),
    RALTS("Ralts"),
    RATICATE("Raticate"),
    RATTATA("Rattata"),
    RAYQUAZA("Rayquaza"),
    REGICE("Regice"),
    REGIGIGAS("Regigigas"),
    REGIROCK("Regirock"),
    REGISTEEL("Registeel"),
    RELICANTH("Relicanth"),
    OCTILLERY("Octillery"),
    REMORAID("Remoraid"),
    RESHIRAM("Reshiram"),
    RHYDON("Rhydon"),
    RHYHORN("Rhyhorn"),
    RHYPERIOR("Rhyperior"),
    LUCARIO("Lucario"),
    RIOLU("Riolu"),
    BOLDORE("Boldore"),
    GIGALITH("Gigalith"),
    ROGGENROLA("Roggenrola"),
    BUDEW("Budew"),
    ROSELIA("Roselia"),
    ROSERADE("Roserade"),
    ROTOM("Rotom"),
    ROTOM_FAN("Rotom-Fan"),
    ROTOM_FROST("Rotom-Frost"),
    ROTOM_HEAT("Rotom-Heat"),
    ROTOM_MOW("Rotom-Mow"),
    ROTOM_WASH("Rotom-Wash"),
    BRAVIARY("Braviary"),
    RUFFLET("Rufflet"),
    SABLEYE("Sableye"),
    KROKOROK("Krokorok"),
    KROOKODILE("Krookodile"),
    SANDILE("Sandile"),
    SANDSHREW("Sandshrew"),
    SANDSLASH("Sandslash"),
    SAWK("Sawk"),
    SCATTERBUG("Scatterbug"),
    SPEWPA("Spewpa"),
    VIVILLON("Vivillon"),
    SCRAFTY("Scrafty"),
    SCRAGGY("Scraggy"),
    SCIZOR("Scizor"),
    SCYTHER("Scyther"),
    NUZLEAF("Nuzleaf"),
    SEEDOT("Seedot"),
    SHIFTRY("Shiftry"),
    DEWGONG("Dewgong"),
    SEEL("Seel"),
    FURRET("Furret"),
    SENTRET("Sentret"),
    SEVIPER("Seviper"),
    LEAVANNY("Leavanny"),
    SEWADDLE("Sewaddle"),
    SWADLOON("Swadloon"),
    SHAYMIN("Shaymin"),
    SHAYMIN_SKY("Shaymin-Sky"),
    CLOYSTER("Cloyster"),
    SHELLDER("Shellder"),
    GASTRODON("Gastrodon"),
    SHELLOS("Shellos"),
    ACCELGOR("Accelgor"),
    SHELMET("Shelmet"),
    BASTIODON("Bastiodon"),
    SHIELDON("Shieldon"),
    LUXIO("Luxio"),
    LUXRAY("Luxray"),
    SHINX("Shinx"),
    BRELOOM("Breloom"),
    SHROOMISH("Shroomish"),
    SHUCKLE("Shuckle"),
    BANETTE("Banette"),
    SHUPPET("Shuppet"),
    SIGILYPH("Sigilyph"),
    SKARMORY("Skarmory"),
    GOGOAT("Gogoat"),
    SKIDDO("Skiddo"),
    DELCATTY("Delcatty"),
    SKITTY("Skitty"),
    DRAPION("Drapion"),
    SKORUPI("Skorupi"),
    DRAGALGE("Dragalge"),
    SKRELP("Skrelp"),
    SLAKING("Slaking"),
    SLAKOTH("Slakoth"),
    VIGOROTH("Vigoroth"),
    SLOWBRO("Slowbro"),
    SLOWKING("Slowking"),
    SLOWPOKE("Slowpoke"),
    MAGCARGO("Magcargo"),
    SLUGMA("Slugma"),
    SMEARGLE("Smeargle"),
    SNEASEL("Sneasel"),
    WEAVILE("Weavile"),
    SERPERIOR("Serperior"),
    SERVINE("Servine"),
    SNIVY("Snivy"),
    MUNCHLAX("Munchlax"),
    SNORLAX("Snorlax"),
    FROSLASS("Froslass"),
    GLALIE("Glalie"),
    SNORUNT("Snorunt"),
    ABOMASNOW("Abomasnow"),
    SNOVER("Snover"),
    GRANBULL("Granbull"),
    SNUBBULL("Snubbull"),
    DUOSION("Duosion"),
    REUNICLUS("Reuniclus"),
    SOLOSIS("Solosis"),
    SOLROCK("Solrock"),
    FEAROW("Fearow"),
    SPEAROW("Spearow"),
    SEALEO("Sealeo"),
    SPHEAL("Spheal"),
    WALREIN("Walrein"),
    ARIADOS("Ariados"),
    SPINARAK("Spinarak"),
    SPINDA("Spinda"),
    SPIRITOMB("Spiritomb"),
    GRUMPIG("Grumpig"),
    SPOINK("Spoink"),
    AROMATISSE("Aromatisse"),
    SPRITZEE("Spritzee"),
    BLASTOISE("Blastoise"),
    SQUIRTLE("Squirtle"),
    WARTORTLE("Wartortle"),
    STANTLER("Stantler"),
    STARAPTOR("Staraptor"),
    STARAVIA("Staravia"),
    STARLY("Starly"),
    STARMIE("Starmie"),
    STARYU("Staryu"),
    STUNFISK("Stunfisk"),
    SKUNTANK("Skuntank"),
    STUNKY("Stunky"),
    BONSLY("Bonsly"),
    SUDOWOODO("Sudowoodo"),
    SUICUNE("Suicune"),
    SUNFLORA("Sunflora"),
    SUNKERN("Sunkern"),
    MASQUERAIN("Masquerain"),
    SURSKIT("Surskit"),
    ALTARIA("Altaria"),
    SWABLU("Swablu"),
    MAMOSWINE("Mamoswine"),
    PILOSWINE("Piloswine"),
    SWINUB("Swinub"),
    SLURPUFF("Slurpuff"),
    SWIRLIX("Swirlix"),
    SWELLOW("Swellow"),
    TAILLOW("Taillow"),
    TANGELA("Tangela"),
    TANGROWTH("Tangrowth"),
    TAUROS("Tauros"),
    TEDDIURSA("Teddiursa"),
    URSARING("Ursaring"),
    TENTACOOL("Tentacool"),
    TENTACRUEL("Tentacruel"),
    EMBOAR("Emboar"),
    PIGNITE("Pignite"),
    TEPIG("Tepig"),
    TERRAKION("Terrakion"),
    THROH("Throh"),
    THUNDURUS("Thundurus"),
    THUNDURUS_THERIAN("Thundurus-Therian"),
    CONKELDURR("Conkeldurr"),
    GURDURR("Gurdurr"),
    TIMBURR("Timburr"),
    CARRACOSTA("Carracosta"),
    TIRTOUGA("Tirtouga"),
    TOGEKISS("Togekiss"),
    TOGEPI("Togepi"),
    TOGETIC("Togetic"),
    BLAZIKEN("Blaziken"),
    COMBUSKEN("Combusken"),
    TORCHIC("Torchic"),
    TORKOAL("Torkoal"),
    TORNADUS("Tornadus"),
    TORNADUS_THERIAN("Tornadus-Therian"),
    CROCONAW("Croconaw"),
    FERALIGATR("Feraligatr"),
    TOTODILE("Totodile"),
    FLYGON("Flygon"),
    TRAPINCH("Trapinch"),
    VIBRAVA("Vibrava"),
    GROVYLE("Grovyle"),
    SCEPTILE("Sceptile"),
    TREECKO("Treecko"),
    TROPIUS("Tropius"),
    GARBODOR("Garbodor"),
    TRUBBISH("Trubbish"),
    GROTLE("Grotle"),
    TORTERRA("Torterra"),
    TURTWIG("Turtwig"),
    PALPITOAD("Palpitoad"),
    SEISMITOAD("Seismitoad"),
    TYMPOLE("Tympole"),
    EELEKTRIK("Eelektrik"),
    EELEKTROSS("Eelektross"),
    TYNAMO("Tynamo"),
    TYRANTRUM("Tyrantrum"),
    TYRUNT("Tyrunt"),
    UNOWN("Unown"),
    UXIE("Uxie"),
    VANILLISH("Vanillish"),
    VANILLITE("Vanillite"),
    VANILLUXE("Vanilluxe"),
    SCOLIPEDE("Scolipede"),
    VENIPEDE("Venipede"),
    WHIRLIPEDE("Whirlipede"),
    VENOMOTH("Venomoth"),
    VENONAT("Venonat"),
    VICTINI("Victini"),
    VIRIZION("Virizion"),
    VOLBEAT("Volbeat"),
    VOLCANION("Volcanion"),
    ELECTRODE("Electrode"),
    VOLTORB("Voltorb"),
    MANDIBUZZ("Mandibuzz"),
    VULLABY("Vullaby"),
    NINETALES("Ninetales"),
    VULPIX("Vulpix"),
    WAILMER("Wailmer"),
    WAILORD("Wailord"),
    BEEDRILL("Beedrill"),
    KAKUNA("Kakuna"),
    WEEDLE("Weedle"),
    EXPLOUD("Exploud"),
    LOUDRED("Loudred"),
    WHISMUR("Whismur"),
    PELIPPER("Pelipper"),
    WINGULL("Wingull"),
    WOBBUFFET("Wobbuffet"),
    WYNAUT("Wynaut"),
    SWOOBAT("Swoobat"),
    WOOBAT("Woobat"),
    QUAGSIRE("Quagsire"),
    WOOPER("Wooper"),
    BEAUTIFLY("Beautifly"),
    CASCOON("Cascoon"),
    DUSTOX("Dustox"),
    SILCOON("Silcoon"),
    WURMPLE("Wurmple"),
    XERNEAS("Xerneas"),
    COFAGRIGUS("Cofagrigus"),
    YAMASK("Yamask"),
    YANMA("Yanma"),
    YANMEGA("Yanmega"),
    YVELTAL("Yveltal"),
    ZANGOOSE("Zangoose"),
    ZAPDOS("Zapdos"),
    ZEKROM("Zekrom"),
    LINOONE("Linoone"),
    ZIGZAGOON("Zigzagoon"),
    ZOROARK("Zoroark"),
    ZORUA("Zorua"),
    CROBAT("Crobat"),
    GOLBAT("Golbat"),
    ZUBAT("Zubat"),
    ZYGARDE("Zygarde"),
    ZYGARDE_10("Zygarde-10%"),
    ZYGARDE_COMPLETE("Zygarde-Complete"),
    ROWLET("Rowlet"),
    DARTRIX("Dartrix"),
    DECIDUEYE("Decidueye"),
    LITTEN("Litten"),
    TORRACAT("Torracat"),
    INCINEROAR("Incineroar"),
    POPPLIO("Popplio"),
    BRIONNE("Brionne"),
    PRIMARINA("Primarina"),
    PIKIPEK("Pikipek"),
    TRUMBEAK("Trumbeak"),
    TOUCANNON("Toucannon"),
    YUNGOOS("Yungoos"),
    GUMSHOOS("Gumshoos"),
    GRUBBIN("Grubbin"),
    CHARJABUG("Charjabug"),
    VIKAVOLT("Vikavolt"),
    CRABRAWLER("Crabrawler"),
    CRABOMINABLE("Crabominable"),
    ORICORIO_SENSU("Oricorio-Sensu"),
    ORICORIO("Oricorio"),
    ORICORIO_POM_POM("Oricorio-Pom-Pom"),
    ORICORIO_PAU("Oricorio-Pa'u"),
    CUTIEFLY("Cutiefly"),
    RIBOMBEE("Ribombee"),
    ROCKRUFF("Rockruff"),
    LYCANROC_MIDNIGHT("Lycanroc-Midnight"),
    LYCANROC("Lycanroc"),
    WISHIWASHI("Wishiwashi"),
    MAREANIE("Mareanie"),
    TOXAPEX("Toxapex"),
    MUDBRAY("Mudbray"),
    MUDSDALE("Mudsdale"),
    DEWPIDER("Dewpider"),
    ARAQUANID("Araquanid"),
    FOMANTIS("Fomantis"),
    LURANTIS("Lurantis"),
    MORELULL("Morelull"),
    SHIINOTIC("Shiinotic"),
    SALANDIT("Salandit"),
    SALAZZLE("Salazzle"),
    STUFFUL("Stufful"),
    BEWEAR("Bewear"),
    BOUNSWEET("Bounsweet"),
    STEENEE("Steenee"),
    TSAREENA("Tsareena"),
    COMFEY("Comfey"),
    ORANGURU("Oranguru"),
    PASSIMIAN("Passimian"),
    WIMPOD("Wimpod"),
    GOLISOPOD("Golisopod"),
    SANDYGAST("Sandygast"),
    PALOSSAND("Palossand"),
    PYUKUMUKU("Pyukumuku"),
    TYPE_NULL("Type: Null"),
    SILVALLY_PSYCHIC("Silvally-Psychic"),
    SILVALLY_ROCK("Silvally-Rock"),
    SILVALLY_STEEL("Silvally-Steel"),
    SILVALLY_WATER("Silvally-Water"),
    SILVALLY_FLYING("Silvally-Flying"),
    SILVALLY_FIRE("Silvally-Fire"),
    SILVALLY_FIGHTING("Silvally-Fighting"),
    SILVALLY_FAIRY("Silvally-Fairy"),
    SILVALLY_GHOST("Silvally-Ghost"),
    SILVALLY_GRASS("Silvally-Grass"),
    SILVALLY_GROUND("Silvally-Ground"),
    SILVALLY_ICE("Silvally-Ice"),
    SILVALLY_POISON("Silvally-Poison"),
    SILVALLY_ELECTRIC("Silvally-Electric"),
    SILVALLY("Silvally"),
    SILVALLY_BUG("Silvally-Bug"),
    SILVALLY_DARK("Silvally-Dark"),
    SILVALLY_DRAGON("Silvally-Dragon"),
    MINIOR("Minior"),
    KOMALA("Komala"),
    TURTONATOR("Turtonator"),
    TOGEDEMARU("Togedemaru"),
    MIMIKYU("Mimikyu"),
    BRUXISH("Bruxish"),
    DRAMPA("Drampa"),
    DHELMISE("Dhelmise"),
    JANGMO_O("Jangmo-o"),
    HAKAMO_O("Hakamo-o"),
    KOMMO_O("Kommo-o"),
    TAPU_KOKO("Tapu Koko"),
    TAPU_LELE("Tapu Lele"),
    TAPU_BULU("Tapu Bulu"),
    TAPU_FINI("Tapu Fini"),
    COSMOG("Cosmog"),
    COSMOEM("Cosmoem"),
    SOLGALEO("Solgaleo"),
    LUNALA("Lunala"),
    NIHILEGO("Nihilego"),
    BUZZWOLE("Buzzwole"),
    PHEROMOSA("Pheromosa"),
    XURKITREE("Xurkitree"),
    CELESTEELA("Celesteela"),
    KARTANA("Kartana"),
    GUZZLORD("Guzzlord"),
    NECROZMA("Necrozma"),
    MAGEARNA("Magearna"),
    MARSHADOW("Marshadow"),
    RATTATA_ALOLA("Rattata-Alola"),
    RATICATE_ALOLA("Raticate-Alola"),
    RAICHU_ALOLA("Raichu-Alola"),
    SANDSHREW_ALOLA("Sandshrew-Alola"),
    SANDSLASH_ALOLA("Sandslash-Alola"),
    VULPIX_ALOLA("Vulpix-Alola"),
    NINETALES_ALOLA("Ninetales-Alola"),
    DIGLETT_ALOLA("Diglett-Alola"),
    DUGTRIO_ALOLA("Dugtrio-Alola"),
    MEOWTH_ALOLA("Meowth-Alola"),
    PERSIAN_ALOLA("Persian-Alola"),
    GEODUDE_ALOLA("Geodude-Alola"),
    GRAVELER_ALOLA("Graveler-Alola"),
    GOLEM_ALOLA("Golem-Alola"),
    GRIMER_ALOLA("Grimer-Alola"),
    MUK_ALOLA("Muk-Alola"),
    EXEGGUTOR_ALOLA("Exeggutor-Alola"),
    MAROWAK_ALOLA("Marowak-Alola");

    static {
        JSONArray pokemons = null;
        try {
            pokemons = PokemonData.getPokemons();
        } catch (IOException e) {
            Bot.LOGGER.error("Error parsing pokemons", e);
            System.exit(1);
        }

        for (int i = 0; i < pokemons.length(); i++) {
            JSONObject jsonPokemon = pokemons.getJSONObject(i);
            String name = jsonPokemon.getString("name");
            Species pokemon = Species.getPokemon(name);

            JSONObject alts = jsonPokemon.getJSONArray("alts").getJSONObject(0);
            int hp = alts.getInt("hp");
            int attack = alts.getInt("atk");
            int defense = alts.getInt("def");
            int specialAttack = alts.getInt("spa");
            int specialDefense = alts.getInt("spd");
            int speed = alts.getInt("spe");
            double weight = alts.getDouble("weight");
            double height = alts.getDouble("height");

            pokemon
                    .addStats(Stat.HP, hp)
                    .addStats(Stat.ATTACK, attack)
                    .addStats(Stat.DEFENSE, defense)
                    .addStats(Stat.SPECIAL_ATTACK, specialAttack)
                    .addStats(Stat.SPECIAL_DEFENSE, specialDefense)
                    .addStats(Stat.SPEED, speed)
                    .setWeight(weight)
                    .setHeight(height);

            JSONArray jsonGenerations = jsonPokemon.getJSONArray("genfamily");
            for (int j = 0; j < jsonGenerations.length(); j++) {
                Generation generation = Generation.getGeneration(jsonGenerations.getString(j));
                pokemon.addGenerations(generation);
            }

            JSONArray jsonAbilities = alts.getJSONArray("abilities");
            for (int j = 0; j < jsonAbilities.length(); j++) {
                Ability ability = Ability.getAbility(jsonAbilities.getString(j));
                pokemon.addAbilities(ability);
            }

            JSONArray jsonTypes = alts.getJSONArray("types");
            for (int j = 0; j < jsonTypes.length(); j++) {
                Type type = Type.getType(jsonTypes.getString(j));
                pokemon.addTypes(type);
            }

            JSONArray jsonTiers = alts.getJSONArray("formats");
            for (int j = 0; j < jsonTiers.length(); j++) {
                Tier tier = Tier.getTier(jsonTiers.getString(j));
                pokemon.addTiers(tier);
            }

            JSONArray jsonEvolutions = jsonPokemon.getJSONArray("evos");
            for (int j = 0; j < jsonEvolutions.length(); j++) {
                Species evolution = Species.getPokemon(jsonEvolutions.getString(j));
                pokemon.addEvolutions(evolution);
            }
        }
    }

    private final String NAME;
    private final List<Generation> GENERATIONS = new ArrayList<>();
    private final List<Ability> ABILITIES = new ArrayList<>();
    private final List<Type> TYPES = new ArrayList<>();
    private final List<Tier> TIERS = new ArrayList<>();
    private final Map<Stat, Integer> STATS = new HashMap<>();
    private final List<Species> EVOLUTIONS = new ArrayList<>();
    private Double WEIGHT = null;
    private Double HEIGHT = null;
    private String SUFFIX = null;

    Species(@Nonnull String name) {
        Holder.MAP.put(name.toLowerCase(), this);
        this.NAME = name;
    }

    public static Species getPokemon(@Nonnull String pokemon) {
        pokemon = pokemon.toLowerCase();
        if (!Holder.MAP.containsKey(pokemon)) {
            throw new NullPointerException("Pokemon " + pokemon + " doesn't exist");
        }

        return Holder.MAP.get(pokemon);
    }

    public static boolean isArceus(@Nonnull Pokemon pokemon) {
        return pokemon.getName().contains("Arceus");
    }

    public static boolean isSilvally(@Nonnull Pokemon pokemon) {
        return pokemon.getName().contains("Silvally");
    }

    public String getName() {
        return this.NAME;
    }

    public List<Generation> getGenerations() {
        return this.GENERATIONS;
    }

    private Species addGenerations(Generation... generations) {
        Collections.addAll(this.GENERATIONS, generations);
        return this;
    }

    private Species setGenerations(Generation... generations) {
        this.GENERATIONS.clear();
        return this.addGenerations(generations);
    }

    public List<Ability> getAbilities() {
        return this.ABILITIES;
    }

    private Species addAbilities(Ability... abilities) {
        Collections.addAll(this.ABILITIES, abilities);
        return this;
    }

    private Species setAbilities(Ability... abilities) {
        this.ABILITIES.clear();
        return this.addAbilities(abilities);
    }

    public List<Type> getTypes() {
        return this.TYPES;
    }

    private Species addTypes(Type... types) {
        Collections.addAll(this.TYPES, types);
        return this;
    }

    private Species setTypes(Type... types) {
        this.TYPES.clear();
        return this;
    }

    public List<Tier> getTiers() {
        return this.TIERS;
    }

    private Species addTiers(Tier... tiers) {
        Collections.addAll(this.TIERS, tiers);
        return this;
    }

    private Species setTiers(Tier... tiers) {
        this.TIERS.clear();
        return this;
    }

    public Map<Stat, Integer> getStats() {
        return this.STATS;
    }

    private Species addStats(Pair<Stat, Integer>... stats) {
        for (Pair<Stat, Integer> stat : stats) {
            this.STATS.put(stat.getKey(), stat.getValue());
        }
        return this;
    }

    private Species addStats(Stat stat, int amount) {
        this.STATS.put(stat, amount);
        return this;
    }

    private Species setStats(Pair<Stat, Integer>... stats) {
        this.STATS.clear();
        return this.addStats(stats);
    }

    public List<Species> getEvolutions() {
        return this.EVOLUTIONS;
    }

    private Species addEvolutions(Species... evolutions) {
        Collections.addAll(this.EVOLUTIONS, evolutions);
        return this;
    }

    private Species setEvolutions(Species... evolutions) {
        this.EVOLUTIONS.clear();
        return this.addEvolutions(evolutions);
    }

    public Double getWeight() {
        return this.WEIGHT;
    }

    private Species setWeight(double weight) {
        this.WEIGHT = weight;
        return this;
    }

    public Double getHeight() {
        return this.HEIGHT;
    }

    private Species setHeight(double height) {
        this.HEIGHT = HEIGHT;
        return this;
    }

    public String getSuffix() {
        return this.SUFFIX;
    }

    private void setSuffix(String suffix) {
        this.SUFFIX = suffix;
    }

    private static class Holder {
        static Map<String, Species> MAP = new HashMap<>();
    }

}