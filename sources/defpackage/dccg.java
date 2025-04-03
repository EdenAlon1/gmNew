package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dccg implements erqj {
    final /* synthetic */ dccj a;

    public dccg(dccj dccjVar) {
        this.a = dccjVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dccj dccjVar = this.a;
        dccjVar.d = (List) obj;
        dccjVar.d();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        csjy.h("Bugle", th, "Failed to fetch recently used stickers.");
    }
}
