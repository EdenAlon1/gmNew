package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bufs extends dtyx {
    public bufs(String[] strArr) {
        super("message_replies", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bufr b() {
        l();
        return new bufr(this.a.a());
    }

    public final void c(buff... buffVarArr) {
        int a = bufy.c().a();
        Integer.valueOf(a).getClass();
        for (buff buffVar : buffVarArr) {
            if (((Integer) bufy.b.getOrDefault(buffVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(buffVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(bufy.c);
        c((buff) apply);
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = bufy.a;
        apply = function.apply(new bufx());
        k(new bufw((bufx) apply));
    }
}
