package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fazv implements fazj, fbaq {
    public final Set a = new HashSet();
    private boolean b = false;

    @Override // defpackage.fbaq
    public final void a(fbap fbapVar) {
        fazo.a();
        c();
        this.a.add(fbapVar);
    }

    public final void b() {
        fazo.a();
        this.b = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fbap) it.next()).g();
        }
    }

    public final void c() {
        if (this.b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
    }
}
