package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrt {
    public final Executor a;
    public final ejqp b;

    public ejrt(Executor executor, ejqp ejqpVar) {
        executor.getClass();
        this.a = executor;
        this.b = ejqpVar;
    }

    public final void a(ffud ffudVar) {
        ffuf ffufVar = new ffuf(ffudVar);
        final ffji ffjiVar = new ffji() { // from class: ejrs
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ejrt ejrtVar = ejrt.this;
                ejqp ejqpVar = ejrtVar.b;
                Throwable th = (Throwable) obj;
                if (ejqpVar == ejqp.DEV || ejqpVar == ejqp.ROBOLECTRIC || ejqpVar == ejqp.EMULATOR) {
                    final IllegalStateException illegalStateException = new IllegalStateException("TikTok's CoroutineScope should not be cancelled or completed", th);
                    ejrtVar.a.execute(eldl.l(new Runnable() { // from class: ejrr
                        @Override // java.lang.Runnable
                        public final void run() {
                            eldx.k(illegalStateException);
                        }
                    }));
                } else {
                    ((enrr) ((enrr) ((enru) ejrv.a.a()).i()).g(th).h("com/google/apps/tiktok/coroutines/TikTokScopes", "crashOrLogOnCompletion$lambda$1", 48, "TikTokScopes.kt")).q("TikTok's CoroutineScope should not be cancelled or completed");
                }
                return ffcu.a;
            }
        };
        final elat e = ekyf.e();
        ffufVar.hZ(new ffji() { // from class: eldm
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                elao b = ekyf.b();
                elat h = ekyf.h(b, elat.this);
                try {
                    ffjiVar.invoke(th);
                    ekyf.h(b, h);
                    return ffcu.a;
                } finally {
                }
            }
        });
    }
}
