package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elgm extends fdze {
    private final SettableFuture a;

    public elgm(fecu fecuVar, ekzz ekzzVar) {
        super(fecuVar);
        SettableFuture create = SettableFuture.create();
        ekzzVar.b(create);
        this.a = create;
    }

    @Override // defpackage.feci, defpackage.fecu
    public final void a(Status status, febo feboVar) {
        super.a(status, feboVar);
        this.a.set(null);
    }
}
