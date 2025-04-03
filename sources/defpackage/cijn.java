package defpackage;

import io.grpc.Status;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cijn extends ceut implements ciji {
    public static final cskc a = cskc.g("BugleJobs", "RetryManagerWorker");
    public final fazb b;
    private final fazb e;
    private final errl f;
    private final errl g;
    public final Object c = new Object();
    private boolean h = false;
    public boolean d = false;

    public cijn(fazb fazbVar, fazb fazbVar2, errl errlVar, errl errlVar2) {
        this.b = fazbVar;
        this.e = fazbVar2;
        this.f = errlVar;
        this.g = errlVar2;
    }

    private final elfl k() {
        a.m("Executing retry job");
        return ((cijh) this.e.b()).c();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        l.f(poa.EXPONENTIAL);
        l.g(TimeUnit.SECONDS.toMillis(((Integer) bzaq.f.e()).intValue()));
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RetryManagerWorkerImpl");
    }

    @Override // defpackage.ciji
    public final void c(Status status, cijo cijoVar) {
        if (status.getCode() == Status.Code.OK) {
            synchronized (this.c) {
                if (this.h) {
                    this.d = false;
                    cskc cskcVar = a;
                    cskcVar.m(String.format("report(%s) canceling retry on RPC success", "ONE_OFF"));
                    this.h = false;
                    cskcVar.m("Canceling previously scheduled RetryManagerWorker.");
                    elfo.g(new Callable() { // from class: cijl
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ((cevh) cijn.this.b.b()).f("retry_manager");
                            return true;
                        }
                    }, this.g).k(axou.a(new cijm()), this.f);
                    k();
                }
            }
            return;
        }
        if (!chfh.c(status.getCode())) {
            cijoVar.l();
            a.m(a.C(status, "report(ONE_OFF) ignoring non-retriable error "));
            return;
        }
        cijoVar.k();
        synchronized (this.c) {
            if (this.h) {
                this.d = true;
                a.m(String.format("report(%s) retry scheduled already, setting pendingRetry bit for error %s", "ONE_OFF", status));
            } else {
                if (status != null) {
                    Throwable th = status.t;
                    if ((th instanceof NetworkException) && ((NetworkException) th).immediatelyRetryable()) {
                        a.m(String.format("report(%s) retrying immediately for error %s", "ONE_OFF", status));
                        k();
                    }
                }
                cskc cskcVar2 = a;
                cskcVar2.m(String.format("report(%s) scheduling retry for error %s", "ONE_OFF", status));
                this.h = true;
                cskcVar2.m("Scheduling RetryManagerWorker.");
                ((cevh) this.b.b()).a(ceyr.f("retry_manager"));
            }
        }
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        a.m("Retrying...");
        return k().h(new emwl() { // from class: cijj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cijn cijnVar = cijn.this;
                synchronized (cijnVar.c) {
                    if (!cijnVar.d) {
                        return ceyt.i();
                    }
                    cijnVar.d = false;
                    cijn.a.r("Reschedule the retry");
                    return ceyt.m();
                }
            }
        }, this.f).e(fedn.class, new emwl() { // from class: cijk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fedn fednVar = (fedn) obj;
                if (chfh.d(fednVar)) {
                    csjb e = cijn.a.e();
                    e.I("Failing Ditto retry worker with retriable gRPC error");
                    e.A("status", fednVar.a);
                    e.r();
                    return ceyt.m();
                }
                csjb e2 = cijn.a.e();
                e2.I("Failing Ditto retry worker with non-retriable gRPC error");
                e2.A("status", fednVar.a);
                e2.r();
                return ceyt.k();
            }
        }, erpp.a);
    }
}
