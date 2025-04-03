package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqo extends fdzs {
    final feqp b;

    public feqo(feqp feqpVar) {
        this.b = feqpVar;
    }

    @Override // defpackage.fdzs
    public final fdzr a() {
        emxf.m(true, "config is not set");
        return new fdzr(Status.b, this.b);
    }
}
