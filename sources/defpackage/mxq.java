package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxq {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(mxr mxrVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            mxp mxpVar = (mxp) it.next();
            if (mxpVar.b == mxrVar) {
                mxpVar.c = true;
                this.a.remove(mxpVar);
            }
        }
    }
}
