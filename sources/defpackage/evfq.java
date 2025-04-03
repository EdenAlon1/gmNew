package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evfq extends fdxn {
    public final fdxn a;
    boolean b = false;
    final /* synthetic */ evfu c;

    public evfq(evfu evfuVar, fdxn fdxnVar) {
        this.c = evfuVar;
        this.a = fdxnVar;
    }

    @Override // defpackage.fdxn
    public final void a(final Status status, final febo feboVar) {
        this.c.a.execute(new Runnable() { // from class: evfn
            @Override // java.lang.Runnable
            public final void run() {
                Status status2 = status;
                febo feboVar2 = feboVar;
                evfq evfqVar = evfq.this;
                if (evfqVar.b) {
                    return;
                }
                try {
                    evfqVar.a.a(status2, feboVar2);
                } finally {
                    evfqVar.b = true;
                    evfqVar.c.h.a();
                }
            }
        });
    }

    @Override // defpackage.fdxn
    public final void b(final febo feboVar) {
        this.c.a.execute(new Runnable() { // from class: evfm
            @Override // java.lang.Runnable
            public final void run() {
                evfq evfqVar = evfq.this;
                if (evfqVar.b) {
                    return;
                }
                evfqVar.a.b(feboVar);
            }
        });
    }

    @Override // defpackage.fdxn
    public final void c(final Object obj) {
        this.c.a.execute(new Runnable() { // from class: evfo
            @Override // java.lang.Runnable
            public final void run() {
                evfq evfqVar = evfq.this;
                if (evfqVar.b) {
                    return;
                }
                evfqVar.a.c(obj);
            }
        });
    }

    @Override // defpackage.fdxn
    public final void d() {
        this.c.a.execute(new Runnable() { // from class: evfp
            @Override // java.lang.Runnable
            public final void run() {
                evfq evfqVar = evfq.this;
                if (evfqVar.b) {
                    return;
                }
                evfqVar.a.d();
            }
        });
    }
}
