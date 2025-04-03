package defpackage;

import android.content.Context;
import android.os.Trace;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpx {
    public ListenableFuture b;
    public final LifecycleCameraRepository d;
    public atu e;
    public Context f;
    public final Map g;
    public final Object a = new Object();
    public ListenableFuture c = bkj.b(null);

    public bpx() {
        LifecycleCameraRepository lifecycleCameraRepository;
        synchronized (LifecycleCameraRepository.a) {
            if (LifecycleCameraRepository.b == null) {
                LifecycleCameraRepository.b = new LifecycleCameraRepository();
            }
            lifecycleCameraRepository = LifecycleCameraRepository.b;
        }
        lifecycleCameraRepository.getClass();
        this.d = lifecycleCameraRepository;
        this.g = new HashMap();
    }

    public static final /* synthetic */ ata d(bpx bpxVar, lkr lkrVar, atl atlVar, atz atzVar, atz atzVar2, axy axyVar, List list, axv... axvVarArr) {
        LifecycleCamera lifecycleCamera;
        LifecycleCamera lifecycleCamera2;
        ozg.a("CX:bindToLifecycle-internal");
        try {
            biw.b();
            atu atuVar = bpxVar.e;
            atuVar.getClass();
            bct a = atlVar.a(atuVar.c.a());
            a.getClass();
            a.P();
            ati a2 = bpxVar.a(atlVar);
            LifecycleCameraRepository lifecycleCameraRepository = bpxVar.d;
            bky a3 = bla.a((bba) a2, null);
            synchronized (lifecycleCameraRepository.c) {
                lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.d.get(new bps(lkrVar, a3));
            }
            Collection b = bpxVar.d.b();
            for (axv axvVar : ffdo.J(axvVarArr)) {
                for (Object obj : b) {
                    obj.getClass();
                    LifecycleCamera lifecycleCamera3 = (LifecycleCamera) obj;
                    if (lifecycleCamera3.f(axvVar) && !ffkj.e(lifecycleCamera3, lifecycleCamera)) {
                        String format = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{axvVar}, 1));
                        format.getClass();
                        throw new IllegalStateException(format);
                    }
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository2 = bpxVar.d;
                atu atuVar2 = bpxVar.e;
                atuVar2.getClass();
                atuVar2.a();
                atu atuVar3 = bpxVar.e;
                atuVar3.getClass();
                aju ajuVar = atuVar3.p;
                if (ajuVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                atuVar3.getClass();
                bhl bhlVar = atuVar3.j;
                if (bhlVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                bla blaVar = new bla(a, (bba) a2, atzVar, atzVar2, ajuVar, bhlVar);
                synchronized (lifecycleCameraRepository2.c) {
                    ksw.b(lifecycleCameraRepository2.d.get(new bps(lkrVar, blaVar.b)) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                    lifecycleCamera2 = new LifecycleCamera(lkrVar, blaVar);
                    if (blaVar.d().isEmpty()) {
                        lifecycleCamera2.e();
                    }
                    if (lkrVar.P().a() != lkj.DESTROYED) {
                        synchronized (lifecycleCameraRepository2.c) {
                            lkr a4 = lifecycleCamera2.a();
                            bps bpsVar = new bps(a4, bla.a((bba) lifecycleCamera2.c(), null));
                            LifecycleCameraRepository.LifecycleCameraRepositoryObserver a5 = lifecycleCameraRepository2.a(a4);
                            Set hashSet = a5 != null ? (Set) lifecycleCameraRepository2.e.get(a5) : new HashSet();
                            hashSet.add(bpsVar);
                            lifecycleCameraRepository2.d.put(bpsVar, lifecycleCamera2);
                            if (a5 == null) {
                                LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new LifecycleCameraRepository.LifecycleCameraRepositoryObserver(a4, lifecycleCameraRepository2);
                                lifecycleCameraRepository2.e.put(lifecycleCameraRepositoryObserver, hashSet);
                                a4.P().c(lifecycleCameraRepositoryObserver);
                            }
                        }
                    }
                }
                lifecycleCamera = lifecycleCamera2;
            }
            int length = axvVarArr.length;
            if (length != 0) {
                LifecycleCameraRepository lifecycleCameraRepository3 = bpxVar.d;
                List g = ffdx.g(Arrays.copyOf(axvVarArr, length));
                atu atuVar4 = bpxVar.e;
                atuVar4.getClass();
                atuVar4.a();
                synchronized (lifecycleCameraRepository3.c) {
                    ksw.a(!g.isEmpty());
                    lkr a6 = lifecycleCamera.a();
                    LifecycleCameraRepository.LifecycleCameraRepositoryObserver a7 = lifecycleCameraRepository3.a(a6);
                    if (a7 != null) {
                        Iterator it = ((Set) lifecycleCameraRepository3.e.get(a7)).iterator();
                        while (it.hasNext()) {
                            LifecycleCamera lifecycleCamera4 = (LifecycleCamera) lifecycleCameraRepository3.d.get((bpy) it.next());
                            ksw.h(lifecycleCamera4);
                            if (!lifecycleCamera4.equals(lifecycleCamera) && !lifecycleCamera4.d().isEmpty()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                            }
                        }
                        try {
                            bla blaVar2 = lifecycleCamera.c;
                            synchronized (blaVar2.g) {
                                blaVar2.d = axyVar;
                            }
                            bla blaVar3 = lifecycleCamera.c;
                            synchronized (blaVar3.g) {
                                blaVar3.e = list;
                            }
                            synchronized (lifecycleCamera.a) {
                                bla blaVar4 = lifecycleCamera.c;
                                synchronized (blaVar4.g) {
                                    blaVar4.a.B(blaVar4.f);
                                    LinkedHashSet linkedHashSet = new LinkedHashSet(blaVar4.c);
                                    linkedHashSet.addAll(g);
                                    try {
                                        blaVar4.i(linkedHashSet, false, false);
                                    } catch (IllegalArgumentException e) {
                                        throw new bkx(e);
                                    }
                                }
                            }
                            if (a6.P().a().a(lkj.STARTED)) {
                                lifecycleCameraRepository3.c(a6);
                            }
                        } catch (bkx e2) {
                            throw new IllegalArgumentException(e2);
                        }
                    }
                }
            }
            return lifecycleCamera;
        } finally {
            Trace.endSection();
        }
    }

    public final ati a(atl atlVar) {
        Object obj;
        ozg.a("CX:getCameraInfo");
        try {
            atu atuVar = this.e;
            atuVar.getClass();
            bcq f = atlVar.a(atuVar.c.a()).f();
            f.getClass();
            Iterator it = atlVar.c.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                ath athVar = (ath) next;
                if (!ffkj.e(athVar.a(), ath.a)) {
                    bem a = athVar.a();
                    synchronized (bej.a) {
                    }
                    this.f.getClass();
                }
            }
            bcf bcfVar = bci.a;
            bks bksVar = new bks(f.k(), ((bch) bcfVar).f);
            synchronized (this.a) {
                obj = this.g.get(bksVar);
                if (obj == null) {
                    obj = new bba(f, bcfVar);
                    this.g.put(bksVar, obj);
                }
            }
            return (bba) obj;
        } finally {
            Trace.endSection();
        }
    }

    public final void b(int i) {
        atu atuVar = this.e;
        if (atuVar == null) {
            return;
        }
        asb asbVar = (asb) ((agk) atuVar.a()).b;
        if (i != asbVar.e) {
            Iterator it = asbVar.a.iterator();
            while (it.hasNext()) {
                ((aya) it.next()).a();
            }
        }
        asbVar.e = i;
    }

    public final void c() {
        ozg.a("CX:unbindAll");
        try {
            biw.b();
            b(0);
            LifecycleCameraRepository lifecycleCameraRepository = this.d;
            synchronized (lifecycleCameraRepository.c) {
                Iterator it = lifecycleCameraRepository.d.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.d.get((bpy) it.next());
                    synchronized (lifecycleCamera.a) {
                        bla blaVar = lifecycleCamera.c;
                        blaVar.g(blaVar.d());
                    }
                    lifecycleCameraRepository.d(lifecycleCamera.a());
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void e() {
        atu atuVar = this.e;
        if (atuVar == null) {
            return;
        }
        atuVar.a();
    }
}
