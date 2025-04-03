package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class erpk extends erob {
    private List b;

    public erpk(engi engiVar, boolean z) {
        super(engiVar, z, true);
        List d = engiVar.isEmpty() ? Collections.EMPTY_LIST : enkr.d(engiVar.size());
        for (int i = 0; i < engiVar.size(); i++) {
            d.add(null);
        }
        this.b = d;
    }

    @Override // defpackage.erob
    public final void e(int i, Object obj) {
        List list = this.b;
        if (list != null) {
            list.set(i, new erpj(obj));
        }
    }

    @Override // defpackage.erob
    public final void g() {
        List list = this.b;
        if (list != null) {
            set(r(list));
        }
    }

    @Override // defpackage.erob
    public final void q(int i) {
        super.q(i);
        this.b = null;
    }

    public abstract Object r(List list);
}
