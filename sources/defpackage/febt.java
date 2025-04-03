package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febt {
    private static febt a;

    public febt() {
        new HashSet();
    }

    public static synchronized void a() {
        synchronized (febt.class) {
            if (a == null) {
                a = new febt();
            }
        }
    }
}
