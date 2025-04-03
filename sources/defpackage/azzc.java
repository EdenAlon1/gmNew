package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azzc {
    private final ffbr a;

    public azzc(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    final azzb a(int i) {
        Executor executor = (Executor) this.a.b();
        executor.getClass();
        return new azzb(executor, i);
    }
}
