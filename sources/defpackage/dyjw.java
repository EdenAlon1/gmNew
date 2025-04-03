package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjw {
    private static dyjw a;

    private dyjw() {
    }

    public static synchronized void a() {
        synchronized (dyjw.class) {
            if (a == null) {
                a = new dyjw();
            }
        }
    }
}
