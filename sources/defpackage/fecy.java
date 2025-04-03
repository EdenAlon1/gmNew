package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fecy {
    public static fedb a(fdxe fdxeVar, fecw... fecwVarArr) {
        fedb w = fdxeVar.w();
        List asList = Arrays.asList(fecwVarArr);
        if (asList.isEmpty()) {
            return w;
        }
        fedg fedgVar = w.a;
        HashMap hashMap = new HashMap();
        Iterator it = w.a().iterator();
        while (true) {
            String str = fedgVar.a;
            if (!it.hasNext()) {
                return feda.a(str, fedgVar, hashMap);
            }
            fecz feczVar = (fecz) it.next();
            fecv fecvVar = feczVar.b;
            Iterator it2 = asList.iterator();
            while (it2.hasNext()) {
                fecvVar = new fecx((fecw) it2.next(), fecvVar);
            }
            feda.c(feczVar.a(fecvVar), str, hashMap);
        }
    }
}
