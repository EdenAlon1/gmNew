package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffit {
    public static final void a(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                ffbt.a(th, th2);
            }
        }
    }
}
