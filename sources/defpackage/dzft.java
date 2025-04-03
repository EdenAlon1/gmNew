package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.security.KeyPair;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzft implements dzgg {
    private final dzja a;
    private final dzct b;
    private final String c;
    private final KeyPair d;
    private final long e;
    private final cgjg f;

    public dzft(dzja dzjaVar, dyjf dyjfVar, cgjg cgjgVar, String str, KeyPair keyPair, long j) {
        this.a = dzjaVar;
        this.b = new dzct(dyjfVar);
        this.f = cgjgVar;
        this.c = str;
        this.d = keyPair;
        this.e = j;
    }

    @Override // defpackage.dzgg
    public final ListenableFuture a(final fcfo fcfoVar) {
        final fcek b = dzct.b(this.a.c().f());
        final ListenableFuture d = dzct.d();
        erqp d2 = erqt.d(d);
        final dzct dzctVar = this.b;
        final long j = this.e;
        final KeyPair keyPair = this.d;
        final String str = this.c;
        return d2.a(new Callable() { // from class: dzcp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fcfo fcfoVar2 = fcfoVar;
                String uuid = dzdq.a(fcfoVar2.d).toString();
                Locale locale = Locale.US;
                String lowerCase = uuid.toLowerCase(Locale.US);
                long j2 = j;
                String format = String.format(locale, "%s:%d", lowerCase, Long.valueOf(j2));
                KeyPair keyPair2 = keyPair;
                eyee a = dyjg.a(format, keyPair2);
                fcbs fcbsVar = (fcbs) fcbt.a.createBuilder();
                fcbsVar.copyOnWrite();
                ((fcbt) fcbsVar.instance).e = j2;
                fcbsVar.copyOnWrite();
                fcbt fcbtVar = (fcbt) fcbsVar.instance;
                fcfoVar2.getClass();
                fcbtVar.c = fcfoVar2;
                fcbtVar.b |= 1;
                fcbsVar.copyOnWrite();
                fcbt fcbtVar2 = (fcbt) fcbsVar.instance;
                fcek fcekVar = b;
                fcekVar.getClass();
                fcbtVar2.d = fcekVar;
                fcbtVar2.b |= 2;
                fcbr a2 = dzct.this.a((String) erqt.q(d), str, null, keyPair2.getPublic());
                fcbsVar.copyOnWrite();
                fcbt fcbtVar3 = (fcbt) fcbsVar.instance;
                a2.getClass();
                fcbtVar3.h = a2;
                fcbtVar3.b |= 4;
                if (a == null) {
                    return (fcbt) fcbsVar.build();
                }
                fcbsVar.copyOnWrite();
                ((fcbt) fcbsVar.instance).f = 2;
                fcbsVar.copyOnWrite();
                ((fcbt) fcbsVar.instance).g = a;
                return (fcbt) fcbsVar.build();
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final fcbt fcbtVar = (fcbt) obj;
        return erny.g(listenableFuture, new eroh() { // from class: dzfs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return ((fbqa) obj2).c(fcbt.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dzgg
    public final /* synthetic */ Object c(Object obj) {
        fcbv fcbvVar = (fcbv) obj;
        if ((fcbvVar.b & 2) == 0) {
            if (!fcbvVar.e) {
                dyqr e = dyqs.e();
                ((dyqe) e).d = 3;
                return e.a();
            }
            dyhr.a("RegRefreshRpcHandler", "RegisterRefreshResponse: retry with server timestamp");
            dyqr e2 = dyqs.e();
            dyqe dyqeVar = (dyqe) e2;
            dyqeVar.d = 4;
            dyqeVar.c = emxc.j(Long.valueOf(fcbvVar.f));
            return e2.a();
        }
        dzix e3 = dzja.e();
        dzij dzijVar = new dzij();
        dzijVar.e(this.a.c().f());
        e3.f(dzijVar);
        e3.d(fcbvVar.h);
        e3.e(dziz.VALID);
        dzja a = e3.a();
        dzjo a2 = dzjq.a();
        fcdu fcduVar = fcbvVar.d;
        if (fcduVar == null) {
            fcduVar = fcdu.a;
        }
        a2.c(dyhv.a(fcduVar.b.I()));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dyhj.a();
        long micros = timeUnit.toMicros(System.currentTimeMillis());
        fcdu fcduVar2 = fcbvVar.d;
        if (fcduVar2 == null) {
            fcduVar2 = fcdu.a;
        }
        Long valueOf = Long.valueOf(micros + fcduVar2.c);
        dzmh dzmhVar = (dzmh) a2;
        dzmhVar.a = valueOf;
        dyhj.a();
        dzmhVar.b = Long.valueOf(System.currentTimeMillis());
        a2.d(this.d);
        dzjq a3 = a2.a();
        dyqr e4 = dyqs.e();
        dyqe dyqeVar2 = (dyqe) e4;
        dyqeVar2.d = 2;
        dyqeVar2.a = emxc.j(a);
        dyqeVar2.b = emxc.j(a3);
        return e4.a();
    }

    @Override // defpackage.dzgg
    public final void d(UUID uuid, int i, Status status, dyyt dyytVar, long j) {
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(this.a.c().f());
        r.o(this.a.d().E());
        r.p(uuid.toString());
        r.j(1);
        r.m(Integer.valueOf(status.getCode().value()));
        r.f(i);
        r.e(j);
        dyytVar.b(r.a());
    }

    @Override // defpackage.dzgg
    public final /* synthetic */ void e(UUID uuid, Object obj, dyyt dyytVar, long j) {
        dyqs dyqsVar = (dyqs) obj;
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(((dzii) dyqsVar.a().c()).b.f());
        r.o(((dzii) dyqsVar.a().c()).c.E());
        r.p(uuid.toString());
        r.e(j);
        if (dyqsVar.d() == 2 && dyqsVar.a().g()) {
            r.j(1);
            r.f(1);
            dyytVar.b(r.a());
        } else if (dyqsVar.d() == 4) {
            r.j(1);
            r.f(3);
            dyytVar.b(r.a());
        } else {
            r.n(this.a.c().f());
            r.o(this.a.d().E());
            r.j(1);
            r.f(2);
            dyytVar.b(r.a());
        }
    }
}
