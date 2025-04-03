package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxcy implements eivv {
    final /* synthetic */ cxcz a;
    private final ffbr b;

    public cxcy(cxcz cxczVar, ffbr ffbrVar) {
        this.a = cxczVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        cg cgVar = new cg(this.a.c.a());
        eisx a = eivtVar.a();
        cxda cxdaVar = new cxda();
        fbae.e(cxdaVar);
        ekky.b(cxdaVar, a);
        cgVar.E(R.id.rich_cards_preference_fragment_container, cxdaVar);
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
