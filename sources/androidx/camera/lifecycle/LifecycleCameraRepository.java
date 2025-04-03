package androidx.camera.lifecycle;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.bpy;
import defpackage.ksw;
import defpackage.lki;
import defpackage.lkj;
import defpackage.lkq;
import defpackage.lkr;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifecycleCameraRepository {
    public static final Object a = new Object();
    public static LifecycleCameraRepository b;
    public final Object c = new Object();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    private final ArrayDeque f = new ArrayDeque();

    /* compiled from: PG */
    public static class LifecycleCameraRepositoryObserver implements lkq {
        public final lkr a;
        private final LifecycleCameraRepository b;

        public LifecycleCameraRepositoryObserver(lkr lkrVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.a = lkrVar;
            this.b = lifecycleCameraRepository;
        }

        @OnLifecycleEvent(a = lki.ON_DESTROY)
        public void onDestroy(lkr lkrVar) {
            this.b.e(lkrVar);
        }

        @OnLifecycleEvent(a = lki.ON_START)
        public void onStart(lkr lkrVar) {
            this.b.c(lkrVar);
        }

        @OnLifecycleEvent(a = lki.ON_STOP)
        public void onStop(lkr lkrVar) {
            this.b.d(lkrVar);
        }
    }

    private final void f(lkr lkrVar) {
        synchronized (this.c) {
            LifecycleCameraRepositoryObserver a2 = a(lkrVar);
            if (a2 == null) {
                return;
            }
            Iterator it = ((Set) this.e.get(a2)).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.d.get((bpy) it.next());
                ksw.h(lifecycleCamera);
                lifecycleCamera.e();
            }
        }
    }

    private final void g(lkr lkrVar) {
        synchronized (this.c) {
            Iterator it = ((Set) this.e.get(a(lkrVar))).iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.d.get((bpy) it.next());
                ksw.h(lifecycleCamera);
                if (!lifecycleCamera.d().isEmpty()) {
                    synchronized (lifecycleCamera.a) {
                        if (lifecycleCamera.d) {
                            lifecycleCamera.d = false;
                            if (lifecycleCamera.b.P().a().a(lkj.STARTED)) {
                                lifecycleCamera.onStart(lifecycleCamera.b);
                            }
                        }
                    }
                }
            }
        }
    }

    public final LifecycleCameraRepositoryObserver a(lkr lkrVar) {
        synchronized (this.c) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.e.keySet()) {
                if (lkrVar.equals(lifecycleCameraRepositoryObserver.a)) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    public final Collection b() {
        Collection unmodifiableCollection;
        synchronized (this.c) {
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(this.d.values());
        }
        return unmodifiableCollection;
    }

    public final void c(lkr lkrVar) {
        synchronized (this.c) {
            synchronized (this.c) {
                LifecycleCameraRepositoryObserver a2 = a(lkrVar);
                if (a2 != null) {
                    Iterator it = ((Set) this.e.get(a2)).iterator();
                    while (it.hasNext()) {
                        LifecycleCamera lifecycleCamera = (LifecycleCamera) this.d.get((bpy) it.next());
                        ksw.h(lifecycleCamera);
                        if (!lifecycleCamera.d().isEmpty()) {
                            if (this.f.isEmpty()) {
                                this.f.push(lkrVar);
                            } else {
                                lkr lkrVar2 = (lkr) this.f.peek();
                                if (!lkrVar.equals(lkrVar2)) {
                                    f(lkrVar2);
                                    this.f.remove(lkrVar);
                                    this.f.push(lkrVar);
                                }
                            }
                            g(lkrVar);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void d(lkr lkrVar) {
        synchronized (this.c) {
            this.f.remove(lkrVar);
            f(lkrVar);
            if (!this.f.isEmpty()) {
                g((lkr) this.f.peek());
            }
        }
    }

    public final void e(lkr lkrVar) {
        synchronized (this.c) {
            LifecycleCameraRepositoryObserver a2 = a(lkrVar);
            if (a2 == null) {
                return;
            }
            d(lkrVar);
            Iterator it = ((Set) this.e.get(a2)).iterator();
            while (it.hasNext()) {
                this.d.remove((bpy) it.next());
            }
            this.e.remove(a2);
            a2.a.P().d(a2);
        }
    }
}
