package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feny extends femq {
    final /* synthetic */ feju a;
    final /* synthetic */ fenz b;

    public feny(fenz fenzVar, feju fejuVar) {
        this.a = fejuVar;
        this.b = fenzVar;
    }

    @Override // defpackage.femq, defpackage.feju
    public final void a(Status status, fejt fejtVar, febo feboVar) {
        this.b.b.a.a(status.f());
        this.a.a(status, fejtVar, feboVar);
    }

    @Override // defpackage.femq
    protected final feju b() {
        return this.a;
    }
}
