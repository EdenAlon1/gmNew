package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evga extends fdyz {
    private final AtomicReference a;

    public evga(fdxo fdxoVar) {
        super(fdxoVar);
        this.a = new AtomicReference(evfz.b(1));
    }

    @Override // defpackage.fdza, defpackage.fdxo
    public final void a(fdxn fdxnVar, febo feboVar) {
        evfz evfzVar;
        do {
            evfzVar = (evfz) this.a.get();
        } while (!evfy.a(this.a, evfzVar, evfzVar.b == 1 ? evfz.b(2) : evfzVar));
        int i = evfzVar.b;
        if (i == 1) {
            this.c.a(fdxnVar, feboVar);
        } else if (i == 4) {
            fdxnVar.a(evfzVar.a, new febo());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            this.c.c("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // defpackage.fecg, defpackage.fdxo
    public final void c(String str, Throwable th) {
        evfz evfzVar;
        int i;
        Status status = Status.c;
        if (str != null) {
            status = status.withDescription(str);
        }
        if (th != null) {
            status = status.d(th);
        }
        do {
            evfzVar = (evfz) this.a.get();
            i = evfzVar.b;
        } while (!evfy.a(this.a, evfzVar, i == 4 ? evfzVar : i == 1 ? evfz.a(4, status) : evfz.a(5, status)));
        this.c.c(str, th);
    }

    @Override // defpackage.fecg, defpackage.fdxo
    public final void d() {
        evfz evfzVar;
        do {
            evfzVar = (evfz) this.a.get();
            if (evfzVar.b != 2) {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!evfy.a(this.a, evfzVar, evfz.b(3)));
        this.c.d();
    }

    @Override // defpackage.fecg, defpackage.fdxo
    public final void e(int i) {
        int i2 = ((evfz) this.a.get()).b;
        if (i2 == 1 || i2 == 4) {
            throw new IllegalStateException("Not started");
        }
        emxf.b(i >= 0, "Number requested must be non-negative");
        this.c.e(i);
    }

    @Override // defpackage.fdza, defpackage.fdxo
    public final void f(Object obj) {
        obj.getClass();
        int i = ((evfz) this.a.get()).b;
        if (i == 2) {
            this.c.f(obj);
        } else if (i != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }
}
