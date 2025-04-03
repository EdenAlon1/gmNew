package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sl extends vk {
    private final sn a;

    @SafeVarargs
    public sl(sk skVar, vk... vkVarArr) {
        sn snVar;
        int size;
        List asList = Arrays.asList(vkVarArr);
        this.a = new sn(this, skVar);
        Iterator it = asList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                super.B(false);
                return;
            }
            vk vkVar = (vk) it.next();
            snVar = this.a;
            size = snVar.e.size();
            if (size < 0 || size > snVar.e.size()) {
                break;
            }
            if (vkVar.b) {
                Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            int size2 = snVar.e.size();
            while (true) {
                if (i >= size2) {
                    i = -1;
                    break;
                } else if (((uu) snVar.e.get(i)).b == vkVar) {
                    break;
                } else {
                    i++;
                }
            }
            if ((i == -1 ? null : (uu) snVar.e.get(i)) == null) {
                uu uuVar = new uu(vkVar, snVar, snVar.b, snVar.f.a);
                snVar.e.add(size, uuVar);
                Iterator it2 = snVar.c.iterator();
                while (it2.hasNext()) {
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) it2.next()).get();
                    if (recyclerView != null) {
                        vkVar.hc(recyclerView);
                    }
                }
                if (uuVar.d > 0) {
                    snVar.a.w(snVar.a(uuVar), uuVar.d);
                }
                snVar.d();
            }
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + snVar.e.size() + ". Given:" + size);
    }

    @Override // defpackage.vk
    public final int a() {
        Iterator it = this.a.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((uu) it.next()).d;
        }
        return i;
    }

    @Override // defpackage.vk
    public final int dD(vk vkVar, wr wrVar, int i) {
        sn snVar = this.a;
        uu uuVar = (uu) snVar.d.get(wrVar);
        if (uuVar == null) {
            return -1;
        }
        int a = i - snVar.a(uuVar);
        int a2 = uuVar.b.a();
        if (a >= 0 && a < a2) {
            return uuVar.b.dD(vkVar, wrVar, a);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + a + " which is out of bounds for the adapter with size " + a2 + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + wrVar + "adapter:" + vkVar);
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        sn snVar = this.a;
        sm b = snVar.b(i);
        uu uuVar = b.a;
        int b2 = uuVar.a.b(uuVar.b.dE(b.b));
        snVar.f(b);
        return b2;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        uu a = this.a.b.a(i);
        return a.b.e(viewGroup, a.a.a(i));
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        sn snVar = this.a;
        sm b = snVar.b(i);
        snVar.d.put(wrVar, b.a);
        uu uuVar = b.a;
        uuVar.b.o(wrVar, b.b);
        snVar.f(b);
    }

    @Override // defpackage.vk
    public final void h(RecyclerView recyclerView) {
        sn snVar = this.a;
        int size = snVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) snVar.c.get(size);
            if (weakReference.get() == null) {
                snVar.c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                snVar.c.remove(size);
                break;
            }
        }
        Iterator it = snVar.e.iterator();
        while (it.hasNext()) {
            ((uu) it.next()).b.h(recyclerView);
        }
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        sn snVar = this.a;
        sm b = snVar.b(i);
        uu uuVar = b.a;
        uuVar.b.hb(b.b);
        xz xzVar = uuVar.e;
        snVar.f(b);
        return -1L;
    }

    @Override // defpackage.vk
    public final void hc(RecyclerView recyclerView) {
        sn snVar = this.a;
        Iterator it = snVar.c.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        snVar.c.add(new WeakReference(recyclerView));
        Iterator it2 = snVar.e.iterator();
        while (it2.hasNext()) {
            ((uu) it2.next()).b.hc(recyclerView);
        }
    }

    @Override // defpackage.vk
    public final void i(wr wrVar) {
        this.a.c(wrVar).b.i(wrVar);
    }

    @Override // defpackage.vk
    public final void j(wr wrVar) {
        this.a.c(wrVar).b.j(wrVar);
    }

    @Override // defpackage.vk
    public final void k(wr wrVar) {
        sn snVar = this.a;
        uu uuVar = (uu) snVar.d.get(wrVar);
        if (uuVar == null) {
            throw new IllegalStateException(a.j(snVar, wrVar, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
        }
        uuVar.b.k(wrVar);
        snVar.d.remove(wrVar);
    }

    @Override // defpackage.vk
    public final boolean l(wr wrVar) {
        sn snVar = this.a;
        uu uuVar = (uu) snVar.d.get(wrVar);
        if (uuVar == null) {
            throw new IllegalStateException(a.j(snVar, wrVar, "Cannot find wrapper for ", ", seems like it is not bound by this adapter: "));
        }
        boolean l = uuVar.b.l(wrVar);
        snVar.d.remove(wrVar);
        return l;
    }

    final void m(int i) {
        super.E(i);
    }
}
