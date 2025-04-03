package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cau implements bee {
    private static final Map a;
    private final bee c;
    private final bcq d;
    private final bfx e;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(1, brk.g);
        hashMap.put(8, brk.e);
        hashMap.put(6, brk.d);
        hashMap.put(5, brk.c);
        hashMap.put(4, brk.b);
        hashMap.put(0, brk.f);
    }

    public cau(bee beeVar, bcq bcqVar, bfx bfxVar) {
        this.c = beeVar;
        this.d = bcqVar;
        this.e = bfxVar;
    }

    @Override // defpackage.bee
    public final bei a(int i) {
        if (b(i)) {
            return this.c.a(i);
        }
        return null;
    }

    @Override // defpackage.bee
    public final boolean b(int i) {
        if (!this.c.b(i)) {
            return false;
        }
        brk brkVar = (brk) a.get(Integer.valueOf(i));
        if (brkVar == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.e.c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.a(this.d, brkVar) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).i())) {
                return false;
            }
        }
        return true;
    }
}
