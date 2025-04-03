package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bumh extends dtyx {
    public bumh(String[] strArr) {
        super("message_star", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bumg b() {
        l();
        return new bumg(this.a.a());
    }

    public final void c(bulw... bulwVarArr) {
        int a = bumm.b().a();
        Integer.valueOf(a).getClass();
        for (bulw bulwVar : bulwVarArr) {
            if (((Integer) bumm.b.getOrDefault(bulwVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(bulwVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(bumm.c);
        c((bulw[]) apply);
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = bumm.a;
        apply = function.apply(new buml());
        k(new bumk((buml) apply));
    }
}
