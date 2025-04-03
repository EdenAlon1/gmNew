package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brye extends dtyx {
    public brye(String[] strArr) {
        super("conversation_pin", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bryd b() {
        l();
        return new bryd(this.a.a());
    }

    public final void c(brxs... brxsVarArr) {
        int a = bryh.b().a();
        Integer.valueOf(a).getClass();
        for (brxs brxsVar : brxsVarArr) {
            if (((Integer) bryh.b.getOrDefault(brxsVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(brxsVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = bryh.a;
        apply = function.apply(new bryg());
        k(new bryf((bryg) apply));
    }
}
