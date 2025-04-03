package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duyp {
    public static final enhk a;
    final Executor b;
    final boolean c;
    final AtomicBoolean d;
    final ArrayDeque e = new ArrayDeque(1);

    static {
        enhd enhdVar = new enhd();
        a(enhdVar, duoc.b);
        a(enhdVar, duoc.a);
        a = enhdVar.b();
    }

    public duyp(Executor executor, boolean z) {
        this.b = executor;
        this.c = z;
        this.d = dunl.c(executor) ? new AtomicBoolean(false) : null;
    }

    private static void a(enhd enhdVar, Executor executor) {
        enhdVar.k(executor, new duyp(executor, true));
    }
}
