package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feus implements fdyh {
    final /* synthetic */ fevc a;

    public feus(fevc fevcVar) {
        this.a = fevcVar;
    }

    @Override // defpackage.fdyh
    public final void a(fdyn fdynVar) {
        Status a = fdyp.a(fdynVar);
        if (Status.f.getCode().equals(a.getCode())) {
            this.a.c(a);
        }
    }
}
