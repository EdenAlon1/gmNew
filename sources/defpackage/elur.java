package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elur {
    private final String a;
    private final Supplier b;
    private final ArrayList c = new ArrayList();
    private final Map d = new HashMap();

    private elur(String str, Supplier supplier) {
        this.a = str;
        this.b = supplier;
    }

    public static elur a(String str) {
        return new elur(str, new Supplier() { // from class: eluh
            @Override // java.util.function.Supplier
            public final Object get() {
                return new elpd() { // from class: eluj
                    @Override // defpackage.elpd
                    public final Object a() {
                        return new Object();
                    }
                };
            }
        });
    }

    public final void b(final Function function, final Function function2) {
        this.d.put("executionStatus", new Function() { // from class: elup
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                apply = Function.this.apply(obj);
                return (List) ((Optional) apply).stream().map(function2).collect(elvb.a());
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        });
    }

    public final void c(String str, Function function, elux eluxVar) {
        this.c.add(new eluw(str, function, eluxVar));
    }

    public final elur d(Supplier supplier) {
        return new elur(this.a, supplier);
    }

    public final elur e() {
        return new elur(this.a, this.b);
    }

    public final elur f() {
        return new elur(this.a, this.b);
    }

    public final eluv g() {
        return new eluv(this.a, this.b, DesugarCollections.unmodifiableList(this.c), this.d);
    }
}
