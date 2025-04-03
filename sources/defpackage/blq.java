package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class blq {
    public static boolean a(bfx bfxVar) {
        Iterator it = bfxVar.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).i()) {
                return true;
            }
        }
        return false;
    }
}
