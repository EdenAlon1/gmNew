package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahr implements Runnable {
    public boolean a = false;
    final /* synthetic */ ahs b;
    private final Executor c;

    public ahr(ahs ahsVar, Executor executor) {
        this.b = ahsVar;
        this.c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.execute(new Runnable() { // from class: ahq
            @Override // java.lang.Runnable
            public final void run() {
                ahr ahrVar = ahr.this;
                if (ahrVar.a) {
                    return;
                }
                ksw.c(ahrVar.b.b.A == 8 || ahrVar.b.b.A == 7);
                ahs ahsVar = ahrVar.b;
                if (ahsVar.d()) {
                    ahsVar.b.C(true);
                } else {
                    ahsVar.b.D(true);
                }
            }
        });
    }
}
