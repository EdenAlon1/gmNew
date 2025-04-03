package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rau implements rao {
    private final List a;
    private final kst b;

    public rau(List list, kst kstVar) {
        this.a = list;
        this.b = kstVar;
    }

    @Override // defpackage.rao
    public final ran a(Object obj, int i, int i2, qtu qtuVar) {
        ran a;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        qtp qtpVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            rao raoVar = (rao) this.a.get(i3);
            if (raoVar.b(obj) && (a = raoVar.a(obj, i, i2, qtuVar)) != null) {
                arrayList.add(a.c);
                qtpVar = a.a;
            }
        }
        if (arrayList.isEmpty() || qtpVar == null) {
            return null;
        }
        return new ran(qtpVar, new rat(arrayList, this.b));
    }

    @Override // defpackage.rao
    public final boolean b(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((rao) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + "}";
    }
}
