package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avrj implements avrk {
    private final axpc a;
    private final avrk b;

    public avrj(axpd axpdVar, final avrk avrkVar) {
        this.a = axpdVar.a(new Function() { // from class: avri
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return avrk.this.b((awui) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.b = avrkVar;
    }

    @Override // defpackage.avrk
    public final elfl a(Iterable iterable) {
        return this.b.a(iterable);
    }

    @Override // defpackage.avrk
    public final elfl b(awui awuiVar) {
        return this.a.a(awuiVar);
    }
}
