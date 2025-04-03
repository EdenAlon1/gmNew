package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxis extends dtyx {
    public bxis(String[] strArr) {
        super("remote_user_id_to_registration_id", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxir b() {
        l();
        return new bxir(this.a.a());
    }

    public final void c(bxii... bxiiVarArr) {
        int a = bxiv.b().a();
        Integer.valueOf(a).getClass();
        if (((Integer) bxiv.b.getOrDefault(bxiiVarArr[0].toString(), -1)).intValue() > a) {
            dtub.w("columnReference.toString()", a);
        }
        m(bxiiVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = bxiv.a;
        apply = function.apply(new bxiu());
        k(new bxit((bxiu) apply));
    }
}
