package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbu implements bjt {
    final /* synthetic */ List a;
    final /* synthetic */ ati b;
    final /* synthetic */ cbw c;

    public cbu(cbw cbwVar, List list, ati atiVar) {
        this.c = cbwVar;
        this.a = list;
        this.b = atiVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ati, bcq] */
    @Override // defpackage.bjt
    public final void a(Throwable th) {
        this.c.b = null;
        if (this.a.isEmpty()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.q((bbt) it.next());
        }
        this.a.clear();
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.b = null;
    }
}
