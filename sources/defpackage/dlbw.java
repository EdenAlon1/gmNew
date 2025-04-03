package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneSchedulerWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbw extends pqy {
    private final dlbl a;
    private final akkm b;

    public dlbw(dlbl dlblVar, akkm akkmVar) {
        dlblVar.getClass();
        akkmVar.getClass();
        this.a = dlblVar;
        this.b = akkmVar;
    }

    @Override // defpackage.pqy
    public final ppr a(Context context, String str, WorkerParameters workerParameters) {
        if (ffkj.e(str, PersephoneDownloadWorker.class.getName())) {
            return this.a.a(context, workerParameters);
        }
        if (ffkj.e(str, PersephoneSchedulerWorker.class.getName())) {
            return new PersephoneSchedulerWorker(context, workerParameters, this.b.a.a.dC());
        }
        return null;
    }
}
