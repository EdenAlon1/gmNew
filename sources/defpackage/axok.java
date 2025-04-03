package defpackage;

import java.util.concurrent.CancellationException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axok implements erqj {
    final /* synthetic */ Level a;

    public axok(Level level) {
        this.a = level;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        th.getClass();
        if (th instanceof CancellationException) {
            ((enrr) axom.a.a(this.a).g(th).h("com/google/android/apps/messaging/shared/concurrent/FuturesKtKt$logCancellation$1", "onFailure", 231, "FuturesKt.kt")).q("Future was cancelled.");
        }
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
    }
}
