package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.user.profile.photopicker.picker.intentonly.webview.PhotoPickerWebViewIntentActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class egrt implements adf, ffke {
    final /* synthetic */ PhotoPickerWebViewIntentActivity a;

    public egrt(PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity) {
        this.a = photoPickerWebViewIntentActivity;
    }

    @Override // defpackage.adf
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str;
        egaj egajVar;
        ade adeVar = (ade) obj;
        adeVar.getClass();
        ((enrr) PhotoPickerWebViewIntentActivity.o.e().h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/webview/PhotoPickerWebViewIntentActivity", "handleActivityResult", 166, "PhotoPickerWebViewIntentActivity.kt")).q("onActivityResult for picker-only webview");
        PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity = this.a;
        photoPickerWebViewIntentActivity.u = true;
        Intent intent = adeVar.b;
        String stringExtra = intent != null ? intent.getStringExtra("result.photoUrl") : null;
        if (stringExtra == null) {
            photoPickerWebViewIntentActivity.setResult(0);
            photoPickerWebViewIntentActivity.finish();
            return;
        }
        Intent intent2 = adeVar.b;
        if (intent2 == null || (str = intent2.getStringExtra("result.photoSource")) == null) {
            str = photoPickerWebViewIntentActivity.t;
        }
        photoPickerWebViewIntentActivity.t = str;
        Uri parse = Uri.parse(stringExtra);
        if (photoPickerWebViewIntentActivity.v) {
            dulp dulpVar = photoPickerWebViewIntentActivity.r;
            if (dulpVar == null) {
                ffkj.c("fifeImageUrlUtil");
                dulpVar = null;
            }
            parse = dulpVar.a(0, Uri.parse(stringExtra));
        }
        Uri uri = parse;
        egaj egajVar2 = photoPickerWebViewIntentActivity.q;
        if (egajVar2 == null) {
            ffkj.c("imageManager");
            egajVar = null;
        } else {
            egajVar = egajVar2;
        }
        egajVar.e(photoPickerWebViewIntentActivity, uri, new egal(), photoPickerWebViewIntentActivity.w, photoPickerWebViewIntentActivity.x);
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffkh(1, this.a, PhotoPickerWebViewIntentActivity.class, "handleActivityResult", "handleActivityResult(Landroidx/activity/result/ActivityResult;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof adf) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
