package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnu {
    public static final void a(fnv fnvVar, hvi hviVar, ffjn ffjnVar, hfd hfdVar, int i) {
        int i2 = i & 6;
        hfd b = hfdVar.b(2036134589);
        int i3 = i2 == 0 ? (true != ((i & 8) == 0 ? b.D(fnvVar) : b.F(fnvVar)) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.F(ffjnVar) ? 128 : 256;
        }
        if (b.J((i3 & 147) != 146, i3 & 1)) {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new fkh();
                hfmVar.ad(R);
            }
            fkh fkhVar = (fkh) R;
            String a = fok.a(7, b);
            if (ffkj.e(fnvVar, fkhVar.a)) {
                b.v(1524617353);
                hfmVar.Z();
            } else {
                b.v(1522020731);
                fkhVar.a = fnvVar;
                List list = fkhVar.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((fkg) list.get(i4)).a);
                }
                List am = ffdx.am(arrayList);
                if (!am.contains(fnvVar)) {
                    am.add(fnvVar);
                }
                fkhVar.b.clear();
                List b2 = kau.b(am);
                List list2 = fkhVar.b;
                int size2 = b2.size();
                int i5 = 0;
                while (i5 < size2) {
                    fnv fnvVar2 = (fnv) b2.get(i5);
                    list2.add(new fkg(fnvVar2, hpx.d(1471040642, new fnn(fnvVar2, fnvVar, am, fkhVar, a), b)));
                    i5++;
                    am = am;
                }
                hfmVar.Z();
            }
            int i6 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b, hviVar);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b3, iss.c);
            fkhVar.c = hey.c(b);
            b.v(1801449988);
            List list3 = fkhVar.b;
            int size3 = list3.size();
            for (int i8 = 0; i8 < size3; i8++) {
                fkg fkgVar = (fkg) list3.get(i8);
                Object obj = fkgVar.a;
                ffjn ffjnVar2 = fkgVar.b;
                b.u(2123994112, obj);
                ffjnVar2.a(hpx.d(2041982076, new fno(ffjnVar, (fnv) obj), b), b, 6);
                hfmVar.Z();
            }
            hfmVar.Z();
            b.n();
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fnp(fnvVar, hviVar, ffjnVar, i);
        }
    }

    public static final void b(fnx fnxVar, hvi hviVar, ffjn ffjnVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(431012348);
        if (i3 == 0) {
            i2 = (true != b.D(fnxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if (b.J((i4 & 147) != 146, i4 & 1)) {
            hviVar = hvi.e;
            ffjnVar = fiw.a;
            fnv a = fnxVar.a();
            iyi iyiVar = (iyi) b.e(jdr.a);
            boolean F = b.F(a) | b.F(iyiVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (F || R == hfc.a) {
                R = new fnq(a, iyiVar, null);
                hfmVar.ad(R);
            }
            hgs.g(a, (ffjm) R, b);
            a(fnxVar.a(), hviVar, ffjnVar, b, i4 & 1008);
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new fnr(fnxVar, hviVar, ffjnVar, i);
        }
    }
}
