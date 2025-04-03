package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btdt extends dtyx {
    public btdt(String[] strArr) {
        super("events", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btdr b() {
        l();
        return new btdr(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(btdw.c);
        btdf[] btdfVarArr = (btdf[]) apply;
        int a = btdw.b().a();
        Integer.valueOf(a).getClass();
        for (btdf btdfVar : btdfVarArr) {
            if (((Integer) btdw.b.getOrDefault(btdfVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(btdfVarArr);
    }
}
