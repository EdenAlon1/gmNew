package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbpb {
    public static cbpa j() {
        cbmm cbmmVar = new cbmm();
        cbmmVar.c(cbnb.c);
        int i = engw.d;
        cbmmVar.g(enou.a);
        cbmmVar.d(enou.a);
        cbmmVar.i(enou.a);
        cbmmVar.e(enou.a);
        cbmmVar.f(enou.a);
        cbmmVar.b(enou.a);
        cbmmVar.h(cbnb.c);
        return cbmmVar;
    }

    public static boolean k(cbpb cbpbVar) {
        return !cbpbVar.g().isEmpty();
    }

    public abstract cbnb a();

    public abstract cbnb b();

    public abstract engw c();

    public abstract engw d();

    public abstract engw e();

    public abstract engw f();

    public abstract engw g();

    public abstract engw h();

    public final int i() {
        cbnb a = a();
        engw g = g();
        engw d = d();
        engw h = h();
        engw f = f();
        engw e = e();
        engw c = c();
        Cursor cursor = ((cbmd) b()).a;
        int i = !a.c() ? 1 : 0;
        int i2 = !g.isEmpty() ? 1 : 0;
        int i3 = !d.isEmpty() ? 1 : 0;
        int i4 = !h.isEmpty() ? 1 : 0;
        int i5 = !e.isEmpty() ? 1 : 0;
        int i6 = !f.isEmpty() ? 1 : 0;
        return i + i2 + i3 + i4 + i5 + i6 + (!c.isEmpty() ? 1 : 0) + (cursor.getCount() == 0 ? 0 : 1);
    }
}
