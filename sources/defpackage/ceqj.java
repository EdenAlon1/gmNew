package defpackage;

import android.net.Uri;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqj extends ceut {
    public final covo a;
    public final coxk b;
    private final errl c;

    public ceqj(errl errlVar, covo covoVar, coxk coxkVar) {
        this.c = errlVar;
        this.a = covoVar;
        this.b = coxkVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DeleteMessageFromTelephonyHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ceql.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ceql ceqlVar = (ceql) eyhsVar;
        return elfo.g(new Callable() { // from class: ceqi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ceql ceqlVar2 = ceqlVar;
                List list = (List) Collection.EL.stream(ceqlVar2.c).map(new Function() { // from class: ceqf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Uri.parse((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: ceqg
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                ceqj ceqjVar = ceqj.this;
                ceqjVar.b.ak(list);
                List<Uri> list2 = (List) Collection.EL.stream(ceqlVar2.b).map(new Function() { // from class: ceqh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Uri.parse((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: ceqg
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                cbbl c = ((cbbm) ceqjVar.a.a.b()).c(1);
                for (Uri uri : list2) {
                    if (uri != null) {
                        csjy.l("Bugle", "Clearing cache for ".concat(uri.toString()));
                        c.e(uri.toString());
                    }
                }
                return ceyt.i();
            }
        }, this.c);
    }
}
