package defpackage;

import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egke implements adc {
    final /* synthetic */ egkf a;

    public egke(egkf egkfVar) {
        this.a = egkfVar;
    }

    @Override // defpackage.adc
    public final void a() {
        egkf egkfVar = this.a;
        if (egkf.H(egkfVar.G()) && !egkfVar.E) {
            egkfVar.E = true;
            Object aX = egkfVar.aX();
            EditActivity editActivity = (EditActivity) egkfVar;
            akgb akgbVar = (akgb) aX;
            editActivity.n = (lmw) akgbVar.cl.b();
            editActivity.o = (egrb) akgbVar.bB.b();
            editActivity.p = (egaj) akgbVar.bU.b();
            editActivity.q = (dvyc) akgbVar.b.b.jx.b();
            editActivity.r = (dvxi) akgbVar.b.b.jA.b();
            editActivity.s = akgbVar.ar();
            editActivity.t = (egjw) akgbVar.bV.b();
            editActivity.u = akgbVar.as();
            enhk enhkVar = enoz.a;
            editActivity.v = new faze(enhkVar, enhkVar);
        }
    }
}
