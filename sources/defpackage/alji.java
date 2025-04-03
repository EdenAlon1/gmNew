package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alji implements fbba {
    public static echt a(Optional optional) {
        final echs d = echt.g().d(((Boolean) alsc.q.e()).booleanValue());
        optional.ifPresent(new Consumer() { // from class: alje
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                echs.this.c((echu) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return d.a();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
