package defpackage;

import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arm {
    public final boolean a;
    public boolean b = false;

    public arm(bfx bfxVar) {
        this.a = bfxVar.a(AutoFlashUnderExposedQuirk.class) != null;
    }
}
