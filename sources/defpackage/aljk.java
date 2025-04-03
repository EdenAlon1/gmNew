package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aljk implements fbba {
    public static ecot a(alsc alscVar, Optional optional) {
        boolean b = alscVar.b();
        final ecos i = ecot.i();
        i.d(b);
        if (((Boolean) alsc.m.e()).booleanValue()) {
            i.c(true);
        }
        if (((Boolean) alsc.n.e()).booleanValue()) {
            optional.ifPresent(new Consumer() { // from class: aljg
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((ecoq) ecos.this).b = emxc.j((ecow) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return i.e();
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
