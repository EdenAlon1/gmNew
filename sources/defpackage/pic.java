package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pic {
    public static final pic a = new pic(phw.b, pib.b, pib.b);
    public final phw b;
    public final pib c;
    public final pib d;

    static {
        new pic(phw.b, pib.b, pib.c);
        new pic(phw.a, pib.c, pib.b);
        new pic(phw.d, pib.b, pib.c);
        new pic(phw.c, pib.c, pib.b);
    }

    public pic(phw phwVar, pib pibVar, pib pibVar2) {
        phwVar.getClass();
        pibVar.getClass();
        pibVar2.getClass();
        this.b = phwVar;
        this.c = pibVar;
        this.d = pibVar2;
    }

    public static final plm c(pmd pmdVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : pmdVar.a) {
            if (obj instanceof plm) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (plm) arrayList.get(0);
        }
        return null;
    }

    public final boolean a(pmd pmdVar) {
        if (!ffkj.e(this.d, pib.c)) {
            return false;
        }
        plm c = c(pmdVar);
        return c == null || !ffkj.e(c.b(), plj.b) || ffdx.g(phw.a, phw.c).contains(this.b);
    }

    public final boolean b(pmd pmdVar) {
        if (!ffkj.e(this.c, pib.c)) {
            return false;
        }
        plm c = c(pmdVar);
        return c == null || !ffkj.e(c.b(), plj.a) || ffdx.g(phw.b, phw.d).contains(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pic)) {
            return false;
        }
        pic picVar = (pic) obj;
        return ffkj.e(this.b, picVar.b) && ffkj.e(this.c, picVar.c) && ffkj.e(this.d, picVar.d);
    }

    public final int hashCode() {
        return (((this.b.e * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Bounds:{alignment=" + this.b + ", width=" + this.c + ", height=" + this.d + '}';
    }
}
