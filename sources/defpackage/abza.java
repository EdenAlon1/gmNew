package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abza implements ellh {
    final /* synthetic */ abyy a;

    public abza(abyy abyyVar) {
        this.a = abyyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        abzm abzmVar = this.a.p;
        abzmVar.getClass();
        final boolean a = ((abyh) ellfVar).a();
        Collection.EL.stream(abzmVar.a).forEach(new Consumer() { // from class: abzf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((abzx) obj).d(a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        abzmVar.p();
        abzmVar.G();
        return elli.a;
    }
}
