package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class ayie {
    public static bseh a(ayif ayifVar, aoku aokuVar, ffbr ffbrVar) {
        return ayifVar.b(emxe.b(aokuVar.n()), ffbrVar);
    }

    public static bseh b(ayif ayifVar, Collection collection, ffbr ffbrVar) {
        Stream map = Collection.EL.stream(collection).map(new Function() { // from class: ayib
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return emxe.b(((aoku) obj).n());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return ayifVar.d((engw) map.collect(endq.a), ffbrVar);
    }

    public static elfl c(ayif ayifVar, aoku aokuVar) {
        return ayifVar.f(emxe.b(aokuVar.n()));
    }

    public static elfl d(ayif ayifVar, String str) {
        return ayifVar.f(str).h(new emwl() { // from class: ayid
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (bseh) ((Optional) obj).orElse(null);
            }
        }, erpp.a);
    }

    public static elfl e(ayif ayifVar, java.util.Collection collection) {
        Stream map = Collection.EL.stream(collection).map(new Function() { // from class: ayic
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return emxe.b(((aoku) obj).n());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return ayifVar.j((engw) map.collect(endq.a));
    }

    public static elfl f(ayif ayifVar, aoku aokuVar, ffbr ffbrVar) {
        return ayifVar.m(emxe.b(aokuVar.n()), ffbrVar);
    }

    public static Optional g(ayif ayifVar, aoku aokuVar) {
        return ayifVar.o(emxe.b(aokuVar.n()));
    }

    public static Optional h(ayif ayifVar, aoku aokuVar) {
        return ayifVar.q(emxe.b(aokuVar.n()));
    }

    public static Optional i(ayif ayifVar, java.util.Collection collection) {
        return ayifVar.s((engw) Collection.EL.stream(collection).map(new Function() { // from class: ayia
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return emxe.b(((aoku) obj).n());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a));
    }
}
