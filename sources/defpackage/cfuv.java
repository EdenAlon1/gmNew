package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfuv {
    public cfuv(cfuw cfuwVar, cfuu cfuuVar, ffbr ffbrVar) {
        ekzz f = eleg.f("FlagsInitializer#constructor");
        try {
            cfuwVar.a();
            cfuuVar.a();
            ffbrVar.b();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
