package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.libraries.user.profile.photopicker.picker.intentonly.webview.PhotoPickerWebViewIntentActivity;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egru extends rim {
    final /* synthetic */ PhotoPickerWebViewIntentActivity a;

    public egru(PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity) {
        this.a = photoPickerWebViewIntentActivity;
    }

    @Override // defpackage.rix
    public final /* bridge */ /* synthetic */ void c(Object obj, rjh rjhVar) {
        Bitmap bitmap = (Bitmap) obj;
        try {
            efzz efzzVar = this.a.p;
            Uri uri = null;
            if (efzzVar == null) {
                ffkj.c("bitmapFileSerializer");
                efzzVar = null;
            }
            Uri uri2 = this.a.s;
            if (uri2 == null) {
                ffkj.c("outputUri");
                uri2 = null;
            }
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            OutputStream a = efzzVar.a.a(uri2);
            try {
                bitmap.compress(compressFormat, 100, a);
                if (a != null) {
                    a.close();
                }
                Intent intent = new Intent();
                PhotoPickerWebViewIntentActivity photoPickerWebViewIntentActivity = this.a;
                Uri uri3 = photoPickerWebViewIntentActivity.s;
                if (uri3 == null) {
                    ffkj.c("outputUri");
                } else {
                    uri = uri3;
                }
                intent.setData(uri);
                intent.putExtra("com.google.profile.photopicker.PHOTO_SOURCE", photoPickerWebViewIntentActivity.t);
                this.a.setResult(-1, intent);
                this.a.finish();
            } finally {
            }
        } catch (IOException e) {
            ((enrr) ((enrr) PhotoPickerWebViewIntentActivity.o.e()).g(e).h("com/google/android/libraries/user/profile/photopicker/picker/intentonly/webview/PhotoPickerWebViewIntentActivity$glideTarget$1", "onResourceReady", 89, "PhotoPickerWebViewIntentActivity.kt")).q("write to output uri failed");
            this.a.setResult(0);
            this.a.finish();
        }
    }

    @Override // defpackage.rix
    public final void f(Drawable drawable) {
    }
}
