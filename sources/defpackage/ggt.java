package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggt implements OnBackAnimationCallback {
    final /* synthetic */ ffsk a;
    final /* synthetic */ cxj b;
    final /* synthetic */ ffix c;

    public ggt(ffsk ffskVar, cxj cxjVar, ffix ffixVar) {
        this.a = ffskVar;
        this.b = cxjVar;
        this.c = ffixVar;
    }

    public final void onBackCancelled() {
        ffqy.d(this.a, null, null, new ggq(this.b, null), 3);
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ffqy.d(this.a, null, null, new ggr(this.b, backEvent, null), 3);
    }

    public final void onBackStarted(BackEvent backEvent) {
        ffqy.d(this.a, null, null, new ggs(this.b, backEvent, null), 3);
    }
}
