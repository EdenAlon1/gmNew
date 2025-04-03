package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scn implements erqj {
    final /* synthetic */ kfb a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ sco c;

    public scn(sco scoVar, kfb kfbVar, Runnable runnable) {
        this.a = kfbVar;
        this.b = runnable;
        this.c = scoVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        this.a.b(obj);
        this.c.b(this.b);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof sao) {
            this.a.c(th);
        } else if (th instanceof CancellationException) {
            this.a.c(new sao(4, 7, "Operation was cancelled.", th));
        } else {
            this.a.c(new sao(4, 0, "AiCore request could not be completed.", th));
        }
        this.c.b(this.b);
    }
}
