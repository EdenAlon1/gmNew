package defpackage;

import android.content.pm.PackageManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evcu extends feeg {
    final /* synthetic */ emyl a;
    final /* synthetic */ PackageManager b;
    final /* synthetic */ enip c;
    final /* synthetic */ Executor d;

    public evcu(emyl emylVar, PackageManager packageManager, enip enipVar, Executor executor) {
        this.a = emylVar;
        this.b = packageManager;
        this.c = enipVar;
        this.d = executor;
    }

    @Override // defpackage.feeg
    public final ListenableFuture b(final int i) {
        final emyl emylVar = this.a;
        final PackageManager packageManager = this.b;
        final enip enipVar = this.c;
        return erqt.m(new Callable() { // from class: evct
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new evcs(packageManager, enipVar, (dfqg) emyl.this.get()).a(i);
            }
        }, this.d);
    }
}
