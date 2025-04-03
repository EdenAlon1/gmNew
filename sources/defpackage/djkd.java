package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djkd {
    public final Context a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final djkc c;
    public int d;

    public djkd(Context context) {
        this.a = context;
        d();
        dkty.c("Use network callbacks", new Object[0]);
        this.c = new djkb(this);
    }

    public final void a(djjk djjkVar) {
        this.b.add(djjkVar);
    }

    final void b(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            djjk djjkVar = (djjk) it.next();
            if (djjkVar.shouldTriggerOnCapabilitiesChanged() || !z) {
                djjkVar.onConnectivityChange(this.a, this.d);
            }
        }
    }

    public final void c(djjk djjkVar) {
        this.b.remove(djjkVar);
    }

    public final void d() {
        NetworkInfo networkInfo;
        try {
            networkInfo = dkvo.f(this.a).d();
        } catch (dkvd e) {
            dkty.s(e, "Can't get active network info, missing permissions.", new Object[0]);
            networkInfo = null;
        }
        int i = 2;
        if (networkInfo != null && networkInfo.isConnected()) {
            i = 1;
        }
        this.d = i;
    }
}
