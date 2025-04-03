package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chzg implements ciin {
    private static final entd a = entd.c("BugleNetwork");
    private final ffbr b;
    private final ciii c;
    private final String d;
    private String e;

    public chzg(ffbr ffbrVar, ciii ciiiVar, String str) {
        str.getClass();
        this.b = ffbrVar;
        this.c = ciiiVar;
        this.d = str;
        this.e = "";
    }

    public static final elfl o(fcde fcdeVar) {
        fcdeVar.getClass();
        fcfq fcfqVar = fcdeVar.b;
        if (fcfqVar == null) {
            fcfqVar = fcfq.a;
        }
        long j = fcfqVar.b;
        a.n().t("Unlink identity response is [%s]", fcdeVar);
        elfl e = elfo.e(fcdeVar);
        e.getClass();
        return e;
    }

    @Override // defpackage.ciin
    public final long a() {
        return a();
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return this.c;
    }

    @Override // defpackage.ciin
    public final /* bridge */ /* synthetic */ ListenableFuture e(eyhs eyhsVar) {
        return o((fcde) eyhsVar);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "UnlinkIdentityHandler";
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
        fcfoVar.getClass();
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
        ((fcek) fcejVar.instance).c = this.d;
        eyfy build = fcejVar.build();
        build.getClass();
        fcdb fcdbVar = (fcdb) fcdc.a.createBuilder();
        fcdbVar.getClass();
        fcdbVar.copyOnWrite();
        fcdc fcdcVar = (fcdc) fcdbVar.instance;
        fcdcVar.c = fcfoVar;
        fcdcVar.b |= 1;
        fcdbVar.copyOnWrite();
        fcdc fcdcVar2 = (fcdc) fcdbVar.instance;
        fcdcVar2.d = (fcek) build;
        fcdcVar2.b |= 2;
        eyfy build2 = fcdbVar.build();
        build2.getClass();
        elfl e = elfo.e((fcdc) build2);
        e.getClass();
        return e;
    }

    @Override // defpackage.ciin
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final elfl d(chrv chrvVar, fcdc fcdcVar) {
        chrvVar.getClass();
        fcdcVar.getClass();
        ((ensz) a.h()).t("Unlink identity Request Id is [%s]", this.e);
        try {
            evbw b = ((evbu) this.b.b()).b(new evbx(this.d, "google"), new enpx("https://www.googleapis.com/auth/tachyon"));
            fcej fcejVar = (fcej) fcek.a.createBuilder();
            ciii ciiiVar = this.c;
            fcejVar.copyOnWrite();
            fcek fcekVar = (fcek) fcejVar.instance;
            String str = ciiiVar.a;
            str.getClass();
            fcekVar.c = str;
            elfl h = chrvVar.d((fcek) fcejVar.build()).h(fcdcVar, b);
            h.getClass();
            return h;
        } catch (evbv e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.cijo
    public final void k() {
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
