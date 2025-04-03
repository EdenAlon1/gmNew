package defpackage;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arx {
    public final boolean a;
    public final boolean b;

    public arx(bfx bfxVar) {
        boolean z;
        Iterator it = bfxVar.c(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                z = true;
                break;
            }
        }
        this.a = z;
        this.b = bfxVar.d(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }
}
