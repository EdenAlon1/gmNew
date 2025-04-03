package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pvn {
    private final List a;

    public pvn(pws pwsVar) {
        pvf pvfVar;
        pvx[] pvxVarArr = new pvx[8];
        pvxVarArr[0] = new pvv(pwsVar.b);
        pvxVarArr[1] = new pvw(pwsVar.c);
        pvxVarArr[2] = new pwc(pwsVar.e);
        pwl pwlVar = pwsVar.d;
        pvxVarArr[3] = new pvy(pwlVar);
        pvxVarArr[4] = new pwb(pwlVar);
        pvxVarArr[5] = new pwa(pwsVar.d);
        pvxVarArr[6] = new pvz(pwsVar.d);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = pwsVar.a;
            String str = pvq.a;
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            pvfVar = new pvf((ConnectivityManager) systemService, pvq.b);
        } else {
            pvfVar = null;
        }
        pvxVarArr[7] = pvfVar;
        this.a = ffdo.J(pvxVarArr);
    }

    public final ffxx a(pyj pyjVar) {
        pyjVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((pvx) obj).b(pyjVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pvx) it.next()).a(pyjVar.l));
        }
        return ffyy.a(new pvm((ffxx[]) ffdx.ak(arrayList2).toArray(new ffxx[0])));
    }

    public final boolean b(pyj pyjVar) {
        pyjVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((pvx) obj).c(pyjVar)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            ppt.c().a(pvq.a, "Work " + pyjVar.c + " constrained by " + ffdx.aA(arrayList, null, null, null, pvj.a, 31));
        }
        return arrayList.isEmpty();
    }
}
