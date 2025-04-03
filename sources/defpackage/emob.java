package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emob extends faqj {
    public final emmt a;
    public final emoh b;
    private final AtomicBoolean f = new AtomicBoolean(false);

    public emob(emoh emohVar, emmt emmtVar) {
        this.b = emohVar;
        this.a = emmtVar;
    }

    @Override // defpackage.faqj
    protected final faqe a() {
        faqe faqeVar = this.b.c;
        return faqeVar == null ? faqe.a : faqeVar;
    }

    @Override // defpackage.faqj
    public final synchronized void b() {
        if (this.f.get()) {
            return;
        }
        super.b();
        this.f.set(true);
    }
}
