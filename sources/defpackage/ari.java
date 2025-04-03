package defpackage;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ari {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public ari(bfx bfxVar, bfx bfxVar2) {
        this.a = bfxVar2.d(TextureViewIsClosedQuirk.class);
        this.b = bfxVar.d(PreviewOrientationIncorrectQuirk.class);
        this.c = bfxVar.d(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public final void a(List list) {
        if ((this.a || this.b || this.c) && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((bdy) it.next()).d();
            }
            avw.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
