package j$.util;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
final class k0 implements Consumer {
    Object a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
