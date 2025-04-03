package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkqe {
    public static final Object a = new Object();
    public static dkqm b;

    public static Optional a() {
        Optional ofNullable;
        synchronized (a) {
            ofNullable = Optional.ofNullable(b);
        }
        return ofNullable;
    }

    public static void b() {
        synchronized (a) {
            dkty.k("Destroying JibeServiceComponent", new Object[0]);
            b = null;
        }
    }
}
