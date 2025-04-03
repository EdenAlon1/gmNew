package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erpv implements erog {
    final /* synthetic */ Callable a;

    public erpv(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.erog
    public final ListenableFuture a() {
        return erqt.i(this.a.call());
    }

    public final String toString() {
        return this.a.toString();
    }
}
