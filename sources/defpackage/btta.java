package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btta extends dtyx<btsn, btsz, btta, btrw, btsm> {
    public btta(String[] strArr) {
        super("messages_annotations", strArr, null, null, null, "$primary");
    }

    private final void g(btsm... btsmVarArr) {
        int intValue = bttf.d().intValue();
        for (btsm btsmVar : btsmVarArr) {
            if (((Integer) bttf.b.getOrDefault(btsmVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(btsmVarArr);
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btsz b() {
        l();
        return new btsz(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(bttf.c);
        g((btsm[]) apply);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(bttf.c);
        g((btsm) apply);
    }

    public final void e(btte btteVar) {
        k(new bttd(btteVar));
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = bttf.a;
        apply = function.apply(new btte());
        k(new bttd((btte) apply));
    }
}
