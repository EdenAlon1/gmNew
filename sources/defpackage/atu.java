package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.camera2.Camera2Config$DefaultProvider;
import androidx.camera.core.impl.MetadataHolderService;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atu {
    public static final Object a = new Object();
    public static final SparseArray b = new SparseArray();
    public final bda c;
    public final Object d;
    public final atw e;
    public final Executor f;
    public final Handler g;
    public final HandlerThread h;
    public bcp i;
    public bhl j;
    public final awq k;
    public final ListenableFuture l;
    public ListenableFuture m;
    public final Integer n;
    public int o;
    public aju p;

    public atu(final Context context) {
        ListenableFuture a2;
        bfw bfwVar = new bfw();
        this.c = new bda();
        Object obj = new Object();
        this.d = obj;
        boolean z = true;
        this.o = 1;
        this.m = bkj.b(null);
        Camera2Config$DefaultProvider f = f(context);
        if (f == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        atw cameraXConfig = f.getCameraXConfig();
        this.e = cameraXConfig;
        Object obj2 = (bfs) cameraXConfig.k.m(atw.j, null);
        if (obj2 != null) {
            Objects.toString(obj2);
            avw.a("CameraX", "QuirkSettings from CameraXConfig: ".concat(obj2.toString()));
        } else {
            obj2 = bfwVar.a(context);
            Objects.toString(obj2);
            avw.a("CameraX", "QuirkSettings from app metadata: ".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            obj2 = bfu.a;
            Objects.toString(obj2);
            avw.a("CameraX", "QuirkSettings by default: ".concat(String.valueOf(obj2)));
        }
        bfu.b.c.e(obj2);
        Executor executor = (Executor) cameraXConfig.k.m(atw.d, null);
        Handler handler = (Handler) cameraXConfig.k.m(atw.e, null);
        this.f = executor == null ? new atg() : executor;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.h = handlerThread;
            handlerThread.start();
            this.g = kqv.a(handlerThread.getLooper());
        } else {
            this.h = null;
            this.g = handler;
        }
        Integer num = (Integer) bfy.c(cameraXConfig, atw.f, null);
        this.n = num;
        synchronized (a) {
            if (num != null) {
                ksw.e(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = b;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                d();
            }
        }
        awq awqVar = (awq) cameraXConfig.k.m(atw.i, awq.b);
        awqVar.getClass();
        awqVar.b();
        this.k = awqVar instanceof bga ? ((bga) awqVar).c() : new bgy(awqVar);
        synchronized (obj) {
            if (this.o != 1) {
                z = false;
            }
            ksw.d(z, "CameraX.initInternal() should only be called once per instance");
            this.o = 2;
            a2 = kfg.a(new kfd() { // from class: ats
                @Override // defpackage.kfd
                public final Object a(kfb kfbVar) {
                    atu atuVar = atu.this;
                    atuVar.b(atuVar.f, SystemClock.elapsedRealtime(), 1, context, kfbVar);
                    return "CameraX initInternal";
                }
            });
        }
        this.l = a2;
    }

    public static void d() {
        SparseArray sparseArray = b;
        if (sparseArray.size() == 0) {
            avw.a = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            avw.a = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            avw.a = 4;
        } else if (sparseArray.get(5) != null) {
            avw.a = 5;
        } else if (sparseArray.get(6) != null) {
            avw.a = 6;
        }
    }

    public static final void e(bcu bcuVar) {
        if (ozg.c()) {
            ozg.b("CX:CameraProvider-RetryStatus", bcuVar != null ? bcuVar.a : -1);
        }
    }

    private static Camera2Config$DefaultProvider f(Context context) {
        Context a2 = bhv.a(context);
        while (true) {
            if (!(a2 instanceof ContextWrapper)) {
                break;
            }
            if (a2 instanceof Application) {
                break;
            }
            a2 = ((ContextWrapper) a2).getBaseContext();
        }
        try {
            Context a3 = bhv.a(context);
            ServiceInfo serviceInfo = a3.getPackageManager().getServiceInfo(new ComponentName(a3, (Class<?>) MetadataHolderService.class), 640);
            String string = serviceInfo.metaData != null ? serviceInfo.metaData.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (Camera2Config$DefaultProvider) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            avw.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            avw.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    public final bcp a() {
        bcp bcpVar = this.i;
        if (bcpVar != null) {
            return bcpVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public final void b(final Executor executor, final long j, final int i, final Context context, final kfb kfbVar) {
        executor.execute(new Runnable() { // from class: atr
            /* JADX WARN: Can't wrap try/catch for region: R(24:14|(3:16|9e|24)|30|cc|46|(2:48|(2:50|(6:52|53|(2:55|56)|57|58|59)(2:60|61)))|(3:96|97|(6:99|53|(0)|57|58|59)(1:101))(1:63)|64|65|66|(2:71|72)|74|75|76|(2:81|82)|84|85|86|(2:88|89)|53|(0)|57|58|59) */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x023b, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x023c, code lost:
            
                defpackage.avw.g("CameraValidator", "Camera LENS_FACING_FRONT verification failed", r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x0217, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x0218, code lost:
            
                defpackage.avw.g("CameraValidator", "Camera LENS_FACING_BACK verification failed", r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:120:0x02da  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x0327  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x025b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 895
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.atr.run():void");
            }
        });
    }

    public final void c() {
        synchronized (this.d) {
            this.o = 4;
        }
    }
}
