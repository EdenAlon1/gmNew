package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eump implements dfsb {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.dfsb
    public final void a(boolean z) {
        synchronized (eumr.a) {
            Iterator it = new ArrayList(eumr.b.values()).iterator();
            while (it.hasNext()) {
                eumr eumrVar = (eumr) it.next();
                if (eumrVar.d.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it2 = eumrVar.g.iterator();
                    while (it2.hasNext()) {
                        ((eumo) it2.next()).a(z);
                    }
                }
            }
        }
    }
}
