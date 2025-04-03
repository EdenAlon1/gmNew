package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enrl extends enss {
    public static final ensh a = new enrj();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.enss
    public final void a() {
        this.b.set(Math.max(-this.b.get(), 0L));
    }
}
