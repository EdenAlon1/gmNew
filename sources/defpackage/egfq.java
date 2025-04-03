package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfq implements erqj {
    final /* synthetic */ egdt a;
    final /* synthetic */ egfr b;

    public egfq(egfr egfrVar, egdt egdtVar) {
        this.a = egdtVar;
        this.b = egfrVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eggy eggyVar = new eggy();
        int i = engw.d;
        engr engrVar = new engr();
        Iterator<E> it = ((ewld) obj).b.iterator();
        while (it.hasNext()) {
            engrVar.h(((ewis) it.next()).b);
        }
        egfr egfrVar = this.b;
        eggyVar.c(engrVar.g());
        eggyVar.b(this.a.a());
        egfrVar.g.j(eggyVar.a());
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        egdp a = this.b.d.a(th);
        exfw c = this.a.c(th);
        eggy eggyVar = new eggy();
        int i = engw.d;
        eggyVar.c(enou.a);
        eggyVar.a = emxc.j(a);
        eggyVar.b(c);
        this.b.g.j(eggyVar.a());
    }
}
