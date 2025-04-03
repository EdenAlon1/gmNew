package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edam implements edav {
    private static boolean b;
    public final emyl a;
    private final emyl c;
    private final int d;

    public edam(emyl emylVar) {
        emyl emylVar2 = new emyl() { // from class: edaj
            @Override // defpackage.emyl
            public final Object get() {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                boolean z = false;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    Log.i("PhenotypeProcessReaper", "Memory state is: " + runningAppProcessInfo.importance);
                    if (runningAppProcessInfo.importance >= 400) {
                        z = true;
                    }
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                return Boolean.valueOf(z);
            }
        };
        this.c = emylVar;
        this.d = Math.max(5, 10);
        this.a = emylVar2;
    }

    @Override // defpackage.edav
    public final void a() {
        synchronized (edam.class) {
            if (!b) {
                Runnable runnable = new Runnable() { // from class: edak
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (((Boolean) edam.this.a.get()).booleanValue()) {
                            Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                            Process.killProcess(Process.myPid());
                            System.exit(0);
                        }
                    }
                };
                long j = this.d;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                errm errmVar = (errm) this.c.get();
                edae.a(errmVar.schedule(new edal(runnable, errmVar, j, timeUnit), j, timeUnit));
                b = true;
            }
        }
    }
}
