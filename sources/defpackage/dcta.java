package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcta extends gd {
    public engw h;
    private final SparseArray i;
    private final Optional j;

    public dcta(fr frVar, Optional optional) {
        super(frVar);
        this.i = new SparseArray();
        this.j = optional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gd
    public final ea b(int i) {
        int i2;
        ea h;
        if (this.i.get(i) != null) {
            return (ea) this.i.get(i);
        }
        String h2 = ((MediaViewerItem) this.h.get(i)).h();
        if (le.A(h2)) {
            this.j.get();
            i2 = i;
            h = dcxe.k(((MediaViewerItem) this.h.get(i)).b(), 0, this.h.size(), i2, 0L, false);
        } else {
            i2 = i;
            h = dcsz.h(((MediaViewerItem) this.h.get(i2)).b(), h2, 1);
        }
        this.i.put(i2, h);
        return h;
    }

    @Override // defpackage.pco
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        this.i.remove(i);
        ea eaVar = (ea) obj;
        if (this.b == null) {
            this.b = new cg(this.a);
        }
        while (this.c.size() <= i) {
            this.c.add(null);
        }
        this.c.set(i, eaVar.aF() ? this.a.d(eaVar) : null);
        this.d.set(i, null);
        this.b.n(eaVar);
        if (eaVar.equals(this.e)) {
            this.e = null;
        }
    }

    @Override // defpackage.pco
    public final int j() {
        engw engwVar = this.h;
        if (engwVar != null) {
            return engwVar.size();
        }
        return 0;
    }
}
