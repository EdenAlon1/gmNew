package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpd {
    public final fgcm a = fgdm.a(new zpc(0.0f, 0.0f));
    public final fgdj b;
    private final fgcm c;
    private final Map d;

    public zpd() {
        fgcm a = fgdm.a(false);
        this.c = a;
        this.b = a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ffdb ffdbVar = new ffdb(zpf.d);
        while (ffdbVar.hasNext()) {
            linkedHashMap.put((zpf) ffdbVar.next(), fgdm.a(false));
        }
        this.d = linkedHashMap;
    }

    public final ffxx a(zpf zpfVar) {
        zpfVar.getClass();
        fgcm fgcmVar = (fgcm) this.d.get(zpfVar);
        return fgcmVar != null ? fgcmVar : fgdm.a(false);
    }

    public final void b(float f) {
        if (f == ((zpc) this.a.c()).b) {
            return;
        }
        fgcm fgcmVar = this.a;
        fgcmVar.f(new zpc(((zpc) this.a.c()).b, f >= 0.0f ? f : 0.0f));
        this.c.f(Boolean.valueOf(((zpc) this.a.c()).b > ((zpc) this.a.c()).a));
        ffdb ffdbVar = new ffdb(zpf.d);
        while (ffdbVar.hasNext()) {
            zpf zpfVar = (zpf) ffdbVar.next();
            fgcm fgcmVar2 = (fgcm) this.d.get(zpfVar);
            if (fgcmVar2 != null) {
                fgcmVar2.f(Boolean.valueOf(f > ((float) zpfVar.c)));
            }
        }
    }
}
