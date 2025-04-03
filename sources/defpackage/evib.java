package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evib implements erqj {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ evix b;
    final /* synthetic */ evic c;

    public evib(evic evicVar, ListenableFuture listenableFuture, evix evixVar) {
        this.a = listenableFuture;
        this.b = evixVar;
        this.c = evicVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            erqt.r(this.a, eldl.i(new evia(this, this.b)), erpp.a);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("ClientLoggingBackend", "Error while logging.", th);
    }
}
