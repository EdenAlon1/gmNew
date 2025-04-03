package defpackage;

import com.google.android.libraries.abuse.hades.tartarus.core.TartarusKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljm implements dljz {
    public static final dljm a = new dljm();

    private dljm() {
    }

    @Override // defpackage.dljz
    public final Object a(ffji ffjiVar, List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ewfv b = ewfv.b(((ewfp) it.next()).c);
            if (b == null) {
                b = ewfv.UNRECOGNIZED;
            }
            if (b == ewfv.TYPE_RULE) {
                list.getClass();
                int i = dlks.a;
                ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(((ewfp) it2.next()).c));
                }
                int[] ax = ffdx.ax(arrayList);
                ArrayList arrayList2 = new ArrayList(ffdx.n(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((ewfp) it3.next()).b.I());
                }
                return new dljn(new dlkt(TartarusKt.t(ax, (byte[][]) arrayList2.toArray(new byte[0][]))));
            }
        }
        return null;
    }
}
