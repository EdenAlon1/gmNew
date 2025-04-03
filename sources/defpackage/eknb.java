package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Debug;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eknb implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final enru a = enru.c("com/google/apps/tiktok/media/ImageManagerStackMonitor");
    private final Context b;
    private final Deque c = new ArrayDeque();
    private final Set d = new HashSet();
    private final Map e = new HashMap();

    public eknb(Context context) {
        this.b = context;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        context.registerComponentCallbacks(this);
    }

    final void a(Activity activity, ekmz ekmzVar) {
        Set set = (Set) this.e.get(activity);
        if (set != null) {
            set.add(ekmzVar);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(ekmzVar);
        this.e.put(activity, hashSet);
    }

    final void b(int i) {
        emxf.a(true);
        ((enrr) ((enrr) a.g()).h("com/google/apps/tiktok/media/ImageManagerStackMonitor", "trimGlideManagers", 132, "ImageManagerStackMonitor.java")).u("Trimming Glide: lru=%d; max=%d", this.c.size(), i);
        int size = this.c.size() - i;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.d.contains((Activity) this.c.peekFirst())) {
                break;
            }
            Set set = (Set) this.e.get((Activity) this.c.removeFirst());
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((ekmz) it.next()).a.p();
                }
            }
        }
        if (size > 0) {
            if (Debug.getNativeHeapAllocatedSize() > Runtime.getRuntime().totalMemory() * 0.8d) {
                qpt.b(this.b).i(15);
            }
        }
    }

    final void c(Activity activity, ekmz ekmzVar) {
        Set set = (Set) this.e.get(activity);
        if (set != null) {
            set.remove(ekmzVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.c.remove(activity);
        this.e.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.c.remove(activity);
        this.c.add(activity);
        this.d.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.d.remove(activity);
        if (activity.isChangingConfigurations() || activity.isFinishing()) {
            return;
        }
        double nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / Runtime.getRuntime().maxMemory();
        if (nativeHeapAllocatedSize >= 0.8d) {
            b(1);
        } else if (nativeHeapAllocatedSize >= 0.7d) {
            b(2);
        } else if (nativeHeapAllocatedSize >= 0.6d) {
            b(3);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i < 20) {
            b(i >= 15 ? 1 : i >= 10 ? 2 : 3);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
