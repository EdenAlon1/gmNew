package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class femn implements fejv {
    final Status a;
    private final fejt b;

    public femn(Status status, fejt fejtVar) {
        emxf.b(!status.f(), "error must not be OK");
        this.a = status;
        this.b = fejtVar;
    }

    @Override // defpackage.feab
    public final fdzv c() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // defpackage.fejv
    public final fejs d(febs febsVar, febo feboVar, fdxj fdxjVar, fdxt[] fdxtVarArr) {
        return new femm(this.a, this.b, fdxtVarArr);
    }
}
