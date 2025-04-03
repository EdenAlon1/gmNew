package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwdf extends dtyx<bwav, bwdd, bwdf, PartsTable.BindData, bwau> {
    public bwdf(String[] strArr) {
        super("parts", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bwdd b() {
        l();
        return new bwdd(this.a.a());
    }

    public final void c(bwau... bwauVarArr) {
        int intValue = PartsTable.e().intValue();
        for (bwau bwauVar : bwauVarArr) {
            if (((Integer) PartsTable.b.getOrDefault(bwauVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bwauVarArr);
    }

    public final void d(bwdc... bwdcVarArr) {
        C((String) DesugarArrays.stream(bwdcVarArr).map(new Function() { // from class: bwde
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bwdc) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(PartsTable.d);
        c((bwau[]) apply);
    }

    public final void f(Function function) {
        Object apply;
        apply = function.apply(PartsTable.d);
        c((bwau) apply);
    }

    public final void g(bwdm bwdmVar) {
        k(new bwdj(bwdmVar));
    }

    public final void h(Function function) {
        Object apply;
        String[] strArr = PartsTable.a;
        apply = function.apply(new bwdm());
        k(new bwdj((bwdm) apply));
    }
}
