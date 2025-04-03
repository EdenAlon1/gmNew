package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chym implements ciin {
    public final bzgd a;
    public final fcek b;
    private final errl c;
    private String d = "";
    private long e = 0;

    public chym(bzgd bzgdVar, errl errlVar, fcek fcekVar) {
        this.a = bzgdVar;
        this.c = errlVar;
        this.b = fcekVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return ciil.c;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        this.d = fcfoVar.c;
        fccm fccmVar = (fccm) fccn.a.createBuilder();
        fccmVar.copyOnWrite();
        fccn fccnVar = (fccn) fccmVar.instance;
        fcfoVar.getClass();
        fccnVar.c = fcfoVar;
        fccnVar.b |= 1;
        fccmVar.copyOnWrite();
        fccn fccnVar2 = (fccn) fccmVar.instance;
        fccnVar2.d = this.b;
        fccnVar2.b |= 2;
        return erqt.i((fccn) fccmVar.build());
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(final chrv chrvVar, eyhs eyhsVar) {
        final fccn fccnVar = (fccn) eyhsVar;
        return elfo.g(new Callable() { // from class: chyk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                chym chymVar = chym.this;
                return Boolean.valueOf(chymVar.a.u(chymVar.b));
            }
        }, this.c).i(new eroh() { // from class: chyl
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fbpc a = chrv.this.c.a();
                fdxk fdxkVar = a.a;
                febs febsVar = fbpd.c;
                if (febsVar == null) {
                    synchronized (fbpd.class) {
                        febsVar = fbpd.c;
                        if (febsVar == null) {
                            febp a2 = febs.a();
                            a2.c = febr.UNARY;
                            a2.d = febs.c("google.internal.communications.instantmessaging.v1.Pairing", "RevokeRelayPairing");
                            a2.b();
                            fccn fccnVar2 = fccn.a;
                            eyfc eyfcVar = ffag.a;
                            a2.a = new ffae(fccnVar2);
                            a2.b = new ffae(fccp.a);
                            febsVar = a2.a();
                            fbpd.c = febsVar;
                        }
                    }
                }
                return ffat.a(fdxkVar.a(febsVar, a.b), fccnVar);
            }
        }, erpp.a);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fccp fccpVar = (fccp) eyhsVar;
        if (fccpVar != null) {
            fcfq fcfqVar = fccpVar.b;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        csjy.c("BugleNetwork", "Unpaired successfully");
        return elfo.e(fccpVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "RevokeRelayPairingRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.d;
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void h(Throwable th) {
        ciim.c(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void i() {
        ciim.a(this);
    }

    @Override // defpackage.ciin
    public final /* synthetic */ void j() {
        ciim.b(this);
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
