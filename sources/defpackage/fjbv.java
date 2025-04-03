package defpackage;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjbv implements fjbl {
    final /* synthetic */ Type a;
    final /* synthetic */ Executor b;

    public fjbv(Type type, Executor executor) {
        this.a = type;
        this.b = executor;
    }

    @Override // defpackage.fjbl
    public final /* bridge */ /* synthetic */ Object adapt(fjbj fjbjVar) {
        Executor executor = this.b;
        return executor == null ? fjbjVar : new fjbz(executor, fjbjVar);
    }

    @Override // defpackage.fjbl
    public final Type responseType() {
        return this.a;
    }
}
