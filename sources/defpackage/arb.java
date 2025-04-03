package defpackage;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arb {
    public final boolean a;
    public final boolean b;

    public arb(bfx bfxVar) {
        this.a = bfxVar.d(ImageCaptureFailWithAutoFlashQuirk.class);
        this.b = ara.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }
}
