package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum fapp implements eyge {
    UNKNOWN_APPLICATION(0),
    GMAIL(1),
    GPLUS_WEB(2),
    GOOGLE_VOICE(3),
    HANGOUT_START_PAGE(4),
    DYNAMITE(5),
    DYNAMITE_DESKTOP(63),
    DYNAMITE_NATIVE(359),
    GROUPS_UI(6),
    CALENDAR(7),
    MAPS(8),
    YAQS(9),
    BUGANIZER(10),
    NETDEPLOY(11),
    ORG_CHART(12),
    ONCALLATOR(13),
    GUTS(14),
    BABEL(15),
    BIGTOP(16),
    DOCS(17),
    DRIVE(18),
    DRIVE_ODP(86),
    GOOGLE_QUICK_SEARCH_BOX(19),
    GPLUS(20),
    TEST_APPLICATION(21),
    PLAY_STORE(22),
    ELDAR(23),
    ESTIGO(24),
    PLX(25),
    SUPERPONG(26),
    DEVOPS_CONSOLE(27),
    APOTHECA(28),
    GHIRE(29),
    ICENTRAL(30),
    KRONOS(31),
    SLIDES(32),
    SHEETS(33),
    DRAWINGS(34),
    MEET(35),
    IRM(36),
    MEME(37),
    HUB(38),
    DRIVE_SHARING(39),
    HONEYCOMB(40),
    IMAGERY_REQUEST(41),
    PEOPLEKIT_DEMO(42),
    GANTRY(43),
    INCIDENTFLOW(44),
    LANDSPEEDER(45),
    ANDROID_CONTACTS(46),
    ALERT_CENTER(47),
    DOCS_SMART_SELECT(48),
    DOCS_RICH_LINKS(49),
    TRAPPER_KEEPER(50),
    WHEREABOUTS(51),
    PARICHE(52),
    BUGDASHBOARD(53),
    TICKETTIMER(54),
    HATTORI(55),
    BILLY_ICS(56),
    LOGS_FRONT_DOOR(57),
    DESKTOPIA(58),
    ACCESS_APPROVALS(59),
    L10N_MANAGEMENT(60),
    GPLUS_DASHER(61),
    PRIVACY_ONE(62),
    MY_ACCOUNT(64),
    SPEND_UI(65),
    CEDI_FE(66),
    BRICKS(67),
    VIMES(68),
    STEPCOMPETE(69),
    PRIVACY_ONE_REVIEWER_TOOL(70),
    TEAM_GRAPH(71),
    SQUEEGEE(72),
    ONEGOOGLE(73),
    ANDROID_NATIVE_ONBOARDING(74),
    MEMORIZE(75),
    TRIAGEAS(76),
    DATA_CATALOG(77),
    YOUTUBE(78),
    HIRING_APPLICATION_MANAGEMENT(79),
    SERVER_CENTRAL(80),
    SUPER_G(81),
    DASHE(82),
    YOUTUBE_MUSIC(83),
    UNIPORT(84),
    BRIGHTER(85),
    NALA(87),
    GVC_LABS_GTI(88),
    CLASSROOM(89),
    HYDROGEN(90),
    YOUTUBEHEADCOUNT(91),
    METABUG(92),
    KEYBLADE(93),
    GFIXIT(94),
    DISPATCH_HUB(95),
    COMMSTAR(96),
    BASECAMP(97),
    LEGAL_REMOVALS_MOANA(98),
    DEVICE_POLICY(99),
    PLAY_BOOKS(100),
    JAM(EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    GOOGLE_KEEP(102),
    PLAY_MOVIES(103),
    GOOGLE_MY_BUSINESS(104),
    OPA(105),
    PRIMER(106),
    PROJECT_FI(107),
    TRANSLATE(108),
    TRIPS(109),
    CLOUD_PLATFORM(110),
    ANDROID_WEAR(111),
    GOOGLE_CHROME(112),
    FITNESS(113),
    YOUTUBE_UNPLUGGED(114),
    YOUTUBE_CREATOR_STUDIO(115),
    GOOGLE_JACQUARD(116),
    FIBER(117),
    GOOGLE_ONE(118),
    PAIDTASKS(119),
    PAISA(120),
    PHOTOS(121),
    TASKS(122),
    ADWORDS_MOBILE(123),
    CULTURAL(124),
    NEWS(125),
    EARTH(126),
    DUO_CLIENT(127),
    FAMILY_LINK(128),
    PODCASTS(129),
    STADIA(130),
    IGA(131),
    GOOGLE_WIFI(132),
    CLINICIANS(133),
    SHORTCUT(134),
    GOOGLE_ANALYTICS(135),
    CHROMECAST(136),
    CONTACTS(137),
    ANDROID_DIALER(138),
    ANDROID_SAFETY(139),
    ANDROID_MESSAGES(140),
    RMS(141),
    CONTACTHR(142),
    LIS_APPS(143),
    TECHEXP(144),
    CDDB(145),
    GRAD_FEEDBACK(146),
    TEAM_CONNECT(147),
    MIRIN(148),
    SERVICEDESK(149),
    MARKETING_GARAGE(150),
    SRE_EDU_STACKRES(151),
    NEPTUNE(152),
    MTMDASHBOARD(153),
    QUADRO(154),
    HIGHLIGHT(155),
    LOOKER_STUDIO(156),
    HOUSEPLANT(157),
    JADE(158),
    COMPLY(159),
    WAYMO_TRIAGE_TOOLING(160),
    CLOUD_CONNECT(161),
    GRDT(162),
    SEARCH_MARKETING_PLATFORM(163),
    CASEMANAGEMENT(164),
    PRODUCTION2020_UIE(165),
    APP_ACCESS_CONTROL(166),
    SNIPPETS(167),
    DORC(168),
    SEARCH(169),
    SUPPORT_CONSOLE(170),
    LIMITED_PROFILES(171),
    ALTERNATE_PROFILES(172),
    OHARA(173),
    PIXEL_RELATIONSHIPS(174),
    FLOORSCOPE(175),
    JAADU(176),
    ANDROID_MESSAGES_ONBOARDING(177),
    PROFILE_QUICK_EDITOR(178),
    LAUNCH(179),
    BLOGGER(180),
    CHROME_REMOTE_DESKTOP(181),
    HERMES_UI(182),
    PRODEX(183),
    DSF(184),
    VORTEX2(185),
    LIONO(186),
    BILLING_ASSIST(187),
    POLICY_ASSIST(188),
    PROGRAMSUI(189);

    public final int cJ;

    fapp(int i) {
        this.cJ = i;
    }

    public static fapp b(int i) {
        if (i == 359) {
            return DYNAMITE_NATIVE;
        }
        switch (i) {
            case 0:
                return UNKNOWN_APPLICATION;
            case 1:
                return GMAIL;
            case 2:
                return GPLUS_WEB;
            case 3:
                return GOOGLE_VOICE;
            case 4:
                return HANGOUT_START_PAGE;
            case 5:
                return DYNAMITE;
            case 6:
                return GROUPS_UI;
            case 7:
                return CALENDAR;
            case 8:
                return MAPS;
            case 9:
                return YAQS;
            case 10:
                return BUGANIZER;
            case 11:
                return NETDEPLOY;
            case 12:
                return ORG_CHART;
            case 13:
                return ONCALLATOR;
            case 14:
                return GUTS;
            case 15:
                return BABEL;
            case 16:
                return BIGTOP;
            case 17:
                return DOCS;
            case 18:
                return DRIVE;
            case 19:
                return GOOGLE_QUICK_SEARCH_BOX;
            case 20:
                return GPLUS;
            case 21:
                return TEST_APPLICATION;
            case 22:
                return PLAY_STORE;
            case 23:
                return ELDAR;
            case 24:
                return ESTIGO;
            case 25:
                return PLX;
            case 26:
                return SUPERPONG;
            case 27:
                return DEVOPS_CONSOLE;
            case 28:
                return APOTHECA;
            case 29:
                return GHIRE;
            case 30:
                return ICENTRAL;
            case 31:
                return KRONOS;
            case 32:
                return SLIDES;
            case 33:
                return SHEETS;
            case 34:
                return DRAWINGS;
            case 35:
                return MEET;
            case 36:
                return IRM;
            case 37:
                return MEME;
            case 38:
                return HUB;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return DRIVE_SHARING;
            case 40:
                return HONEYCOMB;
            case 41:
                return IMAGERY_REQUEST;
            case 42:
                return PEOPLEKIT_DEMO;
            case 43:
                return GANTRY;
            case 44:
                return INCIDENTFLOW;
            case 45:
                return LANDSPEEDER;
            case 46:
                return ANDROID_CONTACTS;
            case 47:
                return ALERT_CENTER;
            case 48:
                return DOCS_SMART_SELECT;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return DOCS_RICH_LINKS;
            case 50:
                return TRAPPER_KEEPER;
            case 51:
                return WHEREABOUTS;
            case 52:
                return PARICHE;
            case 53:
                return BUGDASHBOARD;
            case 54:
                return TICKETTIMER;
            case 55:
                return HATTORI;
            case 56:
                return BILLY_ICS;
            case 57:
                return LOGS_FRONT_DOOR;
            case 58:
                return DESKTOPIA;
            case 59:
                return ACCESS_APPROVALS;
            case 60:
                return L10N_MANAGEMENT;
            case 61:
                return GPLUS_DASHER;
            case 62:
                return PRIVACY_ONE;
            case 63:
                return DYNAMITE_DESKTOP;
            case 64:
                return MY_ACCOUNT;
            case 65:
                return SPEND_UI;
            case 66:
                return CEDI_FE;
            case 67:
                return BRICKS;
            case 68:
                return VIMES;
            case 69:
                return STEPCOMPETE;
            case 70:
                return PRIVACY_ONE_REVIEWER_TOOL;
            case 71:
                return TEAM_GRAPH;
            case 72:
                return SQUEEGEE;
            case 73:
                return ONEGOOGLE;
            case 74:
                return ANDROID_NATIVE_ONBOARDING;
            case 75:
                return MEMORIZE;
            case 76:
                return TRIAGEAS;
            case 77:
                return DATA_CATALOG;
            case 78:
                return YOUTUBE;
            case 79:
                return HIRING_APPLICATION_MANAGEMENT;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return SERVER_CENTRAL;
            case 81:
                return SUPER_G;
            case 82:
                return DASHE;
            case 83:
                return YOUTUBE_MUSIC;
            case 84:
                return UNIPORT;
            case 85:
                return BRIGHTER;
            case 86:
                return DRIVE_ODP;
            case 87:
                return NALA;
            case 88:
                return GVC_LABS_GTI;
            case 89:
                return CLASSROOM;
            case 90:
                return HYDROGEN;
            case 91:
                return YOUTUBEHEADCOUNT;
            case 92:
                return METABUG;
            case 93:
                return KEYBLADE;
            case 94:
                return GFIXIT;
            case 95:
                return DISPATCH_HUB;
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return COMMSTAR;
            case 97:
                return BASECAMP;
            case 98:
                return LEGAL_REMOVALS_MOANA;
            case 99:
                return DEVICE_POLICY;
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return PLAY_BOOKS;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return JAM;
            case 102:
                return GOOGLE_KEEP;
            case 103:
                return PLAY_MOVIES;
            case 104:
                return GOOGLE_MY_BUSINESS;
            case 105:
                return OPA;
            case 106:
                return PRIMER;
            case 107:
                return PROJECT_FI;
            case 108:
                return TRANSLATE;
            case 109:
                return TRIPS;
            case 110:
                return CLOUD_PLATFORM;
            case 111:
                return ANDROID_WEAR;
            case 112:
                return GOOGLE_CHROME;
            case 113:
                return FITNESS;
            case 114:
                return YOUTUBE_UNPLUGGED;
            case 115:
                return YOUTUBE_CREATOR_STUDIO;
            case 116:
                return GOOGLE_JACQUARD;
            case 117:
                return FIBER;
            case 118:
                return GOOGLE_ONE;
            case 119:
                return PAIDTASKS;
            case 120:
                return PAISA;
            case 121:
                return PHOTOS;
            case 122:
                return TASKS;
            case 123:
                return ADWORDS_MOBILE;
            case 124:
                return CULTURAL;
            case 125:
                return NEWS;
            case 126:
                return EARTH;
            case 127:
                return DUO_CLIENT;
            case 128:
                return FAMILY_LINK;
            case 129:
                return PODCASTS;
            case 130:
                return STADIA;
            case 131:
                return IGA;
            case 132:
                return GOOGLE_WIFI;
            case 133:
                return CLINICIANS;
            case 134:
                return SHORTCUT;
            case 135:
                return GOOGLE_ANALYTICS;
            case 136:
                return CHROMECAST;
            case 137:
                return CONTACTS;
            case 138:
                return ANDROID_DIALER;
            case 139:
                return ANDROID_SAFETY;
            case 140:
                return ANDROID_MESSAGES;
            case 141:
                return RMS;
            case 142:
                return CONTACTHR;
            case 143:
                return LIS_APPS;
            case 144:
                return TECHEXP;
            case 145:
                return CDDB;
            case 146:
                return GRAD_FEEDBACK;
            case 147:
                return TEAM_CONNECT;
            case 148:
                return MIRIN;
            case 149:
                return SERVICEDESK;
            case 150:
                return MARKETING_GARAGE;
            case 151:
                return SRE_EDU_STACKRES;
            case 152:
                return NEPTUNE;
            case 153:
                return MTMDASHBOARD;
            case 154:
                return QUADRO;
            case 155:
                return HIGHLIGHT;
            case 156:
                return LOOKER_STUDIO;
            case 157:
                return HOUSEPLANT;
            case 158:
                return JADE;
            case 159:
                return COMPLY;
            case 160:
                return WAYMO_TRIAGE_TOOLING;
            case 161:
                return CLOUD_CONNECT;
            case 162:
                return GRDT;
            case 163:
                return SEARCH_MARKETING_PLATFORM;
            case 164:
                return CASEMANAGEMENT;
            case 165:
                return PRODUCTION2020_UIE;
            case 166:
                return APP_ACCESS_CONTROL;
            case 167:
                return SNIPPETS;
            case 168:
                return DORC;
            case 169:
                return SEARCH;
            case 170:
                return SUPPORT_CONSOLE;
            case 171:
                return LIMITED_PROFILES;
            case 172:
                return ALTERNATE_PROFILES;
            case 173:
                return OHARA;
            case 174:
                return PIXEL_RELATIONSHIPS;
            case 175:
                return FLOORSCOPE;
            case 176:
                return JAADU;
            case 177:
                return ANDROID_MESSAGES_ONBOARDING;
            case 178:
                return PROFILE_QUICK_EDITOR;
            case 179:
                return LAUNCH;
            case 180:
                return BLOGGER;
            case 181:
                return CHROME_REMOTE_DESKTOP;
            case 182:
                return HERMES_UI;
            case 183:
                return PRODEX;
            case 184:
                return DSF;
            case 185:
                return VORTEX2;
            case 186:
                return LIONO;
            case 187:
                return BILLING_ASSIST;
            case 188:
                return POLICY_ASSIST;
            case 189:
                return PROGRAMSUI;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.cJ;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.cJ);
    }
}
