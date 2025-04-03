package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpai implements dpae {
    private final ffbz a;
    private final ffbz b;

    public dpai(enip enipVar, enip enipVar2) {
        enipVar.getClass();
        this.a = ffca.a(new dpah(enipVar));
        this.b = ffca.a(new dpag(enipVar2));
    }

    public static final String[] b(Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = ((dozr) it.next()).k;
            if (str != null) {
                arrayList.add(str);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        strArr.getClass();
        return strArr;
    }

    @Override // defpackage.dpae
    public final String[] a(dpad dpadVar) {
        dpadVar.getClass();
        int ordinal = dpadVar.ordinal();
        if (ordinal == 0) {
            return ((dpac) this.a.a()).a;
        }
        if (ordinal == 1) {
            return ((dpac) this.b.a()).a;
        }
        throw new ffcd();
    }
}
