package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejy implements ljv {
    public aehw a;
    private final errm b;
    private final cqoh c;
    private elfl d;

    public aejy(errm errmVar, cqoh cqohVar) {
        this.b = errmVar;
        this.c = cqohVar;
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        elfl elflVar = this.d;
        if (elflVar != null) {
            elflVar.cancel(true);
        }
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        this.d = elfl.g(emuu.a(new Runnable() { // from class: aejx
            @Override // java.lang.Runnable
            public final void run() {
                aehw aehwVar = aejy.this.a;
                aehwVar.v(0, aehwVar.a(), new aelt(new enpx(aemb.TIMESTAMP), true));
            }
        }, 1L, TimeUnit.MINUTES, this.c, this.b));
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }
}
