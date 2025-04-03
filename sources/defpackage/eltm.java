package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eltm implements elru {
    final List a;

    public eltm(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }

    @Override // defpackage.elru
    public final eyiw a(Object obj) {
        Object apply;
        final eyiu eyiuVar = (eyiu) eyiw.a.createBuilder();
        for (final elpq elpqVar : this.a) {
            apply = elpqVar.c().apply(obj);
            ((Optional) apply).ifPresent(new Consumer() { // from class: eltl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    eyiu.this.a(elpqVar.b(), (eyjq) obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return (eyiw) eyiuVar.build();
    }
}
