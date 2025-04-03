package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtqj {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(dtpx dtpxVar, dtqk dtqkVar) {
        final ExecutorService threadPoolExecutor;
        dfqt dfqtVar = dhkk.a;
        dtpu dtpuVar = (dtpu) dtpxVar;
        final dhlf dhlfVar = new dhlf(dtpuVar.a);
        String valueOf = String.valueOf(dtpuVar.a.getPackageName());
        Integer num = dtqkVar.a;
        Context context = dtpuVar.a;
        if (num == null) {
            try {
                dtqkVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                dtqkVar.a = -1;
            }
        }
        final String concat = "com.google.android.libraries.consentverifier#".concat(valueOf);
        dhre c2 = dhlfVar.c(concat, dtqkVar.a.intValue(), c, null);
        if (dtpz.a(dtpuVar.a)) {
            dgxv dgxvVar = dgxw.a;
            threadPoolExecutor = dgxv.d(10);
        } else {
            RejectedExecutionHandler rejectedExecutionHandler = dtqn.a;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            ersf ersfVar = new ersf();
            ersfVar.d("ConsentVerifierLibraryThread-%d");
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, ersf.b(ersfVar), dtqn.a);
        }
        try {
            c2.q(threadPoolExecutor, new dhqy() { // from class: dtqg
                @Override // defpackage.dhqy
                public final void e(Object obj) {
                    boolean z = dtqj.a;
                    dhlf dhlfVar2 = dhlf.this;
                    final String str = concat;
                    dhlfVar2.n(str).p(threadPoolExecutor, new dhqv() { // from class: dtqi
                        @Override // defpackage.dhqv
                        public final void d(Exception exc) {
                            boolean z2 = dtqj.a;
                            Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", str, exc));
                        }
                    });
                }
            });
            c2.p(threadPoolExecutor, new dhqv() { // from class: dtqh
                @Override // defpackage.dhqv
                public final void d(Exception exc) {
                    boolean z = dtqj.a;
                    Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", concat, exc));
                }
            });
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", concat, e));
        }
    }
}
