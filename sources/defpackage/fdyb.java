package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyb {
    private static fdyb a;
    private final List b = Collections.EMPTY_LIST;

    public static synchronized fdyb a() {
        fdyb fdybVar;
        synchronized (fdyb.class) {
            if (a == null) {
                a = new fdyb();
            }
            fdybVar = a;
        }
        return fdybVar;
    }

    public final synchronized List b() {
        return this.b;
    }

    public final synchronized void c() {
    }
}
