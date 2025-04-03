package defpackage;

import android.os.Process;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpcb implements fbba {
    public static errm a() {
        ersf ersfVar = new ersf();
        ersfVar.c(true);
        ersfVar.d("Audio #%d");
        ersfVar.a = new ThreadFactory() { // from class: dpby
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                runnable.getClass();
                return new Thread(new Runnable() { // from class: dpbz
                    @Override // java.lang.Runnable
                    public final void run() {
                        Process.setThreadPriority(-16);
                        runnable.run();
                    }
                });
            }
        };
        errm b = errs.b(Executors.newScheduledThreadPool(2, ersf.b(ersfVar)));
        b.getClass();
        return b;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
