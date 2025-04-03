package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abva implements abuy {
    private final Set a;

    public abva(Set set) {
        this.a = set;
    }

    @Override // defpackage.abuy
    public final void b(final abux abuxVar) {
        Collection.EL.stream(this.a).forEach(new Consumer() { // from class: abuz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((abvb) obj).b(abux.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
