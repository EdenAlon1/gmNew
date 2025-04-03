package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ferv extends feao {
    public final fean a;
    final /* synthetic */ ferw b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public ferv(ferw ferwVar, fean feanVar) {
        this.b = ferwVar;
        this.a = feanVar;
    }

    @Override // defpackage.feao
    public final feak a(feal fealVar) {
        if (this.c.compareAndSet(false, true)) {
            this.b.f.c().execute(new feru(this));
        }
        return feak.a;
    }
}
