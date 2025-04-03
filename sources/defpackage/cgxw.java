package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgxw extends chdj {
    public static final cskc a = cskc.g("BugleNetwork", "GaiaRegistrationProvider");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider");
    public static final Duration c = Duration.ofDays(1);
    public static final Duration d = Duration.ofMinutes(1);
    public final chln e;
    private final emyl f;
    private final chkj g;
    private final chwf h;
    private final chwi i;
    private final ciih j;

    public cgxw(errl errlVar, errl errlVar2, chrv chrvVar, chga chgaVar, cqoh cqohVar, Optional optional, final chxr chxrVar, chwi chwiVar, chwf chwfVar, final ciih ciihVar, final chkj chkjVar, chln chlnVar) {
        super(errlVar, errlVar2, chrvVar, cqohVar, chgaVar, optional);
        this.g = chkjVar;
        this.e = chlnVar;
        this.f = emys.a(new emyl() { // from class: cgxl
            @Override // defpackage.emyl
            public final Object get() {
                cskc cskcVar = cgxw.a;
                chxr chxrVar2 = chxr.this;
                ffbr ffbrVar = chxrVar2.a;
                Optional of = Optional.of(chkjVar);
                chzf chzfVar = (chzf) ffbrVar.b();
                chzfVar.getClass();
                cgcu cgcuVar = (cgcu) chxrVar2.b.b();
                cgcuVar.getClass();
                errl errlVar3 = (errl) chxrVar2.c.b();
                errlVar3.getClass();
                chwa chwaVar = (chwa) chxrVar2.d.b();
                chwaVar.getClass();
                aslr aslrVar = (aslr) chxrVar2.e.b();
                aslrVar.getClass();
                return new chxq(chzfVar, cgcuVar, errlVar3, of, chwaVar, aslrVar, ciihVar);
            }
        });
        this.i = chwiVar;
        this.h = chwfVar;
        this.j = ciihVar;
    }

    @Override // defpackage.chdj
    protected final chye a(long j) {
        final chln chlnVar = this.e;
        Supplier supplier = new Supplier() { // from class: cgxj
            @Override // java.util.function.Supplier
            public final Object get() {
                return chln.this.a();
            }
        };
        chwf chwfVar = this.h;
        ffbr ffbrVar = chwfVar.a;
        Optional of = Optional.of(this.g);
        cqoh cqohVar = (cqoh) ffbrVar.b();
        cqohVar.getClass();
        errl errlVar = (errl) chwfVar.b.b();
        errlVar.getClass();
        chzf chzfVar = (chzf) chwfVar.c.b();
        chzfVar.getClass();
        chwa chwaVar = (chwa) chwfVar.d.b();
        chwaVar.getClass();
        aslr aslrVar = (aslr) chwfVar.e.b();
        aslrVar.getClass();
        return new chwe(cqohVar, errlVar, chzfVar, chwaVar, aslrVar, supplier, of, j, this.j, this.e);
    }

    @Override // defpackage.chdj
    protected final /* synthetic */ ciil b() {
        return this.j;
    }

    @Override // defpackage.chdj
    public final synchronized elfl c() {
        ensk h = b.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "clearRegistration", 259, "GaiaRegistrationProvider.java")).q("Clear gaia registration");
        return elfo.m(h(0L), n(eyee.b), g(new byte[0])).a(new Callable() { // from class: cgxi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cskc cskcVar = cgxw.a;
                return null;
            }
        }, this.q);
    }

    @Override // defpackage.chdj
    protected final elfl d() {
        ensk e = b.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "doFirstTimeTachyonRegistration", 217, "GaiaRegistrationProvider.java")).q("doing first time GAIA tachyon registration");
        return m().i(new eroh() { // from class: cgxm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fccx fccxVar = (fccx) obj;
                ensk e2 = cgxw.b.e();
                e2.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "doFirstTimeTachyonRegistration", 221, "GaiaRegistrationProvider.java")).q("Received Tachyon registration");
                if (fccxVar == null) {
                    cgxw.a.n("Tachyon SignInGaiaResponse is null");
                    throw new IllegalArgumentException("Tachyon SignInGaiaResponse is null");
                }
                if ((fccxVar.b & 4) == 0) {
                    cgxw.a.n("Tachyon SignInGaiaResponse has no auth token");
                    throw new IllegalArgumentException("Tachyon SignInGaiaResponse has no auth token");
                }
                final fcdu fcduVar = fccxVar.f;
                if (fcduVar == null) {
                    fcduVar = fcdu.a;
                }
                final cgxw cgxwVar = cgxw.this;
                return cgxwVar.n(fccxVar.d).i(new eroh() { // from class: cgxt
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return cgxw.this.x(fcduVar);
                    }
                }, cgxwVar.q).h(new emwl() { // from class: cgxu
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        cskc cskcVar = cgxw.a;
                        return fcdu.this;
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }

    @Override // defpackage.chdj
    protected final elfl e() {
        return elfl.g(this.e.a());
    }

    @Override // defpackage.chdj
    protected final elfl f() {
        return elfl.g(this.e.b());
    }

    @Override // defpackage.chdj
    protected final elfl g(byte[] bArr) {
        return elfl.g(this.e.d(bArr));
    }

    @Override // defpackage.chdj
    protected final elfl h(long j) {
        long epochMilli = this.t.f().toEpochMilli() - d.toMillis();
        Duration ofMillis = Duration.ofMillis(j - epochMilli);
        Duration duration = c;
        if (ofMillis.compareTo(duration) > 0) {
            j = duration.toMillis() + epochMilli;
        }
        return elfl.g(this.e.e(Long.valueOf(j)));
    }

    @Override // defpackage.chdj
    protected final elfl i(fcbv fcbvVar) {
        fcdu fcduVar = fcbvVar.d;
        if (fcduVar == null) {
            fcduVar = fcdu.a;
        }
        return elfl.g(elfr.d(x(fcduVar), n(fcbvVar.h)).a(new Callable() { // from class: cgxv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cskc cskcVar = cgxw.a;
                return null;
            }
        }, erpp.a));
    }

    @Override // defpackage.cgwn
    public final String j() {
        return this.j.a;
    }

    public final elfl m() {
        final ciin ciinVar = (ciin) this.f.get();
        elfl i = elfl.g(ciinVar.c((fcfo) this.u.a(j()).build())).i(new eroh() { // from class: cgxn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final fccv fccvVar = (fccv) obj;
                csjb c2 = cgxw.a.c();
                c2.I("SignInGaiaRequest");
                fcfo fcfoVar = fccvVar.c;
                if (fcfoVar == null) {
                    fcfoVar = fcfo.a;
                }
                final cgxw cgxwVar = cgxw.this;
                c2.A("RequestId", fcfoVar.c);
                c2.r();
                chmc chmcVar = (chmc) chmd.a.createBuilder();
                fcfo fcfoVar2 = fccvVar.c;
                if (fcfoVar2 == null) {
                    fcfoVar2 = fcfo.a;
                }
                chln chlnVar = cgxwVar.e;
                final ciin ciinVar2 = ciinVar;
                String str = fcfoVar2.c;
                chmcVar.copyOnWrite();
                chmd chmdVar = (chmd) chmcVar.instance;
                str.getClass();
                chmdVar.b = str;
                long epochMilli = cgxwVar.t.f().toEpochMilli();
                chmcVar.copyOnWrite();
                ((chmd) chmcVar.instance).c = epochMilli;
                return chlnVar.g((chmd) chmcVar.build()).i(new eroh() { // from class: cgxk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ciinVar2.d(cgxw.this.s, fccvVar);
                    }
                }, cgxwVar.r);
            }
        }, this.r);
        ciinVar.getClass();
        return i.i(new eroh() { // from class: cgxo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ciin.this.e((fccx) obj);
            }
        }, this.r);
    }

    public final elfl n(eyee eyeeVar) {
        return elfl.g(this.e.c(eyeeVar.E()));
    }

    public final elfl o() {
        ensk h = b.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "unregister", 270, "GaiaRegistrationProvider.java")).q("Doing GAIA tachyon unregistration");
        errl errlVar = (errl) this.i.a.b();
        errlVar.getClass();
        final chwh chwhVar = new chwh(errlVar, this.j, this.g, this.e);
        return elfl.g(chwhVar.c((fcfo) this.u.a(j()).build())).i(new eroh() { // from class: cgxp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fcdk fcdkVar = (fcdk) obj;
                csjb c2 = cgxw.a.c();
                c2.I("UnregisterRequest");
                fcfo fcfoVar = fcdkVar.c;
                if (fcfoVar == null) {
                    fcfoVar = fcfo.a;
                }
                chwh chwhVar2 = chwh.this;
                c2.A("RequestId", fcfoVar.c);
                c2.r();
                return chwhVar2.o(fcdkVar);
            }
        }, this.r).i(new eroh() { // from class: cgxq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cskc cskcVar = cgxw.a;
                return chwh.this.e((fcdm) obj);
            }
        }, this.r).i(new eroh() { // from class: cgxr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cgxw.this.c();
            }
        }, this.q).h(new emwl() { // from class: cgxs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk h2 = cgxw.b.h();
                h2.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/GaiaRegistrationProvider", "unregister", 294, "GaiaRegistrationProvider.java")).q("Tachyon Gaia unregistration completed");
                return null;
            }
        }, erpp.a);
    }
}
