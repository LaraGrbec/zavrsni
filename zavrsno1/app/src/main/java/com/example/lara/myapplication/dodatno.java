package com.example.lara.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lara on 13.9.2016..
 */
public class dodatno extends AppCompatActivity  {

    @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.dodatne_opcije);


    Button nicanje=(Button)findViewById(R.id.btnNicanje);
    Button problem=(Button)findViewById(R.id.btnProblemi);
    Button preven=(Button)findViewById(R.id.btnPrevencija);
    Button strucnjak=(Button)findViewById(R.id.btnStrucnjak);
}
    public  void OCproblemi (View view){
        List<String> naslovi = new ArrayList<>();
        List<String> podnaslovi = new ArrayList<>();
        naslovi.add("ECC");
        podnaslovi.add("Ovaj oblik karijesa zahvaća djecu između 0-3. godine. Počinje se razvijati već između 6. i 8. mjeseca i jedan je od razloga " +
                "važnosti rane posjete stomatologa unutar godine dana.\n" +
                "Pojavljuje se zbog toga što je bakterija Streptococcus Mutans vrlo rano naselila usnu šupljinu djeteta i uzrokovala nastajanje karijesa. \n" +
                "Razvoj ovog oblika karijesa povezan je sa lošom oralnom higijenom djeteta i 1.Lošom navikom uspavljivanja bočicom mlijeka ili sokova " +
                "koji sadrže šećer, 2.Majčinom navikom isprobavanja hrane djetetovom žličicom jer dijete nema jednake bakterije u ustima kao majka, " +
                "ali se na ovaj način prenose\n" +
                "Rani dječji karijes započinje najčešće na gornjim prednjim zubima. U početku je vidljiv kao bijela mrlja koja se širi na vrat zuba, " +
                "a to je mjesto spoja zuba i zubnog mesa. U toj fazi ga može prepoznati doktor dentalne medicine! Zato je važan rani prvi posjet. " +
                "Kako napreduje, polako se počinju stvarati udubljenja i karijes razara zube, ponekad do te mjere da ostaje samo korijen zuba crne" +
                " boje.\n" +
                "Razoreni zubi onemogućuje normalnu djetetovu prehranu i probavu, javljaju se bolovi i neugodan zadah iz usta, a utječu i na " +
                "zdravlje zametaka trajnih zubi.\n" +
                "Trajni prednji zubi počinju rasti oko 7. godine i do tada bi mliječni trebali biti u ustima. Rani gubitak mliječnih zuba dovodi " +
                "do nepravilnog položaja mladih trajnih zuba. Dijete također otežano govori slova kao što su V,Z,R i S. \n" +
                "Pravilnom oralnom higijenom od nicanja prvog zuba sprječavamo razvoj ranog dječjeg karijesa. \n");
        naslovi.add("Kandidijaza");
        podnaslovi.add("Gljivica Candida albicans normalno se nalazi u usnoj šupljini. Kada dođe do promjene oralne okoline i pada imuniteta ona " +
                "napada sluznicu i uzrokuje kandidijazu. Kandidijaza može zahvatiti sve uzraste pa čak i novorodenčad.\n" +
                "Mlječac ili soor je najuobičajenija gljivična infekcija novorođenčadi i djece s kroničnim bolestima . Zove se mlječac jer izgleda " +
                "poput nakupina mlijeka u usnoj šupljini. \n" +
                "U ustima bebe možete primijetiti takve promjene na jeziku, obrazu i u kutovima usana. One se mogu ukloniti ostavljajući ispod sebe " +
                "crvenkastu površinu. Osim simptoma u ustima dijete je razdražljivo,nemirno i slabijeg apetita. To je zbog toga što promjene u usnoj" +
                " šupljini uzrokuju nelagodu prilikom hranjenja.\n" +
                "Kandidijaza često zahvati i majku i dijete. Prilikom dojenja na bradavicama i koži oko bradavica nastanu sitne pukotine putem kojih " +
                "kandida iz usne šupljine bebe prelazi u majčinu dojku.\n" +
                "Majka između podoja ili za vrijeme podoja osjeti propadanja u dojci poput iglica te intenzivnu i pekuću bol.\n" +
                "Liječenje je vrlo jednostavno. Gel ili kapi koje koriste se 4-8 puta dnevno (otprilike nakon svakog podoja) tijekom 10-14 dana. " +
                "Nakon 24-48 sati primjeti se poboljšanje, ali treba nastaviti koristiti lijek kako se kandida ne bi vratila.\n" +
                "Nakon podoja se blago toplom gazom uklone ostaci mlijeka sa djetetove sluznice i primjeni se lijek. Isto tako sa bradavice i kože " +
                "oko bradavice te slijedi primjena gel. Dijete i majka se moraju liječiti zajedno kako se kandida ne bi ponovno pojavila.\n");
        naslovi.add("Rekurentne aftozne ulceracija");
        podnaslovi.add("Rekurentne aftozne ulceracije afte su koje se ponavljano pojavljuju u usnoj šupljnini djeteta. To su najuobičajnije oralne " +
                "promjene kod djece i smatra se da su povezane s imunološkim sustavom. Najčešće ih se može primjetiti na jeziku ili sluznici unutarnje " +
                "strane usne. Ovalne su ili okrugle promjene, ograničene od okolne sluznice i mogu se pojaviti samostalno ili u većem broju. Prvo je " +
                "vidljiva mala bijela promjena na mjestu koje postupno nastaje oštećenje odnosno ulkus. Središnji dio prekriven je žuto-sivom krastom, " +
                "a rubovi su odignuti i crveni. Veličine su 0,2-1mm. Za djecu, ulkusi su izrazito bolni pa dijete može odbijati jelo. Liječenje ulkusa " +
                "može se vršiti na nekoliko načina. Ako je dijete veće, koristi se antiseptička vodica za ispiranje usta ili se koriste antiseptički " +
                "gelovi i otopine kojima se lezije premažu i tako se olakša djetetu bol. \n" +
                "Osim rekurentnih aftoznih ulceracija postoji jos jedan tip afti koje su česte, a pojavljuju se kod dojenčadi. Te afte zovu se Bednarove " +
                "afte i javljaju se zbog ozljeda oralne sluznice djeteta prilikom dojenja ili nepažljivog i grubljeg održavanja oralne higijene usta novorođenčeta. " +
                "Javljaju se na donjoj strani jezika u projekciji donjih sjekutića jer dijete prilikom dojenja pritišće donjojm površinom jezika na iznikle donje " +
                "sjekutiće i tako mehanički iritira to područje što dovodi do nastanka afte. Ona je također bolna pa dijete može odbijati hranu.\n");
        naslovi.add("Sisanje prsta");
        podnaslovi.add("Prema ADA (American Dental Association) djeca imaju prirodni nagon sisanja prsta. Sisanje prsta ponekad započinje već u maternici  " +
                "i najčešće prestaje između 2. i 4. godine. Kod novorođenčadi pokret sisanja prsta dolazi prirodno kad je dijete gladno pa može biti jedan " +
                "od znakova da je vrijeme za dojenje ili hranjenje na bočicu ukoliko roditelj ne doji dijete.\n" +
                "Sisanje prsta može se primjetiti i kada je dijete okruženo ljudima koje ne poznaje jer mu daje osjećaj sigurnosti i umiruje ga. To je " +
                "jedan od načina na koji se dijete samo smiruje  kada se rastuži, a osim toga ta navika mu pomaže da lakše zaspi. Posebno je intenzivno " +
                "u periodu odvajanja od roditelja, na prmjer pri polasku u jaslice ili vrtić. Najveća briga roditeljima je da sisanje prsta može ostaviti " +
                "posljedice na oralno zdravlje i položaj zuba njihovog djeteta . Ova navika je potpuno bezopasna i neće izazvati probleme sve dok djetetu " +
                "ne krenu nicati trajni zubi. \n" +
                "Postoji nekoliko načina pomoću kojih dijete može lakše odbaciti naviku. Umjesto da ga roditelj grdi kada siše prst treba ga pohvaliti i " +
                "nagraditi kada ne sise prst. Ako se sisanje prsta javlja zbog nesigurosti roditelj može pokušati ukloniti ili ublažiti uzrok djetetove " +
                "nesigurnosti i pružiti mu utjehu svojom prisutnosti i odvlačenjem pažnje, na primjer igranjem. Stariju djecu koja još uvijek nisu " +
                "odbacila naviku roditelj treba prepustiti doktoru dentalne medicine. Doktor mu može pokazati slike i objasniti što će se dogoditi sa " +
                "djetetovim zubima ukoliko ne prestane sisati prst. Bojanje, crtanje, igranje s plastelinom ili glinamolom okupirat će djetetove ruke " +
                "tijekom dana i onemogućiti mu sisanje prsta.\n" +
                "Sisanje prsta je navika koja se smatra zdravom kod novorođenčadi, dojančadi pa čak i djece predškolske dobi i predstavlja mehanizam " +
                "koji je dio normalnog razvoja djeteta. Strpljenjem, razumijevanjem i savjetima doktora dentalne medicine roditelj pomaže djetetu da " +
                "odbaci naviku do rasta prvih trajnih zuba. \n");
        naslovi.add("Traume zuba");
        podnaslovi.add(" Trauma zuba zahvaća oko 30 % djece. Nije svaka trauma jednako teška, ali svaka zahtjeva pregled i procjenu doktora dentalne " +
                "medicine. Najveći broj trauma zuba nastaje kod kuće, u školi ili na sportskim treninzima. Roditelji, učitelji i treneri su prve osobe" +
                " koje mogu pomoći ozlijeđenom djetetu. Potrebno im je određeno znanje o ispravnom postupanju. Ozljede mliječnih zuba najčešće su u dobi" +
                " između 2. i 4. godine i najčešće se događaju kod kuće. Ozljede trajnih zuba najčešće su između 7. i 10. godine i to u školi ili na " +
                "sportskim treninzima. Nešto su češće kod dječaka jer se oni više bave sportskim aktivnostima. Zubi koji su najviše pogođeni ozljedama " +
                "su gornji sjekutići jer su najmanje zaštićeni.\n" +
                "Svaka ozljeda zuba je bolna za dijete. Osim ozljede zuba često dođe i do ozljeda okolnog tkiva kao na primjer usnice. Dijete treba što " +
                "više pokušati smiriti i pritisnuti na mjesto krvarenja ako postoji. Ako se odlomio dio zuba treba ga pokušati pronaći, ako je zub " +
                "pomičan i pomakao se iz svoga normalnog položaja ne treba ga dirati i pokušavati namjestiti već je potrebno odvesti dijete najbližem" +
                " stomatologu. Ako je udarac i pad bio toliko jak da je zub potpuno potrebno ga je pronaći i isprati mlazom hladne vode. Zatim ga je " +
                "potrebno staviti u hladno mlijeko,slinu ili fiziološku otopinu te odnijeti doktoru dentalne medicine. Osim mlijeka, danas u ljekarnama" +
                " postoje specijalne otopine kao što su DentoSafe i Save-a-tooth koje služe za čuvanje izbijenog zuba ili dijela zuba čak 24 sata. " +
                "Isti je postupak čuvanja i prijenosa ako se odlomio komad krune zuba.\n" +
                "Prilikom sportskih treninga mogu pomoći štitnici za zube koje će stomatolog jednostavno izraditi. Ako ozljeda ipak nastane treba djelovati " +
                "što brže kako bi nastalo što manje nepoželjnih štetnih posljedica koje ostavljaju estetske, funkcijske i psihološke posljedice na dijete.\n");
        naslovi.add("Kratak jezični nabor");
        podnaslovi.add("Kratki jezični nabor stvara poteškoće od najranije dobi. Problemi se javljaju već kod dojenčadi kojima je zbog kratkog nabora problem " +
                "dojenje i hranjenje. Refleks povraćanja je još jedna posljedica kratkog nabora koja se javlja kada djeca počinju jesti krutu hranu te zbog " +
                "anomalije nisu u mogućnosti jezikom odstraniti hranu sa nepca. Osim toga djeca imaju problema s govorom. Često ne mogu izgovoriti neka slova " +
                "ili ih nepravilno izgovaraju. Zbog toga je potrebno ovaj problem što prije prepoznati i primjeniti odgovarajuću terapiju, odnosno osloboditi" +
                " jezični nabor.\n" +
                "Bez obzira je li pacijent novorođenče ili adolescent terapija je  jednostavna i radi se vrlo često. Djeca i roditelji dobijaju upute o " +
                "vježbama koje dijete svakodnevno radi. \n");
        Intent intenti=new Intent(this,listasvega.class);
        intenti.putExtra("naslovi",(Serializable) naslovi);
        intenti.putExtra("podnaslovi",(Serializable) podnaslovi);
        startActivity(intenti);
    }

    public void nicanjezuba (View view){
        List<String> naslovi = new ArrayList<>();
        List<String> podnaslovi = new ArrayList<>();
        naslovi.add("Redoslijed nicanja");
        podnaslovi.add("Redoslijed nicanja mliječnih zubi u velikom broju slučajeva točno je određen. Postoje situacije u kojima djetetu" +
                "zub izraste neuobičajenim redom, prije ili poslije, no ni u tom trenutku roditelj se ne treba brinuti već se može posavjetovati"+
                " s liječnikom dentalne medicine. Mliječni zubi rastu u određenim intervalima:\n"+
                "\t1\t2\t3\t4\t5\n" +
                "Gornji\t7-8 mj\t8-10mj\t18-20mj\t14-18mj\t24-30mj\n" +
                "Donji\t6 mj\t7mj\t16-20mj\t12-16mj\t20-30mj\n");
        naslovi.add("Prerano nicanje");
        podnaslovi.add("Zubi koji su prisutni pri rođenju zovu se natalni zubi. U 90% slučajeva to su donji središnji sjekutići." +
                " Smatraju se predmlijecnim zubima jer se na rendgenogramu mogu vidjeti i mliječni zubi na svom uobičajenom mjestu." +
                " Osim natalnih postoje i neonatalni zubi. To su mliječni zubi koji su se pojavili u ustima u prvih 30 dana života i također" +
                " su to najčešće donji sjekutići. Natalni zubi javljaju se češće nego neonatalni i to u omjeru 3:1 te nema razlike u pojavi s obzirom na spol." +
                "Takvi prerano iznikli zubi se ne vade, osim u slučaju kada su jako pomični jer ih beba može progutati ili mogu skliznuti u dišni put" +
                " pa postoji opasnost od gušenja." +
                "Bebama kojima su ranije iznikli mliječni zubi, najčešće ranije niknu i trajni.");
        naslovi.add("Zakašnjelo nicanje");
        podnaslovi.add("Zakašnjelim nicanjem se smatra ako zub kasni 6 mjeseci od očekivanog vremena rasta. Na primjer, prvi zub koji niče je donji " +
                "središnji sjekutić i niče otprilike u 6. mjesecu djetetova života, ali normalnim se smatra nicanje prvog zuba sve do prve godine " +
                "djetetova života. Ako ne nikne nakon što dijete navrši godinu dana, takvo nicanje smatramo zakašnjelim. Doktor dentalne medicine " +
                "roditeljima treba objasniti da iako njihovom djetetu zubi niču kasnije od očekivanog to ne predstavlja razlog za brigu. ");
        naslovi.add("Simptomi i prva pomoć");
        podnaslovi.add("Nicanje zuba je period u životu svake bebe koji nije ugodan i lagan za bebu niti za roditelje.  Prvi simptomi mogu se pojaviti " +
                "i do dva mjeseca prije nicanja prvog zubićaUpravo su roditelji ti koji djetetu pružaju prvu pomoć i olakšavaju ovo razdoblje pa je zato " +
                "važno poznavati simptome i kako ih ublažiti. Bebe najteže podnose nicanje prvih zubića jer je je to za njih novo, ali i nicanje kutnjaka " +
                "zbog veličine zuba. Bebi ne treba puno da shvati kako joj igračke i njene ručice olakšavaju bol. Zbog toga stavlja u usta sve što joj je " +
                "nadohvat. Roditelj svojim prstom ili vlažnom gazom može pomoći bebi masirajući desni. Kamilica pomaže i smiruje upalu i iritaciju pa se " +
                "predlaže nanošenje higijenskim štapićem. Primjetno je da beba teže zaspi tijekom dana, a preko noći se budi češće . Razdražljiva je i " +
                "nervozna, a igračke i metode koje su prije uspjele smiriti bebu sada više i nisu ako uspješne. U ljekarnama se mogu kupiti gelovi koji " +
                "se prstom nanose na zubno meso i olakšavaju simptome. Potrbno se pridržavati propisane količine. \n" +
                "Postoje i posebno dizajnirane igračke koje olakšavaju simptome zbog laganog pritiska na zubno meso koji beba stvara žvakanjem. Posebno " +
                "su učinkovite igračke ispunjene gelom koje se ohlade i takve ohlađene daju bebi. Gubitak apetita i odbijanje hrane također je jedan od " +
                "problema s kojim ćete se susresti jer hranjenje izaziva iritaciju desni i nelagodno je Vašoj bebi. \n" +
                "Ono što vas možda može zbuniti je to da beba češće traži dojenje, a onda brzo odustaje uz plač i negodovanje. To je zbog toga što je " +
                "gladna, ali hranjenje izaziva bol i nelagodu dok s druge strane dojenje omogućuje kontakt s majkom koji je bebi potreban i pruža joj " +
                "sigurnost te ju smiruje. Budite strpljivi i nemojte odustajati. Dojenje će trajati duže i biti isprekidano, ali je potrebno kako, zbog " +
                "hranjenja tako i zbog osjećaja blizine majke.  \n" +
                "Topla kupka je još jedan vrlo jednostavan način koji opušta dijete i umiruje ga. Pobrinite se da dijete svaku večer prije spavanja okupate " +
                "kako bi lakše i mirnije zaspalo. Tijekom dana, ali i noći beba će tražiti da ju nosite. Vrlo često će ju to smiriti i zaspat će na Vašim " +
                "rukama, a probuditi se čim ju krenete spustiti u krevetić. Iako su mnogi oko Vas protiv toga da dijete \" naučite na ruke\" dijete do" +
                " godine dana treba fizički kontakt jer ju Vaš miris, toplina i ljuljanje smiruje i daje joj sigurnost. Kratak je period u životu bebe " +
                "kada ona nošenje na rukama stvarno treba.\n" +
                "Na koži brade može se pojaviti osip koji je povezan sa pojačanim lučenjem sline koja se zadržava na bradi. Pokušajte obrisati slinu što " +
                "je češće moguće, a ako se osip ipak pojavio namažite to područje kremom od badema, melemom ili nekom drugom dječjom kremom.\n" +
                "Postoje simptomi koji se mogu pojaviti pri nicanju zuba, ali i pri nekim ozbiljnijim stanjima koja zahtjevaju posjet pedijatru. " +
                "Bol prilikom nicanja može se širiti prema uhu i obrazu i možete primjetiti da dijete povlači ručicama uho i trlja obraze. \n" +
                "Ako su ti simptomi praćeni visokom temperaturom i jakim plačem djeteta tada postoji mogućnost da se radi o upali uha jer je to " +
                "izrazito bolno. U tom slučaju posjetite pedijatra. Drugi primjer je osip u pelenskom području koji se može pojaviti kao simptom " +
                "nicanja zuba zbog pojačanog stvaranja i gutanja sline, što uzrokuje pojavu učestalih rijetkih stolica kod djeteta. U ovom periodu, " +
                "teškom za svako dijete, potrebno je da roditelj ima puno strpljenja, da od prvog izraslog zuba održava oralnu higijenu na pravi " +
                "način i da odabere stomatologa te na taj način djetetu osigura najbolju skrb i omogući put do lijepog osmjeha.\n");
        Intent intenti=new Intent(this,listasvega.class);
        intenti.putExtra("naslovi",(Serializable) naslovi);
        intenti.putExtra("podnaslovi",(Serializable) podnaslovi);
        startActivity(intenti);
    }
    public void prevencija (View view){
        List<String> naslovi = new ArrayList<>();
        List<String> podnaslovi = new ArrayList<>();
        naslovi.add("Rani posjet stomatologu");
        podnaslovi.add(" Iako se mnogim roditeljima čini rano, posjet doktoru dentalne medicine unutar jedne godine starosti ima veliku važnost i ulogu u " +
                "kasnijem oralnom zdravlju Vašeg djeteta. Za vrijeme prvog dogovorenog posjeta doktor dentalne medicine, odnosno pedodont, izdvojit će " +
                "dovoljno vremena roditelje i njihovu djecu kako bi im dao savjete o održavanju oralne higijene i sprječio rani dolazak nastanka karijesa.\n" +
                "Prije svega, potrebno je pronaći doktora u kojeg roditelj ima povjerenje. To je vrlo važno jer se dijete uz svoje roditelje od samog " +
                "rođenja osjeća zaštićeno, osjeti promjene raspoloženja kod roditelja te je zato važno da odlaza stomatologu bude ugodan za roditelje " +
                "jer beba to osjeti. Osim što doktor zna što mora reći svom pacijentu i u što ga mora uputiti, prije odlaska stomatologu poželjno je " +
                "da se roditelj sam pripremi i pita ono što želi, sve ono što ga brine ili zanima. Kako bi se obavio kvalitetan razgovor s doktorom" +
                " bilo bi najbolje da u ordinaciji budu prisutne dvije odrasle osobe, što ne mora nužno biti drugi roditelj. Na taj način omogućuje " +
                "se da razgovor bude otvoreniji, opušteniji i postoji veća mogućnosta da će se saznati više informacija. Prilikom dogovora o vremenu " +
                "prvog pregleda pedodont uzima u obzir vrijeme kada se beba budi, kada jede i kada ide spavati te se tome prilagođava. Prilikom " +
                "dolaska na pregled roditelj i beba ne čekaju u čekaonici,vrijeme čekanja može biti do 5 minuta samo kako bi se beba privikla na" +
                " novi prostor, ali ne dulje od toga.Nakon razgovora i uputa u oralnu higijenu slijedi pregled. \n" +
                "Prvi pregled ne mora nužno biti objavljen odmah. To ovisi o djetetovu raspoloženju i doktor procjenjuje situaciju zajedno s " +
                "roditeljima. Prvi pregled obavlja se tako da doktor i roditelj sjede jedan nasuprot drugom dok je dijete u krilu roditelja " +
                "licem okrenutim prema njemu. Zatim se dijete postavi u ležeći položaj tako da je glava u doktorovom krilu, što omogućuje i" +
                " roditelju da vidi djetetovu usnu šupljnu i zube.\n" +
                "Pregled se obavlja kao na slikama: doktor i roditelj sjednu na stolicu jedan nasuprot drugom. \n" +
                "Nakon obavljenog pregleda i upoznavanja uz trud dentalnog tima dijete bi trebalo imati ugodno iskustvo, a prvi pregled " +
                "treba biti početak razvoja odnosa između doktora, roditelja i djeteta te stvaranje malog pacijenta koji savršeno surađuje" +
                " sa svojim pedodontom. \n");
        naslovi.add("Zašto se mliječni zubi popravljaju?");
        podnaslovi.add("Mliječni zubi imaju svog nasljednika, odnosno na njihovo mjesto u određenom trenutku djetetova života niče trajni zub. " +
                "Mliječni zubi \"čuvaju\" mjesto trajnim zubima. Ako je mliječni zub prerano izgubljen, ostaje praznina u čeljusti. Zubi koji " +
                "su preostali počinju se približavati jedan drugome i zatvaraju prazan prostor. Međusobnim približavanjem mliječnih, zatvara se " +
                "prostor u koji je trebao niknuti neki trajni zub i u trenutku njegovog nicanja on pronađe novi put, novi prostor i položaj u " +
                "koji će niknuti, ali je taj položaj za njega nepravilan. To više nije njegovo prirodno mjesto nicanja i tada nastaju problemi " +
                "za dijete. Ono što roditelji možda najprije primjete je problem estetike jer su nastale ortodontske anomalije: zubi su postavljeni " +
                "nepravilno, rotirani su ili se međusobno preklapaju. Nepravilnim položajem zuba djetetu je otežano žvakanje hrane, a sile koje se" +
                " stvaraju pri žvakanju se nepravilno prenose na čeljusti i čeljusne zglobove što kasnije dovodi do bolova u zglobovima.\n" +
                "Zamjena mliječnih zuba trajnima započinje tek oko 7. godine djetetova života,a cijelo to vrijeme, dok se ne izmijene svi zubi, " +
                "mliječni zubi omogućuju djetetu žvakanje i govor. Zbog toga mliječne zube treba čuvati, a brigom o mliječnim zubima djeca stječu" +
                " dobru podlogu za pravilno održavanje higijena tijekom cijeloga života.\n");
        naslovi.add("Prehrana");
        podnaslovi.add("Povezanost prehrambenih navika i razvoja karijesa dokazana je u mnogim istraživanjima. Kisela hrana, slatkiši i sokovi " +
                "jesu potencijalni uzročnici karijesa. Međutim, to ne znači da djeca ne smiju jesti slatkiše, nego je važno održavati oralnu " +
                "higijenu i pranjem zuba odstraniti ostatke hrane koji mogu uzrokovati karijes. Djeca koja tijekom dana češće konzumiraju " +
                "slatkiše i imaju više međuobroka imaju veću mogućnost nastanka karijesa pa je u tom slučaju potrebno prati zube više puta " +
                "dnevno. Iako postoje smjernice koje preporučuju ograničavanje obroka djeci na tri glavna i dva međuobroka, te ograničavanje " +
                "slatke hrane na jednom tjedno, dobrom oralnom higijenom možete svome djetetu pružiti zdrav osmijeh bez uskraćivanja obroka " +
                "koji sadrže slatkiše i sokove. ");
        naslovi.add("Oralna higijena");
        podnaslovi.add("Mliječni zubi djeteta počinju se razvijati već u 6. tjednu trudnoće. Majka brigom o sebi, prehrani, svom zdravlju i oralnoj " +
                "higijeni može utjecati na oralno zdravlje djeteta. Održavanje oralne higijene započinje puno prije nicanja prvog zuba. Dva puta dnevno" +
                " djetetu je potrebno očistiti sluznicu usta komadićem gaze namočene u topu vodu . Posebno je važno to učiniti prije spavanja. " +
                "Kada nikne prvi zub vrijeme je za prvu četkicu. Dječje četkice trebaju biti mekane i imati malu glavu. Na njima najčešće piše " +
                "SOFT i da su namijenjene za djecu od 0 do 2 godine. Mogu biti u raznim bojama i oblicima kako bi dijete pranje zuba shvatilo kao " +
                "igru. Igračke koje olakšavaju nelagodu pri nicanju također čiste sluznicu i zube te pomažu u održavanju oralne higijene.\n" +
                "Dječju četkicu mijenjamo češće, jer se vlakna na četkici brže oštećuju i potrebno ju je zamijeniti kada roditelj primjeti da su" +
                " vlakna izgubila oblik. U slučaju jake upale grla roditelj bi trebao zamijeniti dječju četkicu jer je veliki broj bakterija ostao na četkici.\n" +
                "Zubne paste su također prilagođene djetetovoj dobi. Na zubnim pastama nalaze se  oznake koje nam pomažu odabrati zubnu pastu za " +
                "određenu dob djeteta. Količina zubne paste također je određena djetetovom dobi. Od prvog zuba do druge godine preporučuje se da " +
                "na dječju četkicu nanesemo tanak sloj zubne paste, a  od druge do 6. godine količinu paste koja odgovara veličini zrna graška. \n" +
                "Djeca trebaju pomoć pri pranju zuba sve do šeste godine. Od šeste do devete godine potrebno je prekontrolirati jesu li dobro " +
                "oprali zube, a smatra se da su nakon devete godine sposobni sami održavati oralnu higijenu.\n");
        Intent intenti=new Intent(this,listasvega.class);
        intenti.putExtra("naslovi",(Serializable) naslovi);
        intenti.putExtra("podnaslovi",(Serializable) podnaslovi);
        startActivity(intenti);
    }

    public void strucnjaku (View view){

        Intent intent = new Intent(getApplicationContext(),detaljanopis.class);
        intent.putExtra("naslov","dr.med.dent Nikolina Grbec");
        intent.putExtra("podnaslov","Nikolina Grbec doktorica je denalne medicine. Studij dentalne " +
                "medicine završila je 2015. godine. Piše članke za časopis Smile, " +
                "a područje dentalne medicine koje ju posebno zanima je " +
                "Dječja i preventivna dentalna medicina. ");
        startActivity(intent);

    }

}
