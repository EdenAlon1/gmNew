package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjw {
    public final hvh a;
    public final iui b;
    public final jjn c;
    public boolean d;
    public final int e;
    private final boolean f;
    private jjw g;

    public jjw(hvh hvhVar, boolean z, iui iuiVar, jjn jjnVar) {
        this.a = hvhVar;
        this.f = z;
        this.b = iuiVar;
        this.c = jjnVar;
        this.e = iuiVar.d;
    }

    public static /* synthetic */ List l(jjw jjwVar, boolean z, int i) {
        return jjwVar.k((i & 1) != 0 ? !jjwVar.f : false, z & ((i & 2) == 0));
    }

    private final jjw o(jjj jjjVar, ffji ffjiVar) {
        int i;
        int i2;
        jjn jjnVar = new jjn();
        jjnVar.b = false;
        jjnVar.c = false;
        ffjiVar.invoke(jjnVar);
        jjv jjvVar = new jjv(ffjiVar);
        if (jjjVar != null) {
            i = this.e;
            i2 = 1000000000;
        } else {
            i = this.e;
            i2 = 2000000000;
        }
        jjw jjwVar = new jjw(jjvVar, false, new iui(true, i + i2), jjnVar);
        jjwVar.d = true;
        jjwVar.g = this;
        return jjwVar;
    }

    private final void p(List list, jjn jjnVar) {
        if (this.c.c) {
            return;
        }
        m(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            jjw jjwVar = (jjw) list.get(size2);
            if (!jjwVar.q()) {
                jjnVar.d(jjwVar.c);
                jjwVar.p(list, jjnVar);
            }
        }
    }

    private final boolean q() {
        return this.f && this.c.b;
    }

    private final void r(iui iuiVar, List list) {
        hne r = iuiVar.r();
        Object[] objArr = r.a;
        int i = r.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar2 = (iui) objArr[i2];
            if (iuiVar2.e() && !iuiVar2.D) {
                if (iuiVar2.x.j(8)) {
                    list.add(jjx.b(iuiVar2, this.f));
                } else {
                    r(iuiVar2, list);
                }
            }
        }
    }

    private final void s(List list, List list2) {
        m(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            jjw jjwVar = (jjw) list.get(size2);
            if (jjwVar.q()) {
                list2.add(jjwVar);
            } else if (!jjwVar.c.c) {
                jjwVar.s(list, list2);
            }
        }
    }

    public final long a() {
        iwi d = d();
        if (d == null) {
            return 0L;
        }
        if (true != d.t()) {
            d = null;
        }
        if (d != null) {
            return iod.a(d);
        }
        return 0L;
    }

    public final iam b() {
        iwi d = d();
        if (d != null) {
            if (true != d.t()) {
                d = null;
            }
            if (d != null) {
                return iod.d(d);
            }
        }
        return iam.a;
    }

    public final iam c() {
        iwi d = d();
        if (d != null) {
            if (true != d.t()) {
                d = null;
            }
            if (d != null) {
                return iod.e(d);
            }
        }
        return iam.a;
    }

    public final iwi d() {
        if (this.d) {
            jjw g = g();
            if (g != null) {
                return g.d();
            }
            return null;
        }
        isw a = jjx.a(this.b);
        if (a == null) {
            a = this.a;
        }
        return isx.e(a, 8);
    }

    public final jjn e() {
        if (!q()) {
            return this.c;
        }
        jjn a = this.c.a();
        p(new ArrayList(), a);
        return a;
    }

    public final jjw f() {
        return new jjw(this.a, true, this.b, this.c);
    }

    public final jjw g() {
        iui iuiVar;
        jjw jjwVar = this.g;
        if (jjwVar != null) {
            return jjwVar;
        }
        if (this.f) {
            iuiVar = this.b.u();
            while (iuiVar != null) {
                jjn B = iuiVar.B();
                if (B != null && B.b) {
                    break;
                }
                iuiVar = iuiVar.u();
            }
        }
        iuiVar = null;
        if (iuiVar == null) {
            iuiVar = this.b.u();
            while (true) {
                if (iuiVar == null) {
                    iuiVar = null;
                    break;
                }
                if (iuiVar.x.j(8)) {
                    break;
                }
                iuiVar = iuiVar.u();
            }
        }
        if (iuiVar == null) {
            return null;
        }
        return jjx.b(iuiVar, this.f);
    }

    public final List h() {
        return l(this, false, 7);
    }

    public final List i() {
        return l(this, true, 4);
    }

    public final boolean j() {
        if (this.d || !i().isEmpty()) {
            return false;
        }
        iui u = this.b.u();
        while (true) {
            if (u == null) {
                u = null;
                break;
            }
            jjn B = u.B();
            if (B != null && B.b) {
                break;
            }
            u = u.u();
        }
        return u == null;
    }

    public final List k(boolean z, boolean z2) {
        if (!z && this.c.c) {
            return ffel.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!q()) {
            return m(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        s(arrayList, arrayList2);
        return arrayList2;
    }

    public final List m(List list, boolean z) {
        if (this.d) {
            return ffel.a;
        }
        r(this.b, list);
        if (z) {
            jjn jjnVar = this.c;
            jku jkuVar = jkm.a;
            jjj jjjVar = (jjj) jjo.a(jjnVar, jkm.w);
            if (jjjVar != null && this.c.b && !list.isEmpty()) {
                list.add(o(jjjVar, new jjt(jjjVar)));
            }
            if (this.c.f(jkm.a) && !list.isEmpty()) {
                jjn jjnVar2 = this.c;
                if (jjnVar2.b) {
                    List list2 = (List) jjo.a(jjnVar2, jkm.a);
                    String str = list2 != null ? (String) ffdx.M(list2) : null;
                    if (str != null) {
                        list.add(0, o(null, new jju(str)));
                    }
                }
            }
        }
        return list;
    }
}
