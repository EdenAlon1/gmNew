package defpackage;

import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dino implements dimm {
    final ecwj a;

    public dino(ecwj ecwjVar) {
        this.a = ecwjVar;
    }

    @Override // defpackage.dimm
    public final Object a() {
        dinp.x.ifPresent(new Consumer() { // from class: dinn
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Set) obj).add(dino.this.a.d());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return this.a.b();
    }

    @Override // defpackage.dimm
    public final String b() {
        return this.a.d();
    }

    public final String toString() {
        return String.format(Locale.US, "%s=%s", b(), a());
    }
}
