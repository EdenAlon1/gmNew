package defpackage;

import android.os.AsyncTask;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diok extends AsyncTask {
    final /* synthetic */ diol a;

    public diok(diol diolVar) {
        this.a = diolVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        diol diolVar = this.a;
        synchronized (diolVar.a) {
            Iterator it = diolVar.a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        return null;
    }
}
