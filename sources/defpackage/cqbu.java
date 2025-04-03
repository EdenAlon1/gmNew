package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqbu {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public cqbu(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
    }

    final cqbt a(BiConsumer biConsumer) {
        cqbx cqbxVar = (cqbx) this.b.b();
        cqbxVar.getClass();
        Executor executor = (Executor) this.c.b();
        executor.getClass();
        return new cqbt(this.a, cqbxVar, executor, biConsumer);
    }
}
