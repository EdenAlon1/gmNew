package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsi implements abqq {
    public final akzt a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    private final ffsk d;

    public zsi(akzt akztVar, ffsk ffskVar) {
        akztVar.getClass();
        ffskVar.getClass();
        this.a = akztVar;
        this.d = ffskVar;
        this.b = new AtomicInteger(0);
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        axol.k(this.d, null, new zsh(this.b.get(), this, this.c.get(), null), 3);
    }
}
