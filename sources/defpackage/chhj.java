package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chhj implements erqj {
    private final fazb a;

    public chhj(fazb fazbVar) {
        this.a = fazbVar;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        ((Optional) this.a.b()).ifPresent(new Consumer() { // from class: chhi
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                ((chhm) obj2).b(chhj.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((Optional) this.a.b()).ifPresent(new Consumer() { // from class: chhh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((chhm) obj).b(chhj.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
