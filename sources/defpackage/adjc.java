package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adjc extends eays {
    final /* synthetic */ adjf a;

    public adjc(adjf adjfVar) {
        this.a = adjfVar;
    }

    @Override // defpackage.eays
    public final void a() {
        this.a.l.ifPresent(new Consumer() { // from class: adjb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Runnable) obj).run();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
