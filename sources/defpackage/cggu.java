package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cggu {
    private final AtomicInteger a = new AtomicInteger(cggt.a.ordinal());

    public final cggt a() {
        return (cggt) cggt.d.get(this.a.get());
    }

    public final void b(cggt cggtVar) {
        cggtVar.getClass();
        this.a.set(cggtVar.ordinal());
    }

    public final boolean c() {
        return a() != cggt.a;
    }

    public final boolean d() {
        return a() == cggt.c && c();
    }

    public final boolean e() {
        if (c()) {
            return a() == cggt.b;
        }
        throw new IllegalStateException("TrustedContactsInMemory cache is not initialized. Cannot be used to determine the supervision status.");
    }
}
