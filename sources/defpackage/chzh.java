package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class chzh implements ciin {
    private final String a;
    private String b = "";
    private long c = 0;

    public chzh(String str) {
        this.a = str;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return new ciii(this.a);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture c(fcfo fcfoVar) {
        fcdf fcdfVar = (fcdf) fcdg.a.createBuilder();
        fcdfVar.copyOnWrite();
        fcdg fcdgVar = (fcdg) fcdfVar.instance;
        fcfoVar.getClass();
        fcdgVar.c = fcfoVar;
        fcdgVar.b |= 1;
        fcdg fcdgVar2 = (fcdg) fcdfVar.build();
        this.b = fcfoVar.c;
        return elfo.e(fcdgVar2);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        fcdg fcdgVar = (fcdg) eyhsVar;
        fbqa a = chrvVar.c().a();
        fdxk fdxkVar = a.a;
        febs febsVar = fbqb.j;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.j;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.UNARY;
                    a2.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "UnregisterGoogleRCS");
                    a2.b();
                    fcdg fcdgVar2 = fcdg.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(fcdgVar2);
                    a2.b = new ffae(fcdi.a);
                    febsVar = a2.a();
                    fbqb.j = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, a.b), fcdgVar));
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fcdi fcdiVar = (fcdi) eyhsVar;
        if (fcdiVar != null) {
            fcfq fcfqVar = fcdiVar.b;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.c = j;
        return elfo.e(fcdiVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "UnregisterGoogleRcsHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.b;
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
