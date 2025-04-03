package defpackage;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public abstract class oiv extends AbstractList {
    public final ffsk a;
    public final ffsd b;
    public final oiz c;
    public final oin d;
    public final List e;
    public final List f;
    private final okl g;

    public oiv(okl oklVar, ffsk ffskVar, ffsd ffsdVar, oiz oizVar, oin oinVar) {
        oklVar.getClass();
        ffskVar.getClass();
        ffsdVar.getClass();
        oinVar.getClass();
        this.g = oklVar;
        this.a = ffskVar;
        this.b = ffsdVar;
        this.c = oizVar;
        this.d = oinVar;
        int i = oinVar.b;
        int i2 = oinVar.a;
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public okl a() {
        return this.g;
    }

    public abstract Object b();

    public abstract void c(ffjm ffjmVar);

    public abstract void d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.c.get(i);
    }

    public void i(ofz ofzVar, ofx ofxVar) {
        ofzVar.getClass();
    }

    public abstract boolean j();

    public final int l() {
        return this.c.f();
    }

    public final int m() {
        return this.c.b();
    }

    public final List n() {
        return v() ? this : new oli(this);
    }

    public final void o(oil oilVar) {
        oilVar.getClass();
        ffdx.v(this.e, oip.a);
        this.e.add(new WeakReference(oilVar));
    }

    public final void p(ffjm ffjmVar) {
        ffjmVar.getClass();
        ffdx.v(this.f, oiq.a);
        this.f.add(new WeakReference(ffjmVar));
        c(ffjmVar);
    }

    public final void q(int i) {
        if (i >= 0 && i < l()) {
            oiz oizVar = this.c;
            oizVar.g = ffmk.i(i - oizVar.b, 0, oizVar.f - 1);
            d(i);
        } else {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + l());
        }
    }

    public final void r(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator it = ffdx.af(this.e).iterator();
        while (it.hasNext()) {
            oil oilVar = (oil) ((WeakReference) it.next()).get();
            if (oilVar != null) {
                oilVar.a(i, i2);
            }
        }
    }

    public final void s(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        Iterator it = ffdx.af(this.e).iterator();
        while (it.hasNext()) {
            oil oilVar = (oil) ((WeakReference) it.next()).get();
            if (oilVar != null) {
                oilVar.b(i, i2);
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return l();
    }

    public final void t(oil oilVar) {
        oilVar.getClass();
        ffdx.v(this.e, new oit(oilVar));
    }

    public final void u(ffjm ffjmVar) {
        ffjmVar.getClass();
        ffdx.v(this.f, new oiu(ffjmVar));
    }

    public boolean v() {
        return j();
    }
}
