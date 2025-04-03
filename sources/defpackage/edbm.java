package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edbm {
    public static final /* synthetic */ int a = 0;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a() {
        c(14903854);
    }

    public static void b() {
        c(14903855);
    }

    private static void c(final int... iArr) {
        if (b.compareAndSet(false, true)) {
            dfld.m(new dflb() { // from class: edbl
                @Override // defpackage.dflb
                public final void a(dflc dflcVar) {
                    int i = edbm.a;
                    try {
                        dflcVar.f(iArr);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            });
        }
    }
}
