package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fflt extends ffly {
    @Override // defpackage.ffly
    public final int a(int i) {
        return fflz.b(e().nextInt(), i);
    }

    @Override // defpackage.ffly
    public final int b() {
        return e().nextInt();
    }

    @Override // defpackage.ffly
    public final int c(int i) {
        return e().nextInt(i);
    }

    @Override // defpackage.ffly
    public final long d() {
        return e().nextLong();
    }

    public abstract Random e();
}
