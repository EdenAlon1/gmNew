package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekno implements fbba {
    public static edyz a(Context context, final long j) {
        final Application application = (Application) context;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final eknm eknmVar = new eknm(atomicBoolean, application);
        return new edyz() { // from class: eknl
            @Override // defpackage.edyz
            public final void a() {
                Application application2 = application;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = eknmVar;
                application2.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                efbd.e(new eknn(atomicBoolean, application2, activityLifecycleCallbacks, j));
            }
        };
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
