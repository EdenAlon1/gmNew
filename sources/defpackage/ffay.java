package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffay extends ffax {
    final fecu a;
    volatile boolean b;
    private boolean c;
    private boolean d = false;
    private boolean e = false;

    public ffay(fecu fecuVar) {
        this.a = fecuVar;
    }

    @Override // defpackage.ffbc
    public final void a() {
        this.a.a(Status.b, new febo());
        this.e = true;
    }

    @Override // defpackage.ffbc
    public final void b(Throwable th) {
        febo a = Status.a(th);
        if (a == null) {
            a = new febo();
        }
        this.a.a(Status.c(th), a);
        this.d = true;
    }

    @Override // defpackage.ffbc
    public final void c(Object obj) {
        emxf.m(!this.d, "Stream was terminated by error, no further calls are allowed");
        emxf.m(!this.e, "Stream is already completed, no further calls are allowed");
        if (!this.c) {
            this.a.b(new febo());
            this.c = true;
        }
        this.a.e(obj);
    }
}
