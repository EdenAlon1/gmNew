package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chwk implements ciin {
    public final chln a;
    public final ciih b;
    private final ffsk c;
    private final chkj d;
    private String e;
    private long f;

    public chwk(ffsk ffskVar, String str, chkj chkjVar, chln chlnVar) {
        ffskVar.getClass();
        this.c = ffskVar;
        this.d = chkjVar;
        this.a = chlnVar;
        this.e = "";
        this.b = new ciih(str);
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.f;
    }

    @Override // defpackage.ciin
    public final /* synthetic */ ciil b() {
        return this.b;
    }

    @Override // defpackage.ciin
    public final String f() {
        return "GetGaiaDeviceInfoRpcHandler";
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
    public final elfl c(fcfo fcfoVar) {
        elfl c;
        fcfoVar.getClass();
        this.e = fcfoVar.c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new chwj(this, fcfoVar, null));
        return c;
    }

    @Override // defpackage.ciin
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final elfl d(chrv chrvVar, fbze fbzeVar) {
        chrvVar.getClass();
        fbzeVar.getClass();
        elfl a = this.d.a(fbzeVar);
        a.getClass();
        return a;
    }

    @Override // defpackage.ciin
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final elfl e(fbzg fbzgVar) {
        fbzgVar.getClass();
        fcfq fcfqVar = fbzgVar.b;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        this.f = fcfqVar.b;
        elfl e = elfo.e(fbzgVar);
        e.getClass();
        return e;
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
