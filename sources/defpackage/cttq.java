package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cttq implements cttn {
    public static final cfva a = cfvl.f(cfvl.b, "smarts_hats_suggestions_usage_time_window_millis", TimeUnit.DAYS.toMillis(3));
    public static final cfva b = cfvl.e(cfvl.b, "smarts_hats_minimum_suggestions_required", 3);
    public final cqoh c;
    private final ffsk d;
    private final ffbr e;
    private final ffbr f;
    private final cskc g;

    public cttq(ffsk ffskVar, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.d = ffskVar;
        this.c = cqohVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = cskc.g("Bugle", "SmartSuggestionSettingsImpl");
    }

    @Override // defpackage.cttn
    public final elfl a() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cttp(this, null));
        return c;
    }

    @Override // defpackage.cttn
    public final boolean b() {
        if (e()) {
            return ((ctyz) this.f.b()).o() || ((ctyz) this.f.b()).h() || ((ctyz) this.f.b()).n() || ((ctyz) this.f.b()).q();
        }
        return false;
    }

    @Override // defpackage.cttn
    public final boolean c() {
        return d() && ((Boolean) ctjd.d.e()).booleanValue();
    }

    @Override // defpackage.cttn
    public final boolean d() {
        return e() && ((ctyz) this.f.b()).o();
    }

    @Override // defpackage.cttn
    public final boolean e() {
        boolean isEmpty = ((ctml) this.e.b()).a().a.isEmpty();
        boolean isEmpty2 = ((ctml) this.e.b()).a().b.isEmpty();
        csjb d = this.g.d();
        d.B("Reply suggestions enabled", !isEmpty);
        d.r();
        csjb d2 = this.g.d();
        d2.B("Continuation suggestions enabled", !isEmpty2);
        d2.r();
        return (isEmpty && isEmpty2) ? false : true;
    }

    @Override // defpackage.cttn
    public final int f() {
        boolean e = e();
        boolean b2 = b();
        if (e) {
            return b2 ? 4 : 3;
        }
        return 2;
    }
}
