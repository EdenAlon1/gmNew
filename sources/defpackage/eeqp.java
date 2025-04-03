package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeqp implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Set set = eeqo.a;
        efbd.c();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Set set = eeqo.a;
        efbd.c();
        eeqo.b = i;
        Iterator it = eeqo.a.iterator();
        while (it.hasNext()) {
            ((eeqm) it.next()).b(i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
