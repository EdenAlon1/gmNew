package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isx {
    public static final hvh a(hne hneVar) {
        int i;
        if (hneVar == null || (i = hneVar.b) == 0) {
            return null;
        }
        return (hvh) hneVar.c(i - 1);
    }

    public static final ioc b(isw iswVar) {
        if (!iswVar.C().z) {
            imn.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        iwi e = e(iswVar, 2);
        if (!e.t()) {
            imn.c("LayoutCoordinates is not attached.");
        }
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final itu c(hvh hvhVar) {
        if ((hvhVar.q & 2) == 0) {
            return null;
        }
        if (hvhVar instanceof itu) {
            return (itu) hvhVar;
        }
        if (!(hvhVar instanceof isz)) {
            return null;
        }
        hvh hvhVar2 = ((isz) hvhVar).n;
        while (hvhVar2 != 0) {
            if (hvhVar2 instanceof itu) {
                return (itu) hvhVar2;
            }
            hvhVar2 = (!(hvhVar2 instanceof isz) || (hvhVar2.q & 2) == 0) ? hvhVar2.t : ((isz) hvhVar2).n;
        }
        return null;
    }

    public static final iui d(isw iswVar) {
        iwi iwiVar = iswVar.C().v;
        if (iwiVar != null) {
            return iwiVar.r;
        }
        imn.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new ffbx();
    }

    public static final iwi e(isw iswVar, int i) {
        iwi iwiVar = iswVar.C().v;
        iwiVar.getClass();
        if (iwiVar.B() != iswVar || !iwk.h(i)) {
            return iwiVar;
        }
        iwi iwiVar2 = iwiVar.u;
        iwiVar2.getClass();
        return iwiVar2;
    }

    public static final iwx f(isw iswVar) {
        iwx iwxVar = d(iswVar).l;
        if (iwxVar != null) {
            return iwxVar;
        }
        imn.a("This node does not have an owner.");
        throw new ffbx();
    }

    public static final jzn g(isw iswVar) {
        return d(iswVar).s;
    }

    public static final kah h(isw iswVar) {
        return d(iswVar).t;
    }

    public static final void i(isw iswVar) {
        hvx hvxVar;
        iui d = d(iswVar);
        if (d.q || (hvxVar = ((AndroidComposeView) ium.a(d)).s) == null) {
            return;
        }
        hvxVar.c.a.b(d.d, new hvw(hvxVar, d));
    }

    public static final /* synthetic */ void j(hne hneVar, hvh hvhVar) {
        hne s = d(hvhVar).s();
        int i = s.b - 1;
        Object[] objArr = s.a;
        if (i < objArr.length) {
            while (i >= 0) {
                hneVar.n(((iui) objArr[i]).x.e);
                i--;
            }
        }
    }

    public static final iaw k(isw iswVar) {
        return ((AndroidComposeView) f(iswVar)).T;
    }
}
