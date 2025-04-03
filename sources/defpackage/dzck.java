package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzck {
    private static dzck a;

    public static synchronized void a() {
        synchronized (dzck.class) {
            if (a == null) {
                a = new dzck();
            }
        }
    }
}
