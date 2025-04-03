package defpackage;

import android.content.Context;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyyt implements dzhn {
    private static dyyt b;
    public final Set a;
    private final Context c;
    private final dfld d;
    private final Executor e;

    private dyyt(Context context) {
        List list = dfld.m;
        dfld c = new dfla(context, "LIGHTER_ANDROID").c();
        this.a = Collections.newSetFromMap(new WeakHashMap());
        this.e = Executors.newSingleThreadExecutor();
        this.c = context;
        this.d = c;
    }

    public static synchronized dyyt a(Context context) {
        synchronized (dyyt.class) {
            dyyt dyytVar = b;
            if (dyytVar != null) {
                return dyytVar;
            }
            dyyt dyytVar2 = new dyyt(context.getApplicationContext());
            b = dyytVar2;
            return dyytVar2;
        }
    }

    public static final esff c(dzpg dzpgVar) {
        final esfe esfeVar = (esfe) esff.a.createBuilder();
        String d = dzpgVar.d();
        esfeVar.copyOnWrite();
        ((esff) esfeVar.instance).c = d;
        String e = dzpgVar.e();
        esfeVar.copyOnWrite();
        ((esff) esfeVar.instance).e = e;
        dzpf dzpfVar = dzpf.UNKNOWN;
        int ordinal = dzpgVar.b().ordinal();
        if (ordinal == 0) {
            esfeVar.copyOnWrite();
            ((esff) esfeVar.instance).b = fbjw.a(2);
        } else if (ordinal == 1) {
            esfeVar.copyOnWrite();
            ((esff) esfeVar.instance).b = fbjw.a(3);
        } else if (ordinal == 2) {
            esfeVar.copyOnWrite();
            ((esff) esfeVar.instance).b = fbjw.a(4);
        } else if (ordinal == 3) {
            dyht.b(dzpgVar.c(), new ksp() { // from class: dyyn
                @Override // defpackage.ksp
                public final void accept(Object obj) {
                    esfe esfeVar2 = esfe.this;
                    String str = (String) obj;
                    esfeVar2.copyOnWrite();
                    esff esffVar = (esff) esfeVar2.instance;
                    esff esffVar2 = esff.a;
                    esffVar.b = fbjw.a(5);
                    esfeVar2.copyOnWrite();
                    esff esffVar3 = (esff) esfeVar2.instance;
                    str.getClass();
                    esffVar3.d = str;
                }
            });
        } else if (ordinal == 4) {
            esfeVar.copyOnWrite();
            ((esff) esfeVar.instance).b = fbjw.a(7);
        }
        return (esff) esfeVar.build();
    }

    @Override // defpackage.dzhn
    public final void b(final dzhm dzhmVar) {
        int i;
        emxc emxcVar = emux.a;
        if (dzhmVar.l().g() && ((dzpg) dzhmVar.l().c()).b().equals(dzpf.EMAIL)) {
            emxcVar = emxc.j(((dzpg) dzhmVar.l().c()).d());
        }
        dfld dfldVar = this.d;
        final eses esesVar = (eses) eset.a.createBuilder();
        String packageName = this.c.getPackageName();
        esesVar.copyOnWrite();
        eset esetVar = (eset) esesVar.instance;
        packageName.getClass();
        esetVar.s = packageName;
        int a = dzhmVar.a();
        if (a != 10088) {
            switch (a) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 9;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 11;
                    break;
                case 10:
                    i = 12;
                    break;
                case 11:
                    i = 13;
                    break;
                case 12:
                    i = 14;
                    break;
                case 13:
                    i = 15;
                    break;
                case 14:
                    i = 16;
                    break;
                case 15:
                    i = 17;
                    break;
                case 16:
                    i = 18;
                    break;
                case 17:
                    i = 19;
                    break;
                case 18:
                    i = 20;
                    break;
                case 19:
                    i = 21;
                    break;
                case 20:
                    i = 22;
                    break;
                case 21:
                    i = 23;
                    break;
                case 22:
                    i = 24;
                    break;
                case 23:
                    i = 25;
                    break;
                case 24:
                    i = 26;
                    break;
                case 25:
                    i = 27;
                    break;
                case 26:
                    i = 28;
                    break;
                case 27:
                    i = 29;
                    break;
                case 28:
                    i = 30;
                    break;
                case 29:
                    i = 31;
                    break;
                case 30:
                    i = 32;
                    break;
                case 31:
                    i = 33;
                    break;
                case 32:
                    i = 34;
                    break;
                case 33:
                    i = 35;
                    break;
                case 34:
                    i = 36;
                    break;
                case 35:
                    i = 37;
                    break;
                case 36:
                    i = 38;
                    break;
                case 37:
                    i = 39;
                    break;
                case 38:
                    i = 40;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i = 41;
                    break;
                case 40:
                    i = 42;
                    break;
                case 41:
                    i = 43;
                    break;
                case 42:
                    i = 44;
                    break;
                case 43:
                    i = 45;
                    break;
                case 44:
                    i = 46;
                    break;
                case 45:
                    i = 47;
                    break;
                case 46:
                    i = 48;
                    break;
                case 47:
                    i = 49;
                    break;
                case 48:
                    i = 50;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i = 51;
                    break;
                case 50:
                    i = 52;
                    break;
                case 51:
                    i = 53;
                    break;
                case 52:
                    i = 54;
                    break;
                case 53:
                    i = 55;
                    break;
                case 54:
                    i = 56;
                    break;
                case 55:
                    i = 57;
                    break;
                case 56:
                    i = 58;
                    break;
                case 57:
                    i = 59;
                    break;
                case 58:
                    i = 60;
                    break;
                case 59:
                    i = 61;
                    break;
                case 60:
                    i = 62;
                    break;
                default:
                    switch (a) {
                        case 62:
                            i = 64;
                            break;
                        case 63:
                            i = 65;
                            break;
                        case 64:
                            i = 66;
                            break;
                        case 65:
                            i = 67;
                            break;
                        case 66:
                            i = 68;
                            break;
                        case 67:
                            i = 69;
                            break;
                        case 68:
                            i = 70;
                            break;
                        case 69:
                            i = 71;
                            break;
                        case 70:
                            i = 72;
                            break;
                        case 71:
                            i = 73;
                            break;
                        case 72:
                            i = 74;
                            break;
                        case 73:
                            i = 75;
                            break;
                        case 74:
                            i = 76;
                            break;
                        case 75:
                            i = 77;
                            break;
                        case 76:
                            i = 78;
                            break;
                        case 77:
                            i = 79;
                            break;
                        case 78:
                            i = 80;
                            break;
                        case 79:
                            i = 81;
                            break;
                        case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                            i = 82;
                            break;
                        case 81:
                            i = 83;
                            break;
                        case 82:
                            i = 84;
                            break;
                        case 83:
                            i = 85;
                            break;
                        case 84:
                            i = 86;
                            break;
                        case 85:
                            i = 87;
                            break;
                        case 86:
                            i = 88;
                            break;
                        case 87:
                            i = 89;
                            break;
                        case 88:
                            i = 90;
                            break;
                        case 89:
                            i = 91;
                            break;
                        case 90:
                            i = 92;
                            break;
                        case 91:
                            i = 93;
                            break;
                        case 92:
                            i = 94;
                            break;
                        case 93:
                            i = 95;
                            break;
                        case 94:
                            i = 96;
                            break;
                        case 95:
                            i = 97;
                            break;
                        case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                            i = 98;
                            break;
                        default:
                            switch (a) {
                                case VCardConstants.DEFAULT_PREF /* 100 */:
                                    i = 102;
                                    break;
                                case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                    i = 103;
                                    break;
                                case 102:
                                    i = 104;
                                    break;
                                case 103:
                                    i = 105;
                                    break;
                                case 104:
                                    i = 106;
                                    break;
                                case 105:
                                    i = 107;
                                    break;
                                case 106:
                                    i = 108;
                                    break;
                                case 107:
                                    i = 109;
                                    break;
                                case 108:
                                    i = 110;
                                    break;
                                case 109:
                                    i = 111;
                                    break;
                                case 110:
                                    i = 112;
                                    break;
                                case 111:
                                    i = 113;
                                    break;
                                case 112:
                                    i = 114;
                                    break;
                                case 113:
                                    i = 115;
                                    break;
                                case 114:
                                    i = 116;
                                    break;
                                case 115:
                                    i = 117;
                                    break;
                                case 116:
                                    i = 118;
                                    break;
                                case 117:
                                    i = 119;
                                    break;
                                case 118:
                                    i = 120;
                                    break;
                                case 119:
                                    i = 121;
                                    break;
                                case 120:
                                    i = 122;
                                    break;
                                case 121:
                                    i = 123;
                                    break;
                                case 122:
                                    i = 124;
                                    break;
                                case 123:
                                    i = 125;
                                    break;
                                case 124:
                                    i = 126;
                                    break;
                                case 125:
                                    i = 127;
                                    break;
                                case 126:
                                    i = 128;
                                    break;
                                case 127:
                                    i = 129;
                                    break;
                                case 128:
                                    i = 130;
                                    break;
                                case 129:
                                    i = 131;
                                    break;
                                case 130:
                                    i = 132;
                                    break;
                                case 131:
                                    i = 133;
                                    break;
                                case 132:
                                    i = 134;
                                    break;
                                case 133:
                                    i = 135;
                                    break;
                                case 134:
                                    i = 136;
                                    break;
                                case 135:
                                    i = 137;
                                    break;
                                case 136:
                                    i = 138;
                                    break;
                                case 137:
                                    i = 139;
                                    break;
                                case 138:
                                    i = 140;
                                    break;
                                case 139:
                                    i = 141;
                                    break;
                                case 140:
                                    i = 142;
                                    break;
                                case 141:
                                    i = 143;
                                    break;
                                case 142:
                                    i = 144;
                                    break;
                                case 143:
                                    i = 145;
                                    break;
                                case 144:
                                    i = 146;
                                    break;
                                case 145:
                                    i = 147;
                                    break;
                                case 146:
                                    i = 148;
                                    break;
                                case 147:
                                    i = 149;
                                    break;
                                case 148:
                                    i = 150;
                                    break;
                                case 149:
                                    i = 151;
                                    break;
                                case 150:
                                    i = 152;
                                    break;
                                case 151:
                                    i = 153;
                                    break;
                                case 152:
                                    i = 154;
                                    break;
                                default:
                                    switch (a) {
                                        case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                                            i = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
                                            break;
                                        case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                                            i = 204;
                                            break;
                                        case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                                            i = 205;
                                            break;
                                        case 204:
                                            i = 206;
                                            break;
                                        case 205:
                                            i = 207;
                                            break;
                                        case 206:
                                            i = 208;
                                            break;
                                        case 207:
                                            i = 209;
                                            break;
                                        case 208:
                                            i = 210;
                                            break;
                                        case 209:
                                            i = 211;
                                            break;
                                        case 210:
                                            i = 212;
                                            break;
                                        case 211:
                                            i = 213;
                                            break;
                                        case 212:
                                            i = 214;
                                            break;
                                        case 213:
                                            i = 215;
                                            break;
                                        default:
                                            switch (a) {
                                                case 10000:
                                                    i = 10002;
                                                    break;
                                                case 10001:
                                                    i = 10003;
                                                    break;
                                                case 10002:
                                                    i = 10004;
                                                    break;
                                                case 10003:
                                                    i = 10005;
                                                    break;
                                                case 10004:
                                                    i = 10006;
                                                    break;
                                                case 10005:
                                                    i = 10007;
                                                    break;
                                                case 10006:
                                                    i = 10008;
                                                    break;
                                                case 10007:
                                                    i = 10009;
                                                    break;
                                                case 10008:
                                                    i = 10010;
                                                    break;
                                                case 10009:
                                                    i = 10011;
                                                    break;
                                                case 10010:
                                                    i = 10012;
                                                    break;
                                                case 10011:
                                                    i = 10013;
                                                    break;
                                                case 10012:
                                                    i = 10014;
                                                    break;
                                                case 10013:
                                                    i = 10015;
                                                    break;
                                                case 10014:
                                                    i = 10016;
                                                    break;
                                                case 10015:
                                                    i = 10017;
                                                    break;
                                                case 10016:
                                                    i = 10018;
                                                    break;
                                                case 10017:
                                                    i = 10019;
                                                    break;
                                                case 10018:
                                                    i = 10020;
                                                    break;
                                                case 10019:
                                                    i = 10021;
                                                    break;
                                                case 10020:
                                                    i = 10022;
                                                    break;
                                                case 10021:
                                                    i = 10023;
                                                    break;
                                                case 10022:
                                                    i = 10024;
                                                    break;
                                                case 10023:
                                                    i = 10025;
                                                    break;
                                                case 10024:
                                                    i = 10026;
                                                    break;
                                                case 10025:
                                                    i = 10027;
                                                    break;
                                                case 10026:
                                                    i = 10028;
                                                    break;
                                                case 10027:
                                                    i = 10029;
                                                    break;
                                                case 10028:
                                                    i = 10030;
                                                    break;
                                                case 10029:
                                                    i = 10031;
                                                    break;
                                                case 10030:
                                                    i = 10032;
                                                    break;
                                                case 10031:
                                                    i = 10033;
                                                    break;
                                                case 10032:
                                                    i = 10034;
                                                    break;
                                                case 10033:
                                                    i = 10035;
                                                    break;
                                                case 10034:
                                                    i = 10036;
                                                    break;
                                                case 10035:
                                                    i = 10037;
                                                    break;
                                                case 10036:
                                                    i = 10038;
                                                    break;
                                                case 10037:
                                                    i = 10039;
                                                    break;
                                                case 10038:
                                                    i = 10040;
                                                    break;
                                                case 10039:
                                                    i = 10041;
                                                    break;
                                                case 10040:
                                                    i = 10042;
                                                    break;
                                                case 10041:
                                                    i = 10043;
                                                    break;
                                                case 10042:
                                                    i = 10044;
                                                    break;
                                                case 10043:
                                                    i = 10045;
                                                    break;
                                                case 10044:
                                                    i = 10046;
                                                    break;
                                                case 10045:
                                                    i = 10047;
                                                    break;
                                                case 10046:
                                                    i = 10048;
                                                    break;
                                                case 10047:
                                                    i = 10049;
                                                    break;
                                                case 10048:
                                                    i = 10050;
                                                    break;
                                                case 10049:
                                                    i = 10051;
                                                    break;
                                                case 10050:
                                                    i = 10052;
                                                    break;
                                                case 10051:
                                                    i = 10053;
                                                    break;
                                                case 10052:
                                                    i = 10054;
                                                    break;
                                                case 10053:
                                                    i = 10055;
                                                    break;
                                                case 10054:
                                                    i = 10056;
                                                    break;
                                                case 10055:
                                                    i = 10057;
                                                    break;
                                                case 10056:
                                                    i = 10058;
                                                    break;
                                                case 10057:
                                                    i = 10059;
                                                    break;
                                                case 10058:
                                                    i = 10060;
                                                    break;
                                                case 10059:
                                                    i = 10061;
                                                    break;
                                                case 10060:
                                                    i = 10062;
                                                    break;
                                                case 10061:
                                                    i = 10063;
                                                    break;
                                                case 10062:
                                                    i = 10064;
                                                    break;
                                                case 10063:
                                                    i = 10065;
                                                    break;
                                                case 10064:
                                                    i = 10066;
                                                    break;
                                                case 10065:
                                                    i = 10067;
                                                    break;
                                                case 10066:
                                                    i = 10068;
                                                    break;
                                                case 10067:
                                                    i = 10069;
                                                    break;
                                                case 10068:
                                                    i = 10070;
                                                    break;
                                                case 10069:
                                                    i = 10071;
                                                    break;
                                                case 10070:
                                                    i = 10072;
                                                    break;
                                                case 10071:
                                                    i = 10073;
                                                    break;
                                                case 10072:
                                                    i = 10074;
                                                    break;
                                                case 10073:
                                                    i = 10075;
                                                    break;
                                                case 10074:
                                                    i = 10076;
                                                    break;
                                                case 10075:
                                                    i = 10077;
                                                    break;
                                                case 10076:
                                                    i = 10078;
                                                    break;
                                                case 10077:
                                                    i = 10079;
                                                    break;
                                                default:
                                                    switch (a) {
                                                        case 10099:
                                                            i = 10101;
                                                            break;
                                                        case 10100:
                                                            i = 10102;
                                                            break;
                                                        case 10101:
                                                            i = 10103;
                                                            break;
                                                        case 10102:
                                                            i = 10104;
                                                            break;
                                                        case 10103:
                                                            i = 10105;
                                                            break;
                                                        case 10104:
                                                            i = 10106;
                                                            break;
                                                        case 10105:
                                                            i = 10107;
                                                            break;
                                                        case 10106:
                                                            i = 10108;
                                                            break;
                                                        case 10107:
                                                            i = 10109;
                                                            break;
                                                        case 10108:
                                                            i = 10110;
                                                            break;
                                                        default:
                                                            i = 0;
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            i = 10090;
        }
        esesVar.copyOnWrite();
        eset esetVar2 = (eset) esesVar.instance;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        esetVar2.c = i - 2;
        dyht.b(dzhmVar.l(), new ksp() { // from class: dyyp
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                esff c = dyyt.c((dzpg) obj);
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                c.getClass();
                esetVar3.d = c;
                esetVar3.b |= 1;
            }
        });
        dyht.b(dzhmVar.m(), new ksp() { // from class: dyxo
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                eses esesVar2 = eses.this;
                String str = (String) obj;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                str.getClass();
                esetVar3.e = str;
            }
        });
        dyht.b(emux.a, new ksp() { // from class: dyxp
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                eses esesVar2 = eses.this;
                String str = (String) obj;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                str.getClass();
                esetVar3.i = str;
            }
        });
        dyht.b(dzhmVar.n(), new ksp() { // from class: dyxq
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                eses esesVar2 = eses.this;
                String str = (String) obj;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                str.getClass();
                esetVar3.h = str;
            }
        });
        dyht.b(dzhmVar.b(), new ksp() { // from class: dyxr
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                dzic dzicVar = (dzic) obj;
                final eseu eseuVar = (eseu) esev.a.createBuilder();
                emxc b2 = dzicVar.b();
                eseuVar.getClass();
                dyht.b(b2, new ksp() { // from class: dyyj
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        int intValue = ((Integer) obj2).intValue();
                        eseu eseuVar2 = eseu.this;
                        eseuVar2.copyOnWrite();
                        esev esevVar = (esev) eseuVar2.instance;
                        esev esevVar2 = esev.a;
                        esevVar.c = intValue;
                    }
                });
                dyht.b(dzicVar.c(), new ksp() { // from class: dyyk
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        int intValue = ((Integer) obj2).intValue();
                        eseu eseuVar2 = eseu.this;
                        eseuVar2.copyOnWrite();
                        esev esevVar = (esev) eseuVar2.instance;
                        esev esevVar2 = esev.a;
                        esevVar.b = intValue;
                    }
                });
                dyht.b(dzicVar.a(), new ksp() { // from class: dyyl
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        long longValue = ((Long) obj2).longValue();
                        eseu eseuVar2 = eseu.this;
                        eseuVar2.copyOnWrite();
                        esev esevVar = (esev) eseuVar2.instance;
                        esev esevVar2 = esev.a;
                        esevVar.d = longValue;
                    }
                });
                esev esevVar = (esev) eseuVar.build();
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                esevVar.getClass();
                esetVar3.t = esevVar;
                esetVar3.b |= 256;
            }
        });
        dyht.b(dzhmVar.c(), new ksp() { // from class: dyxs
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                esff c = dyyt.c((dzpg) obj);
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                c.getClass();
                esetVar3.f = c;
                esetVar3.b |= 2;
            }
        });
        dyht.b(dzhmVar.d(), new ksp() { // from class: dyxu
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                esff esffVar;
                dzpt dzptVar = (dzpt) obj;
                if (dzptVar.e() == dzpq.ONE_TO_ONE) {
                    esffVar = dyyt.c(dzptVar.c());
                } else {
                    esfe esfeVar = (esfe) esff.a.createBuilder();
                    String a2 = dzptVar.d().a();
                    esfeVar.copyOnWrite();
                    ((esff) esfeVar.instance).e = a2;
                    String b2 = dzptVar.d().b();
                    esfeVar.copyOnWrite();
                    ((esff) esfeVar.instance).c = b2;
                    esfeVar.copyOnWrite();
                    ((esff) esfeVar.instance).b = fbjw.a(6);
                    esffVar = (esff) esfeVar.build();
                }
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                esffVar.getClass();
                esetVar3.f = esffVar;
                esetVar3.b |= 2;
            }
        });
        dyht.b(dzhmVar.h(), new ksp() { // from class: dyxv
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                int i2;
                switch (((Integer) obj).intValue()) {
                    case 0:
                        i2 = 2;
                        break;
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        i2 = 4;
                        break;
                    case 3:
                        i2 = 5;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 7;
                        break;
                    case 6:
                        i2 = 8;
                        break;
                    case 7:
                        i2 = 9;
                        break;
                    case 8:
                        i2 = 10;
                        break;
                    case 9:
                        i2 = 11;
                        break;
                    case 10:
                        i2 = 12;
                        break;
                    case 11:
                        i2 = 13;
                        break;
                    case 12:
                        i2 = 14;
                        break;
                    case 13:
                        i2 = 15;
                        break;
                    case 14:
                        i2 = 16;
                        break;
                    case 15:
                        i2 = 17;
                        break;
                    case 16:
                        i2 = 18;
                        break;
                    case 17:
                        i2 = 19;
                        break;
                    case 18:
                        i2 = 20;
                        break;
                    case 19:
                        i2 = 21;
                        break;
                    case 20:
                        i2 = 22;
                        break;
                    case 21:
                        i2 = 23;
                        break;
                    case 22:
                        i2 = 24;
                        break;
                    case 23:
                        i2 = 25;
                        break;
                    case 24:
                        i2 = 26;
                        break;
                    case 25:
                        i2 = 27;
                        break;
                    case 26:
                        i2 = 28;
                        break;
                    case 27:
                        i2 = 29;
                        break;
                    case 28:
                        i2 = 30;
                        break;
                    case 29:
                        i2 = 31;
                        break;
                    case 30:
                        i2 = 32;
                        break;
                    case 31:
                        i2 = 33;
                        break;
                    case 32:
                        i2 = 34;
                        break;
                    case 33:
                        i2 = 35;
                        break;
                    case 34:
                        i2 = 36;
                        break;
                    case 35:
                        i2 = 37;
                        break;
                    case 36:
                        i2 = 38;
                        break;
                    case 37:
                        i2 = 39;
                        break;
                    case 38:
                        i2 = 40;
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        i2 = 41;
                        break;
                    case 40:
                        i2 = 42;
                        break;
                    case 41:
                        i2 = 43;
                        break;
                    case 42:
                        i2 = 44;
                        break;
                    case 43:
                        i2 = 45;
                        break;
                    case 44:
                        i2 = 46;
                        break;
                    case 45:
                        i2 = 47;
                        break;
                    case 46:
                        i2 = 48;
                        break;
                    case 47:
                        i2 = 49;
                        break;
                    case 48:
                        i2 = 50;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    case 50:
                    case 61:
                    case 69:
                    case 70:
                    default:
                        i2 = 0;
                        break;
                    case 51:
                        i2 = 53;
                        break;
                    case 52:
                        i2 = 54;
                        break;
                    case 53:
                        i2 = 55;
                        break;
                    case 54:
                        i2 = 56;
                        break;
                    case 55:
                        i2 = 57;
                        break;
                    case 56:
                        i2 = 58;
                        break;
                    case 57:
                        i2 = 59;
                        break;
                    case 58:
                        i2 = 60;
                        break;
                    case 59:
                        i2 = 61;
                        break;
                    case 60:
                        i2 = 62;
                        break;
                    case 62:
                        i2 = 64;
                        break;
                    case 63:
                        i2 = 65;
                        break;
                    case 64:
                        i2 = 66;
                        break;
                    case 65:
                        i2 = 67;
                        break;
                    case 66:
                        i2 = 68;
                        break;
                    case 67:
                        i2 = 69;
                        break;
                    case 68:
                        i2 = 70;
                        break;
                    case 71:
                        i2 = 73;
                        break;
                    case 72:
                        i2 = 74;
                        break;
                    case 73:
                        i2 = 75;
                        break;
                    case 74:
                        i2 = 76;
                        break;
                    case 75:
                        i2 = 77;
                        break;
                    case 76:
                        i2 = 78;
                        break;
                    case 77:
                        i2 = 79;
                        break;
                    case 78:
                        i2 = 80;
                        break;
                    case 79:
                        i2 = 81;
                        break;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        i2 = 82;
                        break;
                    case 81:
                        i2 = 83;
                        break;
                    case 82:
                        i2 = 84;
                        break;
                    case 83:
                        i2 = 85;
                        break;
                    case 84:
                        i2 = 86;
                        break;
                    case 85:
                        i2 = 87;
                        break;
                    case 86:
                        i2 = 88;
                        break;
                    case 87:
                        i2 = 89;
                        break;
                    case 88:
                        i2 = 90;
                        break;
                    case 89:
                        i2 = 91;
                        break;
                    case 90:
                        i2 = 92;
                        break;
                    case 91:
                        i2 = 93;
                        break;
                    case 92:
                        i2 = 94;
                        break;
                    case 93:
                        i2 = 95;
                        break;
                    case 94:
                        i2 = 96;
                        break;
                }
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                if (i2 == 1) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                esetVar3.g = i2 - 2;
            }
        });
        dyht.b(dzhmVar.f(), new ksp() { // from class: dyxw
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                int i2;
                int intValue = ((Integer) obj).intValue();
                if (intValue == 201) {
                    i2 = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
                } else if (intValue == 202) {
                    i2 = 204;
                } else if (intValue == 441) {
                    i2 = 443;
                } else if (intValue != 442) {
                    switch (intValue) {
                        case 0:
                            i2 = 2;
                            break;
                        case 1:
                            i2 = 3;
                            break;
                        case 2:
                            i2 = 4;
                            break;
                        case 3:
                            i2 = 5;
                            break;
                        case 4:
                            i2 = 6;
                            break;
                        case 5:
                            i2 = 7;
                            break;
                        case 6:
                            i2 = 8;
                            break;
                        case 7:
                            i2 = 9;
                            break;
                        case 8:
                            i2 = 10;
                            break;
                        case 9:
                            i2 = 11;
                            break;
                        case 10:
                            i2 = 12;
                            break;
                        default:
                            switch (intValue) {
                                case 51:
                                    i2 = 53;
                                    break;
                                case 52:
                                    i2 = 54;
                                    break;
                                case 53:
                                    i2 = 55;
                                    break;
                                case 54:
                                    i2 = 56;
                                    break;
                                case 55:
                                    i2 = 57;
                                    break;
                                case 56:
                                    i2 = 58;
                                    break;
                                case 57:
                                    i2 = 59;
                                    break;
                                case 58:
                                    i2 = 60;
                                    break;
                                case 59:
                                    i2 = 61;
                                    break;
                                case 60:
                                    i2 = 62;
                                    break;
                                case 61:
                                    i2 = 63;
                                    break;
                                case 62:
                                    i2 = 64;
                                    break;
                                case 63:
                                    i2 = 65;
                                    break;
                                case 64:
                                    i2 = 66;
                                    break;
                                case 65:
                                    i2 = 67;
                                    break;
                                case 66:
                                    i2 = 68;
                                    break;
                                case 67:
                                    i2 = 69;
                                    break;
                                default:
                                    switch (intValue) {
                                        case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                            i2 = 103;
                                            break;
                                        case 102:
                                            i2 = 104;
                                            break;
                                        case 103:
                                            i2 = 105;
                                            break;
                                        case 104:
                                            i2 = 106;
                                            break;
                                        case 105:
                                            i2 = 107;
                                            break;
                                        case 106:
                                            i2 = 108;
                                            break;
                                        case 107:
                                            i2 = 109;
                                            break;
                                        case 108:
                                            i2 = 110;
                                            break;
                                        case 109:
                                            i2 = 111;
                                            break;
                                        case 110:
                                            i2 = 112;
                                            break;
                                        case 111:
                                            i2 = 113;
                                            break;
                                        case 112:
                                            i2 = 114;
                                            break;
                                        case 113:
                                            i2 = 115;
                                            break;
                                        case 114:
                                            i2 = 116;
                                            break;
                                        case 115:
                                            i2 = 117;
                                            break;
                                        case 116:
                                            i2 = 118;
                                            break;
                                        default:
                                            switch (intValue) {
                                                case 131:
                                                    i2 = 133;
                                                    break;
                                                case 132:
                                                    i2 = 134;
                                                    break;
                                                case 133:
                                                    i2 = 135;
                                                    break;
                                                case 134:
                                                    i2 = 136;
                                                    break;
                                                case 135:
                                                    i2 = 137;
                                                    break;
                                                case 136:
                                                    i2 = 138;
                                                    break;
                                                case 137:
                                                    i2 = 139;
                                                    break;
                                                case 138:
                                                    i2 = 140;
                                                    break;
                                                case 139:
                                                    i2 = 141;
                                                    break;
                                                case 140:
                                                    i2 = 142;
                                                    break;
                                                default:
                                                    switch (intValue) {
                                                        case 151:
                                                            i2 = 153;
                                                            break;
                                                        case 152:
                                                            i2 = 154;
                                                            break;
                                                        case 153:
                                                            i2 = 155;
                                                            break;
                                                        case 154:
                                                            i2 = 156;
                                                            break;
                                                        case 155:
                                                            i2 = 157;
                                                            break;
                                                        case 156:
                                                            i2 = 158;
                                                            break;
                                                        default:
                                                            switch (intValue) {
                                                                case 221:
                                                                    i2 = 223;
                                                                    break;
                                                                case 222:
                                                                    i2 = 224;
                                                                    break;
                                                                case 223:
                                                                    i2 = 225;
                                                                    break;
                                                                case 224:
                                                                    i2 = 226;
                                                                    break;
                                                                case 225:
                                                                    i2 = 227;
                                                                    break;
                                                                case 226:
                                                                    i2 = 228;
                                                                    break;
                                                                case 227:
                                                                    i2 = 229;
                                                                    break;
                                                                case 228:
                                                                    i2 = 230;
                                                                    break;
                                                                case 229:
                                                                    i2 = 231;
                                                                    break;
                                                                default:
                                                                    switch (intValue) {
                                                                        case 301:
                                                                            i2 = 303;
                                                                            break;
                                                                        case 371:
                                                                            i2 = 373;
                                                                            break;
                                                                        case 381:
                                                                            i2 = 383;
                                                                            break;
                                                                        case 391:
                                                                            i2 = 393;
                                                                            break;
                                                                        case 392:
                                                                            i2 = 394;
                                                                            break;
                                                                        case 393:
                                                                            i2 = 395;
                                                                            break;
                                                                        case 394:
                                                                            i2 = 396;
                                                                            break;
                                                                        case 395:
                                                                            i2 = 397;
                                                                            break;
                                                                        case 396:
                                                                            i2 = 398;
                                                                            break;
                                                                        case 397:
                                                                            i2 = 399;
                                                                            break;
                                                                        case 398:
                                                                            i2 = 400;
                                                                            break;
                                                                        case 399:
                                                                            i2 = 401;
                                                                            break;
                                                                        case 400:
                                                                            i2 = 402;
                                                                            break;
                                                                        case 401:
                                                                            i2 = 403;
                                                                            break;
                                                                        case 402:
                                                                            i2 = 404;
                                                                            break;
                                                                        case 403:
                                                                            i2 = 405;
                                                                            break;
                                                                        case 404:
                                                                            i2 = 406;
                                                                            break;
                                                                        case 405:
                                                                            i2 = 407;
                                                                            break;
                                                                        case 406:
                                                                            i2 = 408;
                                                                            break;
                                                                        case 407:
                                                                            i2 = 409;
                                                                            break;
                                                                        case 408:
                                                                            i2 = 410;
                                                                            break;
                                                                        case 409:
                                                                            i2 = 411;
                                                                            break;
                                                                        case 410:
                                                                            i2 = 412;
                                                                            break;
                                                                        case 411:
                                                                            i2 = 413;
                                                                            break;
                                                                        case 412:
                                                                            i2 = 414;
                                                                            break;
                                                                        case 461:
                                                                            i2 = 463;
                                                                            break;
                                                                        case 462:
                                                                            i2 = 464;
                                                                            break;
                                                                        case 463:
                                                                            i2 = 465;
                                                                            break;
                                                                        case 464:
                                                                            i2 = 466;
                                                                            break;
                                                                        case 481:
                                                                            i2 = 483;
                                                                            break;
                                                                        case 482:
                                                                            i2 = 484;
                                                                            break;
                                                                        case 491:
                                                                            i2 = 493;
                                                                            break;
                                                                        case 492:
                                                                            i2 = 494;
                                                                            break;
                                                                        case 493:
                                                                            i2 = 495;
                                                                            break;
                                                                        case 494:
                                                                            i2 = 496;
                                                                            break;
                                                                        case 495:
                                                                            i2 = 497;
                                                                            break;
                                                                        case 496:
                                                                            i2 = 498;
                                                                            break;
                                                                        case 497:
                                                                            i2 = 499;
                                                                            break;
                                                                        case 498:
                                                                            i2 = 500;
                                                                            break;
                                                                        case 499:
                                                                            i2 = 501;
                                                                            break;
                                                                        case 500:
                                                                            i2 = 502;
                                                                            break;
                                                                        case 501:
                                                                            i2 = 503;
                                                                            break;
                                                                        case 502:
                                                                            i2 = 504;
                                                                            break;
                                                                        case 511:
                                                                            i2 = 513;
                                                                            break;
                                                                        case 512:
                                                                            i2 = 514;
                                                                            break;
                                                                        case 601:
                                                                            i2 = 603;
                                                                            break;
                                                                        case 602:
                                                                            i2 = 604;
                                                                            break;
                                                                        case 603:
                                                                            i2 = 605;
                                                                            break;
                                                                        case 604:
                                                                            i2 = 606;
                                                                            break;
                                                                        case 605:
                                                                            i2 = 607;
                                                                            break;
                                                                        case 606:
                                                                            i2 = 608;
                                                                            break;
                                                                        case 607:
                                                                            i2 = 609;
                                                                            break;
                                                                        case 608:
                                                                            i2 = 610;
                                                                            break;
                                                                        case 609:
                                                                            i2 = 611;
                                                                            break;
                                                                        case 610:
                                                                            i2 = 612;
                                                                            break;
                                                                        case 611:
                                                                            i2 = 613;
                                                                            break;
                                                                        case 612:
                                                                            i2 = 614;
                                                                            break;
                                                                        case 613:
                                                                            i2 = 615;
                                                                            break;
                                                                        case 701:
                                                                            i2 = 703;
                                                                            break;
                                                                        case 702:
                                                                            i2 = 704;
                                                                            break;
                                                                        case 706:
                                                                            i2 = 708;
                                                                            break;
                                                                        case 711:
                                                                            i2 = 713;
                                                                            break;
                                                                        case 712:
                                                                            i2 = 714;
                                                                            break;
                                                                        case 713:
                                                                            i2 = 715;
                                                                            break;
                                                                        default:
                                                                            switch (intValue) {
                                                                                case 341:
                                                                                    i2 = 343;
                                                                                    break;
                                                                                case 342:
                                                                                    i2 = 344;
                                                                                    break;
                                                                                case 343:
                                                                                    i2 = 345;
                                                                                    break;
                                                                                case 344:
                                                                                    i2 = 346;
                                                                                    break;
                                                                                case 345:
                                                                                    i2 = 347;
                                                                                    break;
                                                                                case 346:
                                                                                    i2 = 348;
                                                                                    break;
                                                                                case 347:
                                                                                    i2 = 349;
                                                                                    break;
                                                                                case 348:
                                                                                    i2 = 350;
                                                                                    break;
                                                                                default:
                                                                                    i2 = 0;
                                                                                    break;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    i2 = 444;
                }
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                if (i2 == 1) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                esetVar3.j = i2 - 2;
            }
        });
        dyht.b(dzhmVar.k(), new ksp() { // from class: dyyq
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                int intValue = ((Integer) obj).intValue();
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                esetVar3.k = intValue;
            }
        });
        dyht.b(dzhmVar.j(), new ksp() { // from class: dyyr
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                int intValue = ((Integer) obj).intValue();
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                esetVar3.l = intValue;
            }
        });
        dyht.b(dzhmVar.i(), new ksp() { // from class: dyys
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                int intValue = ((Integer) obj).intValue();
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar3 = (eset) esesVar2.instance;
                eset esetVar4 = eset.a;
                esetVar3.p = intValue;
            }
        });
        if (!dzhmVar.q().isEmpty()) {
            esfc esfcVar = (esfc) esfd.a.createBuilder();
            engw q = dzhmVar.q();
            esfcVar.copyOnWrite();
            esfd esfdVar = (esfd) esfcVar.instance;
            eygl eyglVar = esfdVar.b;
            if (!eyglVar.c()) {
                esfdVar.b = eyfy.mutableCopy(eyglVar);
            }
            eydl.addAll(q, esfdVar.b);
            esesVar.copyOnWrite();
            eset esetVar3 = (eset) esesVar.instance;
            esfd esfdVar2 = (esfd) esfcVar.build();
            esfdVar2.getClass();
            esetVar3.m = esfdVar2;
            esetVar3.b |= 4;
        }
        dyht.b(dzhmVar.o(), new ksp() { // from class: dyxk
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                int intValue = ((Integer) obj).intValue();
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar4 = (eset) esesVar2.instance;
                eset esetVar5 = eset.a;
                esetVar4.n = intValue;
            }
        });
        dyht.b(dzhmVar.p(), new ksp() { // from class: dyxl
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                dzsk dzskVar = (dzsk) obj;
                final esfa esfaVar = (esfa) esfb.a.createBuilder();
                emxc d = dzskVar.d();
                esfaVar.getClass();
                dyht.b(d, new ksp() { // from class: dyxx
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        long longValue = ((Long) obj2).longValue();
                        esfa esfaVar2 = esfa.this;
                        esfaVar2.copyOnWrite();
                        esfb esfbVar = (esfb) esfaVar2.instance;
                        esfb esfbVar2 = esfb.a;
                        esfbVar.d = longValue;
                    }
                });
                dyht.b(dzskVar.f(), new ksp() { // from class: dyxy
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        long longValue = ((Long) obj2).longValue();
                        esfa esfaVar2 = esfa.this;
                        esfaVar2.copyOnWrite();
                        esfb esfbVar = (esfb) esfaVar2.instance;
                        esfb esfbVar2 = esfb.a;
                        esfbVar.e = longValue;
                    }
                });
                dyht.b(dzskVar.e(), new ksp() { // from class: dyxz
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        esfa esfaVar2 = esfa.this;
                        String str = (String) obj2;
                        esfaVar2.copyOnWrite();
                        esfb esfbVar = (esfb) esfaVar2.instance;
                        esfb esfbVar2 = esfb.a;
                        str.getClass();
                        esfbVar.j = str;
                    }
                });
                dyht.b(dzskVar.b(), new ksp() { // from class: dyya
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        esfa esfaVar2 = esfa.this;
                        String str = (String) obj2;
                        esfaVar2.copyOnWrite();
                        esfb esfbVar = (esfb) esfaVar2.instance;
                        esfb esfbVar2 = esfb.a;
                        str.getClass();
                        esfbVar.g = str;
                    }
                });
                dyht.b(dzskVar.c(), new ksp() { // from class: dyyb
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        long longValue = ((Long) obj2).longValue();
                        esfa esfaVar2 = esfa.this;
                        esfaVar2.copyOnWrite();
                        esfb esfbVar = (esfb) esfaVar2.instance;
                        esfb esfbVar2 = esfb.a;
                        esfbVar.f = longValue;
                    }
                });
                dyht.b(dzskVar.a(), new ksp() { // from class: dyyc
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        long longValue = ((Long) obj2).longValue();
                        esfa esfaVar2 = esfa.this;
                        esfaVar2.copyOnWrite();
                        esfb esfbVar = (esfb) esfaVar2.instance;
                        esfb esfbVar2 = esfb.a;
                        esfbVar.h = longValue;
                    }
                });
                dyht.b(dzskVar.g(), new ksp() { // from class: dyyd
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        dzsj dzsjVar = (dzsj) obj2;
                        dzpf dzpfVar = dzpf.UNKNOWN;
                        int c = dzsjVar.c();
                        int i2 = c - 1;
                        if (c == 0) {
                            throw null;
                        }
                        esfa esfaVar2 = esfa.this;
                        int i3 = 4;
                        if (i2 == 1) {
                            esfaVar2.copyOnWrite();
                            esfb esfbVar = (esfb) esfaVar2.instance;
                            esfb esfbVar2 = esfb.a;
                            esfbVar.i = esel.a(3);
                            dzid a2 = dzsjVar.a();
                            final esem esemVar = (esem) esen.a.createBuilder();
                            String e = a2.e();
                            esemVar.copyOnWrite();
                            esen esenVar = (esen) esemVar.instance;
                            e.getClass();
                            esenVar.b = e;
                            int a3 = a2.a();
                            if (a3 == 1) {
                                i3 = 3;
                            } else if (a3 != 2) {
                                i3 = 2;
                            }
                            esemVar.copyOnWrite();
                            ((esen) esemVar.instance).e = i3 - 2;
                            dyht.b(a2.b(), new ksp() { // from class: dyxj
                                @Override // defpackage.ksp
                                public final void accept(Object obj3) {
                                    int i4 = dzjf.PREFILL_MESSAGE.m;
                                    int intValue = ((Integer) obj3).intValue();
                                    esem esemVar2 = esem.this;
                                    esemVar2.copyOnWrite();
                                    esen esenVar2 = (esen) esemVar2.instance;
                                    esen esenVar3 = esen.a;
                                    esenVar2.g = i4 == intValue;
                                }
                            });
                            dyht.b(a2.c(), new ksp() { // from class: dyxt
                                @Override // defpackage.ksp
                                public final void accept(Object obj3) {
                                    int intValue = ((Integer) obj3).intValue();
                                    esem esemVar2 = esem.this;
                                    esemVar2.copyOnWrite();
                                    esen esenVar2 = (esen) esemVar2.instance;
                                    esen esenVar3 = esen.a;
                                    esenVar2.c = intValue;
                                }
                            });
                            dyht.b(a2.d(), new ksp() { // from class: dyye
                                @Override // defpackage.ksp
                                public final void accept(Object obj3) {
                                    int intValue = ((Integer) obj3).intValue();
                                    esem esemVar2 = esem.this;
                                    esemVar2.copyOnWrite();
                                    esen esenVar2 = (esen) esemVar2.instance;
                                    esen esenVar3 = esen.a;
                                    esenVar2.d = intValue;
                                }
                            });
                            dyht.b(a2.b(), new ksp() { // from class: dyym
                                @Override // defpackage.ksp
                                public final void accept(Object obj3) {
                                    int c2 = dzdr.c(((Integer) obj3).intValue());
                                    esem esemVar2 = esem.this;
                                    esemVar2.copyOnWrite();
                                    esen esenVar2 = (esen) esemVar2.instance;
                                    esen esenVar3 = esen.a;
                                    esenVar2.f = fbjr.a(c2);
                                }
                            });
                            esen esenVar2 = (esen) esemVar.build();
                            esfaVar2.copyOnWrite();
                            esfb esfbVar3 = (esfb) esfaVar2.instance;
                            esenVar2.getClass();
                            esfbVar3.c = esenVar2;
                            esfbVar3.b = 7;
                            return;
                        }
                        if (i2 == 2) {
                            esfaVar2.copyOnWrite();
                            esfb esfbVar4 = (esfb) esfaVar2.instance;
                            esfb esfbVar5 = esfb.a;
                            esfbVar4.i = esel.a(5);
                            return;
                        }
                        if (i2 == 4) {
                            esfaVar2.copyOnWrite();
                            esfb esfbVar6 = (esfb) esfaVar2.instance;
                            esfb esfbVar7 = esfb.a;
                            esfbVar6.i = esel.a(7);
                            return;
                        }
                        if (i2 == 5) {
                            esfaVar2.copyOnWrite();
                            esfb esfbVar8 = (esfb) esfaVar2.instance;
                            esfb esfbVar9 = esfb.a;
                            esfbVar8.i = esel.a(8);
                            return;
                        }
                        if (i2 != 6) {
                            return;
                        }
                        dzie b2 = dzsjVar.b();
                        esfaVar2.copyOnWrite();
                        esfb esfbVar10 = (esfb) esfaVar2.instance;
                        esfb esfbVar11 = esfb.a;
                        esfbVar10.i = esel.a(6);
                        eseo eseoVar = (eseo) esep.a.createBuilder();
                        b2.d();
                        eseoVar.copyOnWrite();
                        ((esep) eseoVar.instance).d = false;
                        boolean b3 = b2.b();
                        eseoVar.copyOnWrite();
                        ((esep) eseoVar.instance).b = b3;
                        long a4 = b2.a();
                        eseoVar.copyOnWrite();
                        ((esep) eseoVar.instance).c = a4;
                        boolean c2 = b2.c();
                        eseoVar.copyOnWrite();
                        ((esep) eseoVar.instance).e = c2;
                        esep esepVar = (esep) eseoVar.build();
                        esfaVar2.copyOnWrite();
                        esfb esfbVar12 = (esfb) esfaVar2.instance;
                        esepVar.getClass();
                        esfbVar12.c = esepVar;
                        esfbVar12.b = 9;
                    }
                });
                dyht.b(dzskVar.h(), new ksp() { // from class: dyyf
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        esfa esfaVar2 = esfa.this;
                        String str = (String) obj2;
                        esfaVar2.copyOnWrite();
                        esfb esfbVar = (esfb) esfaVar2.instance;
                        esfb esfbVar2 = esfb.a;
                        str.getClass();
                        esfbVar.k = str;
                    }
                });
                esfb esfbVar = (esfb) esfaVar.build();
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar4 = (eset) esesVar2.instance;
                eset esetVar5 = eset.a;
                esfbVar.getClass();
                esetVar4.o = esfbVar;
                esetVar4.b |= 8;
            }
        });
        dyht.b(dzhmVar.g(), new ksp() { // from class: dyxm
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                dzig dzigVar = (dzig) obj;
                final esew esewVar = (esew) esex.a.createBuilder();
                emxc c = dzigVar.c();
                esewVar.getClass();
                dyht.b(c, new ksp() { // from class: dyyg
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        int intValue = ((Integer) obj2).intValue();
                        esew esewVar2 = esew.this;
                        esewVar2.copyOnWrite();
                        esex esexVar = (esex) esewVar2.instance;
                        esex esexVar2 = esex.a;
                        esexVar.c = intValue;
                    }
                });
                dyht.b(dzigVar.a(), new ksp() { // from class: dyyh
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        int intValue = ((Integer) obj2).intValue();
                        esew esewVar2 = esew.this;
                        esewVar2.copyOnWrite();
                        esex esexVar = (esex) esewVar2.instance;
                        esex esexVar2 = esex.a;
                        esexVar.d = intValue;
                    }
                });
                dyht.b(dzigVar.b(), new ksp() { // from class: dyyi
                    @Override // defpackage.ksp
                    public final void accept(Object obj2) {
                        int intValue = ((Integer) obj2).intValue();
                        esew esewVar2 = esew.this;
                        esewVar2.copyOnWrite();
                        esex esexVar = (esex) esewVar2.instance;
                        esex esexVar2 = esex.a;
                        esexVar.b = intValue;
                    }
                });
                esex esexVar = (esex) esewVar.build();
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar4 = (eset) esesVar2.instance;
                eset esetVar5 = eset.a;
                esexVar.getClass();
                esetVar4.r = esexVar;
                esetVar4.b |= 64;
            }
        });
        dyht.b(dzhmVar.e(), new ksp() { // from class: dyxn
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                esey eseyVar = (esey) esez.a.createBuilder();
                long longValue = ((Long) obj).longValue();
                eseyVar.copyOnWrite();
                ((esez) eseyVar.instance).b = longValue;
                eses esesVar2 = eses.this;
                esesVar2.copyOnWrite();
                eset esetVar4 = (eset) esesVar2.instance;
                esez esezVar = (esez) eseyVar.build();
                eset esetVar5 = eset.a;
                esezVar.getClass();
                esetVar4.q = esezVar;
                esetVar4.b |= 16;
            }
        });
        eset esetVar4 = (eset) esesVar.build();
        int a2 = dzhmVar.a();
        dflc j = dfldVar.j(esetVar4, dtql.b(this.c, new fgkj()));
        j.i(a2);
        if (emxcVar.g()) {
            j.h((String) emxcVar.c());
        }
        j.c();
        this.e.execute(new Runnable() { // from class: dyyo
            @Override // java.lang.Runnable
            public final void run() {
                dyyt dyytVar = dyyt.this;
                Set set = dyytVar.a;
                dzhm dzhmVar2 = dzhmVar;
                synchronized (set) {
                    Iterator it = dyytVar.a.iterator();
                    while (it.hasNext()) {
                        ((dzhn) it.next()).b(dzhmVar2);
                    }
                }
            }
        });
    }
}
