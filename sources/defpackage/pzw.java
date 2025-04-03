package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzw {
    public static final pyj a(List list, pyj pyjVar) {
        list.getClass();
        boolean f = pyjVar.g.f("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean f2 = pyjVar.g.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean f3 = pyjVar.g.f("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (f || !f2 || !f3) {
            return pyjVar;
        }
        String str = pyjVar.e;
        pon ponVar = new pon();
        ponVar.b(pyjVar.g);
        ponVar.e("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return pyj.g(pyjVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", ponVar.a(), 0, 0L, 0, 0, 0L, 0, 16777195);
    }
}
