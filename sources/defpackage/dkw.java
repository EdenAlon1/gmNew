package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dkw {
    public static /* synthetic */ void a(dlu dluVar, float f) {
        float a = dluVar.d.a();
        dluVar.d.e.i(f);
        dluVar.d.f.i(0.0f);
        if (Float.isNaN(a)) {
            return;
        }
        boolean z = f >= a;
        dly dlyVar = dluVar.d;
        if (dluVar.d.a() == dlyVar.k().a(dlyVar.d())) {
            Object c = dluVar.d.k().c(dluVar.d.a() + (f >= a ? 1.0f : -1.0f), z);
            if (c == null) {
                c = dluVar.d.d();
            }
            if (z) {
                dluVar.a = dluVar.d.d();
                dluVar.b = c;
            } else {
                dluVar.a = c;
                dluVar.b = dluVar.d.d();
            }
        } else {
            dly dlyVar2 = dluVar.d;
            Object c2 = dlyVar2.k().c(dlyVar2.a(), false);
            if (c2 == null) {
                c2 = dluVar.d.d();
            }
            dly dlyVar3 = dluVar.d;
            Object c3 = dlyVar3.k().c(dlyVar3.a(), true);
            if (c3 == null) {
                c3 = dluVar.d.d();
            }
            dluVar.a = c2;
            dluVar.b = c3;
        }
        dmu k = dluVar.d.k();
        Object obj = dluVar.a;
        obj.getClass();
        float a2 = k.a(obj);
        dmu k2 = dluVar.d.k();
        Object obj2 = dluVar.b;
        obj2.getClass();
        dluVar.c = Math.abs(a2 - k2.a(obj2));
        if (Math.abs(dluVar.d.a() - dluVar.d.k().a(dluVar.d.d())) >= dluVar.c / 2.0f) {
            Object obj3 = z ? dluVar.b : dluVar.a;
            if (obj3 == null) {
                obj3 = dluVar.d.d();
            }
            ((Boolean) dluVar.d.a.invoke(obj3)).booleanValue();
            dluVar.d.h(obj3);
        }
    }
}
