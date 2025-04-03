package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtaq implements mw {
    final /* synthetic */ List a;
    final /* synthetic */ dtau b;
    final /* synthetic */ RecyclerView c;
    final /* synthetic */ ffix d;
    final /* synthetic */ vk e;

    public dtaq(List list, dtau dtauVar, RecyclerView recyclerView, ffix ffixVar, vk vkVar) {
        this.a = list;
        this.b = dtauVar;
        this.c = recyclerView;
        this.d = ffixVar;
        this.e = vkVar;
    }

    private final void e(List list) {
        Object obj;
        if (this.b.b && this.c.aF()) {
            return;
        }
        ffix ffixVar = this.d;
        vk vkVar = this.e;
        ffdb ffdbVar = new ffdb((ffde) ffixVar.invoke());
        int i = 0;
        while (ffdbVar.hasNext()) {
            Object next = ffdbVar.next();
            int i2 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            doxx doxxVar = (doxx) next;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (doxw.a((doxx) obj, doxxVar)) {
                        break;
                    }
                }
            }
            if (obj != null) {
                vkVar.q(i);
            }
            i = i2;
        }
    }

    @Override // defpackage.mw
    public final void a(int i, int i2, Object obj) {
        List list = this.a;
        e(list.subList(i, list.size()));
    }

    @Override // defpackage.mw
    public final void b(int i, int i2) {
        List list = this.a;
        e(list.subList(i, list.size()));
    }

    @Override // defpackage.mw
    public final void c(int i, int i2) {
        e(this.a.subList(i, i2));
    }

    @Override // defpackage.mw
    public final void d(int i, int i2) {
        List list = this.b.d;
        e(list.subList(i, list.size()));
    }
}
