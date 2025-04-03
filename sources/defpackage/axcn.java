package defpackage;

import android.util.LruCache;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcn implements cskg {
    private final Set a;

    public axcn(Set set) {
        this.a = set;
    }

    public final void a() {
        enqu listIterator = ((enpx) this.a).listIterator();
        while (listIterator.hasNext()) {
            ((LruCache) listIterator.next()).evictAll();
        }
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        a();
    }
}
