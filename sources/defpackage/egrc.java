package defpackage;

import com.google.android.libraries.user.profile.photopicker.picker.PhotoPickerActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egrc implements adc {
    final /* synthetic */ egrd a;

    public egrc(egrd egrdVar) {
        this.a = egrdVar;
    }

    @Override // defpackage.adc
    public final void a() {
        egrd egrdVar = this.a;
        if (egrd.D(egrdVar.C()) && !egrdVar.n) {
            egrdVar.n = true;
            Object aX = egrdVar.aX();
            PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) egrdVar;
            akgb akgbVar = (akgb) aX;
            photoPickerActivity.o = (egrb) akgbVar.bB.b();
            photoPickerActivity.p = akgbVar.cA;
            photoPickerActivity.q = (dvyc) akgbVar.b.b.jx.b();
            photoPickerActivity.r = akgbVar.ar();
            photoPickerActivity.s = akgbVar.ci;
            photoPickerActivity.t = (egjk) akgbVar.cm.b();
            photoPickerActivity.u = akgbVar.as();
            enhk enhkVar = enoz.a;
            photoPickerActivity.v = new faze(enhkVar, enhkVar);
        }
    }
}
