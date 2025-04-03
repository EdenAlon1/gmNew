package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chxa implements ciin {
    private final chzf b;
    private final chkj c;
    private final errl d;
    private String e = "";
    private long f = 0;
    public final ciih a = new ciih("GDitto");

    public chxa(chzf chzfVar, errl errlVar, chkj chkjVar) {
        this.b = chzfVar;
        this.c = chkjVar;
        this.d = errlVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.f;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.a;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        this.e = fcfoVar.c;
        fcfn fcfnVar = (fcfn) fcfo.a.createBuilder(fcfoVar);
        fcfnVar.copyOnWrite();
        ((fcfo) fcfnVar.instance).e = this.a.a;
        final fcfo fcfoVar2 = (fcfo) fcfnVar.build();
        chze a = this.b.a();
        a.j();
        a.l = chhp.a(this.a.a, fcfoVar2.c);
        return elfr.k(a.b(), new eroh() { // from class: chwz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fcbq fcbqVar = (fcbq) obj;
                if ((((fcbr) fcbqVar.instance).b & 1) == 0) {
                    return elfo.d(new IllegalArgumentException("The DeviceId can't be empty in SignInGaia request."));
                }
                fcfo fcfoVar3 = fcfoVar2;
                chxa chxaVar = chxa.this;
                fccu fccuVar = (fccu) fccv.a.createBuilder();
                fccuVar.copyOnWrite();
                fccv fccvVar = (fccv) fccuVar.instance;
                fcfoVar3.getClass();
                fccvVar.c = fcfoVar3;
                fccvVar.b |= 1;
                fccuVar.copyOnWrite();
                ((fccv) fccuVar.instance).f = chxaVar.a.a;
                fccuVar.copyOnWrite();
                ((fccv) fccuVar.instance).e = fgtn.a(3);
                fccuVar.copyOnWrite();
                fccv fccvVar2 = (fccv) fccuVar.instance;
                fcbr fcbrVar = (fcbr) fcbqVar.build();
                fcbrVar.getClass();
                fccvVar2.d = fcbrVar;
                fccvVar2.b |= 2;
                return elfo.e((fccv) fccuVar.build());
            }
        }, this.d);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        fccv fccvVar = (fccv) eyhsVar;
        fcfo fcfoVar = fccvVar.c;
        if (fcfoVar == null) {
            fcfoVar = fcfo.a;
        }
        this.e = fcfoVar.c;
        return this.c.c(fccvVar);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fccx fccxVar = (fccx) eyhsVar;
        if (fccxVar != null) {
            fcfq fcfqVar = fccxVar.c;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.f = j;
        return elfo.e(fccxVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "LookupGaiaRegistrationRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.e;
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
