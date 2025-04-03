package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bunz extends dtyx<bunm, buny, bunz, bums, bunl> {
    public bunz(String[] strArr) {
        super("message_status", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final buny b() {
        l();
        return new buny(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(buoc.c);
        bunl[] bunlVarArr = (bunl[]) apply;
        int a = buoc.b().a();
        Integer.valueOf(a).getClass();
        for (bunl bunlVar : bunlVarArr) {
            if (((Integer) buoc.b.getOrDefault(bunlVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(bunlVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = buoc.a;
        apply = function.apply(new buob());
        k(new buoa((buob) apply));
    }
}
