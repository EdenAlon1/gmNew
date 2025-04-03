package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjj {
    public final kiv a;
    public final kiv d;
    public kjf f;
    final ArrayList g;
    private final kje h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public kjj(kiv kivVar) {
        new ArrayList();
        this.f = null;
        this.h = new kje();
        this.g = new ArrayList();
        this.a = kivVar;
        this.d = kivVar;
    }

    private final void e(kjv kjvVar, int i, ArrayList arrayList) {
        for (kji kjiVar : kjvVar.i.j) {
            if (kjiVar instanceof kjk) {
                g((kjk) kjiVar, i, kjvVar.j, arrayList, null);
            } else if (kjiVar instanceof kjv) {
                g(((kjv) kjiVar).i, i, kjvVar.j, arrayList, null);
            }
        }
        for (kji kjiVar2 : kjvVar.j.j) {
            if (kjiVar2 instanceof kjk) {
                g((kjk) kjiVar2, i, kjvVar.i, arrayList, null);
            } else if (kjiVar2 instanceof kjv) {
                g(((kjv) kjiVar2).j, i, kjvVar.i, arrayList, null);
            }
        }
        if (i == 1) {
            for (kji kjiVar3 : ((kjs) kjvVar).a.j) {
                if (kjiVar3 instanceof kjk) {
                    g((kjk) kjiVar3, 1, null, arrayList, null);
                }
            }
        }
    }

    private final void f(kiu kiuVar, int i, int i2, int i3, int i4) {
        kje kjeVar = this.h;
        kjeVar.i = i;
        kjeVar.j = i3;
        kjeVar.a = i2;
        kjeVar.b = i4;
        this.f.b(kiuVar, kjeVar);
        kiuVar.N(this.h.c);
        kiuVar.C(this.h.d);
        kje kjeVar2 = this.h;
        kiuVar.P = kjeVar2.f;
        kiuVar.y(kjeVar2.e);
    }

    private final void g(kjk kjkVar, int i, kjk kjkVar2, ArrayList arrayList, kjr kjrVar) {
        kjv kjvVar = kjkVar.d;
        if (kjvVar.e == null) {
            kiv kivVar = this.a;
            if (kjvVar == kivVar.o || kjvVar == kivVar.p) {
                return;
            }
            if (kjrVar == null) {
                kjrVar = new kjr(kjvVar);
                arrayList.add(kjrVar);
            }
            kjr kjrVar2 = kjrVar;
            kjvVar.e = kjrVar2;
            kjrVar2.c.add(kjvVar);
            for (kji kjiVar : kjvVar.i.j) {
                if (kjiVar instanceof kjk) {
                    g((kjk) kjiVar, i, kjkVar2, arrayList, kjrVar2);
                }
            }
            for (kji kjiVar2 : kjvVar.j.j) {
                if (kjiVar2 instanceof kjk) {
                    g((kjk) kjiVar2, i, kjkVar2, arrayList, kjrVar2);
                }
            }
            if (i == 1 && (kjvVar instanceof kjs)) {
                for (kji kjiVar3 : ((kjs) kjvVar).a.j) {
                    if (kjiVar3 instanceof kjk) {
                        g((kjk) kjiVar3, 1, kjkVar2, arrayList, kjrVar2);
                    }
                }
            }
            Iterator it = kjvVar.i.k.iterator();
            while (it.hasNext()) {
                g((kjk) it.next(), i, kjkVar2, arrayList, kjrVar2);
            }
            Iterator it2 = kjvVar.j.k.iterator();
            while (it2.hasNext()) {
                g((kjk) it2.next(), i, kjkVar2, arrayList, kjrVar2);
            }
            if (i == 1 && (kjvVar instanceof kjs)) {
                Iterator it3 = ((kjs) kjvVar).a.k.iterator();
                while (it3.hasNext()) {
                    g((kjk) it3.next(), 1, kjkVar2, arrayList, kjrVar2);
                }
            }
        }
    }

    public final int a(kiv kivVar, int i) {
        long a;
        kjj kjjVar = this;
        kiv kivVar2 = kivVar;
        int size = kjjVar.g.size();
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        while (i2 < size) {
            kjr kjrVar = (kjr) kjjVar.g.get(i2);
            kjv kjvVar = kjrVar.b;
            if (!(kjvVar instanceof kjh) ? !(i != 0 ? (kjvVar instanceof kjs) : (kjvVar instanceof kjq)) : ((kjh) kjvVar).g != i) {
                kjk kjkVar = i == 0 ? kivVar2.o.i : kivVar2.p.i;
                kjk kjkVar2 = i == 0 ? kivVar2.o.j : kivVar2.p.j;
                boolean contains = kjvVar.i.k.contains(kjkVar);
                boolean contains2 = kjrVar.b.j.k.contains(kjkVar2);
                long a2 = kjrVar.b.a();
                if (contains && contains2) {
                    long b = kjrVar.b(kjrVar.b.i, j);
                    long a3 = kjrVar.a(kjrVar.b.j, j);
                    long j3 = b - a2;
                    kjv kjvVar2 = kjrVar.b;
                    long j4 = kjvVar2.j.e;
                    if (j3 >= (-r5)) {
                        j3 += j4;
                    }
                    long j5 = (-a3) - a2;
                    long j6 = kjvVar2.i.e;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    kiu kiuVar = kjvVar2.d;
                    float f = i == 0 ? kiuVar.ao : kiuVar.ap;
                    float f2 = 1.0f - f;
                    float f3 = f > 0.0f ? (long) ((j7 / f) + (j3 / f2)) : 0L;
                    a = (j6 + ((((long) ((f * f3) + 0.5f)) + a2) + ((long) ((f3 * f2) + 0.5f)))) - j4;
                } else if (contains) {
                    a = Math.max(kjrVar.b(kjrVar.b.i, r0.e), kjrVar.b.i.e + a2);
                } else if (contains2) {
                    a = Math.max(-kjrVar.a(kjrVar.b.j, r0.e), (-kjrVar.b.j.e) + a2);
                } else {
                    a = (r0.i.e + kjrVar.b.a()) - kjrVar.b.j.e;
                }
            } else {
                a = j;
            }
            j2 = Math.max(j2, a);
            i2++;
            kjjVar = this;
            kivVar2 = kivVar;
            j = 0;
        }
        return (int) j2;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.d.o.d();
        this.d.p.d();
        arrayList.add(this.d.o);
        arrayList.add(this.d.p);
        ArrayList arrayList2 = this.d.aL;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            kiu kiuVar = (kiu) arrayList2.get(i);
            if (kiuVar instanceof kiy) {
                arrayList.add(new kjo(kiuVar));
            } else {
                if (kiuVar.S()) {
                    if (kiuVar.m == null) {
                        kiuVar.m = new kjh(kiuVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(kiuVar.m);
                } else {
                    arrayList.add(kiuVar.o);
                }
                if (kiuVar.T()) {
                    if (kiuVar.n == null) {
                        kiuVar.n = new kjh(kiuVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(kiuVar.n);
                } else {
                    arrayList.add(kiuVar.p);
                }
                if (kiuVar instanceof kiz) {
                    arrayList.add(new kjp(kiuVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((kjv) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            kjv kjvVar = (kjv) arrayList.get(i3);
            if (kjvVar.d != this.d) {
                kjvVar.b();
            }
        }
        this.g.clear();
        kjr.a = 0;
        e(this.a.o, 0, this.g);
        e(this.a.p, 1, this.g);
        this.b = false;
    }

    public final void c() {
        int i;
        boolean z;
        boolean z2;
        kjl kjlVar;
        ArrayList arrayList = this.a.aL;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kiu kiuVar = (kiu) arrayList.get(i2);
            if (!kiuVar.l) {
                int[] iArr = kiuVar.aA;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = kiuVar.C;
                int i6 = kiuVar.D;
                if (i3 == 2) {
                    i = i3;
                    z = true;
                } else if (i3 == 3) {
                    z = i5 == 1;
                    i = 3;
                } else {
                    i = i3;
                    z = false;
                }
                if (i4 == 2) {
                    z2 = true;
                } else if (i4 == 3) {
                    z2 = i6 == 1;
                    i4 = 3;
                } else {
                    z2 = false;
                }
                kjl kjlVar2 = kiuVar.o.f;
                boolean z3 = kjlVar2.i;
                kjl kjlVar3 = kiuVar.p.f;
                boolean z4 = kjlVar3.i;
                if (z3 && z4) {
                    f(kiuVar, 1, kjlVar2.f, 1, kjlVar3.f);
                    kiuVar.l = true;
                } else if (z3 && z2) {
                    f(kiuVar, 1, kjlVar2.f, 2, kjlVar3.f);
                    if (i4 == 3) {
                        kiuVar.p.f.m = kiuVar.h();
                    } else {
                        kiuVar.p.f.c(kiuVar.h());
                        kiuVar.l = true;
                    }
                } else if (z4 && z) {
                    f(kiuVar, 2, kjlVar2.f, 1, kjlVar3.f);
                    if (i == 3) {
                        kiuVar.o.f.m = kiuVar.j();
                    } else {
                        kiuVar.o.f.c(kiuVar.j());
                        kiuVar.l = true;
                    }
                }
                if (kiuVar.l && (kjlVar = kiuVar.p.b) != null) {
                    kjlVar.c(kiuVar.al);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x00ad, code lost:
    
        if (r5 == 2) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.kiv r21) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjj.d(kiv):void");
    }
}
