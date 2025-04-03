package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class digx {
    private static digw a;

    public static synchronized digw a() {
        digw digwVar;
        synchronized (digx.class) {
            if (a == null) {
                b(new dihe());
            }
            digwVar = a;
        }
        return digwVar;
    }

    public static synchronized void b(digw digwVar) {
        synchronized (digx.class) {
            if (a != null) {
                throw new IllegalStateException("init() already called");
            }
            a = digwVar;
        }
    }
}
