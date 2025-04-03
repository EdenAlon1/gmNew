package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cas implements bee {
    private final bee a;
    private Map c;

    /* JADX WARN: Type inference failed for: r3v10, types: [cak, java.lang.Object] */
    public cas(bee beeVar, bfx bfxVar, bcq bcqVar, afd afdVar) {
        Map map;
        this.a = beeVar;
        List c = bfxVar.c(ExtraSupportedQualityQuirk.class);
        if (c.isEmpty()) {
            return;
        }
        ksw.c(c.size() == 1);
        if (ExtraSupportedQualityQuirk.a()) {
            map = null;
            if ("1".equals(bcqVar.k()) && !beeVar.b(4)) {
                bei a = beeVar.a(1);
                beh behVar = (a == null || a.d().isEmpty()) ? null : (beh) a.d().get(0);
                if (behVar != null) {
                    ?? a2 = afdVar.a(bxe.c(behVar));
                    Range c2 = a2 != 0 ? a2.c() : but.f;
                    Size size = blz.d;
                    beg e = beg.e(a.a(), a.b(), a.c(), Collections.singletonList(new bbi(behVar.d(), behVar.j(), bxe.a(behVar.b(), behVar.a(), behVar.a(), behVar.e(), behVar.e(), size.getWidth(), behVar.i(), size.getHeight(), behVar.g(), c2), behVar.e(), size.getWidth(), size.getHeight(), behVar.h(), behVar.a(), behVar.c(), behVar.f())));
                    map = new HashMap();
                    map.put(4, e);
                    if (blz.a(blz.d) > blz.a(new Size(behVar.i(), behVar.g()))) {
                        map.put(1, e);
                    }
                }
            }
        } else {
            map = Collections.EMPTY_MAP;
        }
        if (map != null) {
            this.c = new HashMap(map);
        }
    }

    @Override // defpackage.bee
    public final bei a(int i) {
        return c(i);
    }

    @Override // defpackage.bee
    public final boolean b(int i) {
        return c(i) != null;
    }

    public final bei c(int i) {
        Map map = this.c;
        if (map != null) {
            Integer valueOf = Integer.valueOf(i);
            if (map.containsKey(valueOf)) {
                return (bei) this.c.get(valueOf);
            }
        }
        return this.a.a(i);
    }
}
