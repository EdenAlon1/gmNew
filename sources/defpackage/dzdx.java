package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdx {
    public static dzpg a(fcek fcekVar) {
        dzil dzilVar = new dzil();
        dzilVar.d(fcekVar.d);
        dzpf dzpfVar = dzpf.UNKNOWN;
        fgtg b = fgtg.b(fcekVar.b);
        if (b == null) {
            b = fgtg.UNRECOGNIZED;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            dzilVar.c(fcekVar.c);
            dzilVar.e(dzpf.PHONE_NUMBER);
        } else if (ordinal == 13) {
            dzilVar.c(fcekVar.c);
            dzilVar.e(dzpf.DEVICE_ID);
        } else if (ordinal == 16) {
            dzilVar.c(fcekVar.c);
            dzilVar.e(dzpf.EMAIL);
        } else {
            if (ordinal != 18) {
                return null;
            }
            String[] split = fcekVar.c.split(Pattern.quote("|"), 2);
            if (split.length != 2) {
                return null;
            }
            dzilVar.c(split[1]);
            dzilVar.b(split[0]);
            dzilVar.e(dzpf.HANDLER);
        }
        return dzilVar.a();
    }

    public static dzpt b(fcek fcekVar, dzja dzjaVar) {
        fgtg b = fgtg.b(fcekVar.b);
        if (b == null) {
            b = fgtg.UNRECOGNIZED;
        }
        emxf.a(b == fgtg.GROUP_ID);
        dzip dzipVar = new dzip();
        dzipVar.c(fcekVar.c);
        dzipVar.b(fcekVar.d);
        dzpn a = dzipVar.a();
        dzin dzinVar = new dzin();
        dzinVar.d(a);
        dzinVar.c(dzjaVar.c().f());
        return dzinVar.a();
    }

    public static fcek c(dzpg dzpgVar) {
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fcejVar.copyOnWrite();
        dzim dzimVar = (dzim) dzpgVar;
        ((fcek) fcejVar.instance).d = dzimVar.b;
        dzpf dzpfVar = dzpf.UNKNOWN;
        int ordinal = dzimVar.c.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1) {
            String str = dzimVar.a;
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).c = str;
            fgtg fgtgVar = fgtg.PHONE_NUMBER;
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).b = fgtgVar.a();
        } else if (ordinal == 2) {
            String str2 = dzimVar.a;
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).c = str2;
            fgtg fgtgVar2 = fgtg.EMAIL;
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).b = fgtgVar2.a();
        } else if (ordinal == 3) {
            emxc emxcVar = dzimVar.d;
            if (emxcVar.g()) {
                String str3 = ((String) emxcVar.c()) + "|" + dzimVar.a;
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).c = str3;
                fgtg fgtgVar3 = fgtg.LIGHTER_ID;
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).b = fgtgVar3.a();
            } else {
                String str4 = dzimVar.a;
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).c = str4;
                fgtg fgtgVar4 = fgtg.LIGHTER_ID;
                fcejVar.copyOnWrite();
                ((fcek) fcejVar.instance).b = fgtgVar4.a();
            }
        } else if (ordinal == 4) {
            String str5 = dzimVar.a;
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).c = str5;
            fgtg fgtgVar5 = fgtg.DEVICE_ID;
            fcejVar.copyOnWrite();
            ((fcek) fcejVar.instance).b = fgtgVar5.a();
        }
        return (fcek) fcejVar.build();
    }
}
