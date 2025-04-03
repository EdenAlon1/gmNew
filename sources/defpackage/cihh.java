package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cihh implements cigx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl");
    public final Object b = new Object();
    public final errl c;
    public final ffbr d;
    public final ciio e;
    public final cgwn f;
    public final String g;
    public elfl h;
    public boolean i;
    private final chhw j;
    private final chga k;
    private final boolean l;

    public cihh(chga chgaVar, errl errlVar, ffbr ffbrVar, ciio ciioVar, chhw chhwVar, cgwn cgwnVar, boolean z, String str) {
        this.j = chhwVar;
        this.k = chgaVar;
        this.d = ffbrVar;
        this.c = errlVar;
        this.e = ciioVar;
        this.f = cgwnVar;
        this.l = z;
        this.g = str;
    }

    @Override // defpackage.cigx
    public final elfl a() {
        ekzz f = eleg.f("PullHandlerImpl::pullMessages");
        try {
            elfl i = this.f.k().i(new cihd(this), this.c);
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

    @Override // defpackage.cigx
    public final elfl b(cgwm cgwmVar) {
        ekzz f = eleg.f("PullHandlerImpl::pullMessages");
        try {
            elfl i = this.f.l(cgwmVar).i(new cihd(this), this.c);
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

    public final elfl c(fcdu fcduVar) {
        synchronized (this.b) {
            if (this.h != null) {
                ensk h = a.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", 111, "PullHandlerImpl.java")).q("Pull in progress. Will issue another PullMessages when the current one completes");
                this.i = true;
                return elfo.e(null);
            }
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", 116, "PullHandlerImpl.java")).q("Issuing a new PullMessages RPC");
            this.i = false;
            String j = this.f.j();
            fcfn b = this.l ? this.k.b(j) : this.k.a(j);
            eyee eyeeVar = fcduVar.b;
            b.copyOnWrite();
            fcfo fcfoVar = (fcfo) b.instance;
            fcfo fcfoVar2 = fcfo.a;
            eyeeVar.getClass();
            fcfoVar.f = eyeeVar;
            fcao fcaoVar = (fcao) fcap.a.createBuilder();
            fcaoVar.copyOnWrite();
            fcap fcapVar = (fcap) fcaoVar.instance;
            fcfo fcfoVar3 = (fcfo) b.build();
            fcfoVar3.getClass();
            fcapVar.c = fcfoVar3;
            fcapVar.b |= 1;
            final elfl f = this.j.c((fcap) fcaoVar.build()).i(new eroh() { // from class: cigy
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    fcar fcarVar = (fcar) obj;
                    ensk h3 = cihh.a.h();
                    h3.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "handlePullResponse", 189, "PullHandlerImpl.java")).x("Pull completed, messagecount: %d, pulledAll: %s", fcarVar.b.size(), fcarVar.c);
                    cihh cihhVar = cihh.this;
                    synchronized (cihhVar.b) {
                        if (!fcarVar.c) {
                            cihhVar.i = true;
                        }
                    }
                    ArrayList arrayList = new ArrayList(fcarVar.b.size());
                    for (fbzt fbztVar : fcarVar.b) {
                        cimr cimrVar = (cimr) cihhVar.d.b();
                        fbzs b2 = fbzs.b(fbztVar.d);
                        if (b2 == null) {
                            b2 = fbzs.UNRECOGNIZED;
                        }
                        if (b2 == fbzs.TACHYGRAM_MESSAGE) {
                            bdhg a2 = bdhg.a(fbztVar.c);
                            fgkd fgkdVar = (fgkd) fgki.a.createBuilder();
                            fjay a3 = cslr.a();
                            fgkdVar.copyOnWrite();
                            fgki fgkiVar = (fgki) fgkdVar.instance;
                            a3.getClass();
                            fgkiVar.c = a3;
                            fgkiVar.b |= 1;
                            fgkdVar.copyOnWrite();
                            ((fgki) fgkdVar.instance).e = fgkh.a(9);
                            fgkdVar.copyOnWrite();
                            ((fgki) fgkdVar.instance).g = fgkg.a(49);
                            fgkb fgkbVar = (fgkb) fgkc.a.createBuilder();
                            fgkbVar.a(fbztVar.c);
                            fgkc fgkcVar = (fgkc) fgkbVar.build();
                            fgkdVar.copyOnWrite();
                            fgki fgkiVar2 = (fgki) fgkdVar.instance;
                            fgkcVar.getClass();
                            fgkiVar2.d = fgkcVar;
                            fgkiVar2.b |= 2;
                            cimrVar.b(a2, fgkdVar);
                        }
                        arrayList.add(cihhVar.e.a(fbztVar));
                    }
                    return elfo.j(arrayList).a(new Callable() { // from class: cihf
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    }, erpp.a);
                }
            }, this.c).f(Throwable.class, new eroh() { // from class: cigz
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Throwable th = (Throwable) obj;
                    ensk j2 = cihh.a.j();
                    j2.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) ((enrr) j2).g(th)).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", (char) 133, "PullHandlerImpl.java")).q("Failure calling pull messages or handling results");
                    return elfo.d(th);
                }
            }, this.c);
            return elfj.e(new eros() { // from class: ciha
                @Override // defpackage.eros
                public final erph a(erpc erpcVar) {
                    cihh cihhVar = cihh.this;
                    elfl elflVar = f;
                    synchronized (cihhVar.b) {
                        cihhVar.h = elflVar;
                    }
                    erpcVar.a(new cihg(cihhVar, elflVar), cihhVar.c);
                    return elfj.c(elflVar).a;
                }
            }, erpp.a).h().i(new eroh() { // from class: cihb
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final cihh cihhVar = cihh.this;
                    synchronized (cihhVar.b) {
                        cihhVar.h = null;
                        if (!cihhVar.i) {
                            return elfo.e(null);
                        }
                        ensk h3 = cihh.a.h();
                        h3.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/handler/pullhandler/PullHandlerImpl", "pullMessagesInternal", 178, "PullHandlerImpl.java")).q("Perform pullMessages again at the end of the previous pullMessages call.");
                        return cihhVar.f.k().i(new eroh() { // from class: cihc
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return cihh.this.c((fcdu) obj2);
                            }
                        }, cihhVar.c);
                    }
                }
            }, this.c);
        }
    }
}
