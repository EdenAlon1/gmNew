package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chwy implements ciin {
    private static final entd a = entd.c("BugleAlphaverse");
    private final ffbr b;
    private final ciii c;
    private final String d;
    private String e = null;
    private long f = 0;

    public chwy(ffbr ffbrVar, ciii ciiiVar, String str) {
        this.b = ffbrVar;
        this.c = ciiiVar;
        this.d = str;
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.f;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.c;
    }

    @Override // defpackage.ciin
    public final String f() {
        return "LinkIdentityHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        String str = this.e;
        return str != null ? str : "";
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
        this.e = fcfoVar.c;
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        String str = fcfoVar.e;
        fcejVar.copyOnWrite();
        fcek fcekVar = (fcek) fcejVar.instance;
        str.getClass();
        fcekVar.d = str;
        fgtg fgtgVar = fgtg.EMAIL;
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).b = fgtgVar.a();
        fcejVar.copyOnWrite();
        fcek fcekVar2 = (fcek) fcejVar.instance;
        String str2 = this.d;
        str2.getClass();
        fcekVar2.c = str2;
        fcek fcekVar3 = (fcek) fcejVar.build();
        fbzy fbzyVar = (fbzy) fbzz.a.createBuilder();
        fbzyVar.copyOnWrite();
        fbzz fbzzVar = (fbzz) fbzyVar.instance;
        fcfoVar.getClass();
        fbzzVar.c = fcfoVar;
        fbzzVar.b |= 1;
        fbzyVar.copyOnWrite();
        fbzz fbzzVar2 = (fbzz) fbzyVar.instance;
        fcekVar3.getClass();
        fbzzVar2.d = fcekVar3;
        fbzzVar2.b |= 2;
        return elfo.e((fbzz) fbzyVar.build());
    }

    @Override // defpackage.ciin
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final elfl d(chrv chrvVar, fbzz fbzzVar) {
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/net/handler/LinkIdentityRpcHandler", "executeRpc", 66, "LinkIdentityRpcHandler.java")).t("Link identity Request Id is [%s]", this.e);
        try {
            evbw b = ((evbu) this.b.b()).b(new evbx(this.d, "google"), new enpx("https://www.googleapis.com/auth/tachyon"));
            fcej fcejVar = (fcej) fcek.a.createBuilder();
            ciii ciiiVar = this.c;
            fcejVar.copyOnWrite();
            fcek fcekVar = (fcek) fcejVar.instance;
            String str = ciiiVar.a;
            str.getClass();
            fcekVar.c = str;
            return chrvVar.d((fcek) fcejVar.build()).c(fbzzVar, b);
        } catch (evbv | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.ciin
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final elfl e(fcab fcabVar) {
        fcfq fcfqVar = fcabVar.b;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        this.f = fcfqVar.b;
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/net/handler/LinkIdentityRpcHandler", "handleResponse", 90, "LinkIdentityRpcHandler.java")).t("Link identity response is [%s]", fcabVar);
        return elfo.e(fcabVar);
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
