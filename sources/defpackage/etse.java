package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etse {
    public static final etse a = new etse();
    public final AtomicReference b = new AtomicReference(new etsy(new etsw()));

    public final Object a(etfs etfsVar, Class cls) {
        return ((etsy) this.b.get()).b(etfsVar, cls);
    }

    public final synchronized void b(etsv etsvVar) {
        etsw etswVar = new etsw((etsy) this.b.get());
        etswVar.a(etsvVar);
        this.b.set(new etsy(etswVar));
    }

    public final synchronized void c(ettc ettcVar) {
        etsw etswVar = new etsw((etsy) this.b.get());
        etswVar.b(ettcVar);
        this.b.set(new etsy(etswVar));
    }
}
