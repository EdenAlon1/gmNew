package defpackage;

import android.util.Log;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgq implements kjf, kgl {
    private final kiv a;
    private Map b;
    private final Map c;
    private final Map d;
    private final kgt e;
    private final int[] f;
    private final int[] g;

    public kgq(jzn jznVar) {
        kiv kivVar = new kiv(null);
        kivVar.af(this);
        this.a = kivVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new kgt(jznVar);
        this.f = new int[2];
        this.g = new int[2];
    }

    private final long e(kiu kiuVar, long j) {
        boolean z = kiuVar instanceof kjb;
        Object obj = kiuVar.aq;
        String str = kiuVar.v;
        int i = 0;
        if (!z) {
            if (!(obj instanceof ipl)) {
                Log.w("CCL", "Nothing to measure for widget: ".concat(String.valueOf(str)));
                return cmv.c(0, 0);
            }
            iqk e = ((ipl) obj).e(j);
            this.b.put(obj, e);
            return cmv.c(e.a, e.b);
        }
        int i2 = jzk.k(j) ? 1073741824 : jzk.i(j) ? Integer.MIN_VALUE : 0;
        if (jzk.j(j)) {
            i = 1073741824;
        } else if (jzk.h(j)) {
            i = Integer.MIN_VALUE;
        }
        kjb kjbVar = (kjb) kiuVar;
        kjbVar.b(i2, jzk.b(j), i, jzk.a(j));
        return cmv.c(kjbVar.aU, kjbVar.aV);
    }

    private static final void f(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int[] iArr) {
        if (i == 0) {
            throw null;
        }
        int i6 = i - 1;
        if (i6 == 0) {
            iArr[0] = i2;
            iArr[1] = i2;
            return;
        }
        if (i6 == 1) {
            iArr[0] = 0;
            iArr[1] = i5;
        } else {
            if (i6 != 2) {
                iArr[0] = i5;
                iArr[1] = i5;
                return;
            }
            boolean z3 = z2 || (i4 == 1 ? i3 != 1 || z : i4 == 2);
            iArr[0] = true != z3 ? 0 : i2;
            if (true != z3) {
                i2 = i5;
            }
            iArr[1] = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019a  */
    @Override // defpackage.kjf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.kiu r24, defpackage.kje r25) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgq.b(kiu, kje):void");
    }

    public final void c(iqj iqjVar, List list, Map map) {
        iqk iqkVar;
        iqj iqjVar2;
        this.b = map;
        int i = 0;
        if (this.d.isEmpty()) {
            ArrayList arrayList = this.a.aL;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                kiu kiuVar = (kiu) arrayList.get(i2);
                Object obj = kiuVar.aq;
                if (obj instanceof ipl) {
                    kif kifVar = kiuVar.u;
                    kiu kiuVar2 = kifVar.a;
                    if (kiuVar2 != null) {
                        kifVar.b = kiuVar2.k();
                        kifVar.c = kifVar.a.l();
                        kifVar.d = kifVar.a.i();
                        kifVar.e = kifVar.a.g();
                        kifVar.a(kifVar.a.u);
                    }
                    this.d.put(kgr.a((ipl) obj), new kif(kifVar));
                }
            }
        }
        int size2 = list.size();
        while (i < size2) {
            ipl iplVar = (ipl) list.get(i);
            kif kifVar2 = (kif) this.d.get(kgr.a(iplVar));
            if (kifVar2 != null && (iqkVar = (iqk) this.b.get(iplVar)) != null && kifVar2.q != 8) {
                if (Float.isNaN(kifVar2.h) && Float.isNaN(kifVar2.i) && Float.isNaN(kifVar2.j) && Float.isNaN(kifVar2.k) && Float.isNaN(kifVar2.l) && Float.isNaN(kifVar2.m) && Float.isNaN(kifVar2.n) && Float.isNaN(kifVar2.o) && Float.isNaN(kifVar2.p)) {
                    iqjVar.f(iqkVar, kab.a(kifVar2.b - kaa.a(0L), kifVar2.c - kaa.b(0L)), 0.0f);
                } else {
                    iqjVar2 = iqjVar;
                    iqjVar2.g(iqkVar, kifVar2.b - kaa.a(0L), kifVar2.c - kaa.b(0L), Float.isNaN(kifVar2.m) ? 0.0f : kifVar2.m, new kfx(kifVar2));
                    i++;
                    iqjVar = iqjVar2;
                }
            }
            iqjVar2 = iqjVar;
            i++;
            iqjVar = iqjVar2;
        }
    }

    public final long d(long j, kah kahVar, kgj kgjVar, List list, Map map) {
        khz khzVar;
        khz khzVar2;
        kia kiaVar;
        kiz x;
        kiz x2;
        this.b = map;
        if (list.isEmpty()) {
            return kag.a(jzk.d(j), jzk.c(j));
        }
        kgt kgtVar = this.e;
        if (jzk.k(j)) {
            khzVar = khz.a(jzk.b(j));
        } else {
            khzVar = new khz(khz.b);
            khzVar.e(jzk.d(j));
        }
        kgtVar.h.ad = khzVar;
        kgt kgtVar2 = this.e;
        if (jzk.j(j)) {
            khzVar2 = khz.a(jzk.a(j));
        } else {
            khzVar2 = new khz(khz.b);
            khzVar2.e(jzk.c(j));
        }
        kgtVar2.h.ae = khzVar2;
        this.e.h.ad.d(this.a, 0);
        this.e.h.ae.d(this.a, 1);
        kgt kgtVar3 = this.e;
        kgtVar3.b = j;
        kgtVar3.d = !(kahVar == kah.b);
        this.b.clear();
        this.c.clear();
        this.d.clear();
        if (!kgjVar.d && list.size() == kgjVar.f.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object f = ((ipl) list.get(i)).f();
                if (ffkj.e(f instanceof kfz ? (kfz) f : null, kgjVar.f.get(i))) {
                }
            }
            kfy.a(this.e, list);
            this.a.N(jzk.b(j));
            this.a.C(jzk.a(j));
            this.a.ah();
            this.a.ag(257);
            kiv kivVar = this.a;
            kivVar.ak(kivVar.aC, 0, 0, 0, 0, 0, 0);
            kiv kivVar2 = this.a;
            return kag.a(kivVar2.j(), kivVar2.h());
        }
        kgt kgtVar4 = this.e;
        Iterator it = kgtVar4.e.keySet().iterator();
        while (it.hasNext()) {
            ((kib) kgtVar4.e.get(it.next())).b().u();
        }
        kgtVar4.e.clear();
        kgtVar4.e.put(kie.c, kgtVar4.h);
        kgtVar4.f.clear();
        kgtVar4.g.clear();
        kgtVar4.i.clear();
        kgtVar4.k = true;
        kgt kgtVar5 = this.e;
        kgjVar.f.clear();
        kgjVar.c.c(ffcu.a, kgjVar.e, new kgf(list, kgjVar, kgtVar5));
        kgjVar.d = false;
        kfy.a(this.e, list);
        kgt kgtVar6 = this.e;
        kiv kivVar3 = this.a;
        kivVar3.ao();
        kgtVar6.h.ad.d(kivVar3, 0);
        kgtVar6.h.ae.d(kivVar3, 1);
        for (Object obj : kgtVar6.f.keySet()) {
            kiz x3 = ((kia) kgtVar6.f.get(obj)).x();
            if (x3 != null) {
                kib kibVar = (kib) kgtVar6.e.get(obj);
                if (kibVar == null) {
                    kibVar = kgtVar6.b(obj);
                }
                kibVar.f(x3);
            }
        }
        for (Object obj2 : kgtVar6.e.keySet()) {
            kib kibVar2 = (kib) kgtVar6.e.get(obj2);
            if (kibVar2 != kgtVar6.h && (kibVar2.a() instanceof kia) && (x2 = ((kia) kibVar2.a()).x()) != null) {
                kib kibVar3 = (kib) kgtVar6.e.get(obj2);
                if (kibVar3 == null) {
                    kibVar3 = kgtVar6.b(obj2);
                }
                kibVar3.f(x2);
            }
        }
        Iterator it2 = kgtVar6.e.keySet().iterator();
        while (it2.hasNext()) {
            kib kibVar4 = (kib) kgtVar6.e.get(it2.next());
            if (kibVar4 != kgtVar6.h) {
                kiu b = kibVar4.b();
                b.as = kibVar4.d().toString();
                b.ae = null;
                if (kibVar4.a() instanceof kil) {
                    kibVar4.e();
                }
                kivVar3.am(b);
            } else {
                kibVar4.f(kivVar3);
            }
        }
        Iterator it3 = kgtVar6.f.keySet().iterator();
        while (it3.hasNext()) {
            kia kiaVar2 = (kia) kgtVar6.f.get(it3.next());
            if (kiaVar2.x() != null) {
                ArrayList arrayList = kiaVar2.am;
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    kiaVar2.x().af(((kib) kgtVar6.e.get(arrayList.get(i2))).b());
                }
                kiaVar2.e();
            } else {
                kiaVar2.e();
            }
        }
        Iterator it4 = kgtVar6.e.keySet().iterator();
        while (it4.hasNext()) {
            kib kibVar5 = (kib) kgtVar6.e.get(it4.next());
            if (kibVar5 != kgtVar6.h && (kibVar5.a() instanceof kia) && (x = (kiaVar = (kia) kibVar5.a()).x()) != null) {
                ArrayList arrayList2 = kiaVar.am;
                int size3 = arrayList2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Object obj3 = arrayList2.get(i3);
                    kib kibVar6 = (kib) kgtVar6.e.get(obj3);
                    if (kibVar6 != null) {
                        x.af(kibVar6.b());
                    } else if (obj3 instanceof kib) {
                        x.af(((kib) obj3).b());
                    } else {
                        PrintStream printStream = System.out;
                        Objects.toString(obj3);
                        printStream.println("couldn't find reference for ".concat(String.valueOf(obj3)));
                    }
                }
                kibVar5.e();
            }
        }
        for (Object obj4 : kgtVar6.e.keySet()) {
            kib kibVar7 = (kib) kgtVar6.e.get(obj4);
            kibVar7.e();
            kiu b2 = kibVar7.b();
            if (b2 != null && obj4 != null) {
                b2.v = obj4.toString();
            }
        }
        this.a.N(jzk.b(j));
        this.a.C(jzk.a(j));
        this.a.ah();
        this.a.ag(257);
        kiv kivVar4 = this.a;
        kivVar4.ak(kivVar4.aC, 0, 0, 0, 0, 0, 0);
        kiv kivVar22 = this.a;
        return kag.a(kivVar22.j(), kivVar22.h());
    }

    @Override // defpackage.kjf
    public final void a() {
    }
}
