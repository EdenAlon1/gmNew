package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klk implements Runnable {
    final /* synthetic */ Application a;
    final /* synthetic */ klm b;

    public klk(Application application, klm klmVar) {
        this.a = application;
        this.b = klmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.unregisterActivityLifecycleCallbacks(this.b);
    }
}
