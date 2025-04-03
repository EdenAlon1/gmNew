package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chwm implements ciin {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/GetRcsAccountInfoRpcHandler");
    private final ciii b;
    private String c = "";
    private long d;

    public chwm(ciii ciiiVar) {
        this.b = ciiiVar;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.d;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.b;
    }

    @Override // defpackage.ciin
    public final String f() {
        return "GetAccountInfoRcsHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.c;
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
        fcfoVar.getClass();
        this.c = fcfoVar.c;
        fbyz fbyzVar = (fbyz) fbza.a.createBuilder();
        fbyzVar.getClass();
        fbyzVar.copyOnWrite();
        fbza fbzaVar = (fbza) fbyzVar.instance;
        fbzaVar.c = fcfoVar;
        fbzaVar.b |= 1;
        eyfy build = fbyzVar.build();
        build.getClass();
        elfl e = elfo.e((fbza) build);
        e.getClass();
        return e;
    }

    @Override // defpackage.ciin
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final elfl d(chrv chrvVar, fbza fbzaVar) {
        chrvVar.getClass();
        fbzaVar.getClass();
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fcejVar.getClass();
        fbfk.b(this.b.a, fcejVar);
        elfl a2 = chrvVar.d(fbfk.a(fcejVar)).a(fbzaVar);
        a2.getClass();
        return a2;
    }

    @Override // defpackage.ciin
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final elfl e(fbzc fbzcVar) {
        fbzcVar.getClass();
        fcfq fcfqVar = fbzcVar.b;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        this.d = fcfqVar.b;
        ensk e = a.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) e.h("com/google/android/apps/messaging/shared/net/handler/GetRcsAccountInfoRpcHandler", "handleResponse", 51, "GetRcsAccountInfoRpcHandler.kt")).t("GetAccountInfoResponse is %s", fbzcVar);
        elfl e2 = elfo.e(fbzcVar);
        e2.getClass();
        return e2;
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
