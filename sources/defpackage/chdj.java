package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class chdj implements cgwn {
    public static final cskc p = cskc.g("BugleNetwork", "RegistrationProvider");
    public final errl q;
    protected final errl r;
    protected final chrv s;
    protected final cqoh t;
    protected final chga u;
    protected final Optional v;
    public elfl w;

    public chdj(errl errlVar, errl errlVar2, chrv chrvVar, cqoh cqohVar, chga chgaVar, Optional optional) {
        this.q = errlVar;
        this.r = errlVar2;
        this.s = chrvVar;
        this.t = cqohVar;
        this.u = chgaVar;
        this.v = optional;
    }

    static final void y(fcfi fcfiVar) {
        fgtm b = fgtm.b(fcfiVar.b);
        if (b == null) {
            b = fgtm.UNRECOGNIZED;
        }
        if (b.equals(fgtm.UNKNOWN)) {
            return;
        }
        csjb e = p.e();
        e.I("Received warning during tachyon registration: ");
        fgtm b2 = fgtm.b(fcfiVar.b);
        if (b2 == null) {
            b2 = fgtm.UNRECOGNIZED;
        }
        e.I(b2);
        e.r();
    }

    protected abstract chye a(long j);

    protected abstract ciil b();

    public abstract elfl c();

    protected abstract elfl d();

    protected abstract elfl e();

    protected abstract elfl f();

    protected abstract elfl g(byte[] bArr);

    protected abstract elfl h(long j);

    protected abstract elfl i(fcbv fcbvVar);

    @Override // defpackage.cgwn
    public final elfl k() {
        return l(cgwm.CACHE_ALLOWED);
    }

    @Override // defpackage.cgwn
    public final elfl l(final cgwm cgwmVar) {
        ekzz f = eleg.f("RegistrationProvider#getAuthToken");
        try {
            elfl i = (cgwmVar.d ? elfo.e(null) : h(0L)).i(new eroh() { // from class: chcu
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return chdj.this.t(cgwmVar.e);
                }
            }, erpp.a);
            f.b(i);
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final synchronized elfl s() {
        return t(true);
    }

    public final synchronized elfl t(final boolean z) {
        if (this.w != null) {
            p.p("returning already existing registration future");
            return this.w;
        }
        p.p("Getting Tachyon registration");
        final elfl f = e().i(new eroh() { // from class: chcr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return chdj.this.z((byte[]) obj);
            }
        }, this.r).i(new eroh() { // from class: chcs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final chdj chdjVar = chdj.this;
                final byte[] bArr = (byte[]) obj;
                final boolean z2 = z;
                return (bArr == null || bArr.length == 0) ? !z2 ? elfo.d(new fedn(Status.g.d(new IllegalStateException("No registration and not allowed to re-register")))) : chdjVar.d() : chdjVar.f().i(new eroh() { // from class: chcv
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        Long l = (Long) obj2;
                        long longValue = l == null ? 0L : l.longValue();
                        chdj chdjVar2 = chdj.this;
                        if (longValue - ((Long) cgyj.b.e()).longValue() < chdjVar2.t.f().toEpochMilli()) {
                            return chdjVar2.v(0L, z2);
                        }
                        byte[] bArr2 = bArr;
                        chdj.p.q("using immediateFuture based on stored tachyon registration");
                        fcdt fcdtVar = (fcdt) fcdu.a.createBuilder();
                        eyee x = eyee.x(bArr2);
                        fcdtVar.copyOnWrite();
                        ((fcdu) fcdtVar.instance).b = x;
                        return elfo.e((fcdu) fcdtVar.build());
                    }
                }, erpp.a);
            }
        }, erpp.a).f(Throwable.class, new eroh() { // from class: chcp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Throwable th = (Throwable) obj;
                chdj.p.s("Failed to register with Tachyon", th);
                if (th instanceof fedn) {
                    fgtr b = chfh.b(th);
                    Status.Code a = chfh.a(th);
                    if (b == fgtr.DASHER_ACCOUNT_RESTRICTED) {
                        csjb e = chdj.p.e();
                        e.I("Got Dasher account restricted error in StatusRuntimeException");
                        e.A("error", b);
                        e.A("status", a);
                        e.s(th);
                        return elfo.d(new chdh(th));
                    }
                    if (b == fgtr.UNICORN_ACCOUNT_RESTRICTED) {
                        csjb e2 = chdj.p.e();
                        e2.I("Got Unicorn account restricted error in StatusRuntimeException");
                        e2.A("error", b);
                        e2.A("status", a);
                        e2.s(th);
                        return elfo.d(new chdi(th));
                    }
                    chdj chdjVar = chdj.this;
                    if (chdjVar.v.isPresent()) {
                        csjb e3 = chdj.p.e();
                        e3.I("Got error in StatusRuntimeException. Notifying tachyon registration error listeners");
                        e3.A("error", b);
                        e3.A("status", a);
                        e3.s(th);
                        ciil b2 = chdjVar.b();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((Set) chdjVar.v.get()).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((cijf) it.next()).d(b2, b));
                        }
                        return elfo.j(arrayList).b(new erog() { // from class: chde
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                return elfo.d(th);
                            }
                        }, erpp.a);
                    }
                }
                return elfo.d(th);
            }
        }, erpp.a);
        return elfj.e(new eros() { // from class: chcy
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                chdj chdjVar = chdj.this;
                elfl elflVar = f;
                synchronized (chdjVar) {
                    chdjVar.w = elflVar;
                }
                erpcVar.a(new chdg(chdjVar), chdjVar.r);
                return elfj.c(elflVar).a;
            }
        }, erpp.a).h();
    }

    public final elfl u() {
        return elfl.g(e()).h(new emwl() { // from class: chcx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                byte[] bArr = (byte[]) obj;
                boolean z = false;
                if (bArr != null && bArr.length != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, erpp.a);
    }

    public final elfl v(final long j, final boolean z) {
        ekzz f = eleg.f("RegistrationProvider#refreshTachyonRegistration");
        try {
            cskc cskcVar = p;
            cskcVar.m("starting refresh of tachyon registration");
            final chye a = a(j);
            fcfo fcfoVar = (fcfo) this.u.a(j()).build();
            csjb c = cskcVar.c();
            c.A("RefreshRequestId", fcfoVar.c);
            c.r();
            elfl f2 = elfl.g(a.c(fcfoVar)).i(new eroh() { // from class: chcz
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return a.d(chdj.this.s, (fcbt) obj);
                }
            }, this.q).i(new eroh() { // from class: chda
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return chye.this.e((fcbv) obj);
                }
            }, this.q).i(new eroh() { // from class: chdb
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final fcbv fcbvVar = (fcbv) obj;
                    chdj.p.p("Received Tachyon registration refresh token");
                    if (fcbvVar == null) {
                        chdj.p.n("Tachyon register refresh response was null");
                        return elfo.d(new IllegalArgumentException("Tachyon register refresh response was null"));
                    }
                    chdj chdjVar = chdj.this;
                    if ((fcbvVar.b & 8) != 0) {
                        fcfi fcfiVar = fcbvVar.g;
                        if (fcfiVar == null) {
                            fcfiVar = fcfi.a;
                        }
                        chdj.y(fcfiVar);
                    }
                    if ((fcbvVar.b & 2) != 0) {
                        return elfl.g(chdjVar.i(fcbvVar)).h(new emwl() { // from class: chcq
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                fcdu fcduVar = fcbv.this.d;
                                return fcduVar == null ? fcdu.a : fcduVar;
                            }
                        }, erpp.a);
                    }
                    chdj.p.r("Tachyon register refresh response has no auth token");
                    if (!fcbvVar.e || fcbvVar.f == 0 || j != 0) {
                        return elfo.d(new IllegalArgumentException("Tachyon register refresh response has no auth token"));
                    }
                    boolean z2 = z;
                    csjb c2 = chdj.p.c();
                    c2.I("Retrying RegisterRefresh with server timestamp");
                    c2.z("timestamp", fcbvVar.f);
                    c2.r();
                    return chdjVar.v(fcbvVar.f, z2);
                }
            }, erpp.a).f(fedn.class, new eroh() { // from class: chdc
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    fedn fednVar = (fedn) obj;
                    fgtr b = chfh.b(fednVar);
                    Status.Code a2 = chfh.a(fednVar);
                    csjb e = chdj.p.e();
                    e.I("Got StatusRuntimeException for RegisterRefresh");
                    e.A("error", b.name());
                    e.A("status", a2);
                    e.A("exception", fednVar);
                    e.r();
                    if (b != fgtr.REGISTRATION_NOT_FOUND && b != fgtr.REGISTRATION_UNAUTHENTICATED && b != fgtr.GAIA_ID_MISMATCH) {
                        throw fednVar;
                    }
                    boolean z2 = z;
                    chdj chdjVar = chdj.this;
                    if (!z2) {
                        return chdjVar.c().i(new eroh() { // from class: chdd
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return elfo.d(new fedn(Status.j.d(new IllegalStateException("Refresh failed and not allowed to re-register"))));
                            }
                        }, erpp.a);
                    }
                    chdj.p.p("Handle non-retriable RegisterRefresh error by re-registering");
                    return chdjVar.d();
                }
            }, erpp.a);
            f.b(f2);
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final synchronized elfl w() {
        p.p("Refresh Tachyon Registration Now");
        return u().i(new eroh() { // from class: chct
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return chdj.this.l(cgwm.FORCE_REFRESH).h(new emwl() { // from class: chdf
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, erpp.a);
                }
                chdj.p.p("Tachyon registration token is null, ignore immediate refresh");
                return elfo.e(null);
            }
        }, erpp.a);
    }

    final elfl x(fcdu fcduVar) {
        p.m("Storing Tachyon auth token");
        return elfl.g(elfr.d(g(fcduVar.b.I()), h(this.t.f().toEpochMilli() + TimeUnit.MICROSECONDS.toMillis(fcduVar.c))).a(new Callable() { // from class: chcw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, erpp.a));
    }

    protected elfl z(byte[] bArr) {
        return elfo.e(bArr);
    }
}
