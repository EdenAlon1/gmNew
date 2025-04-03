package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fejq implements feju {
    public final fdxn a;
    public Status b;
    final /* synthetic */ fejr c;

    public fejq(fejr fejrVar, fdxn fdxnVar) {
        this.c = fejrVar;
        this.a = fdxnVar;
    }

    @Override // defpackage.feju
    public final void a(Status status, fejt fejtVar, febo feboVar) {
        int i = ffbo.a;
        fdys b = this.c.b();
        if (status.getCode() == Status.Code.CANCELLED && b != null && b.g()) {
            status = this.c.f.b();
            feboVar = new febo();
        }
        this.c.c.execute(new fejo(this, status, feboVar));
    }

    public final void b(Status status) {
        this.b = status;
        this.c.h.c(status);
    }

    @Override // defpackage.feju
    public final void c(febo feboVar) {
        int i = ffbo.a;
        this.c.c.execute(new fejm(this, feboVar));
    }

    @Override // defpackage.fevr
    public final void d(fevq fevqVar) {
        int i = ffbo.a;
        this.c.c.execute(new fejn(this, fevqVar));
    }

    @Override // defpackage.fevr
    public final void e() {
        if (this.c.b.a.a()) {
            return;
        }
        int i = ffbo.a;
        this.c.c.execute(new fejp(this));
    }
}
