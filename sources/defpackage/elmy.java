package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elmy {
    public final Consumer a;

    public elmy(Consumer consumer) {
        this.a = consumer;
    }

    public final void a(int i) {
        int i2 = i - 1;
        this.a.accept(i2 != 0 ? i2 != 1 ? elnu.e.c() : elnu.d.c() : elnu.a.c());
    }
}
