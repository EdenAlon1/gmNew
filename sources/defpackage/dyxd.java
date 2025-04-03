package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyxd {
    private static dyxd a;

    public static synchronized void a() {
        synchronized (dyxd.class) {
            if (a == null) {
                a = new dyxd();
            }
        }
    }
}
