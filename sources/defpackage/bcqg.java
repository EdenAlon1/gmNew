package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcqg implements cskg {
    public final HashSet a = new HashSet();
    public final Object b = new Object();

    public final void a() {
        HashSet hashSet;
        synchronized (this.b) {
            hashSet = (HashSet) this.a.clone();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((bcqf) it.next()).a();
        }
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        a();
    }
}
