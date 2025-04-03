package defpackage;

import defpackage.czmy;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvl implements ellh {
    final /* synthetic */ uuy a;

    public uvl(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        final czmy.a aVar = (czmy.a) ellfVar;
        this.a.ab.a().ifPresent(new Consumer() { // from class: usp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cfup cfupVar = uuy.a;
                ((cjhi) obj).d(czmy.a.this.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
