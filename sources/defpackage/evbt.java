package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evbt implements evew {
    public static final fdxi a = new fdxi("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", false);
    private static final febj b;
    private static final febj c;
    private final emxc d;
    private final enhk e;
    private ListenableFuture f;
    private evew g;

    static {
        febf febfVar = febo.c;
        int i = febj.d;
        b = new febe("Authorization", febfVar);
        c = new febe("X-Auth-Time", febo.c);
    }

    public evbt(emxc emxcVar, enhk enhkVar) {
        this.d = emxcVar;
        this.e = enhkVar;
    }

    @Override // defpackage.evew
    public final evgb a(eves evesVar) {
        evew evewVar = this.g;
        if (evewVar != null) {
            return evewVar.a(evesVar);
        }
        try {
            evbw evbwVar = (evbw) erqt.q(this.f);
            febo feboVar = evesVar.a;
            febj febjVar = b;
            emxf.m(!feboVar.h(febjVar), "Already attached auth token");
            evesVar.a.g(febjVar, a.t(evbwVar.a, "Bearer "));
            evesVar.a.g(c, Long.toString(evbwVar.b));
            return evgb.a;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof evbv)) {
                return evgb.b(Status.c(cause), new febo());
            }
            Status.Code code = Status.Code.UNAUTHENTICATED;
            List list = Status.a;
            return evgb.b(code.a().d(cause.getCause()), new febo());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.evew
    public final evgb b(final eves evesVar) {
        final evbr evbrVar = (evbr) evesVar.b.h(evbr.a);
        evbrVar.getClass();
        if (this.e.containsKey(evbrVar.b())) {
            evcb evcbVar = (evcb) this.e.get(evbrVar.b());
            emxc emxcVar = evcbVar.c;
            emxc emxcVar2 = evcbVar.b;
            evcg evcgVar = new evcg((evcf) ((emxn) evcbVar.b).a);
            this.g = evcgVar;
            return evcgVar.b(evesVar);
        }
        boolean z = false;
        if (!evbrVar.b().equals("incognito") && !evbrVar.b().equals("pseudonymous")) {
            z = true;
        }
        emxf.m(z, "Used non-google account without enabling API Key fallback");
        final evbu l = ((euzw) evesVar.b.h(euzx.a)).l();
        final Set c2 = this.d.g() ? this.d.c() : ((evbk) evesVar.b.h(evbk.a)).b();
        ekzz f = eleg.f("AuthContextInterceptor#tokenFuture");
        try {
            errj errjVar = new errj(eldl.m(new Callable() { // from class: evbs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean booleanValue = ((Boolean) eves.this.b.h(evbt.a)).booleanValue();
                    evbu evbuVar = l;
                    evbr evbrVar2 = evbrVar;
                    Set set = c2;
                    return booleanValue ? evbuVar.a(evbrVar2, set) : evbuVar.b(evbrVar2, set);
                }
            }));
            f.b(errjVar);
            ((euzw) evesVar.b.h(euzx.a)).o().execute(errjVar);
            this.f = errjVar;
            evgb c3 = evgb.c(errjVar);
            f.close();
            return c3;
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
