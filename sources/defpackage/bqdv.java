package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqdv extends dtyx {
    public bqdv(String[] strArr) {
        super("backup_id_map", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqdu b() {
        l();
        return new bqdu(this.a.a());
    }

    public final void c(bqdi... bqdiVarArr) {
        int a = bqea.c().a();
        Integer.valueOf(a).getClass();
        for (bqdi bqdiVar : bqdiVarArr) {
            if (((Integer) bqea.b.getOrDefault(bqdiVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(bqdiVarArr);
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = bqea.a;
        apply = function.apply(new bqdz());
        k(new bqdy((bqdz) apply));
    }
}
