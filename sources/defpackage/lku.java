package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lku {
    public lkj a;
    private lkp b;

    public lku(lkq lkqVar, lkj lkjVar) {
        lkp lliVar;
        lkjVar.getClass();
        lky lkyVar = lky.a;
        boolean z = lkqVar instanceof lkp;
        boolean z2 = lkqVar instanceof ljv;
        if (z && z2) {
            lliVar = new ljw((ljv) lkqVar, (lkp) lkqVar);
        } else if (z2) {
            lliVar = new ljw((ljv) lkqVar, null);
        } else if (z) {
            lliVar = (lkp) lkqVar;
        } else {
            Class<?> cls = lkqVar.getClass();
            if (lky.a.a(cls) == 2) {
                Object obj = lky.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    lliVar = new lmk(lky.b((Constructor) list.get(0), lkqVar));
                } else {
                    int size = list.size();
                    lkc[] lkcVarArr = new lkc[size];
                    for (int i = 0; i < size; i++) {
                        lkcVarArr[i] = lky.b((Constructor) list.get(i), lkqVar);
                    }
                    lliVar = new lju(lkcVarArr);
                }
            } else {
                lliVar = new lli(lkqVar);
            }
        }
        this.b = lliVar;
        this.a = lkjVar;
    }

    public final void a(lkr lkrVar, lki lkiVar) {
        lkj a = lkiVar.a();
        this.a = lkt.a(this.a, a);
        this.b.hg(lkrVar, lkiVar);
        this.a = a;
    }
}
