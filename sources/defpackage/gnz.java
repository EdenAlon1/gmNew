package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnz {
    public static final void a(god godVar, hvi hviVar, ffjn ffjnVar, hfd hfdVar, int i, int i2) {
        int i3;
        int i4 = i2 & 1;
        hfd b = hfdVar.b(464178177);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != b.D(godVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        int i6 = i3 | 384;
        if ((i6 & 147) == 146 && b.I()) {
            b.s();
        } else {
            if (i5 != 0) {
                hviVar = hvi.e;
            }
            ffjnVar = fyv.a;
            goa a = godVar.a();
            iyi iyiVar = (iyi) b.e(jdr.a);
            boolean D = b.D(a) | b.F(iyiVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new gnv(a, iyiVar, null);
                hfmVar.ad(R);
            }
            hgs.g(a, (ffjm) R, b);
            b(godVar.a(), hviVar, ffjnVar, b, i6 & 1008);
        }
        hvi hviVar2 = hviVar;
        ffjn ffjnVar2 = ffjnVar;
        hio L = b.L();
        if (L != null) {
            L.d = new gnw(godVar, hviVar2, ffjnVar2, i, i2);
        }
    }

    public static final void b(goa goaVar, hvi hviVar, ffjn ffjnVar, hfd hfdVar, int i) {
        int i2 = i & 6;
        hfd b = hfdVar.b(-1316639904);
        int i3 = i2 == 0 ? (true != b.D(goaVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.F(ffjnVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
        } else {
            String b2 = hcb.b(R.string.m3c_snackbar_pane_title, b);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new gdu();
                hfmVar.ad(R);
            }
            gdu gduVar = (gdu) R;
            if (ffkj.e(goaVar, gduVar.a)) {
                b.v(-304328884);
                hfmVar.Z();
            } else {
                b.v(-306328725);
                gduVar.a = goaVar;
                List list = gduVar.b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((gdt) list.get(i4)).a);
                }
                List am = ffdx.am(arrayList);
                if (!am.contains(goaVar)) {
                    am.add(goaVar);
                }
                gduVar.b.clear();
                List b3 = kau.b(am);
                List list2 = gduVar.b;
                int size2 = b3.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    goa goaVar2 = (goa) b3.get(i5);
                    list2.add(new gdt(goaVar2, hpx.d(-1654683077, new gns(goaVar2, goaVar, gduVar, b2), b)));
                }
                hfmVar.Z();
            }
            int i6 = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b4 = huz.b(b, hviVar);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b4, iss.c);
            gduVar.c = hey.c(b);
            b.v(1748073313);
            List list3 = gduVar.b;
            int size3 = list3.size();
            for (int i8 = 0; i8 < size3; i8++) {
                gdt gdtVar = (gdt) list3.get(i8);
                Object obj = gdtVar.a;
                ffjn ffjnVar2 = gdtVar.b;
                b.u(1201064413, obj);
                ffjnVar2.a(hpx.d(-1135367807, new gnt(ffjnVar, (goa) obj), b), b, 6);
                hfmVar.Z();
            }
            hfmVar.Z();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gnu(goaVar, hviVar, ffjnVar, i);
        }
    }
}
