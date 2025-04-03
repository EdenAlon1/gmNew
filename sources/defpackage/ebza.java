package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebza {
    public static ListenableFuture a(final dfrg dfrgVar, final emwl emwlVar, final Executor executor) {
        final SettableFuture create = SettableFuture.create();
        dfrgVar.g(new dfrm() { // from class: ebyx
            @Override // defpackage.dfrm
            public final void a(final dfrl dfrlVar) {
                Status a = dfrlVar.a();
                if (a.f == 14) {
                    throw new AssertionError("We never use the blocking API for these calls: ".concat(String.valueOf(String.valueOf(dfrlVar))));
                }
                final SettableFuture settableFuture = SettableFuture.this;
                if (a.d()) {
                    final emwl emwlVar2 = emwlVar;
                    executor.execute(new Runnable() { // from class: ebyw
                        @Override // java.lang.Runnable
                        public final void run() {
                            emwl emwlVar3 = emwlVar2;
                            SettableFuture settableFuture2 = SettableFuture.this;
                            dfrl dfrlVar2 = dfrlVar;
                            try {
                                try {
                                    settableFuture2.set(emwlVar3.apply(dfrlVar2));
                                } catch (RuntimeException e) {
                                    settableFuture2.setException(e);
                                }
                            } finally {
                                ebza.b(dfrlVar2);
                            }
                        }
                    });
                } else {
                    settableFuture.setException(new ebyn(dfrlVar, a));
                    ebza.b(dfrlVar);
                }
            }
        }, TimeUnit.SECONDS);
        create.b(eldl.l(new Runnable() { // from class: ebyy
            @Override // java.lang.Runnable
            public final void run() {
                if (SettableFuture.this.isCancelled()) {
                    dfrgVar.e();
                }
            }
        }), erpp.a);
        return create;
    }

    public static void b(dfrl dfrlVar) {
        if (dfrlVar instanceof dfri) {
            ((dfri) dfrlVar).b();
        }
    }
}
