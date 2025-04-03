package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duip {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    public static void a() {
        if (a.compareAndSet(false, true)) {
            eyfc a2 = eyfc.a();
            eyfc eyfcVar = ffag.a;
            a2.getClass();
            ffag.a = a2;
        }
    }
}
