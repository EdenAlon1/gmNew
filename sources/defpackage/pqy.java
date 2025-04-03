package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pqy {
    public abstract ppr a(Context context, String str, WorkerParameters workerParameters);

    public final ppr b(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        ppr a = a(context, str, workerParameters);
        if (a == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(ppr.class);
                asSubclass.getClass();
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    newInstance.getClass();
                    a = (ppr) newInstance;
                } catch (Throwable th) {
                    String concat = "Could not instantiate ".concat(str);
                    ppt.c();
                    Log.e(pqz.a, concat, th);
                    throw th;
                }
            } catch (Throwable th2) {
                String concat2 = "Invalid class: ".concat(str);
                ppt.c();
                Log.e(pqz.a, concat2, th2);
                throw th2;
            }
        }
        if (!a.d) {
            return a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
