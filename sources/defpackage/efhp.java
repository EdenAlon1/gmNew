package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efhp implements efeu {
    private final efhq a;

    public efhp(efhq efhqVar) {
        this.a = efhqVar;
    }

    @Override // defpackage.efeu
    public final ListenableFuture a(ListenableFuture listenableFuture) {
        final efhq efhqVar = this.a;
        return erny.g(listenableFuture, eldl.d(new eroh() { // from class: efhf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                efhq efhqVar2 = efhq.this;
                efhqVar2.c((Uri) erqt.q(efhqVar2.a), obj);
                return erre.a;
            }
        }), efhqVar.b);
    }
}
