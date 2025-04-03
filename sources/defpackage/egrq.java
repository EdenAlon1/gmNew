package defpackage;

import com.google.android.libraries.user.profile.photopicker.picker.intentonly.webview.PhotoPickerWebViewIntentActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egrq implements adc {
    final /* synthetic */ egrr a;

    public egrq(egrr egrrVar) {
        this.a = egrrVar;
    }

    @Override // defpackage.adc
    public final void a() {
        egrr egrrVar = this.a;
        if (egrr.D(egrrVar.C()) && !egrrVar.n) {
            egrrVar.n = true;
            Object aX = egrrVar.aX();
            PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity = (PhotoPickerWebViewIntentActivity) egrrVar;
            akgb akgbVar = (akgb) aX;
            photoPickerWebViewIntentActivity.p = (efzz) akgbVar.bS.b();
            photoPickerWebViewIntentActivity.q = (egaj) akgbVar.bU.b();
            photoPickerWebViewIntentActivity.r = (dulp) akgbVar.b.cy.b();
        }
    }
}
