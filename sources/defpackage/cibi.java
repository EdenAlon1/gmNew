package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cibi implements cibh {
    private final asvy a;

    public cibi(asvy asvyVar) {
        this.a = asvyVar;
    }

    @Override // defpackage.cibh
    public final elfl a(fced fcedVar) {
        fcedVar.getClass();
        if (!((ersq) ((asen) this.a).a.b()).a("bugle.enable24hr_auth_token")) {
            fcedVar.a(fgtb.SUPPORTS_LONG_LIVED_RCS_AUTH_TOKEN);
            elfl e = elfo.e(fcedVar);
            e.getClass();
            return e;
        }
        fcedVar.a(fgtb.SUPPORTS_LONG_LIVED_RCS_AUTH_TOKEN);
        fcedVar.a(fgtb.SUPPORTS_24_HOUR_RCS_AUTH_TOKEN);
        elfl e2 = elfo.e(fcedVar);
        e2.getClass();
        return e2;
    }
}
