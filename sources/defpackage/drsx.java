package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drsx implements fbba {
    public static fdxk a(Application application, final drsy drsyVar, feef feefVar, feey feeyVar, Executor executor, ScheduledExecutorService scheduledExecutorService, Executor executor2) {
        feei feeiVar = drsv.a;
        executor.getClass();
        scheduledExecutorService.getClass();
        executor2.getClass();
        feej s = feej.s(feefVar, application);
        s.g(executor);
        s.u(executor2);
        s.j(scheduledExecutorService);
        s.v(scheduledExecutorService);
        s.x(drsv.a);
        s.w(feeyVar);
        return fdxr.b(s.a(), new duiy(new emyl() { // from class: drsu
            @Override // defpackage.emyl
            public final Object get() {
                feei feeiVar2 = drsv.a;
                return Boolean.valueOf(drsy.this.a);
            }
        }));
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
