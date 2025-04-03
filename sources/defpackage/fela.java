package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fela extends fdxn {
    public final fdxn a;
    public volatile boolean b;
    public List c = new ArrayList();

    public fela(fdxn fdxnVar) {
        this.a = fdxnVar;
    }

    private final void e(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.fdxn
    public final void a(Status status, febo feboVar) {
        e(new feky(this, status, feboVar));
    }

    @Override // defpackage.fdxn
    public final void b(febo feboVar) {
        if (this.b) {
            this.a.b(feboVar);
        } else {
            e(new fekw(this, feboVar));
        }
    }

    @Override // defpackage.fdxn
    public final void c(Object obj) {
        if (this.b) {
            this.a.c(obj);
        } else {
            e(new fekx(this, obj));
        }
    }

    @Override // defpackage.fdxn
    public final void d() {
        if (this.b) {
            this.a.d();
        } else {
            e(new fekz(this));
        }
    }
}
