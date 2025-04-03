package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepf implements feqq {
    final /* synthetic */ feqc a;

    public fepf(feqc feqcVar) {
        this.a = feqcVar;
    }

    @Override // defpackage.feqq
    public final void a(boolean z) {
        feqc feqcVar = this.a;
        feqcVar.S.c(feqcVar.z, z);
        if (z) {
            this.a.k();
        }
    }

    @Override // defpackage.feqq
    public final void c(Status status) {
        throw null;
    }

    @Override // defpackage.feqq
    public final void d() {
        throw null;
    }

    @Override // defpackage.feqq
    public final void e() {
        throw null;
    }

    @Override // defpackage.feqq
    public final void b() {
    }
}
