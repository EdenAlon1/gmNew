package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkpc<ResultT> extends BroadcastReceiver {
    protected abstract void c(Context context, Intent intent);

    protected Executor d() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    protected boolean e(Context context, Intent intent) {
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (e(context, intent)) {
            new dkpb(this, context, intent, goAsync()).executeOnExecutor(csix.n() ? erpp.a : d(), new Void[0]);
        }
    }
}
