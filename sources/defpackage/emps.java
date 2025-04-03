package defpackage;

import j$.util.Optional;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emps {
    public static String a(fbxa fbxaVar) {
        int i;
        Integer valueOf = Integer.valueOf(emlr.b(fbxaVar).a());
        String str = (fbxaVar.c == 7 ? (fbsd) fbxaVar.d : fbsd.a).b;
        fbsk fbskVar = (fbxaVar.c == 6 ? (fbsm) fbxaVar.d : fbsm.a).c;
        if (fbskVar == null) {
            fbskVar = fbsk.a;
        }
        String str2 = fbskVar.c;
        String str3 = (fbxaVar.c == 2 ? (fbxc) fbxaVar.d : fbxc.a).c;
        String str4 = (fbxaVar.c == 5 ? (fbtw) fbxaVar.d : fbtw.a).b;
        String str5 = (fbxaVar.c == 13 ? (fbtl) fbxaVar.d : fbtl.a).b;
        String str6 = (fbxaVar.c == 20 ? (fbwr) fbxaVar.d : fbwr.a).b;
        String str7 = (fbxaVar.c == 15 ? (fbwh) fbxaVar.d : fbwh.a).b;
        if (fbri.BUSINESS_MESSAGE.equals(emlr.b(fbxaVar))) {
            fbwy fbwyVar = fbxaVar.e;
            if (fbwyVar == null) {
                fbwyVar = fbwy.b;
            }
            fbrg b = fbrg.b(fbwyVar.g);
            if (b == null) {
                b = fbrg.UNRECOGNIZED;
            }
            i = b.a();
        } else {
            i = 0;
        }
        Integer valueOf2 = Integer.valueOf(i);
        int b2 = fbur.b((fbxaVar.c == 30 ? (fbus) fbxaVar.d : fbus.a).b);
        if (b2 == 0) {
            b2 = 1;
        }
        return String.format("%d:%s:%s:%s:%s:%s:%s:%s:%d:%d", valueOf, str, str2, str3, str4, str5, str6, str7, valueOf2, Integer.valueOf(fbur.a(b2)));
    }

    public static boolean b(fbxa fbxaVar) {
        fbwy fbwyVar = fbxaVar.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbrg b = fbrg.b(fbwyVar.g);
        if (b == null) {
            b = fbrg.UNRECOGNIZED;
        }
        return b == fbrg.STICKY_PROVIDER;
    }

    public static void c(List list) {
        Collections.sort(list, new Comparator() { // from class: empr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                fbxa fbxaVar = (fbxa) obj;
                fbxa fbxaVar2 = (fbxa) obj2;
                if (fbxaVar.c != 2 && fbxaVar2.c != 2 && emps.b(fbxaVar) != emps.b(fbxaVar2)) {
                    return !emps.b(fbxaVar2) ? 1 : -1;
                }
                int i = fbxaVar.c;
                boolean z = i == 15;
                int i2 = fbxaVar2.c;
                if (z != (i2 == 15)) {
                    return i != 15 ? 1 : -1;
                }
                if ((i == 7) != (i2 == 7)) {
                    return i != 7 ? 1 : -1;
                }
                if ((i == 14) != (i2 == 14)) {
                    return i != 14 ? 1 : -1;
                }
                if ((i == 6) != (i2 == 6)) {
                    return i != 6 ? 1 : -1;
                }
                if ((i == 11) != (i2 == 11)) {
                    return i != 11 ? 1 : -1;
                }
                if ((i == 3) != (i2 == 3)) {
                    return i != 3 ? 1 : -1;
                }
                if ((i == 4) != (i2 == 4)) {
                    return i != 4 ? 1 : -1;
                }
                if ((i == 5) != (i2 == 5)) {
                    return i != 5 ? 1 : -1;
                }
                if ((i == 19) != (i2 == 19)) {
                    return i != 19 ? 1 : -1;
                }
                if ((i == 2) != (i2 == 2)) {
                    return i != 2 ? 1 : -1;
                }
                return 0;
            }
        });
    }

    static fbxa d(fbxa fbxaVar, Optional optional, int i) {
        fbwy fbwyVar = fbxaVar.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbwx fbwxVar = (fbwx) fbwyVar.toBuilder();
        fbvy fbvyVar = (fbvy) fbvz.a.createBuilder();
        fbvyVar.copyOnWrite();
        ((fbvz) fbvyVar.instance).c = fbqz.a(i);
        if (optional.isPresent()) {
            fbwa fbwaVar = (fbwa) fbwb.a.createBuilder();
            double doubleValue = ((Double) optional.get()).doubleValue();
            fbwaVar.copyOnWrite();
            ((fbwb) fbwaVar.instance).b = doubleValue;
            fbvyVar.copyOnWrite();
            fbvz fbvzVar = (fbvz) fbvyVar.instance;
            fbwb fbwbVar = (fbwb) fbwaVar.build();
            fbwbVar.getClass();
            fbvzVar.d = fbwbVar;
            fbvzVar.b |= 1;
        }
        fbwz fbwzVar = (fbwz) fbxaVar.toBuilder();
        fbwxVar.copyOnWrite();
        fbwy fbwyVar2 = (fbwy) fbwxVar.instance;
        fbvz fbvzVar2 = (fbvz) fbvyVar.build();
        fbvzVar2.getClass();
        fbwyVar2.r = fbvzVar2;
        fbwyVar2.c |= 4;
        fbwzVar.copyOnWrite();
        fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
        fbwy fbwyVar3 = (fbwy) fbwxVar.build();
        fbwyVar3.getClass();
        fbxaVar2.e = fbwyVar3;
        fbxaVar2.b |= 1;
        return (fbxa) fbwzVar.build();
    }
}
