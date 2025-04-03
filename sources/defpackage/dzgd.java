package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.security.KeyPair;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgd implements dzgg {
    private final dzct a;
    private final dzpg b;
    private final String c;
    private final ListenableFuture d;
    private final cgjg e;
    private final cgji f;

    public dzgd(dzpg dzpgVar, dyjf dyjfVar, cgjg cgjgVar, String str, cgji cgjiVar, ListenableFuture listenableFuture) {
        this.a = new dzct(dyjfVar);
        this.b = dzpgVar;
        this.e = cgjgVar;
        this.c = str;
        this.f = cgjiVar;
        this.d = listenableFuture;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(final fcfo fcfoVar) {
        final dzpg dzpgVar = this.b;
        fcek b = dzct.b(dzpgVar);
        final ListenableFuture d = dzct.d();
        final ListenableFuture c = dzct.c(this.f, null, b.d, dzdq.a(fcfoVar.d));
        final ListenableFuture listenableFuture = this.d;
        erqp d2 = erqt.d(d, listenableFuture, c);
        final dzct dzctVar = this.a;
        final String str = this.c;
        return d2.a(new Callable() { // from class: dzcq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fccu fccuVar = (fccu) fccv.a.createBuilder();
                fccuVar.copyOnWrite();
                fccv fccvVar = (fccv) fccuVar.instance;
                fcfo fcfoVar2 = fcfoVar;
                fcfoVar2.getClass();
                fccvVar.c = fcfoVar2;
                fccvVar.b |= 1;
                String e = dzpgVar.e();
                fccuVar.copyOnWrite();
                ((fccv) fccuVar.instance).f = e;
                fccuVar.copyOnWrite();
                ((fccv) fccuVar.instance).e = fgtn.a(2);
                fcbr a = dzct.this.a((String) erqt.q(d), str, (String) erqt.q(c), ((KeyPair) erqt.q(listenableFuture)).getPublic());
                fccuVar.copyOnWrite();
                fccv fccvVar2 = (fccv) fccuVar.instance;
                a.getClass();
                fccvVar2.d = a;
                fccvVar2.b |= 2;
                return (fccv) fccuVar.build();
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fccv fccvVar = (fccv) obj;
        return this.b.b() != dzpf.EMAIL ? erqt.h(new fedn(Status.e)) : erny.g(listenableFuture, new eroh() { // from class: dzgc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return ((fbqa) obj2).d(fccv.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* synthetic */ Object c(Object obj) {
        fccx fccxVar = (fccx) obj;
        if ((fccxVar.b & 4) != 0) {
            try {
                dzix e = dzja.e();
                dzij dzijVar = new dzij();
                dzijVar.e(this.b);
                e.f(dzijVar);
                e.d(fccxVar.d);
                e.e(dziz.VALID);
                dzja a = e.a();
                dzjo a2 = dzjq.a();
                fcdu fcduVar = fccxVar.f;
                if (fcduVar == null) {
                    fcduVar = fcdu.a;
                }
                a2.c(dyhv.a(fcduVar.b.I()));
                a2.d((KeyPair) erqt.q(this.d));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dyhj.a();
                long micros = timeUnit.toMicros(System.currentTimeMillis());
                fcdu fcduVar2 = fccxVar.f;
                if (fcduVar2 == null) {
                    fcduVar2 = fcdu.a;
                }
                ((dzmh) a2).a = Long.valueOf(micros + fcduVar2.c);
                dyhj.a();
                ((dzmh) a2).b = Long.valueOf(System.currentTimeMillis());
                dzjq a3 = a2.a();
                dyqg dyqgVar = new dyqg();
                dyqgVar.c(0);
                dyqgVar.d(a);
                dyqgVar.b(a3);
                return dyqgVar.a();
            } catch (ExecutionException e2) {
                dyhr.d("RegRpcHandler", "KeyPair get was interupted.", e2);
            }
        }
        dyqg dyqgVar2 = new dyqg();
        dyqgVar2.c(1);
        return dyqgVar2.a();
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.b);
        r.p(uuid.toString());
        r.j(3);
        r.m(Integer.valueOf(status.getCode().value()));
        r.f(i);
        r.e(j);
        dyytVar.b(r.a());
    }

    @Override // defpackage.dzgg
    public final /* synthetic */ void e(UUID uuid, Object obj, dyyt dyytVar, long j) {
        dyqu dyquVar = (dyqu) obj;
        if (!dyquVar.c().g()) {
            dzhl r = dzhm.r();
            r.g(10003);
            r.n(this.b);
            r.p(uuid.toString());
            r.j(3);
            r.f(2);
            r.e(j);
            dyytVar.b(r.a());
            return;
        }
        dzhl r2 = dzhm.r();
        r2.g(10003);
        r2.n(((dzii) dyquVar.c().c()).b.f());
        r2.o(((dzii) dyquVar.c().c()).c.E());
        r2.p(uuid.toString());
        r2.j(3);
        r2.f(1);
        r2.e(j);
        dyytVar.b(r2.a());
    }
}
