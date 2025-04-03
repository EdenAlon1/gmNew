package defpackage;

import android.os.Trace;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqf {
    public static final pqb a(pof pofVar, final String str, final Executor executor, final ffix ffixVar) {
        executor.getClass();
        final llg llgVar = new llg(pqb.b);
        return new pqc(kfg.a(new kfd() { // from class: pqd
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final String str2 = str;
                final ffix ffixVar2 = ffixVar;
                final llg llgVar2 = llgVar;
                executor.execute(new Runnable() { // from class: pqe
                    @Override // java.lang.Runnable
                    public final void run() {
                        kfb kfbVar2 = kfbVar;
                        llg llgVar3 = llgVar2;
                        ffix ffixVar3 = ffixVar2;
                        String str3 = str2;
                        boolean c = ozg.c();
                        if (c) {
                            try {
                                ozg.a(str3);
                            } finally {
                                if (c) {
                                    Trace.endSection();
                                }
                            }
                        }
                        try {
                            ffixVar3.invoke();
                            llgVar3.j(pqb.a);
                            kfbVar2.b(pqb.a);
                        } catch (Throwable th) {
                            llgVar3.j(new ppx(th));
                            kfbVar2.c(th);
                        }
                    }
                });
                return ffcu.a;
            }
        }));
    }
}
