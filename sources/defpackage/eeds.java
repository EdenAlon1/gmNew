package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeds {
    public final fiwq a;

    public eeds() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    public eeds(Optional optional, Optional optional2, Optional optional3) {
        final fiwq fiwqVar = new fiwq(null);
        this.a = fiwqVar;
        optional2.ifPresent(new Consumer() { // from class: eedp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fiwq.this.c = ((Integer) obj).intValue();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional3.ifPresent(new Consumer() { // from class: eedq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fiwq.this.b = ((Integer) obj).intValue();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional.ifPresent(new Consumer() { // from class: eedr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                fiwq.this.a.a = ((Integer) obj).intValue();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
