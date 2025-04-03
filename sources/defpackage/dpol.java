package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.compose.cameragallery.ui.camera.inapp.CameraActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpol extends adu {
    public static final dpol a = new dpol();

    private dpol() {
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        return new Intent(context, (Class<?>) CameraActivity.class);
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (intent != null) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (drnn) intent.getParcelableExtra("camera_capture_key");
            }
        }
        return null;
    }
}
