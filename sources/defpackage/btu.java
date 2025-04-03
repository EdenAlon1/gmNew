package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btu implements bjt {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ boolean b;
    final /* synthetic */ btz c;

    public btu(btz btzVar, ListenableFuture listenableFuture, boolean z) {
        this.c = btzVar;
        this.a = listenableFuture;
        this.b = z;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        avw.d("VideoCapture", "Surface update completed with unexpected exception", th);
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        btz btzVar = this.c;
        if (this.a != btzVar.d || btzVar.g == 3) {
            return;
        }
        btzVar.r(true != this.b ? 2 : 1);
    }
}
