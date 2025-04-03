package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekqj {
    private final fazb a;

    public ekqj(fazb fazbVar) {
        this.a = fazbVar;
    }

    public final void a() {
        Iterable$EL.forEach((Set) this.a.b(), new Consumer() { // from class: ekqi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ejle) obj).b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void b() {
        Iterable$EL.forEach((Set) this.a.b(), new Consumer() { // from class: ekqh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ejle) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
