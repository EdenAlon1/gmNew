package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekpl implements evew {
    private ListenableFuture a;

    static {
        febf febfVar = febo.c;
        int i = febj.d;
        new febe("Authorization", febfVar);
        new febe("X-Auth-Time", febo.c);
    }

    @Override // defpackage.evew
    public final evgb a(eves evesVar) {
        try {
            throw null;
        } catch (ExecutionException e) {
            Status.Code code = Status.Code.UNKNOWN;
            List list = Status.a;
            return evgb.b(code.a().d(e.getCause()).withDescription("Could not obtain auth token"), new febo());
        }
    }

    @Override // defpackage.evew
    public final evgb b(eves evesVar) {
        ListenableFuture listenableFuture = (ListenableFuture) evesVar.b.h(ekpe.a);
        if (listenableFuture == null) {
            return evgb.a;
        }
        this.a = listenableFuture;
        return evgb.c(listenableFuture);
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb c() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb e() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.evew
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.evew
    public final /* synthetic */ void d(ever everVar) {
    }
}
