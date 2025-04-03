package defpackage;

import android.content.Context;
import com.bumptech.glide.manager.LifecycleLifecycle;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rgx {
    final Map a = new HashMap();
    private final rha b;

    public rgx(rha rhaVar) {
        this.b = rhaVar;
    }

    final qqs a(Context context, qpt qptVar, lkk lkkVar, boolean z) {
        rkh.j();
        rkh.j();
        qqs qqsVar = (qqs) this.a.get(lkkVar);
        if (qqsVar != null) {
            return qqsVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lkkVar);
        qqs a = this.b.a(qptVar, lifecycleLifecycle, new rgw(), context);
        this.a.put(lkkVar, a);
        lifecycleLifecycle.a(new rgv(this, lkkVar));
        if (!z) {
            return a;
        }
        a.n();
        return a;
    }
}
