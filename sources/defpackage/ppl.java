package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppl {
    public static final ListenableFuture a(final Executor executor, final String str, final ffix ffixVar) {
        executor.getClass();
        return kfg.a(new kfd() { // from class: ppf
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                kfbVar.a(new Runnable() { // from class: pph
                    @Override // java.lang.Runnable
                    public final void run() {
                        atomicBoolean.set(true);
                    }
                }, poy.a);
                final ffix ffixVar2 = ffixVar;
                executor.execute(new Runnable() { // from class: ppi
                    @Override // java.lang.Runnable
                    public final void run() {
                        kfb kfbVar2 = kfbVar;
                        ffix ffixVar3 = ffixVar2;
                        if (atomicBoolean.get()) {
                            return;
                        }
                        try {
                            kfbVar2.b(ffixVar3.invoke());
                        } catch (Throwable th) {
                            kfbVar2.c(th);
                        }
                    }
                });
                return str;
            }
        });
    }

    public static /* synthetic */ ListenableFuture b(final ffhd ffhdVar, final ffjm ffjmVar) {
        final ffsm ffsmVar = ffsm.a;
        ffhdVar.getClass();
        ffsmVar.getClass();
        return kfg.a(new kfd() { // from class: ppg
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                ffhd ffhdVar2 = ffhd.this;
                final ffud ffudVar = (ffud) ffhdVar2.get(ffud.c);
                kfbVar.a(new Runnable() { // from class: ppj
                    @Override // java.lang.Runnable
                    public final void run() {
                        ffud ffudVar2 = ffud.this;
                        if (ffudVar2 != null) {
                            ffudVar2.t(null);
                        }
                    }
                }, poy.a);
                return ffqy.d(ffsl.b(ffhdVar2), null, ffsmVar, new ppk(ffjmVar, kfbVar, null), 1);
            }
        });
    }
}
