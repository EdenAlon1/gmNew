package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dycq extends pqy {
    private final akmc a;

    public dycq(akmc akmcVar) {
        this.a = akmcVar;
    }

    @Override // defpackage.pqy
    public final ppr a(Context context, String str, WorkerParameters workerParameters) {
        Log.d("MddListenableWorkerFactory", "createWorker for class: ".concat(str));
        akmc akmcVar = this.a;
        akmcVar.b = workerParameters;
        fbbe.a(akmcVar.b, WorkerParameters.class);
        ffbr ffbrVar = (ffbr) enhk.l("com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker", new akme(akmcVar.a, akmcVar.b).b).get(str);
        if (ffbrVar == null) {
            return null;
        }
        return (ppr) ffbrVar.b();
    }
}
