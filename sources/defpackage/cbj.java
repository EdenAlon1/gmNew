package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbj implements ksp {
    final /* synthetic */ Executor a;
    final /* synthetic */ ksp b;
    final /* synthetic */ cbl c;

    public cbj(cbl cblVar, Executor executor, ksp kspVar) {
        this.c = cblVar;
        this.a = executor;
        this.b = kspVar;
    }

    @Override // defpackage.ksp
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        bur burVar = (bur) obj;
        if (burVar instanceof bum) {
            if (biw.d()) {
                this.c.j(this);
            } else {
                this.a.execute(new Runnable() { // from class: cbi
                    @Override // java.lang.Runnable
                    public final void run() {
                        cbj cbjVar = cbj.this;
                        cbjVar.c.j(cbjVar);
                    }
                });
            }
        }
        this.b.accept(burVar);
    }
}
