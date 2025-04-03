package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feyv {
    static {
        Logger.getLogger(feyv.class.getName());
    }

    private feyv() {
    }

    public static byte[][] a(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size][];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fezo fezoVar = (fezo) it.next();
            bArr[i] = fezoVar.f.k();
            bArr[i + 1] = fezoVar.g.k();
            i += 2;
        }
        return fevt.b(bArr);
    }
}
