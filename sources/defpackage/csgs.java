package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csgs {
    public static final void a(Throwable th, csgr csgrVar) {
        th.getClass();
        Throwable b = emyt.b(th);
        try {
            b.initCause(csgrVar);
        } catch (Exception unused) {
            b.getClass();
            ffbt.a(b, csgrVar);
        }
    }
}
