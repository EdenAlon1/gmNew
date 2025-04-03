package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evhf extends fdze {
    final /* synthetic */ evhg a;
    final /* synthetic */ fdyn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evhf(fecu fecuVar, evhg evhgVar, fdyn fdynVar) {
        super(fecuVar);
        this.a = evhgVar;
        this.b = fdynVar;
    }

    @Override // defpackage.feci, defpackage.fecu
    public final void a(Status status, febo feboVar) {
        status.getClass();
        feboVar.getClass();
        if (((AtomicReference) this.a.a[0].c.b(this.b)).get() != null) {
            throw new IllegalStateException("Response headers can be populated only before the first response message.");
        }
        this.a.b(feboVar, this.b, false);
        super.a(status, feboVar);
    }

    @Override // defpackage.feci, defpackage.fecu
    public final void b(febo feboVar) {
        this.a.b(feboVar, this.b, true);
        super.b(feboVar);
    }
}
