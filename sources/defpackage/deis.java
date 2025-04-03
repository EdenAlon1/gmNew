package defpackage;

import android.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deis implements eivv {
    final /* synthetic */ deiu a;
    final /* synthetic */ ffbr b;

    public deis(deiu deiuVar, ffbr ffbrVar) {
        this.a = deiuVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        cg cgVar = new cg(this.a.a.a());
        eisx a = eivtVar.a();
        deiv deivVar = new deiv();
        fbae.e(deivVar);
        ekky.b(deivVar, a);
        cgVar.s(R.id.content, deivVar);
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
