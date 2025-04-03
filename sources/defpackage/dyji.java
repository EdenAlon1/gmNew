package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyji {
    private static dyji a;

    private dyji() {
    }

    public static synchronized void a() {
        synchronized (dyji.class) {
            if (a != null) {
                return;
            }
            a = new dyji();
        }
    }
}
