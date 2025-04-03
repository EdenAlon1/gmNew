package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbu extends bbt {
    public final List a = new ArrayList();

    public bbu(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bbt bbtVar = (bbt) it.next();
            if (!(bbtVar instanceof bbv)) {
                this.a.add(bbtVar);
            }
        }
    }

    @Override // defpackage.bbt
    public final void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bbt) it.next()).a(i);
        }
    }

    @Override // defpackage.bbt
    public final void b(int i, bcd bcdVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bbt) it.next()).b(i, bcdVar);
        }
    }

    @Override // defpackage.bbt
    public final void c(int i, bbx bbxVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bbt) it.next()).c(i, bbxVar);
        }
    }

    @Override // defpackage.bbt
    public final void d(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bbt) it.next()).d(i);
        }
    }
}
