package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evcg implements evew {
    private static final febj a;
    private ListenableFuture b;
    private final evcf c;

    static {
        febf febfVar = febo.c;
        int i = febj.d;
        a = new febe("X-Goog-Spatula", febfVar);
    }

    public evcg(evcf evcfVar) {
        this.c = evcfVar;
    }

    @Override // defpackage.evew
    public final evgb a(eves evesVar) {
        try {
            evesVar.a.g(a, (String) erqt.q(this.b));
            return evgb.a;
        } catch (ExecutionException e) {
            Status.Code code = Status.Code.UNAUTHENTICATED;
            List list = Status.a;
            return evgb.b(code.a().d(e.getCause()).withDescription("Could not retrieve spatula header"), new febo());
        }
    }

    @Override // defpackage.evew
    public final evgb b(eves evesVar) {
        ekzz f = eleg.f("AsyncSpatulaInterceptor#headerFuture");
        try {
            ListenableFuture a2 = duin.a(((dfdt) this.c.a.b()).a());
            f.b(a2);
            this.b = a2;
            evgb c = evgb.c(a2);
            f.close();
            return c;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
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
