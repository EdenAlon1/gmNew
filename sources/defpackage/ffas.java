package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffas extends ffap {
    private final ffao a;
    private Object b;
    private boolean c = false;

    public ffas(ffao ffaoVar) {
        this.a = ffaoVar;
    }

    @Override // defpackage.fdxn
    public final void a(Status status, febo feboVar) {
        if (!status.f()) {
            this.a.setException(new fedn(status, feboVar));
            return;
        }
        if (!this.c) {
            this.a.setException(new fedn(Status.o.withDescription("No value received for unary call"), feboVar));
        }
        this.a.set(this.b);
    }

    @Override // defpackage.fdxn
    public final void c(Object obj) {
        if (this.c) {
            throw new fedn(Status.o.withDescription("More than one value received for unary call"));
        }
        this.b = obj;
        this.c = true;
    }

    @Override // defpackage.ffap
    public final void e() {
        this.a.a.e(2);
    }

    @Override // defpackage.fdxn
    public final void b(febo feboVar) {
    }
}
