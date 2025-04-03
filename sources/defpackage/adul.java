package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adul implements cfzm {
    public eoim a = eoim.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_UNKNOWN;

    public final String a() {
        int ordinal = this.a.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "unknown" : "false" : "true" : "not required";
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl c() {
        return cfzj.c();
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        cfzc cfzcVar = new cfzc();
        cfzcVar.b("share_with_partner_consent");
        cfzcVar.c(a());
        return elfo.e(engw.r(cfzcVar.a()));
    }
}
