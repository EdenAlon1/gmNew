package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buxo extends dtyx<buuo, buxm, buxo, MessagesTable.BindData, buun> {
    public buxo(String[] strArr) {
        super("messages", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final buxm b() {
        l();
        return new buxm(this.a.a());
    }

    public final void c(buun... buunVarArr) {
        int intValue = MessagesTable.g().intValue();
        for (buun buunVar : buunVarArr) {
            if (((Integer) MessagesTable.b.getOrDefault(buunVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(buunVarArr);
    }

    public final void d(buxl... buxlVarArr) {
        C((String) DesugarArrays.stream(buxlVarArr).map(new Function() { // from class: buxn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((buxl) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    public final void e(Function function) {
        Object apply;
        apply = function.apply(MessagesTable.c);
        c((buun[]) apply);
    }

    public final void f(Function function) {
        Object apply;
        apply = function.apply(MessagesTable.c);
        c((buun) apply);
    }

    public final void g(buxz buxzVar) {
        k(new buxs(buxzVar));
    }

    public final void h(Function function) {
        Object apply;
        String[] strArr = MessagesTable.a;
        apply = function.apply(new buxz());
        k(new buxs((buxz) apply));
    }
}
