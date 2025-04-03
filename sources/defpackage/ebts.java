package defpackage;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebts implements qud {
    final /* synthetic */ ebtt a;
    private final ebtq b;
    private ListenableFuture c;
    private final int d;

    public ebts(ebtt ebttVar, ebtq ebtqVar, int i) {
        this.a = ebttVar;
        this.b = ebtqVar;
        this.d = i;
    }

    @Override // defpackage.qud
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.qud
    public final void d() {
        ListenableFuture listenableFuture = this.c;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.c = null;
        }
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        ListenableFuture g = this.a.a.g(((ebsw) this.b.b()).a, this.d);
        this.c = g;
        elfr.l(g, new ebtr(qucVar), erpp.a);
    }

    @Override // defpackage.qud
    public final void e() {
    }
}
