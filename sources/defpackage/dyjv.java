package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjv {
    private static dyjv a;

    public static synchronized dyjv a() {
        dyjv dyjvVar;
        synchronized (dyjv.class) {
            if (a == null) {
                a = new dyjv();
            }
            dyjvVar = a;
        }
        return dyjvVar;
    }
}
