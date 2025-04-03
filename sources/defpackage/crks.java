package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crks {
    private final ffbr a;
    private final ffbr b;

    public crks(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    public final crkr a(emhv emhvVar) {
        Executor executor = (Executor) this.b.b();
        executor.getClass();
        return new crkr(this.a, executor, emhvVar);
    }
}
