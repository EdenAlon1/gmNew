package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejcn {
    public final effy a;
    public final Executor b;
    public final dtoq c;

    public ejcn(effy effyVar, Executor executor, dtoq dtoqVar) {
        this.a = effyVar;
        this.b = executor;
        this.c = dtoqVar;
    }

    final ListenableFuture a() {
        ListenableFuture a = this.a.a();
        return a.isDone() ? a : new ejcm(this, a);
    }

    final ListenableFuture b(emwl emwlVar, Executor executor) {
        return new ejcm(this, this.a.b(emwlVar, new ejcj(this, executor)));
    }
}
