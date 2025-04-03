package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekpp extends fdyz {
    final elds a;
    final String b;

    public ekpp(fdxo fdxoVar, String str, elds eldsVar) {
        super(fdxoVar);
        this.b = str;
        this.a = eldsVar;
    }

    @Override // defpackage.fdza, defpackage.fdxo
    public final void a(final fdxn fdxnVar, final febo feboVar) {
        elds.d(this.a, new Runnable() { // from class: ekpo
            @Override // java.lang.Runnable
            public final void run() {
                ekpp.this.b(fdxnVar, feboVar);
            }
        }).run();
    }

    public final /* synthetic */ void b(fdxn fdxnVar, febo feboVar) {
        ekzz f = eleg.f(this.b);
        try {
            SettableFuture create = SettableFuture.create();
            f.b(create);
            super.a(new ekpq(fdxnVar, create), feboVar);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
