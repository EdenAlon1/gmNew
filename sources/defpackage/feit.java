package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feit implements feor {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.feor
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
