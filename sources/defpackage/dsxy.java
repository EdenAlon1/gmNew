package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxy extends wc {
    private final dsyi a;
    private final enev b = new enev(5);

    public dsxy(dsyi dsyiVar) {
        this.a = dsyiVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        this.b.add(new dsxx(System.currentTimeMillis(), i2));
        this.a.b(i2);
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
        float f;
        enev enevVar = this.b;
        if (enevVar.size() <= 1) {
            enevVar = null;
        }
        if (enevVar != null) {
            int i2 = 0;
            Iterator it = ffdx.aC(enevVar, 1, false, new ffji() { // from class: dsxw
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    List list = (List) obj;
                    list.getClass();
                    ffdx.K(list).getClass();
                    Object P = ffdx.P(list);
                    P.getClass();
                    dsxx dsxxVar = (dsxx) P;
                    return Float.valueOf(dsxxVar.b / ((dsxxVar.a - ((dsxx) r0).a) / 1000.0f));
                }
            }).iterator();
            double d = eobe.a;
            while (it.hasNext()) {
                d += ((Number) it.next()).floatValue();
                i2++;
                if (i2 < 0) {
                    ffdx.k();
                }
            }
            f = (float) (i2 == 0 ? Double.NaN : d / i2);
        } else {
            f = 0.0f;
        }
        this.a.a(i, f);
        if (i == 0) {
            this.b.clear();
        }
    }
}
