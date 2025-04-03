package defpackage;

import android.content.Context;
import android.os.SystemClock;
import defpackage.cslb;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cslc extends csld {
    final /* synthetic */ csld a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cslc(String str, csld csldVar, Context context) {
        super(str);
        this.a = csldVar;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.a.run();
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            synchronized (f) {
                f.remove(this.a);
            }
            cskz cH = ((cslb.a) ekhw.a(this.b, cslb.a.class)).cH();
            if (cH != null) {
                cH.k(this.h, elapsedRealtime2, e);
            }
        } catch (IllegalStateException e) {
            ensk j = csld.g.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncRunnable$1", "run", 'U', "SafeAsyncRunnable.java")).q("Exception in SafeAsyncRunnable");
        }
    }
}
