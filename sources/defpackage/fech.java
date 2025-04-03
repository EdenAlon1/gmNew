package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fech extends fdxn {
    @Override // defpackage.fdxn
    public void a(Status status, febo feboVar) {
        h().a(status, feboVar);
    }

    @Override // defpackage.fdxn
    public void b(febo feboVar) {
        h().b(feboVar);
    }

    @Override // defpackage.fdxn
    public final void d() {
        h().d();
    }

    protected abstract fdxn h();

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("delegate", h());
        return b.toString();
    }
}
