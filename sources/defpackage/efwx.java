package defpackage;

import com.google.android.libraries.user.profile.photopicker.art.edit.ArtEditActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efwx implements adc {
    final /* synthetic */ efwy a;

    public efwx(efwy efwyVar) {
        this.a = efwyVar;
    }

    @Override // defpackage.adc
    public final void a() {
        efwy efwyVar = this.a;
        if (efwy.ae(efwyVar.ad()) && !efwyVar.Q) {
            efwyVar.Q = true;
            Object aX = efwyVar.aX();
            ArtEditActivity artEditActivity = (ArtEditActivity) efwyVar;
            akgb akgbVar = (akgb) aX;
            artEditActivity.n = (lmw) akgbVar.cl.b();
            artEditActivity.o = (egrb) akgbVar.bB.b();
            artEditActivity.p = (efwk) akgbVar.bW.b();
            artEditActivity.q = (dvyc) akgbVar.b.b.jx.b();
            artEditActivity.r = (dvxy) akgbVar.b.b.jy.b();
            artEditActivity.s = (dvxi) akgbVar.b.b.jA.b();
            artEditActivity.t = akgbVar.ar();
            artEditActivity.u = (egjw) akgbVar.bV.b();
            artEditActivity.v = (egaj) akgbVar.bU.b();
            artEditActivity.w = akgbVar.au();
            enhk enhkVar = enoz.a;
            artEditActivity.x = new faze(enhkVar, enhkVar);
            artEditActivity.y = "group_profile_photo_picker";
            artEditActivity.z = (egcw) akgbVar.cq.b();
            artEditActivity.A = akgbVar.as();
        }
    }
}
