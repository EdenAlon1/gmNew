package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbto implements eivv {
    final /* synthetic */ dbtp a;

    public dbto(dbtp dbtpVar) {
        this.a = dbtpVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        ea h = this.a.b.a().h("gaia_pairing_settings");
        if (h == null) {
            eisx a = eivtVar.a();
            h = new dbud();
            fbae.e(h);
            ekky.b(h, a);
        }
        cg cgVar = new cg(this.a.b.a());
        cgVar.x(R.id.fragment_container, h, "gaia_pairing_settings");
        cgVar.c();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        csjb b = dbtp.a.b();
        b.I("Unexpected account error when opening the Gaia pairing settings page.");
        b.s(eiupVar);
        ((adio) this.a.c.b()).a(eiupVar);
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
