package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eunj {
    private static WeakReference a;

    public static synchronized eunj d(Context context) {
        synchronized (eunj.class) {
            dfwv.n(context);
            WeakReference weakReference = a;
            eunj eunjVar = weakReference == null ? null : (eunj) weakReference.get();
            if (eunjVar != null) {
                return eunjVar;
            }
            euor euorVar = new euor(context.getApplicationContext());
            a = new WeakReference(euorVar);
            return euorVar;
        }
    }

    public abstract dhre a(String... strArr);

    public abstract dhre b();

    public abstract dhre c(eunt... euntVarArr);
}
