package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aedo implements ellh {
    final /* synthetic */ aedh a;

    public aedo(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        ((Optional) ((fbbb) this.a.at).a).ifPresent(new Consumer() { // from class: aead
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                throw null;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return elli.a;
    }
}
