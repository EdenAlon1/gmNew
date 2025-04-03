package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecjt implements ecje {
    public final errm a;
    public final fazb b;

    public ecjt(ecjd ecjdVar, final Context context, errm errmVar, fazb fazbVar, ffbr ffbrVar, final ffbr ffbrVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        ecjdVar.a(errmVar, fazbVar, ffbrVar);
        this.a = errmVar;
        this.b = fazbVar;
        emys.a(new emyl() { // from class: ecjr
            @Override // defpackage.emyl
            public final Object get() {
                ecjt ecjtVar = ecjt.this;
                Context context2 = context;
                synchronized (ecjtVar) {
                    String b = echh.b();
                    String v = a.v(b, ".trace");
                    File file = new File(context2.getFilesDir(), a.t(b, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "<init>", 117, "CpuProfilingService.java")).q("Could not create directory");
                        return emux.a;
                    }
                    File file2 = new File(file, v);
                    file2.deleteOnExit();
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                    } catch (RuntimeException e) {
                        ((enrr) ((enrr) ((enrr) ecdj.a.e()).g(e)).h("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", (char) 368, "CpuProfilingService.java")).q("Exception when clearing trace file.");
                    }
                    return emxc.j(file2);
                }
            }
        });
        emys.a(new emyl() { // from class: ecjs
            @Override // defpackage.emyl
            public final Object get() {
                return (ecju) ffbr.this.b();
            }
        });
    }

    public final synchronized void a() {
    }

    @Override // defpackage.ecje
    public final void n() {
        erqt.l(new Runnable() { // from class: ecjq
            @Override // java.lang.Runnable
            public final void run() {
                ecjt.this.a();
            }
        }, this.a);
    }
}
