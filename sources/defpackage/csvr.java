package defpackage;

import java.util.concurrent.CancellationException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csvr implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public csvr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof CancellationException) {
            ((ensz) ((ensz) entd.c(this.a).a(Level.WARNING).g(th)).h("com/google/android/apps/messaging/shared/util/future/BugleFutures", "logCancel", 118, "BugleFutures.java")).q("task cancelled");
            return;
        }
        String str = this.a;
        ((ensz) ((ensz) entd.c(str).a(Level.SEVERE).g(th)).h("com/google/android/apps/messaging/shared/util/future/BugleFutures", "logFailure", 105, "BugleFutures.java")).q(this.b);
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
    }
}
