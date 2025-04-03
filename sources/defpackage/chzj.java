package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chzj implements ciin {
    private final String a;
    private final ciii b;
    private final ffbr c;
    private String d = "";
    private long e = 0;

    public chzj(ffbr ffbrVar, ciii ciiiVar, String str) {
        this.c = ffbrVar;
        this.b = ciiiVar;
        this.a = str;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.e;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.b;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        csjy.c("Bugle", "Verify request Id: ".concat(String.valueOf(fcfoVar.c)));
        this.d = fcfoVar.c;
        fcdp fcdpVar = (fcdp) fcdq.a.createBuilder();
        fcdpVar.copyOnWrite();
        fcdq fcdqVar = (fcdq) fcdpVar.instance;
        fcfoVar.getClass();
        fcdqVar.c = fcfoVar;
        fcdqVar.b |= 1;
        fcdpVar.copyOnWrite();
        fcdq fcdqVar2 = (fcdq) fcdpVar.instance;
        String str = this.a;
        str.getClass();
        fcdqVar2.d = str;
        return erqt.i((fcdq) fcdpVar.build());
    }

    @Override // defpackage.ciin
    public final String f() {
        return "VerifyRpcHandler";
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

    @Override // defpackage.ciin
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture d(chrv chrvVar, fcdq fcdqVar) {
        return chrvVar.d(cpta.b(((avkc) this.c.b()).c(this.b.a))).i(fcdqVar);
    }

    @Override // defpackage.ciin
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture e(fcds fcdsVar) {
        long j;
        if (fcdsVar != null) {
            fcfq fcfqVar = fcdsVar.c;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        return erqt.i(fcdsVar);
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
