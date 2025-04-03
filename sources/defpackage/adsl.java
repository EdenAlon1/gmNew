package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsl implements adsn {
    public final ffbr a;
    private final ffbr b;

    public adsl(ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.a = ffbrVar2;
    }

    @Override // defpackage.adsn
    public final void a() {
        ((Optional) this.b.b()).ifPresent(new Consumer() { // from class: adsk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                abxd abxdVar = (abxd) obj;
                if (abxdVar.e() && abxdVar.f()) {
                    ((adsd) adsl.this.a.b()).a(17);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
