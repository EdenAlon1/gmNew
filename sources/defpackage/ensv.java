package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ensv extends enss {
    public static final ensh a = new enst();
    public static final ThreadLocal b = new ensu();
    final AtomicInteger e = new AtomicInteger();

    @Override // defpackage.enss
    public final void a() {
        this.e.decrementAndGet();
    }
}
