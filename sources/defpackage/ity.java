package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ity {
    public static final int a(iuv iuvVar, imq imqVar) {
        iuv M = iuvVar.M();
        if (M == null) {
            imn.c(a.i(iuvVar, "Child of ", " cannot be null when calculating alignment line"));
        }
        if (iuvVar.K().m().containsKey(imqVar)) {
            Integer num = (Integer) iuvVar.K().m().get(imqVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int eh = M.eh(imqVar);
        if (eh == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        M.j = true;
        iuvVar.k = true;
        iuvVar.Q();
        M.j = false;
        iuvVar.k = false;
        return eh + (imqVar instanceof inv ? kaa.b(M.I()) : kaa.a(M.I()));
    }
}
