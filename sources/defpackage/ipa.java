package defpackage;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipa implements hez {
    public final iui a;
    public hfr b;
    public iri c;
    public int d;
    public int e;
    public final cop f;
    public final cop g;
    public final iot h;
    public final ioq i;
    public final cop j;
    public final cop k;
    public final hne l;
    public int m;
    public int n;
    public final String o;
    private final irh p;

    public ipa(iui iuiVar, iri iriVar) {
        this.a = iuiVar;
        this.c = iriVar;
        long[] jArr = cpg.a;
        this.f = new cop((byte[]) null);
        this.g = new cop((byte[]) null);
        this.h = new iot(this);
        this.i = new ioq(this);
        this.j = new cop((byte[]) null);
        this.p = new irh(null);
        this.k = new cop((byte[]) null);
        this.l = new hne(new Object[16]);
        this.o = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    private final Object m(List list, int i) {
        Object f = this.f.f((iui) list.get(i));
        f.getClass();
        return ((ior) f).a;
    }

    private static final void n(iui iuiVar) {
        iuiVar.x().G = 3;
        ivd w = iuiVar.w();
        if (w != null) {
            w.w = 3;
        }
    }

    public final irb a(Object obj, ffjm ffjmVar) {
        if (!this.a.e()) {
            return new iox();
        }
        i();
        if (!this.g.h(obj)) {
            this.k.b(obj);
            cop copVar = this.j;
            Object f = copVar.f(obj);
            if (f == null) {
                f = f(obj);
                if (f != null) {
                    l(this.a.I().indexOf(f), this.a.I().size());
                    this.n++;
                } else {
                    f = e(this.a.I().size());
                    this.n++;
                }
                copVar.e(obj, f);
            }
            k((iui) f, obj, ffjmVar);
        }
        return new ioy(this, obj);
    }

    @Override // defpackage.hez
    public final void b() {
        j(true);
    }

    @Override // defpackage.hez
    public final void c() {
        g();
    }

    @Override // defpackage.hez
    public final void d() {
        j(false);
    }

    public final iui e(int i) {
        iui iuiVar = new iui(true, 2, null);
        iui iuiVar2 = this.a;
        iuiVar2.o = true;
        iuiVar2.P(i, iuiVar);
        iuiVar2.o = false;
        return iuiVar;
    }

    public final iui f(Object obj) {
        int i;
        if (this.m == 0) {
            return null;
        }
        List I = this.a.I();
        int size = I.size() - this.n;
        int i2 = size - this.m;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (ffkj.e(m(I, i4), obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                Object f = this.f.f((iui) I.get(i3));
                f.getClass();
                ior iorVar = (ior) f;
                Object obj2 = iorVar.a;
                if (obj2 == ira.a || this.c.b(obj, obj2)) {
                    iorVar.a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            l(i4, i2);
        }
        this.m--;
        iui iuiVar = (iui) I.get(i2);
        Object f2 = this.f.f(iuiVar);
        f2.getClass();
        ior iorVar2 = (ior) f2;
        iorVar2.f = new hic(true, hla.a);
        iorVar2.e = true;
        iorVar2.d = true;
        return iuiVar;
    }

    public final void g() {
        int i;
        hjo hjoVar;
        ffix ffixVar = iui.b;
        iui iuiVar = this.a;
        iuiVar.o = true;
        cop copVar = this.f;
        Object[] objArr = copVar.c;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128 && (hjoVar = ((ior) objArr[(i2 << 3) + i4]).c) != null) {
                            hjoVar.d();
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.a.aa();
        iuiVar.o = false;
        this.f.d();
        this.g.d();
        this.n = 0;
        this.m = 0;
        this.j.d();
        i();
    }

    public final void h(int i) {
        this.m = 0;
        List I = this.a.I();
        int size = (I.size() - this.n) - 1;
        if (i <= size) {
            this.p.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.p.add(m(I, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(this.p);
            hrw a = hrv.a();
            ffji k = a != null ? a.k() : null;
            hrw b = hrv.b(a);
            boolean z = false;
            while (size >= i) {
                try {
                    iui iuiVar = (iui) I.get(size);
                    Object f = this.f.f(iuiVar);
                    f.getClass();
                    ior iorVar = (ior) f;
                    Object obj = iorVar.a;
                    if (this.p.contains(obj)) {
                        this.m++;
                        if (iorVar.a()) {
                            n(iuiVar);
                            iorVar.b();
                            z = true;
                        }
                    } else {
                        iui iuiVar2 = this.a;
                        iuiVar2.o = true;
                        this.f.b(iuiVar);
                        hjo hjoVar = iorVar.c;
                        if (hjoVar != null) {
                            hjoVar.d();
                        }
                        this.a.ab(size, 1);
                        iuiVar2.o = false;
                    }
                    this.g.b(obj);
                    size--;
                } finally {
                    hrv.e(a, b, k);
                }
            }
            if (z) {
                hrv.f();
            }
        }
        i();
    }

    public final void i() {
        int size = this.a.I().size();
        if (this.f.e != size) {
            imn.b("Inconsistency between the count of nodes tracked by the state (" + this.f.e + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((size - this.m) - this.n < 0) {
            imn.b("Incorrect state. Total children " + size + ". Reusable children " + this.m + ". Precomposed children " + this.n);
        }
        if (this.j.e == this.n) {
            return;
        }
        imn.b("Incorrect state. Precomposed children " + this.n + ". Map size " + this.j.e);
    }

    public final void j(boolean z) {
        this.n = 0;
        this.j.d();
        List I = this.a.I();
        int size = I.size();
        if (this.m != size) {
            this.m = size;
            hrw a = hrv.a();
            ffji k = a != null ? a.k() : null;
            hrw b = hrv.b(a);
            for (int i = 0; i < size; i++) {
                try {
                    iui iuiVar = (iui) I.get(i);
                    ior iorVar = (ior) this.f.f(iuiVar);
                    if (iorVar != null && iorVar.a()) {
                        n(iuiVar);
                        if (z) {
                            hjo hjoVar = iorVar.c;
                            if (hjoVar != null) {
                                synchronized (((hfu) hjoVar).c) {
                                    boolean z2 = ((hfu) hjoVar).e.b > 0;
                                    if (z2 || !((hfu) hjoVar).d.isEmpty()) {
                                        Trace.beginSection("Compose:deactivate");
                                        try {
                                            hqe hqeVar = new hqe(((hfu) hjoVar).d, ((hfu) hjoVar).m.P());
                                            if (z2) {
                                                hjv d = ((hfu) hjoVar).e.d();
                                                try {
                                                    hfp.k(d, hqeVar);
                                                    d.A(true);
                                                    ((hfu) hjoVar).a.f();
                                                    hqeVar.c();
                                                } finally {
                                                }
                                            }
                                            hqeVar.b();
                                        } finally {
                                            Trace.endSection();
                                        }
                                    }
                                    ((hfu) hjoVar).f.d();
                                    ((hfu) hjoVar).g.d();
                                    ((hfu) hjoVar).j.d();
                                    ((hfu) hjoVar).h.a();
                                    ((hfu) hjoVar).i.a();
                                    ((hfu) hjoVar).m.W();
                                }
                            }
                            iorVar.f = new hic(false, hla.a);
                        } else {
                            iorVar.b();
                        }
                        iorVar.a = ira.a;
                    }
                } catch (Throwable th) {
                    hrv.e(a, b, k);
                    throw th;
                }
            }
            hrv.e(a, b, k);
            this.g.d();
        }
        i();
    }

    public final void k(iui iuiVar, Object obj, ffjm ffjmVar) {
        boolean z;
        cop copVar = this.f;
        Object f = copVar.f(iuiVar);
        if (f == null) {
            f = new ior(obj, inh.a);
            copVar.e(iuiVar, f);
        }
        ior iorVar = (ior) f;
        hjo hjoVar = iorVar.c;
        if (hjoVar != null) {
            synchronized (((hfu) hjoVar).c) {
                z = ((hfu) hjoVar).j.e > 0;
            }
        } else {
            z = true;
        }
        if (iorVar.b != ffjmVar || z || iorVar.d) {
            iorVar.b = ffjmVar;
            hrw a = hrv.a();
            ffji k = a != null ? a.k() : null;
            hrw b = hrv.b(a);
            try {
                iui iuiVar2 = this.a;
                ffix ffixVar = iui.b;
                iuiVar2.o = true;
                ffjm ffjmVar2 = iorVar.b;
                hjo hjoVar2 = iorVar.c;
                hfr hfrVar = this.b;
                if (hfrVar == null) {
                    imn.a("parent composition reference not set");
                    throw new ffbx();
                }
                boolean z2 = iorVar.e;
                hpw hpwVar = new hpw(-1750409193, true, new ioz(iorVar, ffjmVar2));
                if (hjoVar2 == null || ((hfu) hjoVar2).n) {
                    ViewGroup.LayoutParams layoutParams = jhm.a;
                    hjoVar2 = new hfu(hfrVar, new ixx(iuiVar));
                }
                if (z2) {
                    hfm hfmVar = ((hfu) hjoVar2).m;
                    hfmVar.o = 100;
                    hfmVar.n = true;
                    ((hfu) hjoVar2).l(hpwVar);
                    hfm hfmVar2 = ((hfu) hjoVar2).m;
                    if (hfmVar2.r || hfmVar2.o != 100) {
                        hih.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    hfmVar2.o = -1;
                    hfmVar2.n = false;
                } else {
                    ((hfu) hjoVar2).l(hpwVar);
                }
                iorVar.c = hjoVar2;
                iorVar.e = false;
                iuiVar2.o = false;
                hrv.e(a, b, k);
                iorVar.d = false;
            } catch (Throwable th) {
                hrv.e(a, b, k);
                throw th;
            }
        }
    }

    public final void l(int i, int i2) {
        ffix ffixVar = iui.b;
        iui iuiVar = this.a;
        iuiVar.o = true;
        iuiVar.Y(i, i2, 1);
        iuiVar.o = false;
    }
}
