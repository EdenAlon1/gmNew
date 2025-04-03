package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class felz implements feju {
    public final feju a;
    public volatile boolean b;
    public List c = new ArrayList();

    public felz(feju fejuVar) {
        this.a = fejuVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.feju
    public final void a(Status status, fejt fejtVar, febo feboVar) {
        b(new fely(this, status, fejtVar, feboVar));
    }

    @Override // defpackage.feju
    public final void c(febo feboVar) {
        b(new felx(this, feboVar));
    }

    @Override // defpackage.fevr
    public final void d(fevq fevqVar) {
        if (this.b) {
            this.a.d(fevqVar);
        } else {
            b(new felv(this, fevqVar));
        }
    }

    @Override // defpackage.fevr
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new felw(this));
        }
    }
}
