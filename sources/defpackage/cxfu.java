package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxfu implements eivv {
    final /* synthetic */ cxfv a;
    private final ffbr b;

    public cxfu(cxfv cxfvVar, ffbr ffbrVar) {
        this.a = cxfvVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        cg cgVar = new cg(this.a.a.a());
        eisx a = eivtVar.a();
        cwup cwupVar = new cwup();
        fbae.e(cwupVar);
        ekky.b(cwupVar, a);
        cgVar.x(R.id.fragment_container, cwupVar, "ChatIdentitySettingsSelectionFragmentPeer");
        cgVar.c();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        ((adio) this.b.b()).a(eiupVar);
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
