package defpackage;

import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cat implements bee {
    private final bee a;
    private final bfx c;
    private final Map d = new HashMap();

    public cat(bee beeVar, bfx bfxVar) {
        this.a = beeVar;
        this.c = bfxVar;
    }

    @Override // defpackage.bee
    public final bei a(int i) {
        return c(i);
    }

    @Override // defpackage.bee
    public final boolean b(int i) {
        return this.a.b(i) && c(i) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bei c(int i) {
        Size size;
        Map map = this.d;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (bei) this.d.get(valueOf);
        }
        beg begVar = null;
        if (this.a.b(i)) {
            bei c = ((cas) this.a).c(i);
            c.getClass();
            Iterator it = this.c.c(StretchedVideoResolutionQuirk.class).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((StretchedVideoResolutionQuirk) it.next()) != null) {
                    if (i == 4) {
                        size = new Size(640, 480);
                    } else if (i == 5) {
                        size = new Size(960, 720);
                    } else if (i == 6) {
                        size = new Size(1440, 1080);
                    }
                }
            }
            size = null;
            if (size == null) {
                begVar = c;
            } else {
                ArrayList arrayList = new ArrayList();
                for (beh behVar : c.d()) {
                    arrayList.add(new bbi(behVar.d(), behVar.j(), behVar.b(), behVar.e(), size.getWidth(), size.getHeight(), behVar.h(), behVar.a(), behVar.c(), behVar.f()));
                }
                if (!arrayList.isEmpty()) {
                    begVar = beg.e(c.a(), c.b(), c.c(), arrayList);
                }
            }
        }
        this.d.put(Integer.valueOf(i), begVar);
        return begVar;
    }
}
