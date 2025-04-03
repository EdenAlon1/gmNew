package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@oag(a = "navigation")
/* loaded from: classes.dex */
public class nzm extends oaj<nzl> {
    private final oal b;

    public nzm(oal oalVar) {
        oalVar.getClass();
        this.b = oalVar;
    }

    @Override // defpackage.oaj
    public final /* synthetic */ nzh a() {
        return new nzl(this);
    }

    @Override // defpackage.oaj
    public final void d(List list, nzr nzrVar) {
        String str;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nxm nxmVar = (nxm) it.next();
            nzh nzhVar = nxmVar.b;
            nzhVar.getClass();
            nzl nzlVar = (nzl) nzhVar;
            fflb fflbVar = new fflb();
            fflbVar.a = nxmVar.a();
            int i = nzlVar.b;
            if (i == 0) {
                int i2 = nzlVar.j;
                if (i2 != 0) {
                    str = nzlVar.e;
                    if (str == null) {
                        str = String.valueOf(i2);
                    }
                } else {
                    str = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(String.valueOf(str)));
            }
            nzh nzhVar2 = (nzh) cpp.a(nzlVar.a, i);
            if (nzhVar2 == null) {
                if (nzlVar.m == null) {
                    nzlVar.m = String.valueOf(nzlVar.b);
                }
                String str2 = nzlVar.m;
                str2.getClass();
                throw new IllegalArgumentException(a.a(str2, "navigation destination ", " is not a direct child of this NavGraph"));
            }
            this.b.a(nzhVar2.c).d(ffdx.b(f().a(nzhVar2, nzhVar2.c((Bundle) fflbVar.a))), nzrVar);
        }
    }
}
