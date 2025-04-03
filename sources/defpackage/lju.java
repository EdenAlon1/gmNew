package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lju implements lkp {
    private final lkc[] a;

    public lju(lkc[] lkcVarArr) {
        this.a = lkcVarArr;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        lkc[] lkcVarArr;
        new HashMap();
        int i = 0;
        while (true) {
            lkcVarArr = this.a;
            if (i >= lkcVarArr.length) {
                break;
            }
            lkcVarArr[i].a();
            i++;
        }
        for (lkc lkcVar : lkcVarArr) {
            lkcVar.a();
        }
    }
}
