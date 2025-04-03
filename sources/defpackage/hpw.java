package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpw implements hpn {
    public final boolean a;
    public Object b;
    public List c;
    public hio d;
    private final int e;

    public hpw(int i, boolean z, Object obj) {
        this.e = i;
        this.a = z;
        this.b = obj;
    }

    private final void n(hfd hfdVar) {
        hio O;
        if (!this.a || (O = ((hfm) hfdVar).O()) == null) {
            return;
        }
        O.n();
        if (hpx.e(this.d, O)) {
            this.d = O;
            return;
        }
        List list = this.c;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(O);
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (hpx.e((hio) list.get(i), O)) {
                list.set(i, O);
                return;
            }
        }
        list.add(O);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return b((hfd) obj, ((Number) obj2).intValue());
    }

    public final Object b(hfd hfdVar, int i) {
        hfd b = hfdVar.b(this.e);
        n(b);
        int b2 = i | (b.D(this) ? hpx.b(0) : hpx.c(0));
        Object obj = this.b;
        obj.getClass();
        fflf.e(obj, 2);
        Object a = ((ffjm) obj).a(b, Integer.valueOf(b2));
        hio L = b.L();
        if (L != null) {
            L.d = new hpo(this);
        }
        return a;
    }

    public final Object c(Object obj, hfd hfdVar, int i) {
        hfd b = hfdVar.b(this.e);
        n(b);
        int b2 = b.D(this) ? hpx.b(1) : hpx.c(1);
        Object obj2 = this.b;
        obj2.getClass();
        fflf.e(obj2, 3);
        Object a = ((ffjn) obj2).a(obj, b, Integer.valueOf(b2 | i));
        hio L = b.L();
        if (L != null) {
            L.d = new hpp(this, obj, i);
        }
        return a;
    }

    public final Object d(Object obj, Object obj2, hfd hfdVar, int i) {
        hfd b = hfdVar.b(this.e);
        n(b);
        int b2 = b.D(this) ? hpx.b(2) : hpx.c(2);
        Object obj3 = this.b;
        obj3.getClass();
        fflf.e(obj3, 4);
        Object a = ((ffjo) obj3).a(obj, obj2, b, Integer.valueOf(b2 | i));
        hio L = b.L();
        if (L != null) {
            L.d = new hpq(this, obj, obj2, i);
        }
        return a;
    }

    public final Object e(Object obj, Object obj2, Object obj3, hfd hfdVar, int i) {
        hfd b = hfdVar.b(this.e);
        n(b);
        int b2 = b.D(this) ? hpx.b(3) : hpx.c(3);
        Object obj4 = this.b;
        obj4.getClass();
        fflf.e(obj4, 5);
        Object f = ((ffjp) obj4).f(obj, obj2, obj3, b, Integer.valueOf(b2 | i));
        hio L = b.L();
        if (L != null) {
            L.d = new hpr(this, obj, obj2, obj3, i);
        }
        return f;
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e(obj, obj2, obj3, (hfd) obj4, ((Number) obj5).intValue());
    }

    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, hfd hfdVar, int i) {
        hfd b = hfdVar.b(this.e);
        n(b);
        int b2 = b.D(this) ? hpx.b(4) : hpx.c(4);
        Object obj5 = this.b;
        obj5.getClass();
        fflf.e(obj5, 6);
        Object a = ((ffjq) obj5).a(obj, obj2, obj3, obj4, b, Integer.valueOf(b2 | i));
        hio L = b.L();
        if (L != null) {
            L.d = new hps(this, obj, obj2, obj3, obj4, i);
        }
        return a;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, hfd hfdVar, int i) {
        hfd b = hfdVar.b(this.e);
        n(b);
        int b2 = b.D(this) ? hpx.b(5) : hpx.c(5);
        Object obj6 = this.b;
        obj6.getClass();
        fflf.e(obj6, 7);
        Object i2 = ((ffjr) obj6).i(obj, obj2, obj3, obj4, obj5, b, Integer.valueOf(i | b2));
        hio L = b.L();
        if (L != null) {
            L.d = new hpt(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return i2;
    }

    @Override // defpackage.ffjr
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return h(obj, obj2, obj3, obj4, obj5, (hfd) obj6, ((Number) obj7).intValue());
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, hfd hfdVar, int i) {
        hfd b = hfdVar.b(this.e);
        n(b);
        int b2 = b.D(this) ? hpx.b(6) : hpx.c(6);
        Object obj7 = this.b;
        obj7.getClass();
        fflf.e(obj7, 8);
        Object k = ((ffjs) obj7).k(obj, obj2, obj3, obj4, obj5, obj6, b, Integer.valueOf(i | b2));
        hio L = b.L();
        if (L != null) {
            L.d = new hpu(this, obj, obj2, obj3, obj4, obj5, obj6, i);
        }
        return k;
    }

    @Override // defpackage.ffjs
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return j(obj, obj2, obj3, obj4, obj5, obj6, (hfd) obj7, ((Number) obj8).intValue());
    }

    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, hfd hfdVar, int i) {
        hfd b = hfdVar.b(this.e);
        n(b);
        int b2 = b.D(this) ? hpx.b(8) : hpx.c(8);
        Object obj9 = this.b;
        obj9.getClass();
        fflf.e(obj9, 10);
        Object m = ((ffiy) obj9).m(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, b, Integer.valueOf(i | b2));
        hio L = b.L();
        if (L != null) {
            L.d = new hpv(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i);
        }
        return m;
    }

    @Override // defpackage.ffiy
    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (hfd) obj9, ((Number) obj10).intValue());
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return c(obj, (hfd) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (hfd) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return g(obj, obj2, obj3, obj4, (hfd) obj5, ((Number) obj6).intValue());
    }
}
