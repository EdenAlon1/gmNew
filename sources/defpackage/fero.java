package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fero extends feao {
    final /* synthetic */ ferq a;
    private final ferq b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public fero(ferq ferqVar, ferq ferqVar2) {
        this.a = ferqVar;
        this.b = ferqVar2;
    }

    @Override // defpackage.feao
    public final feak a(feal fealVar) {
        if (this.c.compareAndSet(false, true)) {
            ferq ferqVar = this.a;
            final ferq ferqVar2 = this.b;
            ferqVar.g.c().execute(new Runnable() { // from class: fern
                @Override // java.lang.Runnable
                public final void run() {
                    ferq.this.d();
                }
            });
        }
        return feak.a;
    }
}
