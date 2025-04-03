package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxqd extends vk {
    private final ekyo d;
    private final List e = new ArrayList();
    public final SparseArray a = new SparseArray();

    public cxqd(ekyo ekyoVar) {
        this.d = ekyoVar;
    }

    private final cxqb H(int i) {
        for (cxqb cxqbVar : this.e) {
            if (i < cxqbVar.a.a()) {
                return cxqbVar;
            }
            i -= cxqbVar.a.a();
        }
        throw new IllegalArgumentException(a.h(i, "position not in adapter "));
    }

    public final int F(cxqb cxqbVar) {
        return m(cxqbVar.a);
    }

    public final void G(vk vkVar, int[] iArr) {
        cxqb cxqbVar = new cxqb(vkVar);
        for (int i : iArr) {
            if (this.a.indexOfKey(i) >= 0) {
                throw new IllegalArgumentException(a.B(i, " already mapped to a partition"));
            }
            this.a.put(i, cxqbVar);
        }
        cxqbVar.a.A(new cxqc(this, cxqbVar));
        this.e.add(cxqbVar);
        int F = F(cxqbVar);
        int a = vkVar.a();
        if (a > 0) {
            w(F, a);
        }
    }

    @Override // defpackage.vk
    public final int a() {
        Iterator it = this.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((cxqb) it.next()).a.a();
        }
        return i;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        cxqb H = H(i);
        return H.a.dE(i - F(H));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        cxqb cxqbVar = (cxqb) this.a.get(i);
        return new cxqa(cxqbVar, cxqbVar.a.e(viewGroup, i));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        cxqa cxqaVar = (cxqa) wrVar;
        elav a = this.d.a("CompositeRecyclerViewAdapter onBindViewHolder");
        try {
            cxqaVar.s.a.g(cxqaVar.t, i - F(H(i)));
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vk
    public final void h(RecyclerView recyclerView) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((cxqb) it.next()).a.h(recyclerView);
        }
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        cxqb H = H(i);
        return H.a.hb(i - F(H));
    }

    @Override // defpackage.vk
    public final void hc(RecyclerView recyclerView) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((cxqb) it.next()).a.hc(recyclerView);
        }
    }

    @Override // defpackage.vk
    public final /* synthetic */ void i(wr wrVar) {
        cxqa cxqaVar = (cxqa) wrVar;
        cxqaVar.s.a.i(cxqaVar.t);
    }

    @Override // defpackage.vk
    public final /* synthetic */ void j(wr wrVar) {
        cxqa cxqaVar = (cxqa) wrVar;
        cxqaVar.s.a.j(cxqaVar.t);
    }

    @Override // defpackage.vk
    public final /* synthetic */ void k(wr wrVar) {
        cxqa cxqaVar = (cxqa) wrVar;
        cxqaVar.s.a.k(cxqaVar.t);
    }

    @Override // defpackage.vk
    public final /* synthetic */ boolean l(wr wrVar) {
        cxqa cxqaVar = (cxqa) wrVar;
        return cxqaVar.s.a.l(cxqaVar.t);
    }

    public final int m(vk vkVar) {
        Iterator it = this.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            vk vkVar2 = ((cxqb) it.next()).a;
            if (vkVar2 == vkVar) {
                return i;
            }
            i += vkVar2.a();
        }
        throw new IllegalStateException("Partition not in adapter ".concat(toString()));
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void z(wr wrVar, int i, List list) {
        cxqa cxqaVar = (cxqa) wrVar;
        elav a = this.d.a("CompositeRecyclerViewAdapter onBindViewHolder");
        try {
            cxqaVar.s.a.z(cxqaVar.t, i - F(H(i)), list);
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
