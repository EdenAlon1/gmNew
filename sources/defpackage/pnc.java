package defpackage;

import android.app.Activity;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnc implements pms {
    public final ReentrantLock a = new ReentrantLock();
    public final WeakHashMap b = new WeakHashMap();
    private final pms c;

    public pnc(pms pmsVar) {
        this.c = pmsVar;
    }

    public final void a(Activity activity, pmd pmdVar) {
        activity.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (ffkj.e(pmdVar, (pmd) this.b.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((pne) this.c).a.c.iterator();
            while (it.hasNext()) {
                png pngVar = (png) it.next();
                if (ffkj.e(pngVar.a, activity)) {
                    pngVar.a(pmdVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
