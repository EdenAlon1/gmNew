package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chyv {
    public static final cskc a = cskc.g("BugleNetwork", "TachyonConnectionCheckHandler");
    private static final long i = TimeUnit.SECONDS.toMillis(10);
    public final cqoh b;
    public final chhw c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicInteger e = new AtomicInteger(-1);
    public final AtomicLong f = new AtomicLong(-1);
    final AtomicBoolean g = new AtomicBoolean(true);
    public final chyp h;
    private final errl j;
    private final csjk k;
    private final chga l;

    public chyv(errl errlVar, csjk csjkVar, chga chgaVar, cqoh cqohVar, chhw chhwVar, chyp chypVar) {
        this.j = errlVar;
        this.k = csjkVar;
        this.l = chgaVar;
        this.b = cqohVar;
        this.c = chhwVar;
        this.h = chypVar;
    }

    public final void a() {
        long epochMilli = this.b.f().toEpochMilli();
        if (!this.g.get() && epochMilli - this.f.get() <= i) {
            a.p("Connectivity check is already going on, cancel current one");
            return;
        }
        this.g.set(false);
        elfl h = elfl.g(((csmz) this.k.a()).i()).h(new emwl() { // from class: chyq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chyv chyvVar = chyv.this;
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    chyv.a.r("Internet connectivity check failed");
                    chyvVar.d.set(false);
                    return false;
                }
                chyv.a.p("Internet connectivity check passed");
                chyvVar.d.set(true);
                return true;
            }
        }, this.j);
        fcfo fcfoVar = (fcfo) this.l.a("Bugle").build();
        fbyv fbyvVar = (fbyv) fbyw.a.createBuilder();
        fbyvVar.copyOnWrite();
        fbyw fbywVar = (fbyw) fbyvVar.instance;
        fcfoVar.getClass();
        fbywVar.c = fcfoVar;
        fbywVar.b |= 1;
        fbyw fbywVar2 = (fbyw) fbyvVar.build();
        a.p("Check Tachyon connectivity");
        elfo.k(h, elfl.g(elfo.e(fbywVar2)).i(new eroh() { // from class: chyr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return chyv.this.c.b((fbyw) obj);
            }
        }, this.j).h(new emwl() { // from class: chys
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chyv.a.p("Received EchoResponse");
                chyv.this.e.set(Status.Code.OK.value());
                return fbyy.a;
            }
        }, this.j).e(Throwable.class, new emwl() { // from class: chyt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Status.Code a2 = chfh.a((Throwable) obj);
                csjb e = chyv.a.e();
                e.I("Tachyon connectivity check failed.");
                e.A("ErrorCode", a2);
                e.r();
                chyv.this.e.set(a2.value());
                return fbyy.a;
            }
        }, this.j)).a(new Callable() { // from class: chyu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                chyv chyvVar = chyv.this;
                chyvVar.g.set(true);
                chyvVar.f.set(chyvVar.b.f().toEpochMilli());
                ((bzea) chyvVar.h.a.b()).b(chyvVar.d.get(), chyvVar.e.get());
                return true;
            }
        }, this.j).k(axnw.b(), this.j);
    }
}
