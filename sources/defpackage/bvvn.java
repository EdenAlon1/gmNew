package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvn extends dtyx<bvti, bvvl, bvvn, ParticipantsTable.BindData, bvth> {
    public bvvn(String[] strArr) {
        super("participants", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvvl b() {
        l();
        return new bvvl(this.a.a());
    }

    public final void c(bvth... bvthVarArr) {
        int intValue = ParticipantsTable.i().intValue();
        for (bvth bvthVar : bvthVarArr) {
            if (((Integer) ParticipantsTable.b.getOrDefault(bvthVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bvthVarArr);
    }

    public final void d(bvvk... bvvkVarArr) {
        C((String) DesugarArrays.stream(bvvkVarArr).map(new Function() { // from class: bvvm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bvvk) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(ParticipantsTable.c);
        c((bvth[]) apply);
    }

    public final void f(Function function) {
        Object apply;
        apply = function.apply(ParticipantsTable.c);
        c((bvth) apply);
    }

    public final void g(bvvw bvvwVar) {
        k(new bvvs(bvvwVar));
    }

    public final void h(Function function) {
        Object apply;
        String[] strArr = ParticipantsTable.a;
        apply = function.apply(new bvvw());
        k(new bvvs((bvvw) apply));
    }
}
