package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eunp {
    private static WeakReference a;

    public static synchronized eunp a(Context context) {
        synchronized (eunp.class) {
            dfwv.n(context);
            WeakReference weakReference = a;
            eunp eunpVar = weakReference == null ? null : (eunp) weakReference.get();
            if (eunpVar != null) {
                return eunpVar;
            }
            euov euovVar = new euov(context.getApplicationContext());
            a = new WeakReference(euovVar);
            return euovVar;
        }
    }

    public abstract void b(euof euofVar);

    public abstract void c(euof euofVar);
}
