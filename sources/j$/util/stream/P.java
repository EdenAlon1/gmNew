package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes9.dex */
final class P extends Q {
    final Consumer b;

    P(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
    }
}
