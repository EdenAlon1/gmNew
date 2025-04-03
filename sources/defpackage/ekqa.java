package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekqa implements evew {
    final /* synthetic */ ekqe a;
    final /* synthetic */ eisx b;
    private ListenableFuture c;

    public ekqa(ekqe ekqeVar, eisx eisxVar) {
        this.a = ekqeVar;
        this.b = eisxVar;
    }

    @Override // defpackage.evew
    public final evgb a(eves evesVar) {
        try {
            return new evgb(1, null, null, evesVar.b.f(evbr.a, (evbr) erqt.q(this.c)));
        } catch (ExecutionException e) {
            Status.Code code = Status.Code.UNAUTHENTICATED;
            List list = Status.a;
            return evgb.b(code.a().d(e).withDescription("Cannot get auth token for account id: ".concat(String.valueOf(String.valueOf(this.b)))), new febo());
        }
    }

    @Override // defpackage.evew
    public final evgb b(eves evesVar) {
        emxf.m(evesVar.b.h(evbr.a) == null, "xrpc AuthContext should not be set on a TikTok RPC stub");
        ListenableFuture c = this.a.a.c();
        this.c = c;
        return evgb.c(c);
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
