package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhrq implements dhrr {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.dhqp
    public final void a() {
        this.a.countDown();
    }

    @Override // defpackage.dhqv
    public final void d(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.dhqy
    public final void e(Object obj) {
        this.a.countDown();
    }
}
