package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwon extends dtyx<bwnm, bwom, bwon, ProfilesTable.BindData, bwnl> {
    public bwon(String[] strArr) {
        super("profiles_table", strArr, null, null, null, "$primary");
    }

    private final void f(bwnl... bwnlVarArr) {
        int intValue = ProfilesTable.c().intValue();
        for (bwnl bwnlVar : bwnlVarArr) {
            if (((Integer) ProfilesTable.b.getOrDefault(bwnlVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bwnlVarArr);
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bwom b() {
        l();
        return new bwom(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        apply = function.apply(ProfilesTable.c);
        f((bwnl[]) apply);
    }

    public final void d(Function function) {
        Object apply;
        apply = function.apply(ProfilesTable.c);
        f((bwnl) apply);
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = ProfilesTable.a;
        apply = function.apply(new bwor());
        k(new bwoq((bwor) apply));
    }
}
