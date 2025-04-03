package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejjy implements erqj {
    final /* synthetic */ String a;

    public ejjy(String str) {
        this.a = str;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof TimeoutException) {
            ((enrr) ((enrr) ((enrr) ejjz.a.j()).g(th)).h("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 190, "AndroidFutures.java")).t("exceeded timeout: %s", this.a);
        }
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
    }
}
