package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.SidecarCompat.TranslatingCallback;
import androidx.window.sidecar.SidecarInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pnh implements pmi {
    public static volatile pnh a;
    public static final ReentrantLock b = new ReentrantLock();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final pmt d;

    public pnh(pmt pmtVar) {
        this.d = pmtVar;
        if (pmtVar != null) {
            SidecarCompat sidecarCompat = (SidecarCompat) pmtVar;
            sidecarCompat.e = new pnc(new pne(this));
            SidecarInterface sidecarInterface = sidecarCompat.a;
            if (sidecarInterface != null) {
                sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(sidecarCompat.new TranslatingCallback(), null));
            }
        }
    }

    @Override // defpackage.pmi
    public final void a(Context context, Executor executor, ksp kspVar) {
        Object obj;
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            pmt pmtVar = this.d;
            if (pmtVar == null) {
                kspVar.accept(new pmd(ffel.a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            boolean z = false;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (ffkj.e(((png) it.next()).a, context)) {
                        z = true;
                        break;
                    }
                }
            }
            png pngVar = new png((Activity) context, executor, kspVar);
            this.c.add(pngVar);
            if (z) {
                Iterator it2 = this.c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (ffkj.e(context, ((png) obj).a)) {
                            break;
                        }
                    }
                }
                png pngVar2 = (png) obj;
                pmd pmdVar = pngVar2 != null ? pngVar2.c : null;
                if (pmdVar != null) {
                    pngVar.a(pmdVar);
                }
            } else {
                IBinder a2 = pnb.a((Activity) context);
                if (a2 != null) {
                    ((SidecarCompat) pmtVar).b(a2, (Activity) context);
                } else {
                    ((Activity) context).getWindow().getDecorView().addOnAttachStateChangeListener(new pnd((SidecarCompat) pmtVar, (Activity) context));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.app.Activity, java.lang.Object, kop] */
    @Override // defpackage.pmi
    public final void b(ksp kspVar) {
        IBinder a2;
        SidecarInterface sidecarInterface;
        synchronized (b) {
            if (this.d == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                png pngVar = (png) it.next();
                if (pngVar.b == kspVar) {
                    pngVar.getClass();
                    arrayList.add(pngVar);
                }
            }
            this.c.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ?? r1 = ((png) it2.next()).a;
                CopyOnWriteArrayList copyOnWriteArrayList = this.c;
                if (!copyOnWriteArrayList.isEmpty()) {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        if (ffkj.e(((png) it3.next()).a, r1)) {
                            break;
                        }
                    }
                }
                pmt pmtVar = this.d;
                if (pmtVar != null && (a2 = pnb.a(r1)) != null) {
                    SidecarInterface sidecarInterface2 = ((SidecarCompat) pmtVar).a;
                    if (sidecarInterface2 != null) {
                        sidecarInterface2.onWindowLayoutChangeListenerRemoved(a2);
                    }
                    ksp kspVar2 = (ksp) ((SidecarCompat) pmtVar).d.get(r1);
                    if (kspVar2 != null) {
                        r1.g(kspVar2);
                        ((SidecarCompat) pmtVar).d.remove(r1);
                    }
                    pnc pncVar = ((SidecarCompat) pmtVar).e;
                    if (pncVar != null) {
                        ReentrantLock reentrantLock = pncVar.a;
                        reentrantLock.lock();
                        try {
                            pncVar.b.put(r1, null);
                            reentrantLock.unlock();
                        } finally {
                        }
                    }
                    int size = ((SidecarCompat) pmtVar).c.size();
                    ((SidecarCompat) pmtVar).c.remove(a2);
                    if (size == 1 && (sidecarInterface = ((SidecarCompat) pmtVar).a) != null) {
                        sidecarInterface.onDeviceStateListenersChanged(true);
                    }
                }
            }
        }
    }
}
