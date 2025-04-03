package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chzi implements ciin {
    private final ciii a;
    private String b = "";
    private long c = 0;

    public chzi(ciii ciiiVar) {
        this.a = ciiiVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.a;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        this.b = fcfoVar.c;
        fcdj fcdjVar = (fcdj) fcdk.a.createBuilder();
        fcdjVar.copyOnWrite();
        fcdk fcdkVar = (fcdk) fcdjVar.instance;
        fcfoVar.getClass();
        fcdkVar.c = fcfoVar;
        fcdkVar.b |= 1;
        fcdjVar.copyOnWrite();
        ((fcdk) fcdjVar.instance).d = 1;
        return erqt.i((fcdk) fcdjVar.build());
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        return chrvVar.c().a().e((fcdk) eyhsVar);
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        long j;
        fcdm fcdmVar = (fcdm) eyhsVar;
        if (fcdmVar != null) {
            fcfq fcfqVar = fcdmVar.b;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.c = j;
        return erqt.i(fcdmVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "UnregisterPhoneRpcHandler";
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
