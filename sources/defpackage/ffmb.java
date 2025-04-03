package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffmb extends fflt {
    @Override // defpackage.fflt
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }

    @Override // defpackage.ffly
    public final int f(int i) {
        return ThreadLocalRandom.current().nextInt(0, 9);
    }

    @Override // defpackage.ffly
    public final long g(long j) {
        return ThreadLocalRandom.current().nextLong(0L, j);
    }

    @Override // defpackage.ffly
    public final long hL(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }
}
