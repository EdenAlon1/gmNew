package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhb implements lkp {
    final /* synthetic */ ffsk a;
    final /* synthetic */ hie b;
    final /* synthetic */ hjh c;
    final /* synthetic */ fflb d;
    final /* synthetic */ View e;

    public jhb(ffsk ffskVar, hie hieVar, hjh hjhVar, fflb fflbVar, View view) {
        this.a = ffskVar;
        this.b = hieVar;
        this.c = hjhVar;
        this.d = fflbVar;
        this.e = view;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        int ordinal = lkiVar.ordinal();
        ffrf ffrfVar = null;
        if (ordinal == 0) {
            ffqy.d(this.a, null, ffsm.d, new jha(this.d, this.c, lkrVar, this, this.e, null), 1);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 4) {
                this.c.x();
                return;
            } else {
                if (ordinal != 5) {
                    return;
                }
                this.c.w();
                return;
            }
        }
        hie hieVar = this.b;
        if (hieVar != null) {
            hhc hhcVar = hieVar.a;
            synchronized (hhcVar.a) {
                if (!hhcVar.a()) {
                    List list = hhcVar.b;
                    hhcVar.b = hhcVar.c;
                    hhcVar.c = list;
                    hhcVar.d = true;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((ffgu) list.get(i)).w(ffcu.a);
                    }
                    list.clear();
                }
            }
        }
        hjh hjhVar = this.c;
        synchronized (hjhVar.d) {
            if (hjhVar.p) {
                hjhVar.p = false;
                ffrfVar = hjhVar.v();
            }
        }
        if (ffrfVar != null) {
            ffrfVar.w(ffcu.a);
        }
    }
}
