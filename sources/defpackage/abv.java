package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abv implements OnBackAnimationCallback {
    final /* synthetic */ ffji a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ffix c;
    final /* synthetic */ ffix d;

    public abv(ffji ffjiVar, ffji ffjiVar2, ffix ffixVar, ffix ffixVar2) {
        this.a = ffjiVar;
        this.b = ffjiVar2;
        this.c = ffixVar;
        this.d = ffixVar2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.invoke(new aak(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.invoke(new aak(backEvent));
    }
}
