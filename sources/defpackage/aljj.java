package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aljj implements fbba {
    public static ecki a(Optional optional) {
        final eckh c = ecki.h().c(true);
        optional.ifPresent(new Consumer() { // from class: aljf
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((eckf) eckh.this).c = (akxg) obj;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return c.d();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
