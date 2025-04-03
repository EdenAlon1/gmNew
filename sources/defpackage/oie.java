package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oie {
    public final ojd a;
    public final List b;
    public final List c;
    public int d;
    public int e;
    public int f;
    public final ffwm g;
    public final ffwm h;
    public final Map i;
    public final ogh j;
    private int k;
    private int l;

    public oie(ojd ojdVar) {
        this.a = ojdVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.g = ffwp.a(-1, 0, 6);
        this.h = ffwp.a(-1, 0, 6);
        this.i = new LinkedHashMap();
        ogh oghVar = new ogh();
        oghVar.d(ofz.a, ofv.a);
        this.j = oghVar;
    }

    public final int a() {
        if (this.a.c) {
            return this.l;
        }
        return 0;
    }

    public final int b() {
        if (this.a.c) {
            return this.k;
        }
        return 0;
    }

    public final int c() {
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((oki) it.next()).b.size();
        }
        return i;
    }

    public final ogo d(oki okiVar, ofz ofzVar) {
        int i;
        okiVar.getClass();
        ofzVar.getClass();
        int ordinal = ofzVar.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal == 1) {
            i = -this.d;
        } else {
            if (ordinal != 2) {
                throw new ffcd();
            }
            i = (this.c.size() - this.d) - 1;
        }
        List b = ffdx.b(new oll(i, okiVar.b));
        int ordinal2 = ofzVar.ordinal();
        if (ordinal2 == 0) {
            ogl oglVar = ogl.a;
            return new ogl(ofz.a, b, b(), a(), this.j.b());
        }
        if (ordinal2 == 1) {
            ogl oglVar2 = ogl.a;
            return new ogl(ofz.b, b, b(), -1, this.j.b());
        }
        if (ordinal2 != 2) {
            throw new ffcd();
        }
        ogl oglVar3 = ogl.a;
        return new ogl(ofz.c, b, -1, a(), this.j.b());
    }

    public final okm e(oln olnVar) {
        Integer num;
        int i;
        List ak = ffdx.ak(this.c);
        if (olnVar != null) {
            int b = b();
            int i2 = -this.d;
            int e = ffdx.e(this.c) - this.d;
            int i3 = i2;
            while (true) {
                i = olnVar.a;
                if (i3 >= i) {
                    break;
                }
                b += i3 > e ? this.a.a : ((oki) this.c.get(this.d + i3)).b.size();
                i3++;
            }
            int i4 = b + olnVar.b;
            if (i < i2) {
                i4 -= this.a.a;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        return new okm(ak, num, this.a, b());
    }

    public final void f(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.l = i;
    }

    public final void g(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.k = i;
    }

    public final boolean h(int i, ofz ofzVar, oki okiVar) {
        ofzVar.getClass();
        okiVar.getClass();
        int ordinal = ofzVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (this.c.isEmpty()) {
                        throw new IllegalStateException("should've received an init before append");
                    }
                    if (i != this.f) {
                        return false;
                    }
                    this.b.add(okiVar);
                    int i2 = okiVar.f;
                    if (i2 == Integer.MIN_VALUE) {
                        i2 = ffmk.f(a() - okiVar.b.size(), 0);
                    }
                    f(i2);
                    this.i.remove(ofz.c);
                }
            } else {
                if (this.c.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (i != this.e) {
                    return false;
                }
                this.b.add(0, okiVar);
                this.d++;
                int i3 = okiVar.e;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = ffmk.f(b() - okiVar.b.size(), 0);
                }
                g(i3);
                this.i.remove(ofz.b);
            }
        } else {
            if (!this.c.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            this.b.add(okiVar);
            this.d = 0;
            f(okiVar.f);
            g(okiVar.e);
        }
        return true;
    }
}
