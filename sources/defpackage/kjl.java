package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kjl extends kjk {
    public int m;

    public kjl(kjv kjvVar) {
        super(kjvVar);
        this.l = true != (kjvVar instanceof kjq) ? 3 : 2;
    }

    @Override // defpackage.kjk
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((kji) it.next()).f();
        }
    }
}
