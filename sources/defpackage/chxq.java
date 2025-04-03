package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chxq implements ciin {
    public final Optional a;
    private final chzf b;
    private final cgcu c;
    private final errl d;
    private String e = "";
    private long f = 0;
    private final aslr g;
    private final ciih h;
    private final chwa i;

    public chxq(chzf chzfVar, cgcu cgcuVar, errl errlVar, Optional optional, chwa chwaVar, aslr aslrVar, ciih ciihVar) {
        this.b = chzfVar;
        this.a = optional;
        this.c = cgcuVar;
        this.d = errlVar;
        this.g = aslrVar;
        this.h = ciihVar;
        this.i = chwaVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.f;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.h;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        ListenableFuture b;
        elfl c;
        String str = this.h.a;
        if (!this.c.a() && !str.equals("CMS")) {
            this.e = fcfoVar.c;
            fcfn fcfnVar = (fcfn) fcfo.a.createBuilder(fcfoVar);
            ciih ciihVar = this.h;
            fcfnVar.copyOnWrite();
            ((fcfo) fcfnVar.instance).e = ciihVar.a;
            final fcfo fcfoVar2 = (fcfo) fcfnVar.build();
            chze a = this.b.a();
            a.j();
            ciih ciihVar2 = this.h;
            a.l = chhp.a(ciihVar2.a, fcfoVar2.c);
            return elfr.k(a.b(), new eroh() { // from class: chxm
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return chxq.this.m((fcbq) obj, fcfoVar2);
                }
            }, erpp.a);
        }
        this.e = fcfoVar.c;
        fcfn fcfnVar2 = (fcfn) fcfo.a.createBuilder(fcfoVar);
        fcfnVar2.copyOnWrite();
        ((fcfo) fcfnVar2.instance).e = str;
        final fcfo fcfoVar3 = (fcfo) fcfnVar2.build();
        final chze a2 = this.b.a();
        a2.j();
        a2.l = chhp.a(str, fcfoVar3.c);
        if (str.equals("GDitto")) {
            chwa chwaVar = this.i;
            c = axol.c(chwaVar.a, ffhe.a, ffsm.a, new chvx(chwaVar, null));
            b = c.i(new eroh() { // from class: chxn
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    chze chzeVar = chze.this;
                    chzeVar.n = (eyee) obj;
                    return chzeVar.b();
                }
            }, this.d);
        } else if (!str.equals("CMS")) {
            b = a2.b();
        } else if (this.g.a()) {
            b = this.i.a().i(new eroh() { // from class: chxo
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    chze chzeVar = chze.this;
                    chzeVar.n = (eyee) obj;
                    return chzeVar.b();
                }
            }, this.d);
        } else {
            a2.n = eyee.b;
            b = a2.b();
        }
        return elfr.k(b, new eroh() { // from class: chxp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return chxq.this.m((fcbq) obj, fcfoVar3);
            }
        }, this.d);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [chkj, java.lang.Object] */
    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        fccv fccvVar = (fccv) eyhsVar;
        fcfo fcfoVar = fccvVar.c;
        if (fcfoVar == null) {
            fcfoVar = fcfo.a;
        }
        this.e = fcfoVar.c;
        this.a.isPresent();
        return this.a.get().c(fccvVar);
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
        return "RegisterGaiaRpcHandler";
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

    public final elfl m(fcbq fcbqVar, fcfo fcfoVar) {
        if ((((fcbr) fcbqVar.instance).b & 1) == 0) {
            return elfo.d(new cgyc());
        }
        fccu fccuVar = (fccu) fccv.a.createBuilder();
        fccuVar.copyOnWrite();
        fccv fccvVar = (fccv) fccuVar.instance;
        fcfoVar.getClass();
        fccvVar.c = fcfoVar;
        fccvVar.b |= 1;
        ciih ciihVar = this.h;
        fccuVar.copyOnWrite();
        ((fccv) fccuVar.instance).f = ciihVar.a;
        fccuVar.copyOnWrite();
        ((fccv) fccuVar.instance).e = fgtn.a(2);
        fccuVar.copyOnWrite();
        fccv fccvVar2 = (fccv) fccuVar.instance;
        fcbr fcbrVar = (fcbr) fcbqVar.build();
        fcbrVar.getClass();
        fccvVar2.d = fcbrVar;
        fccvVar2.b |= 2;
        return elfo.e((fccv) fccuVar.build());
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
