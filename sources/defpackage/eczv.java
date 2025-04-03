package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eczv {
    private final AtomicInteger a = new AtomicInteger();

    public final int a() {
        return this.a.get();
    }

    public final void b() {
        this.a.incrementAndGet();
    }
}
