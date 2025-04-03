package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffta {
    public static final void a(ffsz ffszVar, ffgu ffguVar, boolean z) {
        Object p = ffszVar.p();
        Throwable s = ffszVar.s(p);
        Object a = s != null ? ffci.a(s) : ffszVar.o(p);
        if (!z) {
            ffguVar.w(a);
            return;
        }
        fggk fggkVar = (fggk) ffguVar;
        ffgu ffguVar2 = fggkVar.b;
        Object obj = fggkVar.d;
        ffhd u = ffguVar2.u();
        Object b = fghv.b(u, obj);
        ffvo c = b != fghv.a ? ffsa.c(ffguVar2, u, b) : null;
        try {
            fggkVar.b.w(a);
            if (c == null || c.f()) {
                fghv.c(u, b);
            }
        } catch (Throwable th) {
            if (c == null || c.f()) {
                fghv.c(u, b);
            }
            throw th;
        }
    }

    public static final boolean b(int i) {
        return i == 1 || i == 2;
    }
}
