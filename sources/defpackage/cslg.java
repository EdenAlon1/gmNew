package defpackage;

import android.os.AsyncTask;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cslg extends csld {
    private final WeakReference a;

    public cslg(cslh cslhVar) {
        super("SafeAsyncTask.doInBackground");
        this.a = new WeakReference(cslhVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        cslh cslhVar = (cslh) this.a.get();
        if (cslhVar != null && cslhVar.getStatus() == AsyncTask.Status.RUNNING) {
            ensk j = cslh.d.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncTask$TimeoutTracker", "run", 180, "SafeAsyncTask.java")).t("%s timed out and is canceled", cslhVar);
            cslhVar.cancel(true);
        }
    }
}
