package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chwh implements ciin {
    public final ciih a;
    private final chkj b;
    private final chln c;
    private final errl d;
    private String e = "";
    private long f = 0;

    public chwh(errl errlVar, ciih ciihVar, chkj chkjVar, chln chlnVar) {
        this.d = errlVar;
        this.c = chlnVar;
        this.b = chkjVar;
        this.a = ciihVar;
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
    public final /* bridge */ /* synthetic */ ListenableFuture d(chrv chrvVar, eyhs eyhsVar) {
        return o((fcdk) eyhsVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "GaiaUnregisterRpcHandler";
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

    @Override // defpackage.ciin
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final elfl c(final fcfo fcfoVar) {
        this.e = fcfoVar.c;
        return this.c.a().h(new emwl() { // from class: chwg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fcfn fcfnVar = (fcfn) fcfo.a.createBuilder(fcfoVar);
                fcfnVar.copyOnWrite();
                ((fcfo) fcfnVar.instance).e = chwh.this.a.a;
                eyee x = eyee.x((byte[]) obj);
                fcfnVar.copyOnWrite();
                ((fcfo) fcfnVar.instance).f = x;
                fcfo fcfoVar2 = (fcfo) fcfnVar.build();
                fcdj fcdjVar = (fcdj) fcdk.a.createBuilder();
                fcdjVar.copyOnWrite();
                fcdk fcdkVar = (fcdk) fcdjVar.instance;
                fcfoVar2.getClass();
                fcdkVar.c = fcfoVar2;
                fcdkVar.b |= 1;
                fcdjVar.copyOnWrite();
                ((fcdk) fcdjVar.instance).d = 1;
                return (fcdk) fcdjVar.build();
            }
        }, this.d);
    }

    @Override // defpackage.ciin
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final elfl e(fcdm fcdmVar) {
        fcfq fcfqVar = fcdmVar.b;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        this.f = fcfqVar.b;
        return elfo.e(fcdmVar);
    }

    public final elfl o(fcdk fcdkVar) {
        return this.b.d(fcdkVar);
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
