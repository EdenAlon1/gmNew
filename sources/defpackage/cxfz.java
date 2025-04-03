package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxfz implements eivv {
    final /* synthetic */ cxga a;
    private final ffbr b;

    public cxfz(cxga cxgaVar, ffbr ffbrVar) {
        this.a = cxgaVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        eisx a = eivtVar.a();
        cwro cwroVar = new cwro();
        fbae.e(cwroVar);
        ekky.b(cwroVar, a);
        cg cgVar = new cg(this.a.a.a());
        cgVar.E(R.id.fragment_container, cwroVar);
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
