package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffbl extends ffbh {
    private final AtomicInteger l;
    private feao m;

    public ffbl(feai feaiVar) {
        super(feaiVar);
        this.l = new AtomicInteger(new Random().nextInt());
        this.m = new feah(feak.a);
    }

    private final feao h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((ffbf) it.next()).d);
        }
        return new ffbk(arrayList, this.l);
    }

    private final void i(fdyc fdycVar, feao feaoVar) {
        if (fdycVar == this.k && feaoVar.equals(this.m)) {
            return;
        }
        this.h.f(fdycVar, feaoVar);
        this.k = fdycVar;
        this.m = feaoVar;
    }

    @Override // defpackage.ffbh
    protected final ffbf f(Object obj) {
        return new ffbj(this, obj, this.j);
    }

    @Override // defpackage.ffbh
    protected final void g() {
        ArrayList arrayList = new ArrayList();
        for (ffbf ffbfVar : this.g) {
            if (ffbfVar.c == fdyc.READY) {
                arrayList.add(ffbfVar);
            }
        }
        if (!arrayList.isEmpty()) {
            i(fdyc.READY, h(arrayList));
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            fdyc fdycVar = ((ffbf) it.next()).c;
            fdyc fdycVar2 = fdyc.CONNECTING;
            if (fdycVar == fdycVar2 || fdycVar == fdyc.IDLE) {
                i(fdycVar2, new feah(feak.a));
                return;
            }
        }
        i(fdyc.TRANSIENT_FAILURE, h(this.g));
    }
}
