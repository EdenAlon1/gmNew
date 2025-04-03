package defpackage;

import com.google.android.libraries.user.profile.photopicker.picker.intentonly.PhotoPickerIntentActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egrl implements adc {
    final /* synthetic */ egrm a;

    public egrl(egrm egrmVar) {
        this.a = egrmVar;
    }

    @Override // defpackage.adc
    public final void a() {
        egrm egrmVar = this.a;
        if (egrm.D(egrmVar.C()) && !egrmVar.n) {
            egrmVar.n = true;
            Object aX = egrmVar.aX();
            PhotoPickerIntentActivity photoPickerIntentActivity = (PhotoPickerIntentActivity) egrmVar;
            akgb akgbVar = (akgb) aX;
            photoPickerIntentActivity.o = (egrb) akgbVar.bB.b();
            photoPickerIntentActivity.p = akgbVar.cC;
            photoPickerIntentActivity.q = (dvyc) akgbVar.b.b.jx.b();
            photoPickerIntentActivity.r = akgbVar.ar();
            photoPickerIntentActivity.s = (egrj) akgbVar.cs.b();
            photoPickerIntentActivity.t = (efzz) akgbVar.bS.b();
            photoPickerIntentActivity.u = akgbVar.aI();
            photoPickerIntentActivity.v = akgbVar.as();
            enhk enhkVar = enoz.a;
            photoPickerIntentActivity.w = new faze(enhkVar, enhkVar);
        }
    }
}
