package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwru implements eivv {
    final /* synthetic */ cwrv a;
    private final ffbr b;

    public cwru(cwrv cwrvVar, ffbr ffbrVar) {
        this.a = cwrvVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        cg cgVar = new cg(this.a.b.a());
        ea h = this.a.b.a().h("ApplicationSettingsFragmentPeer");
        if (h != null) {
            cgVar.n(h);
        }
        eisx a = eivtVar.a();
        cwrw cwrwVar = new cwrw();
        fbae.e(cwrwVar);
        ekky.b(cwrwVar, a);
        cgVar.x(R.id.fragment_container, cwrwVar, "ApplicationSettingsFragmentPeer");
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
