package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eixf implements eroh {
    public final List a;
    public final int b;
    public final Executor c;
    private final emxg e;
    public int d = -1;
    private final eroh f = eldl.d(this);

    public eixf(List list, emxg emxgVar, Executor executor) {
        this.a = list;
        this.b = list.size();
        this.e = emxgVar;
        this.c = executor;
    }

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        return this.e.a(obj) ? erqt.i(obj) : b();
    }

    public final ListenableFuture b() {
        int i = this.d + 1;
        this.d = i;
        return i < this.b ? erny.g((ListenableFuture) this.a.get(i), this.f, this.c) : erqt.i(null);
    }
}
