package defpackage;

import android.os.Bundle;
import defpackage.nzh;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oaj<D extends nzh> {
    public boolean a;
    private oam b;

    public abstract nzh a();

    public boolean b() {
        return true;
    }

    public void d(List list, nzr nzrVar) {
        list.getClass();
        ffnf ffnfVar = new ffnf(new ffng(ffno.i(ffdx.as(list), new oah(this, nzrVar)), false, ffoa.a));
        while (ffnfVar.hasNext()) {
            f().f((nxm) ffnfVar.next());
        }
    }

    public Bundle e() {
        return null;
    }

    public final oam f() {
        oam oamVar = this.b;
        if (oamVar != null) {
            return oamVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void g(oam oamVar) {
        this.b = oamVar;
        this.a = true;
    }

    public void h(nxm nxmVar) {
        nxmVar.getClass();
        nzh nzhVar = nxmVar.b;
        if (true != (nzhVar instanceof nzh)) {
            nzhVar = null;
        }
        if (nzhVar == null) {
            return;
        }
        c(nzhVar, null, nzt.a(oai.a));
        f().g(nxmVar);
    }

    public void j(nxm nxmVar, boolean z) {
        nxmVar.getClass();
        List list = (List) f().f.c();
        if (!list.contains(nxmVar)) {
            throw new IllegalStateException(a.j(list, nxmVar, "popBackStack was called with ", " which does not exist in back stack "));
        }
        ListIterator listIterator = list.listIterator(list.size());
        nxm nxmVar2 = null;
        while (b()) {
            nxmVar2 = (nxm) listIterator.previous();
            if (ffkj.e(nxmVar2, nxmVar)) {
                break;
            }
        }
        if (nxmVar2 != null) {
            f().e(nxmVar2, z);
        }
    }

    public void i(Bundle bundle) {
    }

    public nzh c(nzh nzhVar, Bundle bundle, nzr nzrVar) {
        return nzhVar;
    }
}
