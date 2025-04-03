package defpackage;

import com.google.android.libraries.user.profile.photopicker.picker.intentonly.webview.PhotoPickerWebViewIntentActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egrv implements rif {
    final /* synthetic */ PhotoPickerWebViewIntentActivity a;

    public egrv(PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity) {
        this.a = photoPickerWebViewIntentActivity;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        rixVar.getClass();
        ((enrr) ((enrr) PhotoPickerWebViewIntentActivity.o.e()).g(qwpVar).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/webview/PhotoPickerWebViewIntentActivity$requestListener$1", "onLoadFailed", 106, "PhotoPickerWebViewIntentActivity.kt")).q("loading bitmap failed");
        this.a.setResult(0);
        this.a.finish();
        return false;
    }

    @Override // defpackage.rif
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        obj2.getClass();
        qsyVar.getClass();
        return false;
    }
}
