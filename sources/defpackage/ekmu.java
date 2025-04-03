package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekmu implements ComponentCallbacks2 {
    final /* synthetic */ ekmz a;

    public ekmu(ekmz ekmzVar) {
        this.a = ekmzVar;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        efbd.c();
        if (this.a.a == null) {
            return;
        }
        if (i == 60 || i == 80) {
            this.a.a.p();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
