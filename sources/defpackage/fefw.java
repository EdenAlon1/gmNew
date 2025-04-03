package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fefw implements erqj {
    final /* synthetic */ fecu a;
    final /* synthetic */ fehg b;
    final /* synthetic */ febo c;
    final /* synthetic */ fecv d;

    public fefw(fecu fecuVar, fehg fehgVar, febo feboVar, fecv fecvVar) {
        this.a = fecuVar;
        this.b = fehgVar;
        this.c = feboVar;
        this.d = fecvVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Status status = (Status) obj;
        if (!status.f()) {
            this.a.a(status, new febo());
            return;
        }
        fehg fehgVar = this.b;
        fecu fecuVar = this.a;
        try {
            fehgVar.a.set(this.d.a(fecuVar, this.c));
            fehgVar.f();
        } catch (RuntimeException e) {
            fecuVar.a(Status.o.d(e).withDescription("Failed to start server call after authorization check"), new febo());
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.a.a(Status.o.d(th).withDescription("Authorization future failed"), new febo());
    }
}
