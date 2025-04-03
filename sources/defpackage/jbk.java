package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbk implements ComponentCallbacks2 {
    final /* synthetic */ Configuration a;
    final /* synthetic */ jid b;

    public jbk(Configuration configuration, jid jidVar) {
        this.a = configuration;
        this.b = jidVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        jid jidVar = this.b;
        int updateFrom = this.a.updateFrom(configuration);
        Iterator it = jidVar.a.entrySet().iterator();
        while (it.hasNext()) {
            jib jibVar = (jib) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (jibVar == null || Configuration.needNewResources(updateFrom, jibVar.b)) {
                it.remove();
            }
        }
        this.a.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @ffbs
    public final void onLowMemory() {
        this.b.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.b.a();
    }
}
