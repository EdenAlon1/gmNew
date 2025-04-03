package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmv implements wmu {
    private final wmx a;
    private final ffbr b;
    private int c;
    private int d;
    private int j;
    private int k;
    private CharSequence l;
    private boolean m;
    private eqtg n;
    private boolean r;
    private int s;
    private List e = new ArrayList();
    private List f = new ArrayList();
    private List g = new ArrayList();
    private List h = new ArrayList();
    private List i = new ArrayList();
    private List o = new ArrayList();
    private List p = new ArrayList();
    private boolean q = true;

    public wmv(wmx wmxVar, ffbr ffbrVar) {
        this.a = wmxVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.wmu
    public final eqsq a() {
        eqsq eqsqVar = (eqsq) eqss.a.createBuilder();
        int i = this.c;
        eqsqVar.copyOnWrite();
        eqss eqssVar = (eqss) eqsqVar.instance;
        eqssVar.b |= 1;
        eqssVar.c = i;
        int i2 = this.d;
        eqsqVar.copyOnWrite();
        eqss eqssVar2 = (eqss) eqsqVar.instance;
        eqssVar2.b |= 2;
        eqssVar2.d = i2;
        List list = this.e;
        eqsqVar.copyOnWrite();
        eqss eqssVar3 = (eqss) eqsqVar.instance;
        eygi eygiVar = eqssVar3.j;
        if (!eygiVar.c()) {
            eqssVar3.j = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eqssVar3.j.h(((eqtg) it.next()).i);
        }
        List list2 = this.f;
        eqsqVar.copyOnWrite();
        eqss eqssVar4 = (eqss) eqsqVar.instance;
        eygi eygiVar2 = eqssVar4.i;
        if (!eygiVar2.c()) {
            eqssVar4.i = eyfy.mutableCopy(eygiVar2);
        }
        eydl.addAll(list2, eqssVar4.i);
        List list3 = this.g;
        eqsqVar.copyOnWrite();
        eqss eqssVar5 = (eqss) eqsqVar.instance;
        eygi eygiVar3 = eqssVar5.k;
        if (!eygiVar3.c()) {
            eqssVar5.k = eyfy.mutableCopy(eygiVar3);
        }
        eydl.addAll(list3, eqssVar5.k);
        List list4 = this.h;
        eqsqVar.copyOnWrite();
        eqss eqssVar6 = (eqss) eqsqVar.instance;
        eygc eygcVar = eqssVar6.l;
        if (!eygcVar.c()) {
            eqssVar6.l = eyfy.mutableCopy(eygcVar);
        }
        eydl.addAll(list4, eqssVar6.l);
        List list5 = this.i;
        eqsqVar.copyOnWrite();
        eqss eqssVar7 = (eqss) eqsqVar.instance;
        eygc eygcVar2 = eqssVar7.m;
        if (!eygcVar2.c()) {
            eqssVar7.m = eyfy.mutableCopy(eygcVar2);
        }
        eydl.addAll(list5, eqssVar7.m);
        int i3 = this.j;
        eqsqVar.copyOnWrite();
        eqss eqssVar8 = (eqss) eqsqVar.instance;
        eqssVar8.b |= 4;
        eqssVar8.e = i3;
        int i4 = this.k;
        eqsqVar.copyOnWrite();
        eqss eqssVar9 = (eqss) eqsqVar.instance;
        eqssVar9.b |= 8;
        eqssVar9.f = i4;
        boolean z = this.m;
        eqsqVar.copyOnWrite();
        eqss eqssVar10 = (eqss) eqsqVar.instance;
        eqssVar10.b |= 16;
        eqssVar10.g = z;
        int i5 = this.s;
        if (i5 != 0) {
            eqsqVar.copyOnWrite();
            eqss eqssVar11 = (eqss) eqsqVar.instance;
            eqssVar11.o = i5 - 1;
            eqssVar11.b |= 128;
        }
        eqtg eqtgVar = this.n;
        if (eqtgVar != null) {
            eqsqVar.copyOnWrite();
            eqss eqssVar12 = (eqss) eqsqVar.instance;
            eqssVar12.h = eqtgVar.i;
            eqssVar12.b |= 32;
        }
        List list6 = this.o;
        eqsqVar.copyOnWrite();
        eqss eqssVar13 = (eqss) eqsqVar.instance;
        eygi eygiVar4 = eqssVar13.q;
        if (!eygiVar4.c()) {
            eqssVar13.q = eyfy.mutableCopy(eygiVar4);
        }
        Iterator it2 = list6.iterator();
        while (it2.hasNext()) {
            eqssVar13.q.h(((eqsn) it2.next()).m);
        }
        List list7 = this.p;
        eqsqVar.copyOnWrite();
        eqss eqssVar14 = (eqss) eqsqVar.instance;
        eygi eygiVar5 = eqssVar14.r;
        if (!eygiVar5.c()) {
            eqssVar14.r = eyfy.mutableCopy(eygiVar5);
        }
        eydl.addAll(list7, eqssVar14.r);
        return eqsqVar;
    }

    @Override // defpackage.wmu
    public final void b(Throwable th) {
        th.getClass();
        if (this.r) {
            List list = this.o;
            list.add(wmo.a(th));
            this.p.add(Integer.valueOf(this.c + this.d));
        }
    }

    @Override // defpackage.wmu
    public final void c() {
        if (!this.r || this.i.isEmpty()) {
            return;
        }
        this.i.set(r0.size() - 1, true);
    }

    @Override // defpackage.wmu
    public final void d(esgx esgxVar, int i) {
        if (this.r) {
            this.e.add(this.a.b.get(esgxVar));
            if (this.d == 0 || !this.q) {
                i = 0;
            }
            this.g.add(Integer.valueOf(i));
            this.q = true;
            this.i.add(false);
        }
    }

    @Override // defpackage.wmu
    public final void e() {
        if (!this.r || this.h.isEmpty()) {
            return;
        }
        this.h.set(r0.size() - 1, true);
    }

    @Override // defpackage.wmu
    public final void f(int i) {
        if (this.r) {
            if (this.c == 0 || !this.q) {
                i = 0;
            }
            this.f.add(Integer.valueOf(i));
            this.q = true;
            this.h.add(false);
        }
    }

    @Override // defpackage.wmu
    public final void g() {
        if (this.r) {
            this.d++;
            this.q = true;
            this.s = 0;
        }
    }

    @Override // defpackage.wmu
    public final void h(esgx esgxVar, CharSequence charSequence) {
        if (this.r) {
            this.k++;
            this.n = (eqtg) this.a.b.get(esgxVar);
            this.l = charSequence;
            this.m = false;
        }
    }

    @Override // defpackage.wmu
    public final void i() {
        this.c = 0;
        this.d = 0;
        this.s = 0;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = 0;
        this.k = 0;
        this.m = false;
        this.l = null;
        this.n = null;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
    }

    @Override // defpackage.wmu
    public final void j(boolean z) {
        this.r = z;
    }

    @Override // defpackage.wmu
    public final void k() {
        if (this.r) {
            this.q = false;
        }
    }

    @Override // defpackage.wmu
    public final void l() {
        if (this.r) {
            this.c++;
            this.n = null;
        }
    }

    @Override // defpackage.wmu
    public final void m(CharSequence charSequence) {
        charSequence.getClass();
        if (this.r) {
            this.j++;
            this.l = charSequence;
            this.m = false;
        }
    }

    @Override // defpackage.wmu
    public final void n(CharSequence charSequence) {
        charSequence.getClass();
        if (this.r) {
            if (charSequence.length() == 0) {
                i();
                return;
            }
            CharSequence charSequence2 = this.l;
            boolean z = false;
            if (charSequence2 != null && !TextUtils.equals(charSequence, charSequence2)) {
                z = true;
            }
            this.m = z;
        }
    }

    @Override // defpackage.wmu
    public final boolean o() {
        return this.r;
    }

    @Override // defpackage.wmu
    public final void p(int i) {
        if (this.r) {
            this.s = i;
        }
    }
}
