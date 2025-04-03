package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byyg extends dtyx<byxx, byyf, byyg, VmtTable.BindData, byxw> {
    public byyg(String[] strArr) {
        super("vmt", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byyf b() {
        l();
        return new byyf(this.a.a());
    }

    public final void c(byxw... byxwVarArr) {
        int a = VmtTable.c().a();
        Integer.valueOf(a).getClass();
        for (byxw byxwVar : byxwVarArr) {
            if (((Integer) VmtTable.b.getOrDefault(byxwVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(byxwVarArr);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(VmtTable.c);
        c((byxw[]) apply);
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = VmtTable.a;
        apply = function.apply(new byyk());
        k(new byyj((byyk) apply));
    }
}
