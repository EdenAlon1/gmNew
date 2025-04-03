package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mj extends vk {
    public final mh a;
    private final mi d;

    protected mj(mc mcVar) {
        mi miVar = new mi();
        this.d = miVar;
        mh mhVar = new mh(new ml(this), mcVar);
        this.a = mhVar;
        mhVar.a(miVar);
    }

    @Override // defpackage.vk
    public int a() {
        return this.a.e.size();
    }

    public final Object b(int i) {
        return this.a.e.get(i);
    }

    public void c(List list) {
        mh mhVar = this.a;
        int i = mhVar.f + 1;
        mhVar.f = i;
        List list2 = mhVar.d;
        if (list == list2) {
            return;
        }
        List list3 = mhVar.e;
        if (list == null) {
            int size = list2.size();
            mhVar.d = null;
            mhVar.e = Collections.EMPTY_LIST;
            mhVar.a.d(0, size);
            mhVar.b();
            return;
        }
        if (list2 != null) {
            mhVar.b.a.execute(new mf(mhVar, list2, list, i));
            return;
        }
        mhVar.d = list;
        mhVar.e = DesugarCollections.unmodifiableList(list);
        mhVar.a.b(0, list.size());
        mhVar.b();
    }

    protected mj(mr mrVar) {
        mi miVar = new mi();
        this.d = miVar;
        mh mhVar = new mh(new ml(this), new mb(mrVar).a());
        this.a = mhVar;
        mhVar.a(miVar);
    }
}
