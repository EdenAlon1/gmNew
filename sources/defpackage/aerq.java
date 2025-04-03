package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aerq implements alhi {
    @Override // defpackage.alhi
    public final eolt a() {
        return eolt.GOOGLE_PHOTOS_ONBOARDING_EVENT;
    }

    @Override // defpackage.alhi
    public final BiConsumer b() {
        final aero aeroVar = aero.a;
        return new BiConsumer() { // from class: aerp
            @Override // java.util.function.BiConsumer
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ffjm.this.a(obj, obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.alhi
    public final Supplier c() {
        return new Supplier() { // from class: aern
            @Override // java.util.function.Supplier
            public final Object get() {
                return (eqca) eqcb.a.createBuilder();
            }
        };
    }
}
