package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcch implements erqj {
    final /* synthetic */ dccj a;

    public dcch(dccj dccjVar) {
        this.a = dccjVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        for (ewnk ewnkVar : (List) obj) {
            if (ewnkVar != null) {
                dccj dccjVar = this.a;
                dccjVar.e.put(ewnkVar.c, ewnkVar.h);
            }
        }
        this.a.d();
        this.a.h = null;
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        csjy.h("Bugle", th, "Failed to fetch metadata of recently used expressive sticker.");
        this.a.h = null;
    }
}
