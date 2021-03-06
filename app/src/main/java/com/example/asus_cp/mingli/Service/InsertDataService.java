package com.example.asus_cp.mingli.Service;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;

import com.example.asus_cp.mingli.db.DBCreateHelper;
import com.example.asus_cp.mingli.db.DBOperateHelper;
import com.example.asus_cp.mingli.fragment.MingFragment;
import com.example.asus_cp.mingli.model.DiTianShui;
import com.example.asus_cp.mingli.model.QiongTong;
import com.example.asus_cp.mingli.model.SanMing;
import com.example.asus_cp.mingli.util.CaculateGanZhi;

/**
 * Created by asus-cp on 2016-04-29.
 */
public class InsertDataService extends IntentService {
    private DBOperateHelper helper;

    public static final String JIA_ZI="甲子";

    public static final String JIA_YIN="甲寅";

    public static final String JIA_CHEN="甲辰";

    public static final String JIA_WU="甲午";

    public static final String JIA_SHEN="甲申";

    public static final String JIA_XU="甲戌";

    public static final String YI_CHOU="乙丑";

    public static final String YI_MAO="乙卯";

    public static final String YI_SI="乙巳";

    public static final String YI_WEI="乙未";

    public static final String YI_YOU="乙酉";

    public static final String YI_HAI="乙亥";

    public static final String BING_ZI="丙子";

    public static final String BING_YIN="丙寅";

    public static final String BING_CHEN="丙辰";

    public static final String BING_WU="丙午";

    public static final String BING_SHEN="丙申";

    public static final String BING_XU="丙戌";

    public static final String DING_CHOU="丁丑";

    public static final String DING_MAO="丁卯";

    public static final String DING_SI="丁巳";

    public static final String DING_WEI="丁未";

    public static final String DING_YOU="丁酉";

    public static final String DING_HAI="丁亥";

    public static final String WU_ZI="戊子";

    public static final String WU_YIN="戊寅";

    public static final String WU_CHEN="戊辰";

    public static final String WU_WU="戊午";

    public static final String WU_SHEN="戊申";

    public static final String WU_XU="戊戌";

    public static final String JI_CHOU="己丑";

    public static final String JI_MAO="己卯";

    public static final String JI_SI="己巳";

    public static final String JI_WEI="己未";

    public static final String JI_YOU="己酉";

    public static final String JI_HAI="己亥";

    public static final String GENG_ZI="庚子";

    public static final String GENG_YIN="庚寅";

    public static final String GENG_CHEN="庚辰";

    public static final String GENG_WU="庚午";

    public static final String GENG_SHEN="庚申";

    public static final String GENG_XU="庚戌";

    public static final String XIN_CHOU="辛丑";

    public static final String XIN_MAO="辛卯";

    public static final String XIN_SI="辛巳";

    public static final String XIN_WEI="辛未";

    public static final String XIN_YOU="辛酉";

    public static final String XIN_HAI="辛亥";

    public static final String REN_ZI="壬子";

    public static final String REN_YIN="壬寅";

    public static final String REN_CHEN="壬辰";

    public static final String REN_WU="壬午";

    public static final String REN_SHEN="壬申";

    public static final String REN_XU="壬戌";

    public static final String GUI_CHOU="癸丑";

    public static final String GUI_MAO="癸卯";

    public static final String GUI_SI="癸巳";

    public static final String GUI_WEI="癸未";

    public static final String GUI_YOU="癸酉";

    public static final String GUI_HAI="癸亥";
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public InsertDataService(String name) {
        super(name);
    }

    /**
     * 子类必然会调用父类的构造方法，如果父类没有空参数的构造方法
     * 则子类必须指定要调用父类的哪个构造方法，否则会报错
     */
    public InsertDataService(){
        super("110");
        helper=new DBOperateHelper(DBCreateHelper.getDBCreateHelper());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        DiTianShui diTianShui=new DiTianShui();
        QiongTong qiongTong=new QiongTong();
        SanMing sanMing=new SanMing();

        //插入滴天髓的数据
        diTianShui.setRiGan(CaculateGanZhi.JIA);
        diTianShui.setDuanYu("甲木参天，脱胎要火，春不容金，秋不容土，火炽乘龙，水宕骑虎，地润天和，植立千古。");
        helper.insertDiTianShui(diTianShui);

        diTianShui.setRiGan(CaculateGanZhi.YI);
        diTianShui.setDuanYu("乙木虽柔，刲羊解牛，怀丁抱丙，跨凤乘猴，虚湿之地，骑马亦忧，藤罗系甲，可春可秋。");
        helper.insertDiTianShui(diTianShui);

        diTianShui.setRiGan(CaculateGanZhi.BING);
        diTianShui.setDuanYu("丙火猛烈，欺霜侮雪。能煅庚金，逢辛反怯。土众成慈。水猖显节，虎马犬乡，甲来成灭。");
        helper.insertDiTianShui(diTianShui);

        diTianShui.setRiGan(CaculateGanZhi.DING);
        diTianShui.setDuanYu("丁火柔中，内性昭融，抱乙而孝，合壬而忠，旺而不烈，衰而不穷，如有嫡母，可秋可冬。");
        helper.insertDiTianShui(diTianShui);

        diTianShui.setRiGan(CaculateGanZhi.WU_TIAN_GAN);
        diTianShui.setDuanYu("戊土固重，既中且正，静翕动辟，万物司命，水润物生，火燥物病，若在艮坤，怕冲宜静。");
        helper.insertDiTianShui(diTianShui);

        diTianShui.setRiGan(CaculateGanZhi.JI);
        diTianShui.setDuanYu("己土卑湿，中正蓄藏，不愁木盛，不畏水狂，火少火晦，金多金光，若要物旺，宜助宜帮。");
        helper.insertDiTianShui(diTianShui);

        diTianShui.setRiGan(CaculateGanZhi.GENG);
        diTianShui.setDuanYu("庚金带煞，刚健为最，得水而清，得火而锐，土润则生，土干则脆，能赢甲兄，输于乙妹。");
        helper.insertDiTianShui(diTianShui);

        diTianShui.setRiGan(CaculateGanZhi.XIN);
        diTianShui.setDuanYu("辛金软弱，温润而清，畏土之叠，乐水之盈，能扶社稷，能救生灵，热则喜母，寒则喜丁。");
        helper.insertDiTianShui(diTianShui);

        diTianShui.setRiGan(CaculateGanZhi.REN);
        diTianShui.setDuanYu("壬水通河，能泄金气，则中之德，周流不滞，通根透癸，冲天奔地，化则有情，从则相济。");
        helper.insertDiTianShui(diTianShui);

        diTianShui.setRiGan(CaculateGanZhi.GUI);
        diTianShui.setDuanYu("癸水至弱，达于天津，得龙而运，功化斯神，不愁火土，不论庚辛，合戊见火，化象斯真。");
        helper.insertDiTianShui(diTianShui);

        //插入三命通会的数据
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("甲子日甲子时，子遥巳格，年月无庚辛申酉，丑绊午冲，离祖自立，贵。" +
                "若年月俱寅，逢申酉运，大富后退财。子亥卯未年月，行西运，贵。" +
                "甲辰月亦贵。酉月，只以正官格论，大贵。巳午戌月，平常。午月，甲死子冲，尤不吉。" +
                "乙卯、乙巳月，主法死。以上具以日时为主，而以人命年月附之，其官御不同者，此前代命也。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("甲寅日甲子时，拱丑中辛，贵。年月无庚辛申酉丑未，" +
                "大贵。再甲寅月，孤克，惟憎道可。亥子年月，四品贵。" +
                "午月，行东北方运，亦贵。如酉丑巳等月，明有官煞，柱但有印，俱贵。" +
                "卯未，身太旺，未免刑伤。乙巳月，受刑。丁亥月，旺中恶死。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("甲辰日甲子时，若水位年月，水泛木浮，主移根换叶；" +
                "申月，煞星会印，俱贵。子月，行水木运，亦贵。酉月正官，大贵。" +
                "寅午戌月，俱吉。乙卯月，刑折。癸巳月，水火中死。癸亥月，凶死。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("甲午日甲子时，时日并冲，忧伤妻子，月通木气者显贵。纯子午年月，或亥未酉月，俱贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("甲申日甲子时，甲胎逢印印化煞，贵。鸳鸯重迭，子嗣难为。" +
                "若行东南方运，文武职居间。亥卯未辰丑申等月，俱贵。乙卯月夭。丁巳月，死不全尸。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("甲戌日甲子时，拱亥天门，会同帝阙，甲长生地也，不可以隔角论。" +
                "年月通申巳酉丑金气，大贵。戊寅年月，主聋哑，或狼虎伤害，见壬则吉。" +
                "乙卯月，刑死，乙亥月，遭盗死。以上六日年月喜忌，当通融活看。");
        helper.insertSanMing(sanMing);





        //丑时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("甲日乙丑时，辛金为官，己土为财，丑中暗己，被明乙劫夺，乙丑金神，若年日时合成火局，" +
                "得制伏，主德性纯和而贵；无火凶狠；如合水局凶恶损家。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("甲寅日乙丑时，春贫，秋贵，冬富，夏火制金神，吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("甲辰日乙丑时，主富厚有财，通火气年月，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("甲午日乙丑时，金神入火局，身弱贫夭。寅戌会火，是一木迭逢火位，不吉。" +
                "若单寅单戌，或申酉亥月，四五品贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("甲申日乙丑时，带疾平常。子月生，南方运，贵。秋生化煞，天干透印绶，尤贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("甲戌日乙丑时，田连阡陌，贯朽粟陈，但未免先刑。寅年月，父子俱显。子月，西方运，金紫。");
        helper.insertSanMing(sanMing);


        //寅时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("甲子日丙寅时，日禄居时，青云得路，年月无庚辛金，贵；通木火气极贵。" +
                "午月行东北方运，五六品贵。申月，归禄逢煞，主大权贵；水局平常。若年月与日时同，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("甲寅日丙寅时，年月无巳酉辛丑字，是归禄格，位至一二品。" +
                "纯木火带土，富贵双全，六卿之职。丙子及亥未，卯月，四五品贵；行西南方运，最吉。" +
                "亦有酉、丑月贵者，看干透及年何如。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("甲辰日丙寅时，龙虎拱门，又龙吟虎啸，主贵，或一生近贵，财源或得或失，名利既济未济。" +
                "未、寅年月，官至六卿；戌月风宪；酉月三品；子、亥、丑月四五品，行西方运，大贵；卯、巳年月平常。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("甲午日丙寅时，身居绝地，主平。若通水月，木得滋养，吉；火月寿夭，天干比助无妨。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("甲申日丙寅时，时日并冲，忧伤妻子。若年月日同，大贵；巳、亥二三品；" +
                "辰、子年月，会水以煞化印，吉；未月财库，亦吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("甲戌日丙寅时，年月有土则富；有金反复。如有金，须生亥子印月方贵，余月则否。");
        helper.insertSanMing(sanMing);


        //卯时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("甲子日丁卯时，克剥悭吝，作事进退，不免刑伤妻子，或死他乡。" +
                "生辰戌丑未月，贵。卯月凶，柱有官煞制亦吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("甲寅日丁卯时，年月木火相停，通明之象，贵。" +
                "月令坐丑、未贵。乙亥月，文章冠世，官至三品，干支金水全，官印双显贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("甲辰日丁卯时，财帛满目，生计盈余，妻贤子孝，高命论之。春生太旺无制，贫贱残疾。丑、酉月贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("甲午日丁卯时，身坐绝地，凶刑。若生秋冬，寿夭。春夏富贵。甲午月，大贵，运宜东北方。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("甲申日丁卯时，主武职，风宪权贵。酉月，火木运，中贵。寅、午年月大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("甲戌日丁卯时，逢亥月，有才学，贵显。羊刃最坏，造化须有制合方吉；" +
                "身弱无凶，若年月纯煞，甲木秋生，主夭折。");
        helper.insertSanMing(sanMing);


        //辰时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("甲子日戊辰时，主移根换叶，改姓易宗，妻贤子孝，作高命论。未月，行北方运，贵。酉月，北方运，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("甲寅日戊辰时，龙吟虎啸格，贵。纯辰，中贵。纯寅康寿。亥卯未三合，财旺身强，大贵。酉丑申年月亦吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("甲辰日戊辰时，刑冲发财，妻重子晚，双亲有克。酉月三四品贵。丑月亦贵。地支纯辰，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("甲午日戊辰时，财多成败，早岁灰心。亥子丑卯午未年月大贵。酉月亦贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("甲申日戊辰时，主孤，僧道清高。丑月富贵。寅月尤贵。甲戌日戊辰时，大富，年月扶合亦贵。" +
                "寅亥年月，三四品贵。但时日并冲克，早年身孤，中年发福。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("甲日戊辰时，天财坐库，时上偏财，遇龙守库，主为商贾发财，田园广盛。" +
                "八月带禄，财官俱有，富贵双全。忌比肩、羊刃夺财。");
        helper.insertSanMing(sanMing);


        //巳时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("甲子日己巳时，先贫后富，祖业轻微，妻勤子拗。生寅未巳丑年月，虽贵防疾。申子辰戌，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("甲寅日己巳时，时日相刑，忧伤妻子。生火年月，有明断之才，掌兵权之职。戊子年月，承袭祖荫，主富。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("甲辰日己巳时，丰姿敦厚，一生平安，财帛有成。巳酉丑年月，行火金运，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("甲午月己巳时，金神入火乡，大贵。酉月，行火木运，武职有权。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("甲申日己巳时，敦厚聪明，善于决断，身孤清贵，不免破刑。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("甲戌日己巳时，财神贵格，名利两全。子戌年月，五品以上贵。");
        helper.insertSanMing(sanMing);


        //午时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("甲子日庚午时，时日相冲，忧伤妻子，平常。若子午年月及寅戌月生，行西北方运，金紫风宪。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("甲寅日庚午时，春月有寿。夏月伤官伤尽，财源进退。申有权，酉反复。冬月伤妻子。子未年月煞助印生，四品。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("甲辰日庚午时，田园乐赏。寅月，行金运，风宪。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("甲午日庚午时，破祖业发财，禄因财不得善终。寅午戌年月，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("甲申日庚午时，子辰年月会印。亥卯年月身旺，俱贵。寅戌会伤制煞，甲得寄托，亦贵，运喜金水。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("甲戌日庚午时，生辰戌月，敦厚，不贵则富。丑月行火土运，金紫风宪，寅月清贵。");
        helper.insertSanMing(sanMing);


        //未时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("甲子日辛未时，辰戌丑未及己酉月，土金地方，文贵显达。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("甲寅日辛未时，寅申月贵。纯酉丑年月，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("甲辰日辛未时，辰戌丑未月富。巳酉丑子年月贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("甲午日辛未时，春吉，夏凶，秋身弱难任官禄，冬贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("甲申日辛未时，春吉，夏辛苦，秋显达，冬根基别立贵。子丑月大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("甲戌日辛未时，先刑后贵。寅卯酉丑年月贵，子申年月，位至贵显。");
        helper.insertSanMing(sanMing);


        //申时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("甲子日壬申时，申子辰亥月，水泛木漂，移根换叶，玉堂金马之贵。水土运，凶。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("甲寅日壬申时，旺中有失。辰戌丑未月勾陈得位；寅、午、戌月，偏官有制；秋月，行东南运，俱贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("甲辰日壬申时，寅辰年月，文章显贵。透丙戊尤美。甲午日壬申时，申子辰月，改姓更宗，敦厚之命。午月贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("甲日壬申时，甲木绝在申，申土壬水长生，庚金建禄，明袅暗鬼，甲旺化鬼为官，犹不免凶暴。" +
                "若生秋庚旺，生冬壬旺，柱无丙戊制伏，漂流之象。若巳午月，大吉。强横透庚，作煞论，运行北方，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("甲申日壬申时，寅月，身煞两停；卯月，以刃合煞，俱贵。子辰年月，以煞化印；" +
                "巳午火月，七煞有制，俱吉。最怕煞旺身弱，大凶。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("甲戌日壬申时，辰戌丑未月，衣锦有成；亥月学堂；寅月建禄；俱贵。午酉月寿促，不然贫贱。");
        helper.insertSanMing(sanMing);


        //酉时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("甲子日癸酉时，春生木旺；酉月官纯，贵。若混之以煞，或煞多，柱中全无火气，凶。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("甲寅日癸酉时，春生寿，夏反复。秋性不定，多凶。冬平常。丑未月贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("甲辰日癸酉时，子戌年月，有财有官，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("甲午日癸酉时，主孤。生寅午戌月，行东北方郎官。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("甲申日癸酉时，平常。通火气月，行南运，富贵。申酉年月，多夭。" +
                "有水化金毒，只作官印论，不作金神亦吉，但主退早。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("甲戌日癸酉时，子戌年月，文章显贵。子午月，不贵即富。");
        helper.insertSanMing(sanMing);


        //戌时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("甲子日甲戌时，春寿，夏暴，秋贵，冬，移根换叶，柱见纯亥夹角，虽贵终凶。辰戌丑未，杂气财官，亦吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("甲寅日甲戌时，比肩争禄，木气遭焚，四十后渐不如前。甲丙申子年月，大贵。纯戌风宪，午月，行水火运，七八品贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("甲辰日甲戌时，财源稳厚，多凶。春月金火运，官至六品。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("甲午日甲戌时，春生，贵人扶持。夏，背禄逐马。冬，印缓，吉。纯寅年月，近侍贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("甲申日甲戌时，夹酉官贵，但身孤，发亦不久。春生，木土运，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("甲戌日甲戌时，背禄逐马，平常。秋生，官煞有气，贵。辰戌丑未月，吉。" +
                "卯月凶。若丙寅、甲午年月，三甲食二丙，丙夏得时，居寅长生，甲就食见禄，主富贵。");
        helper.insertSanMing(sanMing);


        //亥时
        sanMing.setRiGanZhi(JIA_ZI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("甲子日乙亥时，成趋干格，贵。如生申月，煞旺合刃，权贵。酉月正官，柱稍得土助，大贵。" +
                "辰巳丑未戌月俱吉。年月纯卯，刃旺则凶。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_YIN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("甲寅日乙亥时，辰戌丑未月，富。申酉月，贵，冬，平常。若寅亥月，高贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_CHEN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("甲辰日乙亥时，酉月正官，最贵。辰戌丑未及寅亥年月，俱吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_WU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("甲午日乙亥时，卯月羊刃，刑骨肉，身弱不得善终。春生，贵为宰辅。申子戌午年月，行水火运，官至六卿。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_SHEN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("甲申日乙亥时，亥月，学问有成，贵为风宪。申酉月，先贫后富。子月，行水火运，金紫。" +
                "辰戌丑未，杂气财官；寅月建禄，俱吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(JIA_XU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("甲戌日乙亥时，春冬生，富，土厚地方显贵。夏，劳力不聚财。秋平常。");
        helper.insertSanMing(sanMing);



        //六乙日的数据
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("乙丑日丙子时，身弱平常，无午穿冲，贤德温厚。申酉年月，风宪。寅子，贵显。" +
                "忌丙寅、己未、甲戌、己丑等月，主凶刑恶死。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("乙卯日丙子时，高。辰戌丑未亥年月，不见官星，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("乙巳日丙子时，吉。若巳午年月，寿促，不然，身孤劳碌，纯土，财旺生官，行西运；" +
                "子辰，行水火运，俱二三品贵。申月正官，酉月偏官，卯月建禄，俱吉。忌甲寅月，刑夭。乙酉月下贱。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("乙未日丙子时，平。若子亥年月，大贵，岁运同。" +
                "忌巳未月，刑伤，丙申月，身不完死；己丑月，破祖恶死。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("乙酉日丙子时，贵，身孤，反复起倒，月通水气，不见辛午亦贵。" +
                "忌戊寅月，大凶；丁巳月，破祖贫；己酉月，金刃死。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("乙亥日丙子时，化青赤，主福。生庚辰年月，富贵。" +
                "纯亥，成败。丑月，行南运郎官。巳午西运，极贫。忌壬辰月，刑；乙酉月，破祖高贵，中恶死。");
        helper.insertSanMing(sanMing);


        //六乙日丑时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("乙丑日丁丑时，秋生有权；主带疾；夏吉，冬平；春旺，贵寿。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("乙卯日丁丑时，亥月，身旺见辛偏官，柱有丁制，风宪武职。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("乙巳日丁丑时生，亥卯未寅月，贵。通金气月有倚托者，福重。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("乙未日丁丑时，辰戌丑未月，富。春寿长，秋名利，夏贫下，冬平常，申年月，武职三品");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("乙酉日丁丑时，若通木气有倚托者，显贵。申丑年月亦好，寅亥尤佳。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("乙亥日丁丑时，亥月，性急有操持，妻贤子孝，官至六七品。午月长生，年月透官印，大贵。");
        helper.insertSanMing(sanMing);


        //六乙日寅时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("乙丑日戊寅时高，生子年戌月者，富贵。辰戌，行木火运，威权。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("乙卯日戊寅时，刑中发福。秋生贵。酉年遇辰戌丑未月，富。卯月建禄，午月印生，透官印，俱吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("乙巳日戊寅时，孤克平常。若年月申庚，正官；丑辛，七煞，俱贵。辰月，北方运，吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("乙未日戊寅时，春生有寿。秋贵显。夏平常，冬反复。辰戌且未，俱吉。岁运同。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("乙酉日戊寅时，春生富，夏平、秋贵、寿促，冬吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("乙亥日戊寅时，春吉，夏劳力，秋冬贵。子丑年月，贵至三品，有起有落，寿永。");
        helper.insertSanMing(sanMing);


        //六乙日卯时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("乙丑日己卯时高，中年大福。春生，身太旺，孤。夏贫。" +
                "秋有疾。冬温厚。柱不见辛金，吉。若辰戌丑未月，金紫贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("乙卯日己卯时高，春生旺，为僧道，富足。夏平常，不见辛金，吉。" +
                "秋带疾。冬温厚。卯丑年月，显达高寿。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("乙巳日己卯时，春孤贫，夏平，秋带疾，冬贵。午辰年月、地支一路相连，尤吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("乙未日己卯时，年月不见庚辛金，贵。秋生，看地厚薄，如生壬戌年月，三四品贵。" +
                "乙酉日己卯时秀，初年破祖，中主发财，未年孤刑。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("乙日己卯时，禄入庙堂，乙木逢卯建禄，为人秀丽，通木火者贵。见庚辛为伤禄破命，患目疾。" +
                "若生巳酉丑月，平常衣禄。辰戌丑未，吉。申月亦吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("乙亥日己卯时，生寅巳月，不见庚辛，日禄归时格，显达清贵。纯卯年月，高僧羽士。戌，特达聪明，有财禄。");
        helper.insertSanMing(sanMing);


        //六乙日辰时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("乙丑日庚辰时，破祖克父，身弱忌疾，通月气者，贵。子申年月，天干透甲戊，合三奇，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("乙卯日庚辰时，富贵。通火土年月，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("乙巳日庚辰时，作事成败，僧道富贵带疾。常人刑克妻子。申子辰卯巳年月，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("乙未日庚辰时，亥卯身，身旺；巳申，官旺，天干透煞印，皆贵。" +
                "丑酉纯煞，柱有火制，亦吉。戌丑年月，四库全，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("乙酉日庚辰时，亥子年月，干透戊癸，贵。寅巳午月，官煞有制，吉。纯酉化金，主厚福。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("乙亥日庚辰时，不贵则富。若年月癸戊一化，申卯两旺，巳丑酉会金，行木土运，位至金紫。");
        helper.insertSanMing(sanMing);


        //六乙日巳时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("乙丑日辛巳时，先杂后纯，生寅午丙丁年月，偏官有制，作高命看。" +
                "巳申酉丑月，官煞重迭，多带疾从煞，亦吉。惟身强主兵权，有名誉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("乙卯日辛巳时，春生，身强煞浅，大贵。夏平常。秋，官煞旺；冬，印绶旺，俱吉。秋不如冬。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("乙巳日辛巳时，克妻，妻子俱晚。若巳酉丑月，木柔金重，主带疾。不然寿促。" +
                "甲巳子巳年月，入偏官格，西运，风宪。春月身旺，更吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("乙未日辛巳时，午月干强，武职，有名誉。亥子印绶，吉。" +
                "乙酉日辛巳时，若未月生，身坐制伏则吉。秋偏官，贵。酉月，行南方运，贫，不然残疾。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("乙日辛巳时，暗金交争，是非日有，若通身旺月，有倚托，化鬼为官，行身旺运，贵。" +
                "通木气月，行金旺运，大贵。通金气月，行身旺运，亦贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("乙亥日辛巳时，生巳午月，偏官有制。春干强，位居风宪。秋煞重，主残疾。");
        helper.insertSanMing(sanMing);


        //六乙日午时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("乙丑日壬午时，春夏多富贵。秋冬官印，或纯煞透干，尤吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("乙卯日壬午时高，丑月，入杂气财官；申酉月，身煞两停，俱主显贵。纯午酉年月，三四品；辰戌，平常。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("乙巳日壬午时吉，春夏富贵。秋冬平常。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("乙未日壬午时，寅卯身旺，亥子印旺，丑月财官印三奇，俱主贵显。" +
                "申月正官，尤吉，若庚午、丁亥年月，食神同窠，就食见禄，富贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("乙酉日壬午时，春吉。秋夏平常。柱纯乙酉，透庚合化，或见印助，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("乙亥日壬午时，春身旺，夏福厚，秋反复，冬吉庆。");
        helper.insertSanMing(sanMing);


        //六乙日未时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("乙丑日癸未时，凶刑孤独，年月通土气，吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("乙卯日癸未时，改祖离亲，就妻为家。午未年月，贵。春尤贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("乙巳日癸未时，不贵则富，先难后易。纯午、三品贵。辰戌丑月，俱吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("乙未日癸未时，春，身旺刑伤。秋，官煞旺，科名有分。冬安稳。夏平常。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("乙酉日癸未时，身坐煞，春，身旺，吉。夏，身弱煞衰，贫。秋，煞旺，身能从化，贵。" +
                "冬平。辰戌丑未月，透庚辛，行金运，贵。一到刃运，退官罢职。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("乙亥日癸未时，春木旺，刑伤妻子。申月官旺，贵。" +
                "酉煞旺，年月有火则吉。午未戌年月，一二品贵。冬生稳厚。");
        helper.insertSanMing(sanMing);


        //六乙日申时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("乙丑日甲申时高，纯子辰年月，行东南运，大贵。巳酉丑，贵；中防凶。" +
                "午未纯，吉。亥卯亦吉。余月平平。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("乙卯日甲申时，化贵。月通水气无伤破者，贵，不然，富。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("乙巳日甲申时，身强官旺。春，聪明显达，官至四品。夏，身心劳碌。秋冬眼疾。午年月，行财运，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("乙未日甲申时，生未酉亥月，聪俊特达，官至二三品。丙丁寅午卯酉年月，伤食制煞，权贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("乙酉日甲申时，官煞混杂，若柱丁火制煞留官则吉。亥卯未酉年月，武职极品；不久；行东南方运，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("乙亥日甲申时，时落空亡，主少子。秋生，官居六卿。亥卯年未月，俱吉。");
        helper.insertSanMing(sanMing);


        //六乙日酉时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("乙丑日乙酉时高，生巳酉丑月，合金局，更行西运，大贵。寅午戌月，贫下。" +
                "亥卯未月，吉。纯子年月，行南运，一二品贵。寅月火金，七品贵。申月水木，金紫贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("乙卯日乙酉时，月通金局者贵。未寅年月，官至一二品。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("乙巳日乙酉时，春吉。夏，伤官有制，好。秋，木弱金重，夭，不然有疾。冬，福厚亦夭。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("乙未日乙酉时，拱贵格，无刑破者贵，有申填实则非。亥卯月，行西运，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("乙酉日乙酉时，旺处自刑，年月火土重，主灾。若通月气，透出印食，行火木运，大贵。" +
                "地支纯酉，化成金象，但带印绶，贵不可言。最怕岁运遇官。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("乙亥日乙酉时，春生，仁寿格，贵。寅月，行金火运，大贵。");
        helper.insertSanMing(sanMing);


        //六乙日戌时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("乙丑日丙戌时，春身旺，吉。夏，伤官太重。秋，劳力辛苦。" +
                "冬亥子，印绶带伤官，极贵。戌月，木火运，七品贵。纯戌年月，天干透庚丙者，大贵。" +
                "寅午合火者夭。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("乙卯日丙戌时，寅卯月，运西运，六七品贵。子月印绶；丑月杂气，刑出财官，俱贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("乙巳日丙戌时，吉。丑戌未年月，风宪六卿。亥月，行东运，翰院清贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("乙未日丙戌时，旺处凶。卯午未戌年月，贵显。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("乙酉日丙戌时，春身旺，冬印旺，大贵。夏巳午，秋酉戌，俱贵。" +
                "亦看天干如何？丁未、甲辰，生计辛苦；一生遇贵。丑月刑。戌吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("乙亥日丙戌时，血疾。亥子卯未寅月，遇贵发福；天干透伤官生财，尤吉。" +
                "枯木相逢局，逢春叶更生；晚年方得地，花发再重荣。");
        helper.insertSanMing(sanMing);


        //六乙日亥时
        sanMing.setRiGanZhi(YI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("乙丑日丁亥时秀，生壬子申未卯月，干透财印者，才德兼全，职在风宪。" +
                "年月干支纯金，身衰煞旺，主凶死。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_MAO);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("乙卯日丁亥时，巳酉丑月偏官，申月正官，俱贵。亥月，东南运，风宪。未月，三合木局，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_SI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("乙日丁亥时，死处逢生，乙木死，亥却气壬水为生气印绶，乙用丁为食，亥中丁坐无气，喜甲木生，助丁食为福。" +
                "如遇金局，行水运者，防目疾。四柱见财，或行财运、贪财坏印，主破财。戊为财为妻，庚为官为子，亥上庚绝土病，" +
                "妻衰子少。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_WEI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("乙未日丁亥时贵，子亥年月，公侯。春生，行西运，郎官。酉孤，贵。" +
                "年月木火，主发高科。水土金与日干合化有用者，俱吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_YOU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("乙酉日丁亥时，月通金局，行水运，大贵。通木气，发达。土气，称意。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(YI_HAI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("乙亥日丁亥时，有财自刑，寅卯身旺，天干透财者富；辰丑，行金火运，贵。" +
                "亥子申，官印双清，更辅以财。大贵。");
        helper.insertSanMing(sanMing);




        //六丙日十二时辰
        //六丙日子时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丙子日戊子时，寅巳卯未月，木能生火，大贵。冬月，丙火无气，贫夭。" +
                "戌月，行火土运，五六品贵。忌丁巳月，夭；己酉月，破家失土，身贱。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丙寅日戊子时，生卯丑月，清贵。寅戌，平常。夏月身旺，柱有水金方吉。" +
                "子月正官，大贵。忌癸巳月，刑；癸亥月，恶死；己酉月，大败。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丙辰日戊子时，丙辰为日德格，喜见官星。若生戌月，身旺最宜，武贵。寅月，行金水运，中贵。" +
                "申月三合，合煞有印， 贵。忌己巳月，凶死；己亥月，自刑死；癸丑月，破祖恶死。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丙午日戊子时，丙午为日刃格，要官煞制合。生辰戌丑未月，大富。亥卯未寅年月，大贵，申巳，" +
                "文贵三品，武贵不永。纯子，为子午双包贵格。忌丁巳月，恶死；丁亥月，自刑恶死；辛丑月，孤独。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丙申日戊子时，巳午年月，行东北运，风宪，子月，行木火运，三品。" +
                "丑七品，酉亥，虽遇贵反贱。忌癸巳月，中年刑。乙酉月，破败。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丙戌日戊子时，春生，印绶最吉。夏，身太旺，平常。秋，财旺身衰，有寄托则贵。" +
                "纯酉年月，文进之贵。忌己亥月，死不全尸；癸丑月，贫夭。");
        helper.insertSanMing(sanMing);

        //六丙日丑时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丙子日己丑时，寅亥申辰年月，天干透财印食者贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丙寅日己丑时，平常，生乙酉月，正财格，有乙庚健旺者贵。巳丑年月，干透官印者贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丙辰日己丑时，申亥年月，化水则吉；不化寿促，戌月冲库，无人不发。寅午身旺，成火上格，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丙午日己丑时，春月，行火金运，官至极品。夏平，秋富，冬贵，难为妻子，" +
                "午酉年月，五六品，此月禄生财之验。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丙申日巳丑时，血疾。申月，文学儒官成。卯贵。子辰会官，寅卯会印，俱吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丙戌日己丑时高，武刑后发旺。生亥卯月，火金运，大贵。辰未四库全，火土成局，大富。");
        helper.insertSanMing(sanMing);


        //六丙日寅时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丙子日庚寅时，生子月，近贵。癸酉月，行水木运，高贵；火木运，五品以上贵。未申、癸午年月，身居武职，大贵，寿浅。丙寅日庚寅时，" +
                "贵不久。生酉申年月，世裔冷职。子丑寅未，贵显。纯寅尤吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丙日庚寅时，生气学堂，丙寅上长生，文章秀气；丙以庚辛为财，寅上庚绝丙旺。" +
                "若通月气金局者财旺，富贵双全，喜西方运；不通局者财薄。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丙辰日庚寅时，生寅午戌未年月，妻贤子孝，富贵双全。申子，行北运，大贵。酉丑，富。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丙午日庚寅时，年月无壬癸子未巳字，飞天禄马，贵。巳酉丑申，主文学，不贵即富。" +
                "未月，伤官。辰月，先贫后富。亥月，行西运，贵显。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丙申日庚寅时，亥卯未、申子辰二局，官印两旺，大贵。巳丑财局，吉。寅午戌火局，平。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丙戌日庚寅时，生亥子月，贵显。申酉年月，行北方运；寅午戌，行官鬼运，俱大贵。" +
                "若运临死绝，即入黄泉无疑。");
        helper.insertSanMing(sanMing);


        //六丙日卯时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丙子日辛卯时，子卯相刑，伤妻害子。年月同，主魁名，近侍之贵。寅、午、丑、戌、天干地支俱合者大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丙寅日辛卯时，无祖自立，有肢体疾。寅卯未子月，贵。余月平，岁运同。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丙辰日辛卯时，生寅戌月，天月二德，高。巳月，行北方运，贵。酉丑亦贵。亥卯未，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丙午日辛卯时，年月中得癸水官星去刃则吉。子月，伤克妻子，寅酉，性格刚强，不受击触，三四品贵。" +
                "午戌，行东南运；卯月，行西北运，俱贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丙申日辛卯时滞，主聪明好酒色，身旺不化者贵。春吉。冬，行北运，富贵双全。" +
                "巳丑年月，行东运，二品，午未三品。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丙戌日辛卯时，伤妻害子，身旺不化者贵。春，聪明好酒色。冬，行西运，富贵。夏风宪。");
        helper.insertSanMing(sanMing);


        //六丙日辰时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丙子日壬辰时，辰戌丑未月，偏官有制，吉。亥卯年月，富贵。寅午，行子运；" +
                "子，行寅午运，俱贵。不然僧道。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丙寅日壬辰时，身煞两旺，寅卯辰丑未年月，大贵。巳午戌年月亦贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丙辰日壬辰时，身孤有财，主恶死。春生，行北运；夏，东运，俱贵。秋，南运，官至三品。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丙午日壬辰时贵，身旺煞浅，若辰戌丑未月，偏官有制，贵；无制，平常。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丙申日壬辰时，旺中灾。春平，夏福，秋富，冬寿促。若申子辰木局，干透印比助，大贵，" +
                "食制煞亦贵。嫌煞透无制，财党煞强，夭死非命。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丙戌日壬辰时，凶。卯未年月，运行火土，官至三品，妻贤子孝。辰戌丑月，平稳。寅午子巳年月，风宪。");
        helper.insertSanMing(sanMing);


        //六丙日巳时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丙子日癸巳时，丙禄在已，癸禄在巳，互换禄马，岁月无壬已寅亥冲破，近侍风宪，位至公侯。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丙寅日癸巳时，春月，干支无水，文进绣衣，荣妻荫子。卯戌申酉年月，二三品贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丙辰日癸巳时，不利祖宗。酉戌寅丑年月，魁罡格，通身旺，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丙午日癸巳时，丑辰月，杂气财官，贵显。寅月，丙长生；已月，丙建禄，天干透财印者大贵，宜戒酒。" +
                "子，官旺；酉，财旺，俱吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丙申日癸巳时，身坐偏官、偏财，不贵即富。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丙戌日癸巳时，卯戌丑未月，贵，不永。寅亥年月，风宪，嫌冲刑，宜戒酒。");
        helper.insertSanMing(sanMing);


        //六丙日午时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丙子日甲午时，春生吉；夏无依，秋财旺，冬官贵，少子晚成，火土运发达。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丙寅日甲午时，生辰戌丑未月，上伏火气，造化得中贵。午月，火太旺，凶。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丙辰日甲午时，寅卯印助，申酉印旺，巳午身旺，亥子官旺，俱吉。然以火土为重，无则福薄。未戌辰丑见，吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丙午日甲午时，寅午戌月，作倒冲论，二三品贵。子月，南运，八九品贵。" +
                "寅月，南运，金紫贵。午月，东方运，近侍贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丙申日甲午时，不见火土气者福薄。行金水运，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丙戌日甲午时，春生吉，夏孤克，秋吉，子少。寅午戌月，富贵超群。神仙宰相。");
        helper.insertSanMing(sanMing);


        //六丙日未时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丙子日乙未时，春，印绶稳厚。夏平稳，秋反复，冬贵，岁运同。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丙寅日乙未时，生卯未月，印绶格，智慧丰厚，难为妻子。寅巳子辰年月，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丙辰日乙未时，春吉，夏平稳，秋劳碌，冬贵显。巳午月，行西北运，六七品贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丙午日乙未时，不贵则富。午戌年月，职居风宪。申子辰，官星制刃；亥印未，印绶化刃，俱吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丙申日乙未时，不通火气，不见财星，作好命论。年月子辰会官；亥卯会印，俱贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丙戌日乙未时，申子辰年月，近侍贵。寅卯巳年月，大贵。");
        helper.insertSanMing(sanMing);


        //六丙日申时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丙子日丙申时，若通火气及寅卯月再行身旺运，吉。年月纯金，弃命就财，亦以吉论。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丙寅日丙申时，时日对冲，忧伤妻子，通火气月，行身旺运，吉，亥月，手艺。丙辰日丙申时，寅月，" +
                "行南运，贵。子，三合官局，天干透印，大贵。亥生透壬，多夭。戌未，平常。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丙日丙申时，财旺身衰，丙逢庚为财，壬为鬼，申庚旺壬生，丙火无气，财须比肩分夺。" +
                "若不通身旺月者贫下；有倚托救助，又通身旺月，运再同，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丙午日丙申时，主血火厄，后大发。若巳月生，庚辛透露，财星格，武贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丙申日丙申时高，好色。子辰年月，东运，贵；不然，残疾寿促。亥卯未，吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丙戌日丙申时，柱无壬癸亥子酉字填实，作拱格论，贵。寅戌巳午，身旺无依，僧道。");
        helper.insertSanMing(sanMing);


        //六丙日酉时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丙子日丁酉时，春稳，夏贵，秋平，冬吉。未申酉亥年月，大贵。有丑会子，有辰会酉，俱以贵论。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丙寅日丁酉时，卯亥未年月，干透官煞者贵。余月有艺，平常。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丙辰日丁酉时，寅午戌巳年月，干透煞印者贵。申子会官，干透印比者贵。如年月火土，宜见财则吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丙午日丁酉时，生巳午戌月，僧道命好；酉月贵；亥子丑寅卯辰官印年月，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丙申日丁酉时，通水木气月，行水木运贵。已午，身旺。亥子，官旺。年月两全者，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丙戌日丁酉时，月通木气，行水运，贵；通金气，行火运，金马玉堂，才名冠世。露庚藏戊，贫夭。");
        helper.insertSanMing(sanMing);


        //六丙日戌时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丙子日戊戌时，寿永，名利不失。家亥卯未印及申酉戌已年胜，贵。" +
                "丙子日戊戌时，夏月，福寿双全。春，木克土，食神被枭。寅月，丙戊俱长生，最吉。" +
                "有申庚制甲，大贵。秋冬火衰贫下。巳申亥年月，风宪极品。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丙寅日戊戌时，庙堂食神，丙以戊为食神寿星，戌上丙火入库，戊土专位，" +
                "若通火气月及东南运，福厚有寿；不通，平常。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丙辰日戊戌时，午月，丙火有气，土厚地方，五六品贵。亥月，金火运，风宪。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丙午日戊戌时，羊刃食神健旺，名利骤发，亥未辰戌年月，西方运，风宪。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丙申日戊戌时，亥月，东方运，贵。寅午身旺，干透财，吉。丑辰刑冲戌库，发于晚年。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丙戌日戊戌时贫，若通寅巳午戌火局，福寿双全，大贵。见财亦吉。时上食神局，" +
                "楼台店舍中；茶房饼酒肆，几度立家风。");
        helper.insertSanMing(sanMing);


        //六丙日亥时
        sanMing.setRiGanZhi(BING_ZI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丙子日己亥时，秋冬，平常。未月，行水木运，干透木火者，贵。子月，行东运，大贵。" +
                "申、亥、丑、戌年月，亦贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_YIN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丙寅日己亥时，夏生，化鬼为官，妻贤子孝，不贵则富。寅卯辰巳申丑年月，或午戌会局，" +
                "天干更透丙戌字，主大权贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_CHEN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丙辰日己亥时，日德格。寅月生，吉，辰月，为僧道主富，平人孤克。戌月冲辰，巳月冲亥，" +
                "丙旺库，俱吉。卯未会，行金水运，申子会，行木火运，俱贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_WU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丙午日己亥时，武贵。寅巳午月生，妻重子晚，不贵即富。秋冬，名利进退，酉午戌，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_SHEN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丙申日己亥时，春夏生，移根换叶，就妻改福。秋冬平常。酉月，行东南运，风宪。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(BING_XU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丙戌日己亥时，寅卯巳午，木生火炎，妻伤子少，聪明富贵；酉亥子丑，平常，东运亦贵。");
        helper.insertSanMing(sanMing);





        //六丁日十二时辰
        //六丁日子时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丁丑日庚子时平，通木火气，或行身旺运，贵。亦有亥子年月贵者，以丁火阴柔，" +
                "不怕水乡故也。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丁卯庚子时贫，辰戌丑未，偏官有制，午月干强，春身旺，俱吉。秋冬平常。忌癸巳月，破祖凶；" +
                "己未月，刑伤；甲申月，刺面血光死。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丁巳日庚子时，春旺，夏强，俱贵。秋冬平常。四季月，制伏得中吉。子辰，行西运，四五品贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丁未日庚子时，辰戌丑未月，偏官有制。午月干强，贵。余月有制伏，吉；戊子，文章显秀。" +
                "忌戊申月，夭；丙戌月，刑；辛丑月，刑凶。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丁酉日庚子时，辰戌丑未月，刚明特达，贵。辰巳年月，贵尊相府。忌甲寅月，破败恶死；" +
                "癸巳月，离乡恶死；乙酉月刑死。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丁亥日庚子时，五十后大旺。辰戌丑未月，吉。寅午年月，贵。" +
                "忌庚寅月，恶死；庚申月，身不全死；辛酉月，破败。");
        helper.insertSanMing(sanMing);


        //六丁日丑时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丁丑日辛丑时，申酉月，财格，财旺生官，贵。午月，伤财身旺，主官禄。" +
                "纯子寅，武贵三品。水月，艰辛劳苦。辰月贵戚。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丁卯日辛丑时，辰巳未年月，富贵，妻子迟。寅卯印助，戌库身旺，刑。丑丁，得倚托，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丁巳日辛丑时，因阴人致贵。巳酉丑申年月，财旺生官，富贵。卯月平常，行此运亦贵。丑月，西南运，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丁未日辛丑时，时日并冲，忧伤妻子。酉月，通水气，吉。岁运同。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丁酉日辛丑时，寅卯巳午，身旺有托，主文名高贵，宠遇非常。申酉戌，财旺从之，最吉。亥子，官旺亦吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("丁亥日辛丑时，春印绶，吉，秋生，有火气亦吉，夏太旺，凶。冬官煞旺，吉。未戌月，冲开丑库，富。");
        helper.insertSanMing(sanMing);


        //六丁日寅时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丁丑日壬寅时化贵。生冬月，官旺，贵。春，印绶，安稳，夏吉；秋平，行东运好。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丁卯日壬寅时，贵化吉。寅卯年月，行金水运，大贵。亥子月，行西运，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丁巳日壬寅时，丁死于寅，巳无生意，又被寅刑，有始无终，若行金水运，荣贵。" +
                "寅午年月，身旺；申子辰，官旺；亥卯未，印旺，俱可言贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丁未日壬寅时，恶死。春生印吉，夏，木火运，发福。秋富，冬贵。" +
                "酉戌年月，官至三品。亥卯寅戌，文贵，纯卯行金水运，金紫。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丁酉日壬寅时，亥未寅卯申子年月，聪明富贵，风宪极品。巳午，宰相。辰月，" +
                "行金水运；戌月，东方运，俱贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("丁亥日壬寅时，日贵格，配合壬寅，官印俱全，文章显达。子月，大贵，化气凶。");
        helper.insertSanMing(sanMing);


        //六丁日卯时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丁丑日癸卯时，辰戍丑来月，制伏得中。午月，干强，贵。申丑，风宪。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丁卯日癸卯时，寅卯月生，印绶带煞，不为凶论，行官运，贵显。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丁巳日癸卯时，丑月生，北方运，土厚地方.吉，水秀之地，二三品贵。申酉， 用财亦吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丁未日癸卯时.偏官生印。春吉，夏平.秋富，冬铳。或云丁火不怕水，冬生亥 子煞重身柔，大贵。丑未行东运贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丁酉日癸卯时，日时俱坐贵，最吉。春夏身旺，化鬼为官，秋冬身衰，勤苦。" +
                "巳 戌月贵。纯午丑年月，干透庚己，清贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("丁亥日癸卯时，卯月印媛，近侍之贵，寅午京官五六品。");
        helper.insertSanMing(sanMing);


        //六丁日辰时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丁丑日甲辰时吉，亥子月，富贵。申月，东方运；午月，金水运，俱贵。纯寅，风宪极品。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丁卯日甲辰时，辰戌丑未月，孤克，运通发财。丑月，南方运，贵。卯月，金水运，近侍权贵，不利建白。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丁巳日甲辰时，凶刑孤克。春印吉。夏秋平常。冬官旺。纯戌，木火运，官居冷职。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丁未日甲辰时，丑亥卯未月，印绶，官贵。夏平。辰戌，贵厚。酉午，金水运，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丁酉日甲辰时平，年月不见戌字，日主荣贵格。春生，南运，贵；北运，大贵。" +
                "年午月支合局，人马化格，尤贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("丁亥日甲辰时，日贵格，官禄得位，必当显达。申辰年月，大贵。午月，东北运；辰月，北方运，俱贵。");
        helper.insertSanMing(sanMing);


        //六丁日巳时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丁丑日乙巳时，春富，夏孤，秋吉，冬贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丁卯日乙巳时，春印，夏旺，秋财，冬官，看取用何如？俱可论吉。午未年月，文章贵显，行官禄运，吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丁巳日乙巳时，再生巳月，倒冲，亥壬为官，无水填实破格者，主四五品贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丁未日乙巳时，若人倒冲格，无冲破，贵。巳亥年月，三四品贵。酉丑合财局，富。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丁酉日乙巳时，破财倒食，若通金水年月，行金水运，吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("丁亥日乙巳时，时日并冲，忧伤妻子。巳酉丑申子辰，金水二局，财官得用，以富贵论。");
        helper.insertSanMing(sanMing);


        //六丁日午时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("丁丑日丙午时平，寅卯戌未年月，贵。酉丑，用财最吉。忌亥子官煞。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丁卯日丙午时，旺中有灾，卯字刑破白丁。巳月。西北运，贵；东南，极品有权。" +
                "寅亥，武职二品。若全子酉，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丁巳日丙午时，丁禄午，丙禄巳，互换禄格，柱无寅亥子字，文章显贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丁未日丙午时贵，破祖而成。年月忌壬癸字。甲申月，财官印三奇；辰月，官库；亥月，官印，俱大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丁酉日丙午时平，不利子孙。亥卯未年月，贵。巳酉丑，平。寅午戌，富。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("丁亥日丙午时平，子月，金水运，郎官。未申酉丑年月，俱吉。");
        helper.insertSanMing(sanMing);


        //六丁日未时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丁丑日丁未时，丑未刑冲，不得善终。年月辰戌，四库全，贵当极品。申未，三品，法司淡薄清闲。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丁卯日丁未时，刑中发。寅卯月，印绶，发财敦厚。辰戌申午，俱吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丁巳日丁未时，拱禄格贵。年有子字，则午为阙门，得拱大贵。忌空亡填实。" +
                "年月见财官印，俱吉；财，富；官印，贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丁未日丁未时，八专太旺，早克父母妻子，衣禄平常，为僧道吉。柱通金水木并金水运，衣禄安稳，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丁酉日丁未时，日贵格。若亥卯未寅月生，衣禄敦厚，寅月，金水运，金紫风宪。丁亥日丁未时，卯月，三合印局，" +
                "贵而有寿，申，财官旺；亥，官旺，俱吉，夏生，丁火有气，儒官，但不免孤贫");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("丁日丁未时，火托木局，丁以甲为印绶，未为木库印绶之乡，若柱不见财星，不行财运，" +
                "月年通亥卯未局，有倚托者，安稳之福。");
        helper.insertSanMing(sanMing);


        //六丁日申时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丁丑日戊申时，秀贵。未申年月，贵；行东南运，大贵。巳月，西北运，六卿之职。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丁卯日戊申时，春，伤官用印；秋，伤官用财，俱吉。夏，比肩；冬，伤官见官，平常。四季月，吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丁巳日戊申时，不贵即富，未免刑克。夏生，行西北运，贵，秋冬，劳苦。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丁未日戊申时；生巳午未戌，身旺贵显。若亥卯会未，子辰会申，俱以贵论。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丁酉日戊申时，寅午戌丑辰未月生，伤官伤尽为奇，又日贵格，主登科第，运行金水，腰金衣紫。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("丁亥日戊申时，日时相害，忧伤妻子。通月气身旺者，贵显。年月戊戌、丁巳，火土太重者目疾。" +
                "丁日戊申时为正，天元气旺显文明；为官虽是甘淡薄，运吉终须家道成； ");
        helper.insertSanMing(sanMing);


        //六丁日酉时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丁丑日己酉时，辰巳午未申戍年月贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丁卯日己酉时，时日并冲，忧伤妻子，通火气吉。忌乙卯字。年月有亥未、巳丑，但一字两合，不以冲论。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丁巳日己酉时，巳酉丑年月，财旺生官，终身富贵。亥子亦吉。丁未日己酉时，通火气，贵。见卯乙癸字不贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丁日己酉时，丁火酉上长生，学堂、天乙贵人皆兼得之。丁用己为食，辛为财，" +
                "酉上明己暗辛生旺，文章秀丽，如见卯乙冲破者不贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丁酉日己酉时，刑害孤恶，通木火月，吉。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("丁亥日己酉时，蹇滞。如戊己丙丁年月，居近侍有权。卯甲乙寅，西北运，贵。");
        helper.insertSanMing(sanMing);


        //六丁日戌时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丁丑日庚戌时，时日相刑，忧伤妻子。若寅亥申酉年月，官至三品。午未子辰，行金木运亦贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丁卯日庚戌时，生亥未年月，三合会印，贵。子月，煞印，吉。年月建禄，僧道，主贵。柱无救助，" +
                "见癸旺，多患目疾，酉月无贵；纯酉戌年月，天干透己甲者贵，中带凶。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丁巳日庚戌时，辰巳月，金水运，风宪。癸子、壬亥，南方运，极品。" +
                "纯未，西北运，三四品；身旺不行财官运，平常，为僧道清高。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丁未日庚戌时，主刑。亥卯会印，申子辰会官，俱主文贵。午月，建禄，有子冲，凶。" +
                "若年月用土生财，主富；用财生官，富贵双全。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丁酉日庚戌时，日贵格，近贵，晓艺业，有机谋。酉戌，六害，骨肉无情，秋月，五六品贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("丁亥日庚戌时，日贵格。巳酉丑年月，四五品贵。寅卯亥，火金运，位至六卿。");
        helper.insertSanMing(sanMing);


        //六丁日亥时
        sanMing.setRiGanZhi(DING_CHOU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丁丑日辛亥时，秋财旺，夏身旺，春印旺，贵显。冬，官煞太重，恐身弱不能胜任其福。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_MAO);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丁卯日辛亥时，时上财官印三奇，再得年月印助财生，皆主大贵。纯子，行木火运，官可六品，" +
                "巳酉丑月，辛财得局，方有倚旺，富贵双全。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_SI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丁巳日辛亥时，时日相冲，忧伤妻子。若通火气，秋生，行东运，贵。辛月得巳亥者，破祖显秀。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_WEI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丁未日辛亥时，亥卯未寅辰午年月，干透正印、正官者，聪明贵显；行西运，极品。巳丑月，风宪。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_YOU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丁酉日辛亥时，贵人捧印，贵。子月，东方运，风宪。柱有巳丑会财，卯未会印，天干透财官印者，大贵。");
        helper.insertSanMing(sanMing);

        sanMing.setRiGanZhi(DING_HAI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("丁亥日辛亥时，日贵格，又三奇全，通月气身旺者贵。卯未三合印局，大贵。");
        helper.insertSanMing(sanMing);


        //六戊日12个时辰
        //戊子日子时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("戊子日壬子时，财星格。寅卯月，禄马朝元，显贵。酉亥丑年月，西北运，金紫风宪。" +
                "忌乙卯年刑；癸巳月，旺中刑；丙午月，旺中受刑。");
        helper.insertSanMing(sanMing);


        //戊寅日子时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("戊寅日壬子时，卯月，正官格，贵。夏乖，秋少顺。丑酉年月，吉。忌己巳月刑，己亥月凶刑。");
        helper.insertSanMing(sanMing);

        //戊辰日子时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("戊辰日壬子时，春，财官旺、贵。夏乖。秋少顺。冬财旺，行西南运，五六品贵。忌庚辰月，自刑凶；辛巳月，" +
                "截路凶刑；乙丑月，破败凶。");
        helper.insertSanMing(sanMing);


        //戊午日子时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("戊午日壬子时，时日并冲，忧伤妻子。巳午年月，风宪。寅卯亥，六卿。申月，行木火运，侯伯。" +
                "忌丙午月，身不全；癸亥，自刑夭。年月子午不杂，丑戌又刑，俱主大贵。");
        helper.insertSanMing(sanMing);

        //戊申日子时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("戊申日壬子时高，先滞后旺。子酉年月，时上偏官，贵。巳午未戌，身有制化，用财亦专，皆以吉论。申酉，食伤生财，" +
                "天干透甲乙者，富贵双全。忌己巳月刑害，壬午月夭伤，癸亥月孤贫。");
        helper.insertSanMing(sanMing);

        //戊戌日子时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("戊戌日壬子时，寅巳午年月，去财留印，三四品贵。经云：能见义忘利，取印舍财是也。子酉，五品翰林。纯酉，水木运，玉堂极贵。" +
                "忌戊午月，刺面短夭；辛卯月，破败凶刑；癸丑月，受刑；庚午月，贫瞽。");
        helper.insertSanMing(sanMing);


        //戊子日丑时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("戊子日癸丑时，戊月生，杂气印绶，天干透丙丁字，不必格局，主富贵。若年月午酉，干透庚乙，乙与庚合，戊与癸合，戊食庚，庚旺于酉，贵于丑，癸为财，" +
                "乙为官，而印根于午，日时干支为天地合德，贵禄交加，况兼以罗文贵，遇者主极品。");
        helper.insertSanMing(sanMing);


        //戊寅日丑时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("戊寅日癸丑时，寅已午未戌月，化火吉。秋冬平常。");
        helper.insertSanMing(sanMing);

        //戊辰日丑时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("戊辰日癸丑时，寅巳午未戌月，化火得地，申子辰财局亦吉。年月干支纯土，得四库全者贵。");
        helper.insertSanMing(sanMing);


        //戊午日丑时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("戊午日癸丑时，寅戌未午年月，聪明特达威权。");
        helper.insertSanMing(sanMing);

        //戊申日丑时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("戊申日癸丑时，辰戌丑未午月生，富贵爱酒色。夏，东方运，贵。秋冬，财旺生官，若身衰，不夭即贫。");
        helper.insertSanMing(sanMing);

        //戊戌日丑时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("戊戌日癸丑时，夏生，东方运，贵。辰戌丑未月，富贵操权，好花酒风流。" +
                "化合南离局，财门日月开；柱中无冲破，福禄自然来。");
        helper.insertSanMing(sanMing);


        //戊子日寅时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("戊子日甲寅时，先破后发，贵。未月生，干有制伏，贵。午月无制，聪明近贵。" +
                "辰戌丑身旺，亥卯煞旺，但有印有制，贵。纯乙丑年月，金紫。");
        helper.insertSanMing(sanMing);


        //戊寅日寅时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("戊寅日甲寅时，身旺，骨肉不同居。午月，刃印带煞；子月，正财党煞，干透制；亥卯未，" +
                "纯煞身柔，干透刃，运行西南，兵权万里；巳丑戌年月，身旺敌煞；酉丑申，制煞，皆主大贵，嫌劫煞克身则凶。");
        helper.insertSanMing(sanMing);

        //戊辰日寅时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("戊辰日甲寅时，时上偏官，印绶带煞，柱有庚辛制伏者，贵。辰戌丑未，身旺亦贵。");
        helper.insertSanMing(sanMing);


        //戊午日寅时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("戊午日甲寅时，曰羊刃，时偏官，以刃合煞，贵。巳酉丑月，刀笔惊人，制伏不宜太过；" +
                "寅卯辰巳戌子年月，天干有制伏，俱主大贵。");
        helper.insertSanMing(sanMing);

        //戊申日寅时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("戊申日甲寅时，申酉，伤官带煞，土厚地方，贵。丑卯年月，去煞留官，大贵；要行金火运，位极人臣。");
        helper.insertSanMing(sanMing);

        //戊戌日寅时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("戊戌日申寅时，辰、戌、丑、未月，行水木运，三品。丑未年月，行金水运，富贵双全。" +
                "申子、酉子年月俱贵，子孙亦昌。巳午，贵，伤妻害子。");
        helper.insertSanMing(sanMing);


        //戊子日卯时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("戊子日乙卯时，时日相刑，伤妻害子，自成自立。年月再遇，主风宪。午酉，四正全，大贵。");
        helper.insertSanMing(sanMing);


        //戊寅日卯时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("戊寅日乙卯时，亥子年月，妻贤子孝，贵。卯辰纯，吉；寅巳亦吉。");
        helper.insertSanMing(sanMing);

        //戊辰日卯时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("戊辰日乙卯时，身孤，贵。巳卯年月，身强官旺，荣身显祖，子孝妻贤。");
        helper.insertSanMing(sanMing);


        //戊午日卯时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("戊午日乙卯时，刃格，正官去刃为福，子寅卯辰午未申亥年月，俱主贵显。");
        helper.insertSanMing(sanMing);

        //戊申日卯时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("戊申日乙卯时，中年破祖。春贵。夏近贵。秋孤苦。冬富贵双全。巳月，木火运，五品上贵。");
        helper.insertSanMing(sanMing);

        //戊戌日卯时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("戊戌日乙卯时，春官旺。夏，官印双全，贵显。秋平。冬贵。戌丑年月，方面三品。戌月，行东方运，孤贫。");
        helper.insertSanMing(sanMing);


        //戊子日辰时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("戊子日丙辰时，春生近贵。夏辛苦。秋，权高寿促。冬财，通火土，有倚托者贵。");
        helper.insertSanMing(sanMing);


        //戊寅日辰时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("戊寅日丙辰时，龙吟虎啸，中年大贵。子月，行北运，土厚地方，官至三品；" +
                "东运，风宪。丑辰年月，四五品贵。寅午戌年，通土气月，行木火运，极品。");
        helper.insertSanMing(sanMing);

        //戊辰日辰时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("戊辰日丙辰时，克父大发，通身旺月，行东北运富；水木月，行身旺运，贵。");
        helper.insertSanMing(sanMing);


        //戊午日辰时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("戊午日丙辰时，亥卯年月，行东北运，富贵。未丑，行西南运，风宪。");
        helper.insertSanMing(sanMing);

        //戊申日辰时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("戊申时丙辰时，辰戌丑未月，贵；不通土气，行土运亦贵。");
        helper.insertSanMing(sanMing);

        //戊戌日辰时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("戊日丙辰时，时日并冲，忧伤妻子。魁罡，行东北方运，主权重发福。" +
                "酉月，近贵无福禄。亥卯未月，以官印论，贵。");
        helper.insertSanMing(sanMing);

        //戊子日巳时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("戊子日丁巳时，贵。子月正财，土厚地方，显达。亥丑年月，官居极品，内臣中，富贵双全。");
        helper.insertSanMing(sanMing);


        //戊寅日巳时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("戊寅日丁巳时，寅巳相刑，忧伤妻子。午月，东北运，风宪。寅午年月，四品。");
        helper.insertSanMing(sanMing);

        //戊辰日巳时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("戊辰日丁巳时，巳酉丑月，性格风流，威权重大。年月支干不见财官，青云得路。" +
                "亥戌，行南运，五六品贵。申，行北运，贵。");
        helper.insertSanMing(sanMing);


        //戊午日巳时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("戊午日丁巳时，柱无甲乙卯寅，日禄归时格，又戊禄居时，丁禄居日，为互换禄，高贵；" +
                "行伤食印运，吉；有甲乙寅卯未字，作官印取用亦贵。");
        helper.insertSanMing(sanMing);

        //戊申日巳时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("戊申日丁巳时，春夏平，秋成败，冬富贵。行木金运，吉。");
        helper.insertSanMing(sanMing);

        //戊戌日巳时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("戊戌日丁巳时，无冲破，年月不见财官，不行财官运，贵。寅月，作偏官论，行未申运，贵。子月，透甲亦贵。" +
                "亥卯未， 虽见财官，俱吉，盖归禄格不忌官煞与财，以身旺得之，反为福也。");
        helper.insertSanMing(sanMing);


        //戊子日午时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("戊子日戊午时，巳寅戌月，风宪。夏不熔铸，先刑后发，旺处多官。灾破祖。");
        helper.insertSanMing(sanMing);


        //戊寅日午时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("戊寅日戊午时，戌月，三合火局，干透癸化，得天时地利者贵。" +
                "年月申子会水，寅午会火，有既济之妙；辰月亦得；酉伤官；未官印，俱吉。");
        helper.insertSanMing(sanMing);

        //戊辰日午时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("戊辰日戊午时，拱禄格，年月无寅巳甲乙字，贵。卯申，武职。酉丑亥，行南运，贵。");
        helper.insertSanMing(sanMing);


        //戊午日午时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("戊午日戊午时，先刑后发，多不善终。寅巳午戌年月，印绶，大贵。纯午，武职威权" +
                "，名重镇藩。亥卯未申，富贵双全。");
        helper.insertSanMing(sanMing);

        //戊申日午时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("戊申日戊午时，拱贵格，年月逢寅，行南运，风宪；逢午，贵寿；戌文贵。" +
                "有未填实、巳建禄相连一片者，大贵。");
        helper.insertSanMing(sanMing);

        //戊戌日午时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("戊戌日戊午时，大凶。卯午年月，官运，贵显。寅，印绶带煞，变凶为吉。");
        helper.insertSanMing(sanMing);


        //戊子日未时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("戊日己未时，羊刃偏官，戊以己为羊刃，甲为偏官，时上明暗二己为刃，甲木未中合局，若见刑冲破害，刃煞有制，主贵。" +
                "通月旺者平常衣禄，二十年，父母俱失；若不通月气，得寅申者贵。");
        helper.insertSanMing(sanMing);


        //戊寅日未时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("戊寅日己未时，时日相穿，忧伤妻子，早苦晚好。月通土气，行财官运，贵；水木月，行身旺运，贵。");
        helper.insertSanMing(sanMing);

        //戊辰日未时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("戊辰日己未时，春冬，行北运，富贵。");
        helper.insertSanMing(sanMing);


        //戊午日未时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("戊午日己未时，羊刃偏官，主人机谋，寿促，不然，妻子难为重立重成。午亥年月，金土运，贵；申酉，富。");
        helper.insertSanMing(sanMing);

        //戊申日未时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("戊申日己未时贵，行财官运，发福。嫌寅冲煞有凶。");
        helper.insertSanMing(sanMing);

        //戊戌日未时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("戊戌日己未时，春，官旺，贵。夏印安稳。秋平。冬孤苦。戌月，魁罡格，五六品贵。" +
                "须年月申子辰会财，寅午印绶，己酉伤官，亥卯官煞，各成局面方吉。");
        helper.insertSanMing(sanMing);

        //戊子日申时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("戊子日庚申时，若生亥子月，亦是合禄，贵。");
        helper.insertSanMing(sanMing);


        //戊寅日申时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("戊寅日庚申时，凶刑后发，如生寅月，作食禄制煞论，贵。");
        helper.insertSanMing(sanMing);

        //戊辰日申时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("戊辰日庚申时，专食合禄，纯寅年月，二寅不怕一申冲，亦贵。");
        helper.insertSanMing(sanMing);


        //戊午日申时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("戊午日庚申时，未酉丑年月，柱无丙甲卯寅，入合禄格，行西北运，贵；有甲丙又合神藏煞没，四柱纯阳格，大贵。");
        helper.insertSanMing(sanMing);

        //戊申日申时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("戊申日庚申时，身禄同窠，富贵两全，子辰未酉年月，行西运，入合禄格，近上三品。年月丑戌，吉：" +
                "辰戌伤克，平常。亥巳年月，行东北运，一二品贵。");
        helper.insertSanMing(sanMing);

        //戊戌日申时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("戊戌日庚申时，灾疟内，子月，亦合禄格，文贵三品。卯辰年月，大贵。");
        helper.insertSanMing(sanMing);


        //戊子日酉时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("戊子日辛酉时，巳酉丑月，伤官伤尽，行财旺运，武职风宪。");
        helper.insertSanMing(sanMing);


        //戊寅日酉时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("戊寅日辛酉时，通土气月，行西北运，不贵亦富。");
        helper.insertSanMing(sanMing);

        //戊辰日酉时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("戊辰日辛酉时，丑未年月，干透财，主贵。若癸巳月，词馆学堂居提纲，主文学高科，" +
                "寅申巳亥年，则时犯狼藉煞，晚无结果。");
        helper.insertSanMing(sanMing);


        //戊午日酉时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("戊午日辛酉时，春夏平常。秋，伤官伤尽，权贵寿促。冬，难为妻子。");
        helper.insertSanMing(sanMing);

        //戊申日酉时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("戊申日辛酉时，戌亥丑子年月，权贵。");
        helper.insertSanMing(sanMing);

        //戊戌日酉时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("戊戌日辛酉时，辰戌丑未月，贵。古人以水土败在酉，所以多无结果，" +
                "或功名早退，或子息不成。观上六日无大官命，可见伤官时遇不吉。");
        helper.insertSanMing(sanMing);


        //戊子日戌时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("戊子日壬戌时，酉申戌月，家财满目。辰、丑冲刑库开，俱吉。");
        helper.insertSanMing(sanMing);


        //戊寅日戌时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("戊寅日壬戌时，寅午戌辰年月，金水运，大贵。");
        helper.insertSanMing(sanMing);

        //戊辰日戌时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("戊辰日壬戌时，时日并冲，忧伤妻子，如土厚地方，大贵。" +
                "卯月，火金运，中贵。寅申戌丑，行西南运，极贵。");
        helper.insertSanMing(sanMing);


        //戊午日戌时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("戊午日壬戌时，寅午戌月生，时岁火多，以印绶论，未免孤克，先难后易，" +
                "不贵即富。卯月，官星制刃，吉。");
        helper.insertSanMing(sanMing);

        //戊申日戌时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("戊申日壬戌时，春贵，夏平，秋富贵，冬平常。");
        helper.insertSanMing(sanMing);

        //戊戌日戌时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("戊戌日壬戌时，秋富贵。夏，西运；春，北运；冬，南运，俱贵。辰丑月，尤吉。");
        helper.insertSanMing(sanMing);


        //戊子日亥时
        sanMing.setRiGanZhi(WU_ZI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("戊子日癸亥时，年月不见戊字破格，贵。申子年月，东南运；亥卯，南运，俱贵。巳午未旺，大贵。");
        helper.insertSanMing(sanMing);


        //戊寅日亥时
        sanMing.setRiGanZhi(WU_YIN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("戊寅日癸亥时，午未月生，化火会局，高命。春，官煞混杂，温饱衣禄。酉丑年月，三品京堂。");
        helper.insertSanMing(sanMing);

        //戊辰日亥时
        sanMing.setRiGanZhi(WU_CHEN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("戊辰日癸亥时，秀。亥子月，财官格，不贵则富。寅卯年月，贵显。夏生，教职。");
        helper.insertSanMing(sanMing);


        //戊午日亥时
        sanMing.setRiGanZhi(WU_WU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("戊午日癸亥时，贵。寅巳年月，土厚水秀地方，六七品贵。卯未辰丑，俱吉。");
        helper.insertSanMing(sanMing);

        //戊申日亥时
        sanMing.setRiGanZhi(WU_SHEN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("戊申日癸亥时，子未年月，无祖业，因妻致富，不然移根换叶，贫而且贱。");
        helper.insertSanMing(sanMing);

        //戊戌日亥时
        sanMing.setRiGanZhi(WU_XU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("戊戌日癸亥时，寅卯午巳丑戌亥年月，天干透乙庚丁字，清要权贵，宜火土运。");
        helper.insertSanMing(sanMing);



        //六己日12时辰断
        //己丑日子时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("己丑日甲子时，化贵，午寅年月，夭折；通土气月，贵。忌甲寅月，贵中恶死。" +
                "丁未月受刑，丁丑月破祖，失乡恶死。");
        helper.insertSanMing(sanMing);

        //己卯日子时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("己卯日甲子时，先破祖后旺，或旺中有伤。辰戌丑未月，贵。午，身旺。子，聚贵，亥，官长生，俱大贵。" +
                "忌己巳月，破败凶死。庚申月，血光恶死。壬子月，刑害死。");
        helper.insertSanMing(sanMing);


        //己巳日子时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("己巳日庚子时，辰戌丑未月，风宪三品，要行水木运，西运无成，南运财官无气，虚名薄利，贵而不显。子寅年月，东南运，贵显；" +
                "《神白经》说：“化土生福，但不显。”忌壬寅月，受刑。乙未月，刑伤。癸酉月，夭。");
        helper.insertSanMing(sanMing);


        //己未日子时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("己未日甲子时，高身坐官库，辰戌丑未月，吉。寅亥月，官旺，文章振发，贵显易成。巳丑，文贵晚成。" +
                "寅卯，贫下。忌甲申月，身不完死。丙子月，孤贫。丁丑月，刑害。");
        helper.insertSanMing(sanMing);


        //己酉日子时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("己酉日甲子时，寅申午未丑年月，文贵风宪。午月，东北运，极品。忌庚寅年，破败恶死。" +
                "己巳月，凶恶。戊戌月，孤单血死。");
        helper.insertSanMing(sanMing);


        //己亥日子时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("己亥日甲子时，春夏，财官生旺吉；秋冬四季，背禄逐马，凶。寅月，金火运，郎官。" +
                "午月，东北运，金紫。忌壬寅月， 恶死。壬申月，过贫遭刑。癸酉月，破败。己日喜逢甲子时，财官双美贵希奇；" +
                "一朝得遇风云会，独步蟾宫折桂枝。己日时临甲子，化生土厚滋基。财官既助显光辉，有似青龙戏水。不遇庚金卯午，" +
                "为人禄至福齐。常人发福有施为，君子登科及第。");
        helper.insertSanMing(sanMing);


        //己丑日丑时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("己丑日乙丑时，时上偏官，居武职都阃，还看地方断之。卯月金水运，六七品贵。");
        helper.insertSanMing(sanMing);

        //己卯日丑时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("己卯日乙丑时，子申月，行金土运，侯伯。巳酉丑戌年月，俱吉。" +
                "己巳日乙丑时，寅卯月，偏官格。无酉戌字，文进贵命。");
        helper.insertSanMing(sanMing);


        //己巳日丑时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("己日乙丑时，专财逢鬼，丑上有明乙为鬼，暗癸为财。若有倚托通身旺者，贵；通运亦吉。" +
                "若鬼有助，旺不能任者，衣禄平常。");
        helper.insertSanMing(sanMing);


        //己未日丑时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("己未日乙丑时，时日并冲，妻生财可也。卯午年月，金神入火乡，西南运，贵。" +
                "辰戌四季全，大贵。干透丁辛，纯阴亦贵。");
        helper.insertSanMing(sanMing);


        //己酉日丑时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("己酉日乙丑时，卯月，偏官。辰月，财煞，贵。申酉，伤官伤尽。巳午，印绶，俱贵。丑戌，亦贵。");
        helper.insertSanMing(sanMing);


        //己亥日丑时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("己亥日乙丑时，卯月，大贵。申月，水木运，风宪、方面。时逢乙丑本身衰，库有财星内伏埋；" +
                "不遇钥匙难显达，方知出外称心怀。己日时临乙丑，库中耗鬼兴灾。 祖宗产业有盈亏，谋望财去财来。" +
                "戌未刑冲发福，无匙来往搬移，双亲雁序事难依，救未中取贵。");
        helper.insertSanMing(sanMing);


        //己丑日寅时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("己丑日丙寅时，春官旺，夏印旺，秋既济，冬平。辰戌年月，文贵显达。" +
                "纯丑，寿高。戌月，木火运，五、六品贵。");
        helper.insertSanMing(sanMing);

        //己卯日寅时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("己卯日丙寅时，午辰年月，文章显达，大贵。寅午，官至三品。己巳日丙寅时，先刑后旺。寅月，正官格，文章显贵。" +
                "亥子水，水运，贵。纯戌，武职三品。年月申亥四生局全，大贵，或不善终。");
        helper.insertSanMing(sanMing);


        //己巳日寅时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("己日丙寅时，官印生旺。己用甲为官，丙为印，寅上甲旺丙生。" +
                "如果无破、通木局月气者，大贵。喜行木火，不宜金水，岁君同。");
        helper.insertSanMing(sanMing);


        //己未日寅时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("己未日丙寅时，生土厚地，方贵。水木年月，行东北运，贵。一云多庶出过房，或父不见生。");
        helper.insertSanMing(sanMing);


        //己酉日寅时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("己酉日丙寅时，月通木火局，贵；木火运，亦荣达。");
        helper.insertSanMing(sanMing);


        //己亥日寅时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("己亥日丙寅时，春生官旺，贵；夏秋平；冬财旺，吉。寅申丑巳午辰戌年月贵。" +
                "神白经云：“火木象贵。”");
        helper.insertSanMing(sanMing);


        //己丑日卯时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("己丑日丁卯时，申子辰，武职。亥卯未，荣富。巳酉丑，行东北运，吉。");
        helper.insertSanMing(sanMing);

        //己卯日卯时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("己卯日丁卯时，巳酉年月，制伏得宜。庚申合煞，文进大贵。子月，刑煞遇贵，主兵权或法官。" +
                "地支纯印或三合木局，运行寅，混官再遇流年冲运，凶死。");
        helper.insertSanMing(sanMing);


        //己巳日卯时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("己巳日丁卯时，无冲破，富贵；寅午辰年月，刑伤不利。亥月，木火运，贵。" +
                "若春生透甲乙者，官煞太旺，有制化，亦贵；否则凶夭。");
        helper.insertSanMing(sanMing);


        //己未日卯时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("乙未日丁卯时，不贵则富；卯戌亥丑年月，吉。");
        helper.insertSanMing(sanMing);


        //己酉日卯时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("己酉日丁卯时，九成十破，未年旺。年月通身生旺，干头有辛癸制伏丁乙者，吉。");
        helper.insertSanMing(sanMing);


        //己亥日卯时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("己亥日丁卯时，秋生，偏官有制，富贵。春寿促。夏身旺，吉。冬平常。辰戌丑未月，贵。");
        helper.insertSanMing(sanMing);


        //己丑日辰时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("己丑日戊辰时，身孤。寅卯月，禄旺。辰月透甲，作化气看，贵。午，富厚。寅酉，风宪。" +
                "年月子丑透甲，行东南运，金紫，近侍；怕西北运，退职。");
        helper.insertSanMing(sanMing);

        //己卯日辰时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("己卯日戊辰时，卯月，风宪。水木年月，行东北运，并同。");
        helper.insertSanMing(sanMing);


        //己巳日辰时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("己巳日戊辰时，身孤后发。春官贵；夏平稳；秋凶暴；冬财旺。岁运同。");
        helper.insertSanMing(sanMing);


        //己未日辰时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("己未日戊辰时，丑月，杂气财官，吉。寅辰巳亥午戌年月，文章贵显。");
        helper.insertSanMing(sanMing);


        //己酉日辰时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("己酉日戊辰时，春官旺，夏平吉，秋暴狠，冬财旺。");
        helper.insertSanMing(sanMing);


        //己亥日辰时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("己亥日戊辰时，丑月，杂气财官，贵。戌月，木水运，六、七品。" +
                "寅午子辰年月，大贵。辰时己日不寻常，内有钱龙镇库藏；比劫不逢行运吉，定教富贵广田庄。");
        helper.insertSanMing(sanMing);


        //己丑日巳时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("己丑日己巳时，辰月，西北运，贵。午未火旺，大贵。申子戌巳，亦吉。己卯日己巳时，夹辰财库，主大富。又，卯以巳为驿马" +
                "，二己通看，谓之坐马。再生午月，禄马俱有，尤为贵命。亥月，财临旺地，官遇长生。巳月，金神遇火，皆主大贵。");
        helper.insertSanMing(sanMing);

        //己卯日巳时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("己日己巳时，金火相合，己以丙为印，巳中有丙，健旺；己巳又为金神，坐于火位，相合。若通火月气，" +
                "四柱不见财星破印，不行财遇，发福非常。若不通月气，或在冬生，虚秀不实。不通，得南运，亦吉。");
        helper.insertSanMing(sanMing);


        //己巳日巳时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("己巳日己巳时，午年月，权威赫赫，名誉昭昭。春月，子孝妻贤。秋冬平常，贵而不显。" +
                "辰戌，财印官食；申，伤官生财，俱作吉推。");
        helper.insertSanMing(sanMing);


        //己未日巳时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("己未日己巳时，拱禄格。若无羊刃七煞，午字填实，不犯空亡，主显贵。" +
                "亥丑辰申年月，行东运，文武极品。此格不如丁巳、丁未，以丁正禄，巳寄禄故也。");
        helper.insertSanMing(sanMing);


        //己酉日巳时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("己酉日己巳时，夏生，金神入火乡，贵显，岁运同前。");
        helper.insertSanMing(sanMing);


        //己亥日巳时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("己亥日巳时，夏生，资财满目，行乐轩昂。冬，平常，戌月、东南运，国师、金紫。寅月，亦贵。");
        helper.insertSanMing(sanMing);


        //己丑日午时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("己丑日庚午时，寅月生，贵；夏凶；秋暴；冬，财旺子少。");
        helper.insertSanMing(sanMing);

        //己卯日午时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("己卯日庚午时，已禄居午，年月有甲丙及寅午者，大贵。卯月，煞旺庚合，权贵。");
        helper.insertSanMing(sanMing);


        //己巳日午时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("己巳日庚午时，贵。寅午戌月，金神入火乡，作印绶论，贵显，辰戌丑未年月，侯伯。" +
                "若逢合煞运，必不善终。酉月、东南运，贵。");
        helper.insertSanMing(sanMing);


        //己未日午时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("己未日庚午时，背禄伤官，六亲刑克；无破，晚年发旺。未戌年月，贵。");
        helper.insertSanMing(sanMing);


        //己酉日午时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("己日庚午时，日禄归时。已见庚为伤官，乙为正鬼；午上有明庚合乙，伤官合煞，主人独立有成。" +
                "若年月无乙而伤官临于败地，柱有甲、丙二字，伏晶格，不损格局无冲破，主大贵。");
        helper.insertSanMing(sanMing);


        //己亥日午时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("己亥日庚午时，午戌年月，财官禄印，大贵。寅年午月，巨富。卯月，西运。贵。己逢庚午时归禄，无破无冲能发福；柱中丙申若相逢，德润身兮富润屋。己日时逢庚午，名为背禄伤官。冲刑破害祸多端，骨肉六亲冰炭。" +
                "甲丙柱中如遇，伏晶之格清闲。月中丹桂任高攀，富贵不须推算。");
        helper.insertSanMing(sanMing);


        //己丑日未时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("己丑日辛未时，不贵即富。通土气月，富。通木气月，贵。一云刑，凶。");
        helper.insertSanMing(sanMing);

        //己卯日未时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("己卯日辛未时，酉戌亥卯，未年月，贵，行东南运，金紫。");
        helper.insertSanMing(sanMing);


        //己巳日未时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("己巳日辛未时，金神日。寅午戌月生，贵；亥卯辰午，行金火水木运，大贵。");
        helper.insertSanMing(sanMing);


        //己未日未时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("己未日辛未时，春夏、丑月，丰姿特达，言语清辨，名高禄重。秋冬，平常。木火运，刑害发财。一云财中自害。");
        helper.insertSanMing(sanMing);


        //己酉日未时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("己酉日辛未时，春反复；夏吉；秋寿促；冬财帛丰厚。卯月金水运，五品以上贵。" +
                "丑月西南运，郎官。辰戌，财印库地俱吉。一云凶刑后旺。");
        helper.insertSanMing(sanMing);


        //己亥日未时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("己亥日辛未时，春贵，夏稳，秋贫，冬富。酉月，己土长生，食神遇禄，享受自然。一云贵中凶失。");
        helper.insertSanMing(sanMing);


        //己丑日申时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("己丑日壬申时，酉年月，天干透印，富贵好礼，为人慨慷。辰戌吉。亥年，干清坤夷大格。寅申，官贵相辅，俱吉。");
        helper.insertSanMing(sanMing);

        //己卯日申时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("己卯日壬申时，辰月，杂气财官，早贵。亥月、南方运，五、六品贵。寅申年，三、二品贵。");
        helper.insertSanMing(sanMing);


        //己巳日申时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("己巳日壬申时，大凶，刑。己酉丑月，伤官，行财运，吉。寅午戌月，金神入火乡，运西南，贵。" +
                "申子辰月，木火运，贵。");
        helper.insertSanMing(sanMing);


        //己未日申时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("己未日壬申时，巳月生，贯朽粟陈。亥子寅月，金火运，侯伯。辰亥年月，近侍，贵。");
        helper.insertSanMing(sanMing);


        //己酉日申时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("己酉日壬申时，巳酉丑月，伤官伤尽，吉。寅月，凶暴。卯未，武职。子未公侯。一云主心狂贤病，大贵。");
        helper.insertSanMing(sanMing);


        //己亥日申时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("己亥日壬申时，卯未、三合会官，干透印，大贵。戊子月，财旺生官。酉己土受生，干透甲丙，俱吉。" +
                "日干是己会申时，无破无冲最合宜；柱中纵然官不现，也交财旺定根基。");
        helper.insertSanMing(sanMing);


        //己丑日酉时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("己丑日癸酉时，春平；夏稳；秋伤官伤尽，有威权；冬富。如丙寅巳月，金神遇火，贵。" +
                "丑月，金水运，郎官。透乙，大贵。");
        helper.insertSanMing(sanMing);

        //己卯日酉时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("己卯日癸酉时，时日相逢卯酉，主迁移；刑伤又伤官带煞， 主性凶暴，作事迟延。生四季月，吉。");
        helper.insertSanMing(sanMing);


        //己巳日酉时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("己巳日癸酉时，巳酉丑月，伤官伤尽，居武职、风宪。卯戌月，金神入火乡，贵而能言，伤贵，收心早退，以水土败在酉故也。");
        helper.insertSanMing(sanMing);


        //己未日酉时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("己未日癸酉时，戌亥丑辰年月，西方运，贵。子巳大贵。卯、辰，近侍不大。");
        helper.insertSanMing(sanMing);


        //己酉日酉时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("己酉日癸酉时，偏财遇食，主峥嵘。丑未子午俱吉。酉月、内戚。如年月己酉全，犯破碎煞，主一生破败，游走无结果。");
        helper.insertSanMing(sanMing);


        //己亥日酉时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("己亥日癸酉时，通土气月，行木火运，贵。己逢癸水酉时生，食神生旺自从容；" +
                "身弱更兼冲克破，此命依算只中平。");
        helper.insertSanMing(sanMing);


        //己丑日戌时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("己丑日甲戌时，克父太旺。辰月生，土厚。居巳午末申，临官、帝旺，吉。亥戌寅卯，土病死，凶。" +
                "酉辰，三、四品，贵，中年退闲。亥木火运，六、七品，贵。");
        helper.insertSanMing(sanMing);

        //己卯日戌时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("己卯日甲戌时，丙丁午戌年月，干有庚辛制伏官煞，生山明水秀地方，官至二、三品。未酉丑月，行土火运，四、五品。" +
                " 午月、东北运，大贵。子运、木火运，风宪。辰巳有倚托者，极品。");
        helper.insertSanMing(sanMing);


        //己巳日戌时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("己巳日甲戌时，寅午戌月，金神入火乡，贵显。亥戌年月，官居守令，极有声名。子月、木火运，极品。");
        helper.insertSanMing(sanMing);


        //己未日戌时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("己末日甲戌时，克陷遭刑。寅午年月，三、四品，贵。戌月、东南运，五品。纯辛卯年月，刑。");
        helper.insertSanMing(sanMing);


        //己酉日戌时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("己酉日甲戌时，辰丑刑冲，财源益进。酉戌相害，名利中平。子月，己贵。寅月，官印，行印运，贵。" +
                "纯乙酉年月，顽暴。一云孤独离乡。");
        helper.insertSanMing(sanMing);


        //己亥日戌时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("己亥日甲戌时，通土气月，要行木运；通水木月，要行身旺运，俱贵。");
        helper.insertSanMing(sanMing);


        //己丑日亥时
        sanMing.setRiGanZhi(JI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("己丑日乙亥时，巳酉丑月，制煞留官，贵。午月，身旺，亦贵。子月、火运、七、八品，贵。卯未，透辛制乙，大贵。");
        helper.insertSanMing(sanMing);

        //己卯日亥时
        sanMing.setRiGanZhi(JI_MAO);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("己卯日乙亥时，卯月，偏官格，煞重身柔，作弃命看。壬字暗逢，志气轩昂；柱有制伏，行土金运，" +
                "官至三、四品。丑月，杂气。辰、巳，西运，金紫。亥月，水运，夭。");
        helper.insertSanMing(sanMing);


        //己巳日亥时
        sanMing.setRiGanZhi(JI_SI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("己巳日乙亥时，寅午戌月，金神入火乡，贵。巳月、西北运，官至公卿。" +
                "卯午，风宪。纯子亥年月，以财党煞，作弃看，主大兵权。");
        helper.insertSanMing(sanMing);


        //己未日亥时
        sanMing.setRiGanZhi(JI_WEI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("己未日乙亥时，无刑破混杂，清高、富贵，文学堪夸。");
        helper.insertSanMing(sanMing);


        //己酉日亥时
        sanMing.setRiGanZhi(JI_YOU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("己酉日乙亥时，春夏，显达；秋，制伏太过，贫儒；冬，财旺。午巳戌年月，六、七品，贵。" +
                "寅月，行金火运，四、五品，贵。");
        helper.insertSanMing(sanMing);


        //己亥日亥时
        sanMing.setRiGanZhi(JI_HAI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("己亥日乙亥时，年月透辛制，贵；无制，亦主特达。戌月，风宪。已，亦贵。" +
                "丑，土厚之宫，官至三品。一云自刑，多成败，晚富。");
        helper.insertSanMing(sanMing);


        //庚子日子时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("庚子日丙子时，贵。年月再子，并冲，午中丁为官，己为印，" +
                "人飞天禄马格；柱无财官填实，主贵；为僧道，一尘不染，万法皆成；为常人，有名有利，刑伤妻子。一说先贫后富。" +
                "忌己巳月，破刑，贫。癸未月，孤单。巳亥月、刑。");
        helper.insertSanMing(sanMing);


        //庚寅日子时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("庚寅日丙子时，春生，带财带煞，行金水运，金紫。夏，煞旺，大贵。秋，身旺，须行南运，贵。冬，身鬼俱弱，平常。" +
                " 纯午年月，位至公卿。壬子，食前煞后随；一阳生后，丙火有气，贵极人臣。忌癸酉月，破败，凶。辛亥月，血光。" +
                "甲子月，夭。");
        helper.insertSanMing(sanMing);


        //庚辰日子时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("庚辰日丙子时，月通木火气，行西运，妙。乙巳月，破败，刑。丁酉月，旺中刑，凶。己丑月，破败，凶。");
        helper.insertSanMing(sanMing);


        //庚午日子时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("庚午日丙子时，贵。时日相冲，忧伤妻子，运喜西南，通火木月气，风宪三四品。秋生，丙火无气，难为子息。" +
                "忌己巳月，破祖，凶。己亥月，被劫盗，凶。癸丑月，孤。");
        helper.insertSanMing(sanMing);


        //庚申日子时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("庚申日丙子时，申月，生土厚地方，贵。辰未年月，行西运金，方吉。辛巳月，凶刑。辛亥月，孤夭。");
        helper.insertSanMing(sanMing);


        //庚戌日子时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("庚戌日丙子时，春夏生。西南运；秋月、木火运，俱贵。忌乙巳月，凶、破。乙亥月，官灾多，凶刑。" +
                "己丑月，破败，凶。戊戌月，恶死。");
        helper.insertSanMing(sanMing);


        //庚子日丑时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("庚子日丁丑时，春夏，贵；秋平常；冬孤克。");
        helper.insertSanMing(sanMing);


        //庚寅日丑时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("庚寅日丁丑时，魁元。寅卯午未亥月，清秀高命。行午、未运，贵显。通火土年月，贵。");
        helper.insertSanMing(sanMing);


        //庚辰日丑时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("庚辰日丁丑时，丑月，富而寿促。己，近侍，大贵。通火旺土生月，贵；不得，运遇亦富，有名誉。");
        helper.insertSanMing(sanMing);


        //庚午日丑时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("庚午日丁丑时，通土月气，贵；不，亦富，有名声。");
        helper.insertSanMing(sanMing);


        //庚申日丑时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("庚申日丁丑时，丑月，金火运，极品。辰巳午未戌月，官印两旺，贵。申、酉，身太旺，须行木火。" +
                "寅、卯，财太旺，须行金水。亥子，金寒水冷，须行火土运，贵。");
        helper.insertSanMing(sanMing);


        //庚戌日丑时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("庚戌日丁丑时，春财旺；夏官旺；秋平淡；冬无力。");
        helper.insertSanMing(sanMing);


        //庚子日寅时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("庚子日戊寅时，寅午年月，登科显达。纯申，三、四品贵。丑月、金火运，公卿。");
        helper.insertSanMing(sanMing);


        //庚寅日寅时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("庚寅日戊寅时，月通火局或秋生，行身旺运，贵。庚子月，自死。年见辛酉，贫夭残疾。身衰见丙太旺，同论。");
        helper.insertSanMing(sanMing);


        //庚辰日寅时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("庚辰日戊寅时，春夏生，干透丙丁，运行身旺，贵。");
        helper.insertSanMing(sanMing);


        //庚午日寅时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("庚午日戊寅时，寅午戌月，金衰火旺，当带残疾。纯寅，反主极贵。秋，金旺，多贵，但忌时遇亡劫，克身则凶。");
        helper.insertSanMing(sanMing);


        //庚申日寅时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("庚申日戊寅时，时日并冲，忧伤妻子。寅卯辰月、火金运。侯伯。春月、西南运，大贵。寅月，贵显不久。一云先刑后吉。");
        helper.insertSanMing(sanMing);


        //庚戌日寅时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("庚戌日戊寅时，贵。戌月，杂气财官印绶，贵。庚辰年，己卯月者，侯伯。");
        helper.insertSanMing(sanMing);


        //庚子日卯时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("庚子日己卯时，子卯相刑，忧伤妻子，子年月，贵。丑未，官至三品。一云破祖失土，大贵。");
        helper.insertSanMing(sanMing);


        //庚寅日卯时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("庚寅日己卯时，亥卯月，财星格，早荣早退。午戌，三合官局，干透金水，行西北运，吉。");
        helper.insertSanMing(sanMing);


        //庚辰日卯时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("庚辰日己卯时，孤。年月通木气及有倚托者，贵。");
        helper.insertSanMing(sanMing);


        //庚午日卯时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("庚午日己卯时，刑破。申子辰己酉丑，俱行东南运，贵。寅午戌亥卯未，须得西北运为佳。");
        helper.insertSanMing(sanMing);


        //庚申日卯时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("庚申日己卯时，卯月，财星格，不贵即富。丑巳年月，翰林清贵，官至亚卿。一云少贫，中年有小灾，克妻少子。");
        helper.insertSanMing(sanMing);


        //庚戌日卯时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("庚戌日己卯时，少孤母贱，中年贵。卯酉辰丑月，官至公卿。");
        helper.insertSanMing(sanMing);



        //庚子日辰时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("庚子日庚辰时，申月生，井栏叉格。柱并运不见丙丁巳午寅戌字，贵。纯卯年月，位至公侯。");
        helper.insertSanMing(sanMing);


        //庚寅日辰时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("庚寅日庚辰时，龙虎拱门。年月通火土者，贵。纯庚辰，王侯；不然，极凶。若年月遇木火，运再行，极品。");
        helper.insertSanMing(sanMing);


        //庚辰日辰时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("庚辰日庚辰时，魁罡，年月不见财官并戌字，贵；冲破者富。申子年月作井栏叉，行西南运，吉。" +
                "纯庚辰，庚申或乙酉化金通无火气，凶徒小人。一云刑。");
        helper.insertSanMing(sanMing);


        //庚午日辰时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("庚午日庚辰时，自刑，金神入火乡。申月，行火木运，官可六品。");
        helper.insertSanMing(sanMing);


        //庚申日辰时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("庚申日庚辰时，子、申年月入井栏叉。柱、运不逢丙丁巳午字，贵。纯庚申、庚辰，行西北东运，武职极品。");
        helper.insertSanMing(sanMing);


        //庚戌日辰时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("庚戌日庚辰时，魁罡，土厚地方，官高禄重。子月、西南运，贵。寅辰年月，平常。");
        helper.insertSanMing(sanMing);


        //庚子日巳时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("庚子日辛巳时，春富；夏、秋贵；冬贫。辰戌丑未年月，印绶，行西南运，贵。");
        helper.insertSanMing(sanMing);


        //庚寅日巳时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("庚寅日辛巳时，巳酉丑月，身旺，贵。煞旺身弱月，贫。纯申年月，大贵悠久。亥月，东南运、主有权贵。");
        helper.insertSanMing(sanMing);


        //庚辰日巳时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("庚辰日辛巳时，巳酉丑月，身旺，贵。煞旺身弱月，贫。纯申年月，大贵悠久。亥月，东南运、主有权贵。");
        helper.insertSanMing(sanMing);


        //庚午日巳时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("庚午日辛巳时，巳午卯年月，进士风宪。巳申酉戌，行土木运，侯伯。");
        helper.insertSanMing(sanMing);


        //庚申日巳时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("庚申日辛巳时，刑。巳酉丑月，特达。春夏，木火旺，财官得地，吉。辰戌丑未，印绶，行南运，贵。");
        helper.insertSanMing(sanMing);


        //庚戌日巳时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("庚戌日辛巳时，年月遇财，吉。午未，行东南运，文职操权，恐无好终。寅申、翰林宰辅；若行火运，亦难善终。");
        helper.insertSanMing(sanMing);



        //庚子日午时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("庚子日壬午时，时日并冲，忧伤妻子。通金气，贵。火气，大贵，但多忧劳禄。");
        helper.insertSanMing(sanMing);


        //庚寅日午时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("庚寅日壬午时，辰戌丑未巳申酉月，身旺，俱贵。寅午，火旺，运气再遇，寿促；不然，残疾。");
        helper.insertSanMing(sanMing);


        //庚辰日午时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("庚辰日壬午时，食神旺，善饮食，有操持，发即死。");
        helper.insertSanMing(sanMing);


        //庚午日午时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("庚午日壬午时，寅午戌月、金柔火旺，畏缩残疾。亥子午月、行木火运，贵。");
        helper.insertSanMing(sanMing);


        //庚申日午时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("庚申日壬午时，禄马同乡，最吉。如午未年月，位至台阁。卯辰已，贵。戌月、行火土运，清虚冷职。");
        helper.insertSanMing(sanMing);


        //庚戌日午时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("庚戌日壬午时，卯月，正财，吉。未月，杂气财官，贵。辰丑月同。壬庚会合临午，无破无冲福自来；从此名利皆有望，贵人举荐上天阶。");
        helper.insertSanMing(sanMing);


        //庚子日未时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("庚子日癸未时，年月无丁透露，有己土制伏癸水者，贵。");
        helper.insertSanMing(sanMing);


        //庚寅日未时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("庚寅日癸未时，贵。辰戌丑未月，高。夏富。岁运同，巳酉申月，身旺，大贵。");
        helper.insertSanMing(sanMing);


        //庚辰日未时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("庚辰日癸未时，魁罡日。辰中有土制癸。年月无丁；贵。卯月，金水运，七品贵。");
        helper.insertSanMing(sanMing);


        //庚午日未时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("庚午日癸未时，贵。酉申巳亥年月，总领兵戎，官至二品。先虚后实。");
        helper.insertSanMing(sanMing);


        //庚申日未时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("庚申日癸未时，酉月，武贵，初年剥权。年月寅午戌、申子辰二局相参，贵。");
        helper.insertSanMing(sanMing);


        //庚戌日未时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("庚戌日癸未时，戌月、东方运，贵。辰月卯年，大贵。秋生最吉。夏，须行西北运。方吉。");
        helper.insertSanMing(sanMing);



        //庚子日申时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("庚子日甲申时，时犯日禄，见财星，柱无巳寅丙，富贵双全。辰戌丑未土能生金，吉。寅午戌，平常。" +
                "申酉，行火木运、贵。寅亥，三、四品，贵。卯，刑。子，多凶。");
        helper.insertSanMing(sanMing);


        //庚寅日申时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("庚寅日甲申时，寅、亥月，官至三品。");
        helper.insertSanMing(sanMing);


        //庚辰日申时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("庚辰日甲申时，日魁罡，又归禄，俱不喜财官、柱无寅午戌丙丁巳字，贵。");
        helper.insertSanMing(sanMing);


        //庚午日申时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("庚午日甲申时，贵。通身旺月，无丙巳寅午丁，伤破，贵。");
        helper.insertSanMing(sanMing);


        //庚申日申时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("庚申日甲申时，贵。无卯午未戌丙丁字，贵。子丑月，金水运，文贵。余见庚申、甲申，专禄归禄。坚金非火不能锻炼，" +
                "故巳午戌月生者，多贵。看归禄有七法，勿以为嫌。财月最吉。");
        helper.insertSanMing(sanMing);


        //庚戌日申时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("庚戌日甲申时，寅巳午戌月，妻贤子孝，贵。《神白经》运：金水带印，主清闲之福。");
        helper.insertSanMing(sanMing);



        //庚子日酉时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("庚子日乙酉时，主富。月通火气，贵：不通，平常，运通亦称意。卯亥年月，帅阃。一云破祖刑凶。");
        helper.insertSanMing(sanMing);


        //庚寅日酉时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("庚寅日乙酉时，刑。寅午戌吉。申子，凶暴。");
        helper.insertSanMing(sanMing);


        //庚辰日酉时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("庚辰日乙酉时，刑。寅卯午年等月，二品权贵。戌亥大贵。《神白经》云：化金，主福厚。");
        helper.insertSanMing(sanMing);


        //庚午日酉时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("庚午日乙酉时，刑，中贵。寅午戌亥卯未二局，贵。已，亦吉。");
        helper.insertSanMing(sanMing);


        //庚申日酉时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("庚申日乙酉时，真刑。寅午戌，大贵。已酉丑，中贵。申子辰，富。亥卯未，凋零，一云财吉。");
        helper.insertSanMing(sanMing);


        //庚戌日酉时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("庚戌日乙酉时，刑后发。寅午戌，官星明朗，贵。亥卯未，富或五、六品贵。已酉丑刃旺持权，" +
                "主发迹于疆场，武臣最宜， 文臣亦主掌兵权，究竟受羊刃之祸。");
        helper.insertSanMing(sanMing);



        //庚子日戌时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("庚子日丙戌时，春，偏官用财，吉。夏，煞旺身衰，凶暴。秋，身煞俱旺。已酉丑月，西方运，腰金衣紫。" +
                "寅亥子月，金 绝病死，多贫贱。一云聋哑、犬狼伤。");
        helper.insertSanMing(sanMing);


        //庚寅日戌时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("庚寅日丙戌时，申子辰月，偏官有制，吉。秋生，身煞俱旺，有禄权。纯午，孤贫无倚，" +
                "不然残疾。丑午行西南，公卿以上贵。纯寅，亦贵。");
        helper.insertSanMing(sanMing);


        //庚辰日戌时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("庚辰日丙戌时，时日相冲，忧伤妻子。月通金水气，贵。木火气重者，艰辛，贫夭或残疾。");
        helper.insertSanMing(sanMing);


        //庚午日戌时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("庚午日丙戌时，申酉亥丑、富，贵三品。已午未申，透出壬字，艮坎干方运，卿相有寿。");
        helper.insertSanMing(sanMing);


        //庚申日戌时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("庚申日丙戌时，戌亥年月，东南运，贵。申月，大贵。");
        helper.insertSanMing(sanMing);


        //庚戌日戌时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("庚戌日丙戌时，辰戌丑未、印绶生助，吉。申子辰，偏官有制，贵。月通金气，不透壬字，行北运，贵。");
        helper.insertSanMing(sanMing);



        //庚子日亥时
        sanMing.setRiGanZhi(GENG_ZI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("庚子日丁亥时，贵。申子辰月，伤官、劳碌。卯月、金火运、五六品贵。");
        helper.insertSanMing(sanMing);


        //庚寅日亥时
        sanMing.setRiGanZhi(GENG_YIN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("庚寅日丁亥时，平，初贫，中秀，末主富旺。辰戌年月，贵显。申酉亥卯已午年月，干透乙已者，大贵。");
        helper.insertSanMing(sanMing);


        //庚辰日亥时
        sanMing.setRiGanZhi(GENG_CHEN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("庚辰日丁亥时，纯未，显达。已午，西北运，风宪、金紫。亥卯、金紫，有权。申月，建禄，最吉。");
        helper.insertSanMing(sanMing);


        //庚午日亥时
        sanMing.setRiGanZhi(GENG_WU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("庚午日丁亥时，贵。辰戌丑未月，土能生金，荣显。申亥酉月，行木火运，极品。");
        helper.insertSanMing(sanMing);


        //庚申日亥时
        sanMing.setRiGanZhi(GENG_SHEN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("庚申日丁亥时，秋生，南运，贵显；北运，平常。");
        helper.insertSanMing(sanMing);


        //庚戌日亥时
        sanMing.setRiGanZhi(GENG_XU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("庚戌日丁亥时，辰已午月，官煞虽混，亦主武贵。丑月，西运，郎官。辰月，西北运，方面。");
        helper.insertSanMing(sanMing);


        //辛丑日子时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("辛丑日戊子时，丑月，杂气财官，贵。纯丑，儒职。纯辰、行西运，都宪。酉月，东北运，贵。" +
                "忌庚寅月，刺面，凶。癸未月，受刑。癸丑月。破败孤凶。");
        helper.insertSanMing(sanMing);


        //辛卯日子时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("辛卯日戊子时，春生，寅贫、卯贵。夏清贵。秋羊刃，无益。冬富，丑月尤吉。辰戌未月，财官印绶、俱吉。" +
                "《神白经》云：金火化，主贵。忌辛卯月，父母凶死。辛已月， 大凶。壬申月，尸不全死。");
        helper.insertSanMing(sanMing);


        //辛巳日子时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("辛已日戊子时，寅已午月，正官，贵显。亥子，伤官，子少妻多。卯戌，五品贵。" +
                "《神白经》云：金化象，主贵。忌丙寅月，刑、平。乙已月，先贫。丁酉月，夭。");
        helper.insertSanMing(sanMing);


        //辛未日子时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("辛未日戊子时，贵。寅已午酉年月，火木运，贵。亥子，翰苑。辰戌丑未，杂气财官印，俱吉。" +
                "忌庚申月，尸不全死。壬子月，孤凶。癸丑月，凶刑死。");
        helper.insertSanMing(sanMing);


        //辛酉日子时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("辛酉日戊子时，子酉月生，无丙丁火，不行南运，三、四品贵。伤妻子；武职权重。《神白经》云：金火化，主贵，" +
                "破祖方发。忌壬寅月，凶死。辛已月，大败，祖凶。庚戌月，凶死。");
        helper.insertSanMing(sanMing);


        //辛亥日子时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("辛亥日戊子时，不贵则富。亥月，无官，伤官伤尽，发福子少。春夏，亥子丑，木火运局，金紫风宪。");
        helper.insertSanMing(sanMing);


        //辛丑日丑时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("辛丑日己丑时，孤浊滞生。申酉月，金旺，运行火乡，疏通，刑伤妻子；为僧道，贵。纯丑，西南运，大贵。");
        helper.insertSanMing(sanMing);


        //辛卯日丑时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("辛卯日己丑时，寅卯亥未等月，财星格，南方运，贵。辰戌丑未，印绶，南方运，吉。");
        helper.insertSanMing(sanMing);


        //辛巳日丑时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("辛已日己丑时，丑已申酉月生，金多克木，损伤妻子；僧道，贵。寅卯辰。月，南运，贵。");
        helper.insertSanMing(sanMing);


        //辛未日丑时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("辛未日己丑时，寅卯未月，财星格。已午，官显。");
        helper.insertSanMing(sanMing);


        //辛酉日丑时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("辛酉日己丑时，破祖。已酉丑月，金多克木，俊俏有财，难为妻子。寅午月，近侍，贵。");
        helper.insertSanMing(sanMing);


        //辛亥日丑时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("辛亥日己丑时，寅已午月，官星明朗，立计成象。卯未，财局，富贵。未戌，冲，吉。申、子、辰月月，" +
                "金水泄秀，佳。酉建禄、行木火运、吉。纯亥，金水泄秀，贵。");
        helper.insertSanMing(sanMing);


        //辛丑日寅时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("辛丑日庚寅时，春贵；夏官旺；秋显达；冬吉。丑月、南运，风宪或武贵。" +
                "一云发即风疾。年月酉、申金，无火气、贫夭。");
        helper.insertSanMing(sanMing);


        //辛卯日寅时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("辛卯日庚寅时，午未亥子，俱贵。寅卯申酉，六、七品贵。");
        helper.insertSanMing(sanMing);


        //辛巳日寅时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("辛巳日庚寅时，春贵；夏官禄，行西北运，大贵；秋身旺；冬暴狠。一云刑后有财。");
        helper.insertSanMing(sanMing);


        //辛未日寅时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("辛未日庚寅时，已未丑月，名标金标，妻贤子孝，晚年风疾。寅卯午戌，俱吉。");
        helper.insertSanMing(sanMing);


        //辛酉日寅时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("辛酉日庚寅时，贵。春财聚；夏官禄成；秋身旺；亥子丑戌午酉等年月，俱贵。");
        helper.insertSanMing(sanMing);


        //辛亥日寅时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("辛亥日庚寅时，贵，主有暗疾。干透丙，发。午酉寅亥年月，南方运，贵。");
        helper.insertSanMing(sanMing);



        //辛丑日卯时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("辛丑日辛卯时，春、夏生土厚地方，富贵。秋，克妻刑子。冬、艰辛。寅巳午月，" +
                "近待，贵。甲戌年月、木火运，风宪。");
        helper.insertSanMing(sanMing);


        //辛卯日卯时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("辛卯日辛卯时，寅午戌月，财官双美，贵显。卯酉申辰年月，近侍，贵；见官印财星，妙。一云先苦，中年大发。");
        helper.insertSanMing(sanMing);


        //辛巳日卯时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("辛巳日辛卯时，春，财旺；夏、官旺、秋，身强；冬，懦弱。巳酉年月，行木火运，贵戚。" +
                "申月、水火运，金紫。巳月、 西北运，风宪。");
        helper.insertSanMing(sanMing);


        //辛未日卯时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("辛未日辛卯时，纯未、丁年月，虽大权贵，不善终。寅巳亥，纯吉。");
        helper.insertSanMing(sanMing);


        //辛酉日卯时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("辛酉日辛卯时，出身孤苦，中年获福，末年封妻荫子，贵。巳月，官印逢天德，贵当一品。丑月、木火运、中贵。" +
                "申酉亥年月，东南运，风宪。");
        helper.insertSanMing(sanMing);


        //辛亥日卯时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("辛亥日辛卯时，春夏，财官双美，贵显。秋冬，背禄逐马、劳碌反复。纯亥，金水泄秀，多发高科。辰戌，吉。丑未，尤吉。");
        helper.insertSanMing(sanMing);


        //辛丑日辰时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("辛丑日壬辰时，春，财旺，妻贤子孝。夏，伤官见官，然亦多富。秋吉。冬，孤克，多贵。");
        helper.insertSanMing(sanMing);


        //辛卯日辰时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("辛卯日壬辰时，春、伤官生财。夏，行藏反复，或凶暴。午未亦奇。秋，申酉身旺，得火则吉。" +
                "冬，亥子伤官伤尽，有木土为妙；贵重轻高，未免刑克。辰戌丑未主武贵。");
        helper.insertSanMing(sanMing);


        //辛巳日辰时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("辛巳日在辰时，春、显达；夏，平常；有名利，主暴虐。酉月、行东运，贵。戌未，四库全，最贵。" +
                "纯未，杂气财印。丑未，冲开，主有权贵。");
        helper.insertSanMing(sanMing);


        //辛未日辰时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("辛未日壬辰时、身孤。春生，财星格，吉。夏，劳碌。秋，贵。冬，伤官伤尽，为奇。");
        helper.insertSanMing(sanMing);


        //辛酉日辰时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("辛酉日壬辰时，春，富贵双全。夏好。秋身旺，贵。冬，白丁；子月，辛生地，学堂，主文学。" +
                "年月火济，贵。甲戌月， 三品。");
        helper.insertSanMing(sanMing);


        //辛亥日辰时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("辛亥日壬辰时，贵。春，财旺扶身。夏吉。秋身旺，好。冬，伤官伤尽，自立自成。卯未年月，贵。");
        helper.insertSanMing(sanMing);


        //辛丑日巳时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("辛丑日癸巳时，凶，别父母发福。春夏，吉。秋冬，凶暴。一云化贵、戒酒。");
        helper.insertSanMing(sanMing);


        //辛卯日巳时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("辛卯日癸巳时，春夏，身弱寿促。秋，身强、劳力辛苦。如月气火木，三、四品贵。");
        helper.insertSanMing(sanMing);


        //辛巳日巳时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("辛巳日癸巳时，化贵。子午年，寅午戌月，贵，亥卯未，清贵。申子辰，无义之人。辛巳癸巳，" +
                "两干不杂寅辰，透丙，俱主极贵。丑酉三合，亦吉。");
        helper.insertSanMing(sanMing);


        //辛未日巳时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("辛未日癸巳时，寅午戌月，高命。巳酉丑，身旺平稳。申子辰，白丁。亥卯未，清贵。");
        helper.insertSanMing(sanMing);


        //辛酉日巳时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("辛酉日癸巳时，贵显，酒色重。寅卯，财旺，吉。丑，三合全，富贵。");
        helper.insertSanMing(sanMing);


        //辛亥日巳时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("辛亥日癸巳时，时日并冲，忧伤妻子。春财旺。夏，吉。秋，平。冬，凶暴。酉午年月，木火运，风宪、都堂。");
        helper.insertSanMing(sanMing);


        //辛丑日午时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("辛丑日甲午时，未申年月，四柱有利害，虽富寿夭。通金，虽贵不永。");
        helper.insertSanMing(sanMing);


        //辛卯日午时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("辛卯日甲午时，卯月，武贵。寅戌，破祖；不然，残夭。巳午七、八品贵。运同。");
        helper.insertSanMing(sanMing);


        //辛巳日午时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("辛巳日甲午时，平。寅午戌，官旺，吉。申子辰、平常。卯戌年，官印双全，公候。");
        helper.insertSanMing(sanMing);


        //辛未日午时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("辛未日甲午时，申子辰，偏官有制，吉。丑戌，方面。未月。贵。");
        helper.insertSanMing(sanMing);


        //辛酉日午时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("辛酉日甲午时，春，财旺；夏，官贵，俱吉。秋，身强，虽富不永，冬，平常。");
        helper.insertSanMing(sanMing);


        //辛亥日午时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("辛亥日甲午时，亥子年月，金水氵亟秀，文学堪夸。辰戌丑未、杂气财官，贵显。");
        helper.insertSanMing(sanMing);


        //辛丑日未时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("辛丑日乙未时。刑。亥卯未寅月，财旺生官不贵则富。辰戌丑子，俱吉。");
        helper.insertSanMing(sanMing);


        //辛卯日未时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("辛卯日乙未时，亥卯未月，财盛生官，吉。");
        helper.insertSanMing(sanMing);


        //辛巳日未时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("辛巳日乙未时，月通金火，贵。运通，亦贵。");
        helper.insertSanMing(sanMing);


        //辛未日未时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("辛未日乙未时，寅卯未年月，财旺生官，名高禄重。通火气，行西运；通金气，行南，俱吉。");
        helper.insertSanMing(sanMing);


        //辛酉日未时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("辛酉日乙未时，月通火气，行东运，贵。辰戌丑未，最吉。亥卯，贵显不久。秋生，身太旺，财官无气，凶夭。");
        helper.insertSanMing(sanMing);


        //辛亥日未时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("辛亥日乙未时，亥卯未月，财星格。吉。秋冬，孤独。辰、丑，近侍三品。");
        helper.insertSanMing(sanMing);



        //辛丑日申时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("辛丑日丙申时，化贵。少年蹇剥，中贵显。亥月，作化气看。吉。寅午戊巳未月，官星有气；春，财旺，俱吉。");
        helper.insertSanMing(sanMing);


        //辛卯日申时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("辛卯日丙申时，化贵。寅巳午未戌酉亥月，官星明朗，山明水秀，登科荣贵。通士气，亦贵。一云少蹇、中、末好。");
        helper.insertSanMing(sanMing);


        //辛巳日申时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("辛巳日丙申时，见血则福；又云贵中失。申未年月，身厚，妻重子孝，武职三品。");
        helper.insertSanMing(sanMing);


        //辛未日申时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("辛未日丙申时，因贵人门下得富。春，清贵。夏，平常。秋，富。冬，大贵寿促。《神白经》云：金水乖合，又化水，主贵。");
        helper.insertSanMing(sanMing);


        //辛酉日申时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("辛酉日丙申时，寅巳午戌月，官旺，荣贵。︽神白经︾云：水化主贵。");
        helper.insertSanMing(sanMing);


        //辛亥日申时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("辛亥日丙申时，发福，防孤克带疾。通金气，主人秀丽福厚。通水气，大贵。");
        helper.insertSanMing(sanMing);


        //辛丑日酉时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("辛丑日丁酉时，高平稳。酉月、土木运，方面。戌亥子巳未年月，大贵。");
        helper.insertSanMing(sanMing);


        //辛卯日酉时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("辛卯日丁酉时，时日并冲。月通金气，不透丙丁，南方运，贵。");
        helper.insertSanMing(sanMing);


        //辛巳日酉时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("辛巳日丁酉时，平。亥月，反复不定。午月，偏官带疾，显达寿促。子月，贵戚。一云有财有喜，寿不过三十一。");
        helper.insertSanMing(sanMing);


        //辛未日酉时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("辛未日丁酉时，不贵则富。月通金气，无丙丁字，行南运，贵。");
        helper.insertSanMing(sanMing);


        //辛酉日酉时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("辛酉日丁酉时，年月通金气，吉。丑月，西方运，风宪。寅午戌，贵。");
        helper.insertSanMing(sanMing);


        //辛亥日酉时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("辛亥日丁酉时，贵。丑寅卯酉年月；近待、金紫。");
        helper.insertSanMing(sanMing);


        //辛丑日戌时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("辛丑日戊戌时，刑害。辰戌丑未，印绶，行南运，大贵。寅巳，正官，贵。子午卯酉，武职风宪。");
        helper.insertSanMing(sanMing);


        //辛卯日戌时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("辛卯日戊戌时，刑害，饕餮。亥，卯月，木火运，五、六品贵。");
        helper.insertSanMing(sanMing);


        //辛巳日戌时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("辛巳日戊戌时，辰戌丑未月，印绶，文贵少病；生土厚分野，贵。戌月，行木火运，风宪。");
        helper.insertSanMing(sanMing);


        //辛未日戌时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("辛未日戊戌时，凶恶狠暴，忧伤妻子。寅巳午戌丑月，贵。申子辰亥，金水氵亟秀，尤贵。一云克父母，身旺，中年富。");
        helper.insertSanMing(sanMing);


        //辛酉日戌时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("辛酉日戊戌时，凶刑。巳酉丑辰戌未年月，魁元，卿、尹之命。");
        helper.insertSanMing(sanMing);


        //辛亥日戌时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("辛亥日戊戌时，凶狠、机谋奸猾，计较。一云凶后发。");
        helper.insertSanMing(sanMing);


        //辛丑日亥时
        sanMing.setRiGanZhi(XIN_CHOU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("辛丑日己亥时，辰戌丑未及寅卯月生，作飞天禄马，贵。未月，金水运，金紫方面。");
        helper.insertSanMing(sanMing);


        //辛卯日亥时
        sanMing.setRiGanZhi(XIN_MAO);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("辛卯日己亥时，寅卯亥未月，财旺生官，终身有庆。巳酉丁年月，贵。");
        helper.insertSanMing(sanMing);


        //辛巳日亥时
        sanMing.setRiGanZhi(XIN_SI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("辛巳日己亥时，填实巳字，不入飞天格，作官印论，主父母竭力扶持而后富贵。");
        helper.insertSanMing(sanMing);


        //辛未日亥时
        sanMing.setRiGanZhi(XIN_WEI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("辛未日己亥时，贵。亥卯未寅月，金能克木，为财盛生官，名利贵显，巳午年月，富贵。秋生，透丙，亦吉。");
        helper.insertSanMing(sanMing);


        //辛酉日亥时
        sanMing.setRiGanZhi(XIN_YOU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("辛酉日己亥时，辰戌丑未、杂气财官，吉。纯亥，冲巳中丙火为官，贵。");
        helper.insertSanMing(sanMing);


        //辛亥日亥时
        sanMing.setRiGanZhi(XIN_HAI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("辛亥日己亥时，年月再亥，飞天禄马，三、四品，贵；武职极品；侯、伯。寅巳，填实，则减。子辰年月，亦吉。");
        helper.insertSanMing(sanMing);



        //壬子日子时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("壬子日庚子时，辰戌丑未月，杂气财官；巳申酉丑，印绶，居土厚分野，俱贵。寅月，金水运，近侍金紫。" +
                "午月，行西运，六品，子运败凶。若纯壬子羊刃，贫凶。一云，少年富，三十五后艰辛，末大富。忌辛巳月凶恶死，辛亥月大凶，甲子月刑。");
        helper.insertSanMing(sanMing);


        //壬寅日子时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("壬寅日庚子时，贵而刑。辰戌丑未月，杂气财官；巳申酉月，印绶，俱贵。忌乙巳月受刑，丁酉月大破，祖恶死，乙亥月刑。");
        helper.insertSanMing(sanMing);


        //壬辰日子时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("壬辰日庚子时，若寅午月生，财星旺；辰戌丑未，官旺，俱吉。纯辰，透庚壬，作壬骑龙背格，大贵。忌丙辰月，夭死，尸不全；丁未月破祖，孤；辛丑月大破，刑。");
        helper.insertSanMing(sanMing);


        //壬午日子时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("壬午日庚子时，时日并冲，女多男少。丑未月，行南运，富贵。余年月，观诸贵命可见。忌甲午月自刑，多是非；癸酉月大破，失乡恶死；辛亥月恶死。");
        helper.insertSanMing(sanMing);


        //壬申日子时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("壬申日庚子时，贫、刑。未月，杂气财官，行财旺运贵显，先难后易。辰，会水太旺，须行火土运，吉。丑、戌，财官印绶，俱吉。" +
                "春冬平常，秋夏吉庆。忌乙巳月受刑，夭；丁酉，夭；乙亥月孤，自刑。");
        helper.insertSanMing(sanMing);


        //壬戌日子时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("壬戌日庚子时，夭。丑月金火运，辰未财官格，俱贵。寅酉，行西北运，贵。申子辰，行东南运，极品。" +
                "忌巳酉月，孤单凶；丁亥月，凶刑恶死；辛丑月，刑。");
        helper.insertSanMing(sanMing);



        //壬子日丑时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("壬子日辛丑时，巳酉丑月，印绶，多受父母荫。申月，火 土运，近侍有权。辰戌丑未，有官有印，丰资旷达，" +
                "名播天涯。寅午戌月，财破，禄印不成局，平常。亥申年月，贵");
        helper.insertSanMing(sanMing);


        //壬寅日丑时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("壬寅日辛丑时，丑月，杂气印绶高。辰巳，煞强无制伏，财官身弱，辛苦。");
        helper.insertSanMing(sanMing);


        //壬辰日丑时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("壬辰日辛丑时，辰戌丑未，杂气财官印绶，俱吉。春平，夏财禄，秋吉，中有凶。冬身旺，须行南运方显。");
        helper.insertSanMing(sanMing);


        //壬午日丑时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("壬午日辛丑时，禄马同乡，贵。夏吉。秋，财官印全，亦贵。");
        helper.insertSanMing(sanMing);


        //壬申日丑时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("壬申日辛丑时，寅卯亥未年月，进士风宪，官至二品，终有起倒。辰戌，富足。申酉，享用自然，行北运亦贵。");
        helper.insertSanMing(sanMing);


        //壬戌日丑时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("壬戌日辛丑时，辰月，冲开财官，贵。丑戌，亦吉。柱有乙癸卯字，平常。");
        helper.insertSanMing(sanMing);



        //壬子日寅时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("壬子日壬寅时，纯子，年月无午冲破，入飞天格，富贵。寅卯巳申酉戌亥年月，俱贵。");
        helper.insertSanMing(sanMing);


        //壬寅日寅时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("壬寅日壬寅时，壬趋艮格，土厚地方，山明水秀，腰金衣紫。巳亥年月，武职三品，富厚纯笃。寅年午月，行北运，" +
                "金紫。巳月，行西北运，贵。辰戌丑未，亦吉。纯寅尤吉。一云中年贵，五十后大厄。");
        helper.insertSanMing(sanMing);


        //壬辰日寅时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("壬辰日壬寅时，纯辰，壬骑龙背格，干头无丙丁戊己，运行比肩，大贵。纯寅大富。卯戌月，木金运，三五品贵。午月， 平常。");
        helper.insertSanMing(sanMing);


        //壬午日寅时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("壬午日壬寅时，少年多疾厄。壬午，禄马同乡。辰寅年月，二品贵。" +
                "申酉，高尚，若通木火，才名冠世，贵。戌月，行东南运，方面极品。");
        helper.insertSanMing(sanMing);


        //壬申日寅时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("壬申日壬寅时，巳酉丑月，武职三品。辛卯、戌月，亦贵。子寅，大贵。一云贫而发，亦不久。");
        helper.insertSanMing(sanMing);


        //壬戌日寅时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("壬戌日壬寅时，巳月，偏官格，名标金榜，身坐玉堂。纯子，三品，寅卯，行北运，风宪。" +
                "又，六壬日见壬寅时，名白太虚贵，不久，盛而祸生。");
        helper.insertSanMing(sanMing);



        //壬子日卯时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("壬子日癸卯时，子卯相刑，忧伤妻子，贵人提携，财帛盈余，敦厚之命。");
        helper.insertSanMing(sanMing);


        //壬寅日卯时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("壬寅日癸卯时，背财败禄，或兴或废。子年月，贵。巳月，财官虽刑，亦贵。辰戌丑未，官煞制刃，俱吉。");
        helper.insertSanMing(sanMing);


        //壬辰日卯时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("壬辰日癸卯时，通身旺月，见土金破刃，行财运，贵。");
        helper.insertSanMing(sanMing);


        //壬午日卯时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("壬午日癸卯时，壬居午位，禄马同乡，又值卯时，贵显荣达。巳午年月，武职风宪。");
        helper.insertSanMing(sanMing);


        //壬申日卯时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("壬申日癸卯时，亥卯未寅月，伤官伤尽，妻贤子孝，土厚贵命。纯辰，医卜。子月水木，贵。");
        helper.insertSanMing(sanMing);


        //壬戌日卯时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("壬戌日癸卯时，甲癸午酉年月，文贵。申，平常，金火运，贵。");
        helper.insertSanMing(sanMing);



        //壬子日辰时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("壬子日甲辰时，纯子年月，飞天禄马，无破，六卿。巳酉，大贵。亥，亦贵。");
        helper.insertSanMing(sanMing);


        //壬寅日辰时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("壬寅日甲辰时，巳月偏官格，不冲不破，贵显。午，正官，贵。辰卯局全，东方，少年登科，荣贵。");
        helper.insertSanMing(sanMing);


        //壬辰日辰时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("壬辰日甲辰时，辰月生，壬骑龙背，大贵。寅月，不贵即富。戌月，杂气财官，冲开辰库，" +
                "高命。子月，断根损叶，成败不定。未月，金水运，贵。");
        helper.insertSanMing(sanMing);


        //壬午日辰时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("壬午日甲辰时，水火灾。寅辰年月，翰苑宿儒，或居祭酒。纯子，风宪。卯寅，富厚。辰子，儒职。");
        helper.insertSanMing(sanMing);


        //壬申日辰时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("壬申日甲辰时，水火灾，丑寅年月，文行武权。纯子，金火运，方面。");
        helper.insertSanMing(sanMing);


        //壬戌日辰时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("壬戌日甲辰时，寅申酉月，行南运，贵戚。亥卯未申子辰巳午年月，俱吉。");
        helper.insertSanMing(sanMing);



        //壬子日巳时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("壬子日乙巳时，贵，但难为妻子，性格刚强，不受击触。戌年月，纯煞有制，行木金运，官至三品。");
        helper.insertSanMing(sanMing);


        //壬寅日巳时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("壬寅日乙巳时，孤高，刑妻克子，如为僧道，富贵。");
        helper.insertSanMing(sanMing);


        //壬辰日巳时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("壬辰日乙巳时，春平，夏财，秋稳实，冬无助救，主贫苦。");
        helper.insertSanMing(sanMing);


        //壬午日巳时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("壬午日乙巳时，辰戌月，贵。亥月，金运，位至都帅。");
        helper.insertSanMing(sanMing);


        //壬申日巳时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("壬申日乙巳时，身坐长生学堂，财帛进退，名利驱驰。木月，行北运，贵。辰戌丑，俱吉。");
        helper.insertSanMing(sanMing);


        //壬戌日巳时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("壬戌日乙巳时，寅年月，入日德格，贵。辰戌丑未，贵。秋印，夏财官，俱吉，春伤、冬旺，看干透何如，亦可取贵。");
        helper.insertSanMing(sanMing);



        //壬子日午时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("壬子日丙午时，公直撑持，孤高而贵。年月子午，字重，水火既济，极品。");
        helper.insertSanMing(sanMing);


        //壬寅日午时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("壬寅日丙午时，寅午戌月，财星格，但嫌身弱，宜僧道，吉。秋生，印绶。冬，身旺，行金火运，金紫。");
        helper.insertSanMing(sanMing);


        //壬辰日午时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("壬辰日丙午时，寅午戌月，财旺，大贵。");
        helper.insertSanMing(sanMing);


        //壬午日午时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("壬午日丙午时，冬日身旺，吉。夏，财多身弱，丑日近侍，贵。寅午，金土运，独弱从强，弃命就财，高命。");
        helper.insertSanMing(sanMing);


        //壬申日午时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("壬申日丙午时，通金水月气，贵；不通，弃命就财，主富，不然，极贫下。");
        helper.insertSanMing(sanMing);


        //壬戌日午时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("壬戌日丙午时，寅月，三合财局，弃命相从，富。秋，身有托，贵。冬亦吉。");
        helper.insertSanMing(sanMing);



        //壬子日未时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("壬子日丁未时，月通木气，贵；通金气，富，通火土气，富贵；两全不通，行火土运，亦吉。");
        helper.insertSanMing(sanMing);


        //壬寅日未时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("壬寅日丁未时，丁壬化木，亥卯未，寅月，贵。");
        helper.insertSanMing(sanMing);


        //壬辰日未时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("壬辰日丁未时，辰月生，壬骑龙背局，贵显。寅月，妻重子荣。三合水局，身旺无倚，多贫克妻。");
        helper.insertSanMing(sanMing);


        //壬午日未时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("壬午日丁未时，春平，夏富，秋贵，冬吉。巳午年月，位至王候。未月，东运，贵。子月，正印、三奇俱藏，贵当极品。");
        helper.insertSanMing(sanMing);


        //壬申日未时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("壬申日丁未时，大富。巳午年月，或透戊己，富贵双全。");
        helper.insertSanMing(sanMing);


        //壬戌日未时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("壬戌日丁未时，日德，封妻荫子，中年又损妻子。亥子申酉月，贵。巳午，不贵即富。辰月夭，月德贵。");
        helper.insertSanMing(sanMing);



        //壬子日申时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("壬子日戊申时，羊刃带煞，贵人提携。巳午年月，近侍有权。");
        helper.insertSanMing(sanMing);


        //壬寅日申时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("壬寅日戊申时，时日相冲，身孤为僧道，吉。如寅午戌或纯辰年月，亦贵。");
        helper.insertSanMing(sanMing);


        //壬辰日申时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("壬辰日戊申时，戌月生，早登科甲，官至方面。寅卯丑申子午等年月，极贵，武职一品。");
        helper.insertSanMing(sanMing);


        //壬午日申时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("壬午日戊申时，偏官偏印。亥卯未寅月，威权。子丑月，木火运，翰林清贵。戌月，行东南运，高品。");
        helper.insertSanMing(sanMing);


        //壬申日申时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("壬申日戊申时，壬水长生，居申，煞旺身强，更生亥卯未月，偏官有制，吉。");
        helper.insertSanMing(sanMing);


        //壬戌日申时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("壬戌日戊申时，破滞多蹇。纯酉，巨富。若不通身旺月，行煞旺乡，不吉。有甲制亦可。戊己土重，主瞎疾平常。");
        helper.insertSanMing(sanMing);



        //壬子日酉时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("壬子日己酉时，春平，夏吉，秋常，冬旺。如卯月生，好花酒。");
        helper.insertSanMing(sanMing);


        //壬寅日酉时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("壬寅日己酉时，大富贵，喜通水气，行官运，贵。但好花酒，风流人物。");
        helper.insertSanMing(sanMing);


        //壬辰日酉时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("壬辰日己酉时，高，月同日，壬骑龙背，大贵。巳月，行东北运，贵。");
        helper.insertSanMing(sanMing);


        //壬午日酉时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("壬午日己酉时，禄马同乡，先难后易。丑寅月，行金水运，武职二品。");
        helper.insertSanMing(sanMing);


        //壬申日酉时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("壬申日己酉时，官印临门，局中无冲破，禄马双全，不贵即富。戌月生，东南方运，腰金衣紫。");
        helper.insertSanMing(sanMing);


        //壬戌日酉时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("壬戌日己酉时，亥寅子月，行财官运，贵显非常。纯亥，文贵。");
        helper.insertSanMing(sanMing);



        //壬子日戌时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("壬子日庚戌时，名利进退，庚辛年月，贵。辰丑，刑冲；酉月，破害，财库得用；巳午，财官旺，俱吉。");
        helper.insertSanMing(sanMing);


        //壬寅日戌时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("壬寅日庚戌时，刑妻克子。若春生，平，夏、冬，吉。辰丑未月，贵。");
        helper.insertSanMing(sanMing);


        //壬辰日戌时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("壬辰日庚戌时，夏月，不富则贵，春平，秋稳，冬辛勤劳苦，或为僧道，有财破刑。");
        helper.insertSanMing(sanMing);


        //壬午日戌时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("壬午日庚戌时，禄马同乡，壬自坐禄，有庚辛制甲乙为贵。辰戌丑未年月，吉。" +
                "申月学堂，文贵大显。亥子水旺，透壬主凶。午戌透戊，煞旺亦凶。");
        helper.insertSanMing(sanMing);


        //壬申日戌时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("壬申日庚戌时，通火木月气，富贵；不通，行通运，亦好。丑戌年月，大贵。");
        helper.insertSanMing(sanMing);


        //壬戌日戌时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("壬戌日庚戌时，不利妻，主被妻妾害，反复成败。纯戌，贵。寅丑，武职。申月，长生学堂，修文多贵。" +
                "亥月，建禄，干透财官；卯月，伤官，干透财星，俱贵。未月，杂气财官，丑戌相刑。吉。");
        helper.insertSanMing(sanMing);



        //壬子日亥时
        sanMing.setRiGanZhi(REN_ZI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("壬子日辛亥时，主父母不得善终，后发不富。亥卯年月，文章进身，大贵。");
        helper.insertSanMing(sanMing);


        //壬寅日亥时
        sanMing.setRiGanZhi(REN_YIN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("壬寅日辛亥时，艰难中发。未月，杂气财官，敦厚，中年贵，五十后终。亥月，东南运，方面。");
        helper.insertSanMing(sanMing);


        //壬辰日亥时
        sanMing.setRiGanZhi(REN_CHEN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("壬辰日辛亥时，秀贵、恶死，午月，干头无己土，青云得路，若有甲合，为去官留煞，三四品贵。酉月亦贵。");
        helper.insertSanMing(sanMing);


        //壬午日亥时
        sanMing.setRiGanZhi(REN_WU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("壬午日辛亥时，平。丑月，风宪。寅月，禄马同乡，行金水运，方面。戌月，东北运，四五品。丑午，僧道官命。");
        helper.insertSanMing(sanMing);


        //壬申日亥时
        sanMing.setRiGanZhi(REN_SHEN);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("壬申日辛亥时，贵。辰戌丑未，杂气财官，吉。年月干无己土，入日禄格，酉月申卯年，行东北运，显贵。");
        helper.insertSanMing(sanMing);


        //壬戌日亥时
        sanMing.setRiGanZhi(REN_XU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("壬戌日辛亥时，少年富贵。亥申巳戌年月，一二品贵。纯戌，水火运，金紫。");
        helper.insertSanMing(sanMing);



        //癸丑日子时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("癸丑日壬子时，午寅、乙丑，己丑年月，文职四五品，通身旺木气月，无戊己午巳字，显贵。" +
                "未，风宪。巳午，进士。忌壬寅、乙未、庚戌月，俱刑。乙丑月，下贱。");
        helper.insertSanMing(sanMing);


        //癸卯日子时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("癸卯日壬子时，时日相刑，伤妻克子，近贵；无己土，威权。若亥巳俱全，进士乌府。" +
                "年月纯寅，伤官生财，非大贵即大富。忌甲辰月凶刑孤，丙申月凶恶死，己丑月刑。");
        helper.insertSanMing(sanMing);



        //癸巳日子时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("癸巳日壬子时，春夏发财福，辰戌丑未，不贵终富。忌戊寅月遭刑，戊申月受刑，己酉月乞丐。");
        helper.insertSanMing(sanMing);


        //癸未日子时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("癸未日壬子时，申酉月，贵。戌亥，大富贵。寅卯，孤。辰巳，凶。忌壬申月，身不全，凶；庚辰月，凶刑；乙丑月，失土凶死。");
        helper.insertSanMing(sanMing);


        //癸酉日子时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("癸酉日壬子时，行藏进退，少子难为妻家。忌丙寅月，不全尸死；乙巳月，大破凶死；丁酉月，自缢死。");
        helper.insertSanMing(sanMing);



        //癸亥日子时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.ZI);
        sanMing.setDuanYu("癸亥日壬子时，贵。亥月生，飞天禄马，登科甲第，大贵。又癸禄居子，壬禄居亥，" +
                "日时互换，三四品贵。忌戊寅月，死不全尸；戊申月孤贫；己酉月孤苦。");
        helper.insertSanMing(sanMing);


        //癸丑日丑时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("癸丑日癸丑时，丑遥巳中丙戊为财官，若生丑寅申子酉三合年月，主妻贤于孝，荣贵特达；火土运凶；金水运吉。");
        helper.insertSanMing(sanMing);


        //癸卯日丑时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("癸卯日癸丑时，日贵格，身孤克，主贵。丑寅辰年月，干支无戊己巳午卯字，极品。");
        helper.insertSanMing(sanMing);



        //癸巳日丑时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("癸巳日癸丑时，福德秀气格，学问聪明，英才特达，贵。若纯丑巳年月，大贵。");
        helper.insertSanMing(sanMing);


        //癸未日丑时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("癸未日癸丑时，子丑寅年月，贵，中年富。卯月，行金水运，极品。辰戌，四库全，大贵。");
        helper.insertSanMing(sanMing);


        //癸酉日丑时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("癸酉日癸丑时，福德秀气格，学问渊源，行藏进退，难为妻家。");
        helper.insertSanMing(sanMing);



        //癸亥日丑时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.CHOU);
        sanMing.setDuanYu("癸亥日癸丑时，拱禄格，怕冲破、填实，柱无子巳午未字， 大贵。寅午戌月，南方运，六七品。");
        helper.insertSanMing(sanMing);



        //癸丑日寅时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("癸丑日甲寅时，本贵，丑中有辛金，减其分数。纯水年月，官至一品。秋生印绶，亦贵。辰月，行东运，贫下。纯申破寅，凶。");
        helper.insertSanMing(sanMing);


        //癸卯日寅时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("癸卯日甲寅时，亥卯未月，至贵。寅卯年月，刑合格，侯伯。寅亥，四品。寅月，西运，金紫。丑戌辰巳，亦贵。");
        helper.insertSanMing(sanMing);



        //癸巳日寅时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("癸巳日甲寅时，平，通身旺月，大贵。忌戊己庚申字，岁运同。");
        helper.insertSanMing(sanMing);


        //癸未日寅时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("癸未日甲寅时，主秀实，中年贵显。若生己未己巳年月，武贵。");
        helper.insertSanMing(sanMing);


        //癸酉日寅时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("癸酉日甲寅时，金神格。寅午戌月，结火局，贵显特达，官至二三品。忌丑年，不贵。" +
                "巳未亥子年月，富寿。辰丑，干透甲丁者，凶。");
        helper.insertSanMing(sanMing);



        //癸亥日寅时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.YIN_DI_ZHI);
        sanMing.setDuanYu("癸亥日甲寅时，子丑未申月，进士，运行金水，风宪。卯戌年月，地支六合，贵。");
        helper.insertSanMing(sanMing);



        //癸丑日卯时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("癸丑日乙卯时，辰丑月，高贵。一云：少贱中年贵。");
        helper.insertSanMing(sanMing);


        //癸卯日卯时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("癸卯日乙卯时，艰难。生寅卯月，伤官格，难言富贵。未戌年月，技艺近贵。辰丑，吉。己丑、丙子，凶。");
        helper.insertSanMing(sanMing);



        //癸巳日卯时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("癸巳日乙卯时，财官双美，春伤官，夏财旺，秋印稳，冬平常。如丑午子亥年月，官至三四品。乙亥、乙酉，残疾。");
        helper.insertSanMing(sanMing);


        //癸未日卯时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("癸未日乙卯时，寅亥卯未月，伤官伤尽，刚断平常。辰戌申子月，贵。");
        helper.insertSanMing(sanMing);


        //癸酉日卯时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("癸酉日乙卯时，申子辰月，贵。寅午戌，中。亥卯未，平。巳酉丑，富。");
        helper.insertSanMing(sanMing);



        //癸亥日卯时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.MAO);
        sanMing.setDuanYu("癸亥日乙卯时，辰己月，风宪。");
        helper.insertSanMing(sanMing);




        //癸丑日辰时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("癸丑日丙辰时，平。辰戌丑未月，财官有气，贵。");
        helper.insertSanMing(sanMing);


        //癸卯日辰时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("癸卯日丙辰时，孤独难为椿萱，有财帛，贵，人钦敬。卯亥年月，日贵格。午戌，九品至五品。寅月，行南运，风宪。");
        helper.insertSanMing(sanMing);



        //癸巳日辰时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("癸巳日丙辰时，子月生，南方，山明水秀，地方，高贵。子未年月，富厚。戌卯，近侍。未戌申，儒官。");
        helper.insertSanMing(sanMing);


        //癸未日辰时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("癸未日丙辰时，高。寅卯未月，平常。辰戌丑月，吉，巳月，财官俱旺，贵。");
        helper.insertSanMing(sanMing);


        //癸酉日辰时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("癸酉日丙辰时，孤，贵。巳酉丑月，贵。寅卯，不吉。子午，富。戌月，大贵。");
        helper.insertSanMing(sanMing);



        //癸亥日辰时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.CHEN);
        sanMing.setDuanYu("癸亥日丙辰时，柱无甲木破损官库，贵，运南。");
        helper.insertSanMing(sanMing);




        //癸丑日巳时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("癸丑日丁巳时，先贫后富，行火水运，发达。");
        helper.insertSanMing(sanMing);


        //癸卯日巳时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("癸卯日丁巳时，若子月，身旺财旺，贵显。");
        helper.insertSanMing(sanMing);



        //癸巳日巳时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("癸巳日丁巳时，财官双美。子月，贵。火月，富。天干透土，地支午未，主大权贵。纯丑，极品。");
        helper.insertSanMing(sanMing);


        //癸未日巳时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("癸未日丁巳时，寅午戌月，身财旺显，秋冬禄旺，伤残疾。");
        helper.insertSanMing(sanMing);


        //癸酉日巳时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("癸酉日丁巳时，先贫后富。巳酉月，官印俱旺。亥卯未，食伤生财，贵显。午戌，财旺，亦吉。");
        helper.insertSanMing(sanMing);



        //癸亥日巳时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.SI);
        sanMing.setDuanYu("癸亥日丁巳时，刑害。春夏月生，好。秋，印绶，吉。冬，平常。庚寅年月，武贵。");
        helper.insertSanMing(sanMing);




        //癸丑日午时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("癸丑日戊午时，财厚，南运主贵寿促，东运吉。");
        helper.insertSanMing(sanMing);


        //癸卯日午时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("癸卯日戊午时，申子辰亥月，身旺不化，平常。卯戌月，贵。");
        helper.insertSanMing(sanMing);



        //癸巳日午时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("癸已日戊午时，中年大富，若行东运，贵显。申未月，亦贵。");
        helper.insertSanMing(sanMing);


        //癸未日午时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("癸未日戊午时，寅午戌，化火合局，贵显。");
        helper.insertSanMing(sanMing);


        //癸酉日午时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("癸酉日戊午时，主伤妻家财，有始无终，子年子贵而无禄，行南运，好。");
        helper.insertSanMing(sanMing);



        //癸亥日午时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.WU_DI_ZHI);
        sanMing.setDuanYu("癸亥日戊午时，贵，未月，东方运；金月有制，俱贵显。");
        helper.insertSanMing(sanMing);



        //癸丑日未时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("癸丑日己未时，高。年月俱丑，贫薄。辰戌丑未，土旺，主目疾、贫贱。" +
                "通金木水气，贵。午月，东北运，六七品贵。");
        helper.insertSanMing(sanMing);


        //癸卯日未时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("癸卯日己未时，子巳未年月，二品。巳寅字，刑六亲。");
        helper.insertSanMing(sanMing);



        //癸巳日未时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("癸巳日己未时，财官双美，柱无戊土，有卯木合局，作时上偏官，有制，贵。");
        helper.insertSanMing(sanMing);


        //癸未日未时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("癸未日己未时，高。春偏官有制，吉。夏，平常。秋、冬身旺，申月行木运，显贵。巳辰年，六卿。");
        helper.insertSanMing(sanMing);


        //癸酉日未时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("癸酉日己未时，寅巳申酉丑戌年月，贵。");
        helper.insertSanMing(sanMing);



        //癸亥日未时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.WEI);
        sanMing.setDuanYu("癸亥日己未时，贵。未月生，忠孝双金，官至风宪。如煞官混杂，恐终在外。亥年月，贵。");
        helper.insertSanMing(sanMing);



        //癸丑日申时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("癸丑日庚申时，辰戌丑未年月，文章冠世，官至三品。子月坐禄，亦吉。");
        helper.insertSanMing(sanMing);


        //癸卯日申时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("癸卯日庚申时，卯月作合禄格，西北运，贵，金紫。申月，东北运，风宪。" +
                "庚辰、庚戌年月，正官格，贵。辰月，金水运，七品贵。");
        helper.insertSanMing(sanMing);



        //癸巳日申时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("癸巳日庚申时，贫，亦是合禄格。未月生，问学有成，西北运，贵；行东北运，亦贵。");
        helper.insertSanMing(sanMing);


        //癸未日申时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("癸未日庚申时，柱有甲寅，乙卯，己与甲合，乙与庚合，妻贤子孝，荣华在后。" +
                "酉申年月，三四品。秋生，行木火运，二三品。亥卯，文进贵。");
        helper.insertSanMing(sanMing);


        //癸酉日申时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("癸酉日庚申时，卯酉戌寅年月，贵。申酉，火木运，大贵。");
        helper.insertSanMing(sanMing);



        //癸亥日申时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.SHEN);
        sanMing.setDuanYu("癸亥日庚申时，性平身孤。卯未月，饱学，贵命。申，亦贵。子申，近侍有权。");
        helper.insertSanMing(sanMing);



        //癸丑日酉时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("癸丑日辛酉时，秋月，印绶格，行官煞运，吉。冬，福禄双全。子寅年月，干头无戊己字，贵。");
        helper.insertSanMing(sanMing);


        //癸卯日酉时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("癸卯日辛酉时，日贵格，辰戌丑未月，贵。子卯年月，大贵。巳午，亦贵。又云不利妻子。");
        helper.insertSanMing(sanMing);



        //癸巳日酉时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("癸巳日辛酉时，孤。寅卯年，辰戌丑未月，贵。子午卯酉，中贵。寅申巳亥，最贵。");
        helper.insertSanMing(sanMing);


        //癸未日酉时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("癸未日辛酉时，春贫，夏先难后易，秋吉，冬贵。");
        helper.insertSanMing(sanMing);


        //癸酉日酉时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("癸酉日辛酉时，申酉月，印绶多，能守祖，破妻家。子巳 午月，干透庚辛，禄贵印绶俱全，" +
                "贵不可言。寅戌，腰金。午亥，大贵。丑月，煞重凶夭。");
        helper.insertSanMing(sanMing);



        //癸亥日酉时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.YOU);
        sanMing.setDuanYu("癸亥日辛酉时，戌月，行东南运，金紫；东北，风宪。子月建禄，年遇财官，大贵。");
        helper.insertSanMing(sanMing);



        //癸丑日戌时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("癸丑日壬戌时，刑，亥月，土厚地方上贵。辰申年月，南方运，状元。" +
                "五月，南运，都宪。若春秋生，南方运，八九品。");
        helper.insertSanMing(sanMing);


        //癸卯日戌时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("癸卯日壬戌时，日贵格，寅巳年月，干透戊丁财官而旺，大贵有权。卯辰丑午子等年月，文贵" +
                "。酉戌，金土运，五六品。");
        helper.insertSanMing(sanMing);



        //癸巳日戌时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("癸巳日壬戌时，财官双美，春平，夏秋冬贵。辰丑未寅酉年月，风宪。");
        helper.insertSanMing(sanMing);


        //癸未日戌时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("癸未日壬戌时，刑。巳月生，三四品。子庚年月，近侍贵。癸酉日壬戌时，亥子月，才智高贵，妻贤子孝。春平常。" +
                "夏财官，秋印绶，俱吉。辰丑，刑冲戌库，贵富两全。戌月，东南运，武贵。");
        helper.insertSanMing(sanMing);


        //癸酉日戌时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("癸日壬戌时，水火既济，癸用丙丁为财，戊土为官，戊与癸合旺，为人智谋，通月气有倚托者贵；" +
                "不通，平常；通火土月气，富贵双全；运气通，亦吉。");
        helper.insertSanMing(sanMing);



        //癸亥日戌时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.XU);
        sanMing.setDuanYu("癸亥日壬戌时，春生，伤官见官，夏财旺，秋、冬吉，名利有成。戌辰月，行亥子运，贵。子月，行西南运，金紫。");
        helper.insertSanMing(sanMing);



        //癸丑日亥时
        sanMing.setRiGanZhi(GUI_CHOU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("癸丑日癸亥时，作拱禄格。巳酉丑生，福德秀气。午月平常。卯酉月，行南运，金紫风宪，但难为寿。");
        helper.insertSanMing(sanMing);


        //癸卯日亥时
        sanMing.setRiGanZhi(GUI_MAO);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("癸卯日癸亥时，平，日贵格。寅卯月，伤官论，行金水运，风宪。辰戌丑未月，官旺。" +
                "纯卯，三品贵。辰戌与卯刑，主孤贫。");
        helper.insertSanMing(sanMing);



        //癸巳日亥时
        sanMing.setRiGanZhi(GUI_SI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("癸巳日癸亥时，丑月，杂气印绶。贵。亥子年月，行南运，贵。又禄马同乡格，巳申年月，大贵。");
        helper.insertSanMing(sanMing);


        //癸未日亥时
        sanMing.setRiGanZhi(GUI_WEI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("癸未日癸亥时，身下坐财官。辰戌丑未月，行东北运，贵。秋月，东运，七八品贵；干透正印、正官，金紫。");
        helper.insertSanMing(sanMing);


        //癸酉日亥时
        sanMing.setRiGanZhi(GUI_YOU);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("癸酉日癸亥时，辰戌丑未月，生涯遂意。酉月，行东北运，八九品贵。申月，东方运，五品。");
        helper.insertSanMing(sanMing);



        //癸亥日亥时
        sanMing.setRiGanZhi(GUI_HAI);
        sanMing.setShiChen(CaculateGanZhi.HAI);
        sanMing.setDuanYu("癸亥日癸亥时，性聪飘逸，中年大富。冬月生，飞天禄马，无戊巳子字填实惹绊，贵显；不然，孤克为僧道，亦主清高。" +
                "年月辰亥，干透辛壬，无填实巳字，有智量，大贵。卯月，金紫。巳丑亦贵。阴水重重透海波，少年未遇且蹉跎；" +
                "困龙得志方能化，不遇时来虎卧坡。");
        helper.insertSanMing(sanMing);



        //所有数据插入完毕后才关闭数据库
        helper.closeDB();
        //所有数据插入完毕以后才向sharedPreferences里面插入值
        SharedPreferences sharedPreferences=this.getSharedPreferences(MingFragment.SHARE_NAME,MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt(MingFragment.SHARE_KEY,1);
        editor.apply();
    }
}
