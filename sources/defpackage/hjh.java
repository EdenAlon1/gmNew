package defpackage;

import android.util.Log;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjh extends hfr {
    public static final fgcm a = fgdm.a(hpg.a);
    private static final AtomicReference s = new AtomicReference(false);
    public long b;
    public final hes c;
    public final Object d;
    public ffud e;
    public Throwable f;
    public coq g;
    public final hne h;
    public final List i;
    public final cop j;
    public final hhq k;
    public final cop l;
    public final cop m;
    public Set n;
    public ffrf o;
    public boolean p;
    public final fgcm q;
    public final hit r;
    private final List t;
    private List u;
    private final List v;
    private List w;
    private his x;
    private final ffhd y;
    private final ffuf z;

    public hjh(ffhd ffhdVar) {
        hes hesVar = new hes(new hiv(this));
        this.c = hesVar;
        this.d = new Object();
        this.t = new ArrayList();
        byte[] bArr = null;
        this.g = new coq(bArr);
        this.h = new hne(new hgh[16]);
        this.v = new ArrayList();
        this.i = new ArrayList();
        this.j = new cop(bArr);
        this.k = new hhq();
        long[] jArr = cpg.a;
        this.l = new cop(bArr);
        this.m = new cop(bArr);
        this.q = fgdm.a(hiu.c);
        new hqg();
        ffuf ffufVar = new ffuf((ffud) ffhdVar.get(ffud.c));
        ffufVar.hZ(new hix(this));
        this.z = ffufVar;
        this.y = ffhdVar.plus(hesVar).plus(ffufVar);
        this.r = new hit();
    }

    public static final void D(hrq hrqVar) {
        try {
            if (hrqVar.c() instanceof hrx) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            hrqVar.d();
        }
    }

    private static final void F(hjh hjhVar, hhn hhnVar, hhn hhnVar2) {
        List list = hhnVar2.g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                hhn hhnVar3 = (hhn) list.get(i);
                hhq hhqVar = hjhVar.k;
                hhk hhkVar = hhnVar3.a;
                hhr hhrVar = new hhr(hhnVar3, hhnVar);
                hna.b(hhqVar.a, hhkVar, hhrVar);
                hna.b(hhqVar.b, hhrVar.b, hhkVar);
                F(hjhVar, hhnVar, hhnVar3);
            }
        }
    }

    private static final void G(List list, hjh hjhVar, hgh hghVar) {
        list.clear();
        synchronized (hjhVar.d) {
            Iterator it = hjhVar.i.iterator();
            while (it.hasNext()) {
                hhn hhnVar = (hhn) it.next();
                if (ffkj.e(hhnVar.c, hghVar)) {
                    list.add(hhnVar);
                    it.remove();
                }
            }
        }
    }

    private final void H(hgh hghVar) {
        if (this.t.remove(hghVar)) {
            this.u = null;
        }
    }

    private final boolean I() {
        return this.h.b != 0 || z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Throwable th, hgh hghVar) {
        if (!((Boolean) s.get()).booleanValue() || (th instanceof hfa)) {
            synchronized (this.d) {
                his hisVar = this.x;
                if (hisVar != null) {
                    throw hisVar.a;
                }
                this.x = new his(th);
            }
            throw th;
        }
        synchronized (this.d) {
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
            this.v.clear();
            this.h.g();
            this.g = new coq((byte[]) null);
            this.i.clear();
            this.j.d();
            this.l.d();
            this.x = new his(th);
            if (hghVar != null) {
                y(hghVar);
            }
            v();
        }
    }

    public final boolean A() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.g.l() && this.h.b == 0) {
                if (!z()) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final boolean B() {
        List g;
        boolean I;
        synchronized (this.d) {
            if (this.g.k()) {
                return I();
            }
            hnh hnhVar = new hnh(this.g);
            byte[] bArr = null;
            this.g = new coq(bArr);
            synchronized (this.d) {
                g = g();
            }
            try {
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    ((hgh) g.get(i)).q(hnhVar);
                    if (((hiu) this.q.c()).compareTo(hiu.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.d) {
                    this.g = new coq(bArr);
                }
                synchronized (this.d) {
                    if (v() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    I = I();
                }
                return I;
            } catch (Throwable th) {
                synchronized (this.d) {
                    this.g.h(hnhVar);
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.hfr
    public final int a() {
        return 1000;
    }

    @Override // defpackage.hfr
    public final hfq b() {
        return null;
    }

    @Override // defpackage.hfr
    public final hhm c(hhn hhnVar) {
        hhm hhmVar;
        synchronized (this.d) {
            hhmVar = (hhm) this.l.b(hhnVar);
        }
        return hhmVar;
    }

    @Override // defpackage.hfr
    public final ffhd d() {
        return this.y;
    }

    @Override // defpackage.hfr
    public final void e(hgh hghVar, ffjm ffjmVar) {
        boolean s2 = hghVar.s();
        try {
            hrq g = hrv.g(new hja(hghVar), new hjg(hghVar, null));
            try {
                hrw w = g.w();
                try {
                    synchronized (((hfu) hghVar).c) {
                        ((hfu) hghVar).m();
                        cop f = ((hfu) hghVar).f();
                        try {
                            hfu.v();
                            hfm hfmVar = ((hfu) hghVar).m;
                            if (!hfmVar.d.d()) {
                                hfp.j("Expected applyChanges() to have been called");
                            }
                            hfmVar.X(f, ffjmVar);
                        } catch (Exception e) {
                            ((hfu) hghVar).j = f;
                            throw e;
                        }
                    }
                    if (!s2) {
                        hrv.c();
                    }
                    synchronized (this.d) {
                        if (((hiu) this.q.c()).compareTo(hiu.b) > 0 && !g().contains(hghVar)) {
                            this.t.add(hghVar);
                            this.u = null;
                        }
                    }
                    try {
                        synchronized (this.d) {
                            List list = this.i;
                            int size = list.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    break;
                                }
                                if (ffkj.e(((hhn) list.get(i)).c, hghVar)) {
                                    ArrayList arrayList = new ArrayList();
                                    G(arrayList, this, hghVar);
                                    while (!arrayList.isEmpty()) {
                                        u(arrayList, null);
                                        G(arrayList, this, hghVar);
                                    }
                                } else {
                                    i++;
                                }
                            }
                        }
                        try {
                            hghVar.i();
                            hghVar.j();
                            if (s2) {
                                return;
                            }
                            hrv.c();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, hghVar);
                    }
                } finally {
                }
            } finally {
                D(g);
            }
        } catch (Throwable th3) {
            J(th3, hghVar);
        }
    }

    @Override // defpackage.hfr
    public final void f(hhn hhnVar) {
        synchronized (this.d) {
            hna.b(this.j, hhnVar.a, hhnVar);
            if (hhnVar.g != null) {
                F(this, hhnVar, hhnVar);
            }
        }
    }

    public final List g() {
        List list = this.u;
        if (list == null) {
            List list2 = this.t;
            list = list2.isEmpty() ? ffel.a : new ArrayList(list2);
            this.u = list;
        }
        return list;
    }

    @Override // defpackage.hfr
    public final void i(hgh hghVar) {
        ffrf ffrfVar;
        synchronized (this.d) {
            if (this.h.l(hghVar)) {
                ffrfVar = null;
            } else {
                this.h.n(hghVar);
                ffrfVar = v();
            }
        }
        if (ffrfVar != null) {
            ffrfVar.w(ffcu.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Comparable] */
    @Override // defpackage.hfr
    public final void j(hhn hhnVar, hhm hhmVar, hep hepVar) {
        coy coyVar;
        byte[] bArr;
        cop copVar;
        int i;
        int i2;
        synchronized (this.d) {
            this.l.e(hhnVar, hhmVar);
            Object f = this.m.f(hhnVar);
            if (f == null) {
                coyVar = coz.b;
            } else if (f instanceof cok) {
                coyVar = (coy) f;
            } else {
                Object[] objArr = coz.a;
                cok cokVar = new cok(1);
                cokVar.h(f);
                coyVar = cokVar;
            }
            if (coyVar.p()) {
                Object[] objArr2 = coyVar.b;
                int i3 = coyVar.c;
                int i4 = 0;
                while (true) {
                    bArr = null;
                    if (i4 >= i3) {
                        break;
                    }
                    if (hhmVar.a.h(((hhn) objArr2[i4]).e)) {
                        i4++;
                    } else {
                        cok cokVar2 = new cok(bArr);
                        Object[] objArr3 = coyVar.b;
                        int i5 = coyVar.c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            Object obj = objArr3[i6];
                            if (hhmVar.a.h(((hhn) obj).e)) {
                                cokVar2.h(obj);
                            }
                        }
                        coyVar = cokVar2;
                    }
                }
                hhl hhlVar = new hhl(hhmVar);
                if (coyVar.c > 1) {
                    Object invoke = hhlVar.invoke(coyVar.l(0));
                    int i7 = coyVar.c;
                    int i8 = 1;
                    ?? r6 = invoke;
                    while (true) {
                        if (i8 >= i7) {
                            break;
                        }
                        Object invoke2 = hhlVar.invoke(coyVar.l(i8));
                        if (r6.compareTo(invoke2) > 0) {
                            cok cokVar3 = new cok(coyVar.c);
                            Object[] objArr4 = coyVar.b;
                            int i9 = coyVar.c;
                            for (int i10 = 0; i10 < i9; i10++) {
                                cokVar3.h(objArr4[i10]);
                            }
                            coi coiVar = cokVar3.a;
                            if (coiVar == null) {
                                coiVar = new coi(cokVar3);
                                cokVar3.a = coiVar;
                            }
                            if (coiVar.size() > 1) {
                                ffdx.q(coiVar, new hmz(hhlVar));
                            }
                            coyVar = cokVar3;
                        } else {
                            i8++;
                            r6 = invoke2;
                        }
                    }
                }
                if (coyVar.o()) {
                    copVar = cpg.b;
                    copVar.getClass();
                } else {
                    long[] jArr = cpg.a;
                    cop copVar2 = new cop(bArr);
                    hjv d = hhmVar.a.d();
                    try {
                        Object[] objArr5 = coyVar.b;
                        int i11 = coyVar.c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            hhn hhnVar2 = (hhn) objArr5[i12];
                            int a2 = d.a(hhnVar2.e);
                            int l = d.l(a2);
                            hhm.a(d, l);
                            hhm.a(d, l);
                            while (true) {
                                i = d.q;
                                if (i == l || i == d.r) {
                                    break;
                                } else if (l < i + d.j(i)) {
                                    d.M();
                                } else {
                                    d.m();
                                }
                            }
                            if (i != l) {
                                hfp.j("Unexpected slot table structure");
                            }
                            d.M();
                            d.y(a2 - d.q);
                            copVar2.e(hhnVar2, hfp.g(hhnVar2.c, hhnVar2, d, hepVar));
                        }
                        hhm.a(d, Alert.DURATION_SHOW_INDEFINITELY);
                        d.A(true);
                        copVar = copVar2;
                    } catch (Throwable th) {
                        d.A(false);
                        throw th;
                    }
                }
                Object[] objArr6 = copVar.b;
                Object[] objArr7 = copVar.c;
                long[] jArr2 = copVar.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j = jArr2[i13];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = i13 - length;
                            int i15 = 0;
                            while (true) {
                                i2 = 8 - ((~i14) >>> 31);
                                if (i15 >= i2) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    int i16 = (i13 << 3) + i15;
                                    Object obj2 = objArr6[i16];
                                    this.l.e((hhn) obj2, (hhm) objArr7[i16]);
                                }
                                j >>= 8;
                                i15++;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i13 == length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.hfr
    public final void m(hgh hghVar) {
        synchronized (this.d) {
            Set set = this.n;
            if (set == null) {
                set = new LinkedHashSet();
                this.n = set;
            }
            set.add(hghVar);
        }
    }

    @Override // defpackage.hfr
    public final void p(hgh hghVar) {
        synchronized (this.d) {
            H(hghVar);
            this.h.m(hghVar);
            this.v.remove(hghVar);
        }
    }

    @Override // defpackage.hfr
    public final boolean q() {
        return ((Boolean) s.get()).booleanValue();
    }

    @Override // defpackage.hfr
    public final boolean r() {
        return false;
    }

    @Override // defpackage.hfr
    public final boolean s() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ed, code lost:
    
        r0.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f0, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f3, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018d, code lost:
    
        r0 = r10.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0192, code lost:
    
        if (r2 >= r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
    
        if (((defpackage.ffcf) r10.get(r2)).b == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019e, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a1, code lost:
    
        r0 = new java.util.ArrayList(r10.size());
        r2 = r10.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01af, code lost:
    
        if (r3 >= r2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b1, code lost:
    
        r4 = (defpackage.ffcf) r10.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
    
        if (r4.b != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bb, code lost:
    
        r4 = (defpackage.hhn) r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
    
        if (r4 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
    
        r0.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c6, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c0, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c9, code lost:
    
        r2 = r21.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cb, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cc, code lost:
    
        defpackage.ffdx.w(r21.i, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d1, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d2, code lost:
    
        r0 = new java.util.ArrayList(r10.size());
        r2 = r10.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e0, code lost:
    
        if (r3 >= r2) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e2, code lost:
    
        r4 = r10.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01eb, code lost:
    
        if (((defpackage.ffcf) r4).b == null) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List u(java.util.List r22, defpackage.coq r23) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjh.u(java.util.List, coq):java.util.List");
    }

    public final ffrf v() {
        hiu hiuVar;
        byte[] bArr = null;
        if (((hiu) this.q.c()).compareTo(hiu.b) <= 0) {
            this.t.clear();
            this.u = ffel.a;
            this.g = new coq(bArr);
            this.h.g();
            this.v.clear();
            this.i.clear();
            this.w = null;
            ffrf ffrfVar = this.o;
            if (ffrfVar != null) {
                ffrfVar.h(null);
            }
            this.o = null;
            this.x = null;
            return null;
        }
        if (this.x != null) {
            hiuVar = hiu.c;
        } else if (this.e == null) {
            this.g = new coq(bArr);
            this.h.g();
            hiuVar = z() ? hiu.d : hiu.c;
        } else {
            hiuVar = (this.h.b == 0 && !this.g.l() && this.v.isEmpty() && this.i.isEmpty() && !z()) ? hiu.e : hiu.f;
        }
        this.q.f(hiuVar);
        if (hiuVar != hiu.f) {
            return null;
        }
        ffrf ffrfVar2 = this.o;
        this.o = null;
        return ffrfVar2;
    }

    public final void w() {
        synchronized (this.d) {
            if (((hiu) this.q.c()).compareTo(hiu.e) >= 0) {
                this.q.f(hiu.b);
            }
        }
        this.z.t(null);
    }

    public final void x() {
        synchronized (this.d) {
            this.p = true;
        }
    }

    public final void y(hgh hghVar) {
        List list = this.w;
        if (list == null) {
            list = new ArrayList();
            this.w = list;
        }
        if (!list.contains(hghVar)) {
            list.add(hghVar);
        }
        H(hghVar);
    }

    public final boolean z() {
        return (this.p || this.c.d.get() == 0) ? false : true;
    }

    @Override // defpackage.hfr
    public final void k(Set set) {
    }
}
